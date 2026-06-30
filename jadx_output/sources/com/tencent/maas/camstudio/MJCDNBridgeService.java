package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJCDNBridgeService {
    private final com.facebook.jni.HybridData mHybridData;

    public MJCDNBridgeService(android.os.Handler handler, com.tencent.maas.camstudio.j jVar) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(android.os.Looper.getMainLooper());
        this.mHybridData = initHybrid(handler, nativeCallbackManager, nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.k(this, jVar, false)), nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.m(this, jVar, false)), nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.l(this, jVar, false)), nativeCallbackManager.registerCallback(new com.tencent.maas.camstudio.n(this, jVar, false)));
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager, int i17, int i18, int i19, int i27);

    private native void nativeNotifyDownloadCompletion(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError);

    private native void nativeNotifyDownloadProgressUpdate(java.lang.String str, long j17, long j18, float f17, float f18);

    private native void nativeNotifyUploadCompletion(java.lang.String str, java.lang.String str2, com.tencent.maas.instamovie.base.MJError mJError);

    public void a(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
        nativeNotifyDownloadCompletion(str, mJError);
    }

    public void b(java.lang.String str, long j17, long j18, float f17, float f18) {
        nativeNotifyDownloadProgressUpdate(str, j17, j18, f17, f18);
    }

    public void c(java.lang.String str) {
        nativeNotifyDownloadCompletion(str, null);
    }

    public void d(java.lang.String str, com.tencent.maas.instamovie.base.MJError mJError) {
        nativeNotifyUploadCompletion(str, null, mJError);
    }

    public void e(com.tencent.maas.camstudio.MJCDNUploadResult mJCDNUploadResult) {
        nativeNotifyUploadCompletion(mJCDNUploadResult.f47872a, mJCDNUploadResult.f47873b, null);
    }
}
