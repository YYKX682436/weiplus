package com.p159x477cd522.p160x333422;

/* renamed from: com.eclipsesource.mmv8.V8Inspector */
/* loaded from: classes7.dex */
public class C1475xe7732675 {

    /* renamed from: _server */
    private static com.p159x477cd522.p160x333422.C1475xe7732675.JsInspectorChannelServer f4801x6b722c62;

    /* renamed from: com.eclipsesource.mmv8.V8Inspector$JsInspectorChannelServer */
    /* loaded from: classes7.dex */
    public interface JsInspectorChannelServer {
        /* renamed from: notify */
        int mo16428xc2079749(long j17, long j18, java.lang.String str);

        /* renamed from: sendData */
        int mo16429x4a532f52(long j17, java.lang.String str);
    }

    /* renamed from: JniNotify */
    public static native int m16421xbc642f2e(long j17, long j18, java.lang.String str);

    /* renamed from: JniReceiveData */
    public static native void m16422xd4483c68(long j17, java.lang.String str);

    /* renamed from: jniCallbackNotify */
    public static int m16423x3fe73ef3(long j17, long j18, java.lang.String str) {
        com.p159x477cd522.p160x333422.C1475xe7732675.JsInspectorChannelServer jsInspectorChannelServer = f4801x6b722c62;
        if (jsInspectorChannelServer == null) {
            return -1;
        }
        return jsInspectorChannelServer.mo16428xc2079749(j17, j18, str);
    }

    /* renamed from: jniCallbackSendData */
    public static int m16424xcee7947c(long j17, java.lang.String str) {
        com.p159x477cd522.p160x333422.C1475xe7732675.JsInspectorChannelServer jsInspectorChannelServer = f4801x6b722c62;
        if (jsInspectorChannelServer == null) {
            return -1;
        }
        return jsInspectorChannelServer.mo16429x4a532f52(j17, str);
    }

    /* renamed from: notify */
    public static int m16425xc2079749(long j17, long j18, java.lang.String str) {
        return m16421xbc642f2e(j17, j18, str);
    }

    /* renamed from: onReceiveData */
    public static void m16426x9f2735ce(long j17, java.lang.String str) {
        m16422xd4483c68(j17, str);
    }

    /* renamed from: setServer */
    public static void m16427x224e8645(com.p159x477cd522.p160x333422.C1475xe7732675.JsInspectorChannelServer jsInspectorChannelServer) {
        f4801x6b722c62 = jsInspectorChannelServer;
    }
}
