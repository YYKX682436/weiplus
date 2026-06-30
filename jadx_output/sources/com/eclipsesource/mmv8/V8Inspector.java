package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8Inspector {
    private static com.eclipsesource.mmv8.V8Inspector.JsInspectorChannelServer _server;

    /* loaded from: classes7.dex */
    public interface JsInspectorChannelServer {
        int notify(long j17, long j18, java.lang.String str);

        int sendData(long j17, java.lang.String str);
    }

    public static native int JniNotify(long j17, long j18, java.lang.String str);

    public static native void JniReceiveData(long j17, java.lang.String str);

    public static int jniCallbackNotify(long j17, long j18, java.lang.String str) {
        com.eclipsesource.mmv8.V8Inspector.JsInspectorChannelServer jsInspectorChannelServer = _server;
        if (jsInspectorChannelServer == null) {
            return -1;
        }
        return jsInspectorChannelServer.notify(j17, j18, str);
    }

    public static int jniCallbackSendData(long j17, java.lang.String str) {
        com.eclipsesource.mmv8.V8Inspector.JsInspectorChannelServer jsInspectorChannelServer = _server;
        if (jsInspectorChannelServer == null) {
            return -1;
        }
        return jsInspectorChannelServer.sendData(j17, str);
    }

    public static int notify(long j17, long j18, java.lang.String str) {
        return JniNotify(j17, j18, str);
    }

    public static void onReceiveData(long j17, java.lang.String str) {
        JniReceiveData(j17, str);
    }

    public static void setServer(com.eclipsesource.mmv8.V8Inspector.JsInspectorChannelServer jsInspectorChannelServer) {
        _server = jsInspectorChannelServer;
    }
}
