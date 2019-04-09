
name := "My Hello World Program"

version := "0.1"

scalaVersion := "2.12.8"

jarName in assembly := "hello.jar"


mainClass in (Compile, assembly) := Some("com.whiteboardcoder.hello.hw")





