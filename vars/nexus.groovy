def nexus() {
    command = "curl -f -v -u admin:admin123 --upload-file /home/ubuntu/workspace/TODO_CI-Pipelines/todo.zip http://172.31.52.12:8081/repository/todo/todo1.zip"
    def execute_state=sh(returnStdout: true, script: command)
}

def make_artifacts(APP_TYPE, COMPONENT) {
  if(APP_TYPE == "NGINX") {
    command = "zip -r ${COMPONENT}.zip node_modules server.js"
    def execute_com=sh(returnStdout: true, script: command)
    print execute_com
  } else if(APP_TYPE == "NODEJS") {
    command = "zip -r ${COMPONENT}.zip node_modules server.js"
    def execute_com=sh(returnStdout: true, script: command)
    print execute_com
  } else if(APP_TYPE == "JAVA") {
    command = "cp target/*.jar ${COMPONENT}.jar && zip -r ${COMPONENT}.zip ${COMPONENT}.jar"
    def execute_com=sh(returnStdout: true, script: command)
    print execute_com
  } 
}