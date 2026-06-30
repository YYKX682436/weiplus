package com.tencent.maas.speech;

/* loaded from: classes5.dex */
public class MJSpeechManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.internal.NativeCallbackManager f48560a;
    private final com.facebook.jni.HybridData mHybridData;

    public MJSpeechManager(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.f48560a = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeCancelAll();

    private native void nativeCancelTask(int i17);

    private native int nativeQueryAsyncSpeechRequest(java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, java.nio.ByteBuffer byteBuffer, int i17);

    private native int nativeQueryAsyncTTSRequest(java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, java.nio.ByteBuffer byteBuffer, int i17);

    private native int nativeRequestFullSpeechRecognition(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, int i17);

    private native int nativeRequestSpeechRecognition(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str, int i17);

    private native int nativeRequestSpeechToSpeech(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, int i17);

    private native int nativeSubmitAsyncSpeechRequest(java.nio.ByteBuffer byteBuffer, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, int i17, int i18);

    private native int nativeSubmitAsyncTTSRequest(com.tencent.maas.speech.MJAsyncTTSSubmitRequestInfo mJAsyncTTSSubmitRequestInfo, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str, int i17);

    public void a() {
        nativeCancelAll();
    }

    public void b(int i17) {
        nativeCancelTask(i17);
    }

    public int c(java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, java.nio.ByteBuffer byteBuffer, com.tencent.maas.speech.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f48560a.registerCallback(new com.tencent.maas.speech.e(this, bVar, true));
        } else {
            i17 = -1;
        }
        return nativeQueryAsyncSpeechRequest(str, mJILinkAppRequest, str2, byteBuffer, i17);
    }

    public int d(java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, java.nio.ByteBuffer byteBuffer, com.tencent.maas.speech.b bVar) {
        int i17;
        if (bVar != null) {
            i17 = this.f48560a.registerCallback(new com.tencent.maas.speech.e(this, bVar, true));
        } else {
            i17 = -1;
        }
        return nativeQueryAsyncTTSRequest(str, mJILinkAppRequest, str2, byteBuffer, i17);
    }

    public void e() {
        this.mHybridData.resetNative();
    }

    public int f(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, com.tencent.maas.speech.d dVar) {
        int i17;
        if (dVar != null) {
            i17 = this.f48560a.registerCallback(new com.tencent.maas.speech.g(this, dVar, true));
        } else {
            i17 = -1;
        }
        return nativeRequestFullSpeechRecognition(byteBuffer, map, str, mJILinkAppRequest, str2, i17);
    }

    public int g(java.nio.ByteBuffer byteBuffer, java.util.Map map, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str, com.tencent.maas.speech.d dVar) {
        int i17;
        if (dVar != null) {
            i17 = this.f48560a.registerCallback(new com.tencent.maas.speech.g(this, dVar, true));
        } else {
            i17 = -1;
        }
        return nativeRequestSpeechRecognition(byteBuffer, map, mJILinkAppRequest, str, i17);
    }

    public int h(java.nio.ByteBuffer byteBuffer, java.util.Map map, java.lang.String str, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str2, int i17, com.tencent.maas.speech.c cVar) {
        int i18;
        if (cVar != null) {
            i18 = this.f48560a.registerCallback(new com.tencent.maas.speech.f(this, cVar, true));
        } else {
            i18 = -1;
        }
        return nativeSubmitAsyncSpeechRequest(byteBuffer, map, str, mJILinkAppRequest, str2, i17, i18);
    }

    public int i(com.tencent.maas.speech.MJAsyncTTSSubmitRequestInfo mJAsyncTTSSubmitRequestInfo, com.tencent.maas.speech.MJILinkAppRequest mJILinkAppRequest, java.lang.String str, com.tencent.maas.speech.c cVar) {
        int i17;
        if (cVar != null) {
            i17 = this.f48560a.registerCallback(new com.tencent.maas.speech.f(this, cVar, true));
        } else {
            i17 = -1;
        }
        return nativeSubmitAsyncTTSRequest(mJAsyncTTSSubmitRequestInfo, mJILinkAppRequest, str, i17);
    }
}
