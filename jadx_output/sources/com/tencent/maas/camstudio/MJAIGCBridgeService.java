package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJAIGCBridgeService {
    private final com.facebook.jni.HybridData mHybridData;

    public MJAIGCBridgeService(android.os.Handler handler, com.tencent.maas.camstudio.a aVar) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(android.os.Looper.getMainLooper());
        this.mHybridData = initHybrid(handler, nativeCallbackManager, nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.e(this, aVar, false)), nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.d(this, aVar, false)), nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.b(this, aVar, false)), nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.c(this, aVar, false)));
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager, int i17, int i18, int i19, int i27);

    private native void nativeNotifyCancelCompletion(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError);

    private native void nativeNotifyQueryCompletion(com.tencent.maas.camstudio.MJAIGCQueryResponse mJAIGCQueryResponse, com.tencent.maas.instamovie.base.MJError mJError);

    private native void nativeNotifySubmitCompletion(com.tencent.maas.camstudio.MJAIGCSubmitResponse mJAIGCSubmitResponse, com.tencent.maas.instamovie.base.MJError mJError);

    public void a(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
        nativeNotifyCancelCompletion(str, mJError);
    }

    public void b(java.lang.String str) {
        nativeNotifyCancelCompletion(str, null);
    }

    public void c(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
        nativeNotifyQueryCompletion(new com.tencent.maas.camstudio.MJAIGCQueryResponse(str), mJError);
    }

    public void d(com.tencent.maas.camstudio.MJAIGCQueryResponse mJAIGCQueryResponse) {
        nativeNotifyQueryCompletion(mJAIGCQueryResponse, null);
    }

    public void e(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
        nativeNotifySubmitCompletion(new com.tencent.maas.camstudio.MJAIGCSubmitResponse(str, com.tencent.maas.camstudio.f.nMJAIGCResultCodeFailed, "", null, 0), mJError);
    }

    public void f(com.tencent.maas.camstudio.MJAIGCSubmitResponse mJAIGCSubmitResponse) {
        nativeNotifySubmitCompletion(mJAIGCSubmitResponse, null);
    }
}
