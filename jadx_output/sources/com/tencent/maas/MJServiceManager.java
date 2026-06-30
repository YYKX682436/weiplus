package com.tencent.maas;

/* loaded from: classes5.dex */
public class MJServiceManager {
    private final com.tencent.maas.internal.NativeCallbackManager mCallbackManager;
    private final com.facebook.jni.HybridData mHybridData;

    /* loaded from: classes5.dex */
    public interface OnComplete {
        void onComplete(com.tencent.maas.model.MJTemplateCategory mJTemplateCategory, com.tencent.maas.instamovie.base.MJError mJError);
    }

    public MJServiceManager(android.os.Handler handler) {
        com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager = new com.tencent.maas.internal.NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler, com.tencent.maas.internal.NativeCallbackManager nativeCallbackManager);

    private native void nativeRequestAllCamFunTemplateInfos(int i17);

    private native void nativeRequestCamFunTemplateDesc(java.util.List<java.lang.String> list, int i17);

    public void requestAllCamFunTemplateInfos(com.tencent.maas.MJServiceManager.OnComplete onComplete) {
        nativeRequestAllCamFunTemplateInfos(onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.MJServiceManagerCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void requestCamFunTemplateDesc(java.util.List<java.lang.String> list, com.tencent.maas.MJServiceManager.OnComplete onComplete) {
        nativeRequestCamFunTemplateDesc(list, onComplete != null ? this.mCallbackManager.registerCallback(new com.tencent.maas.MJServiceManagerCallback.CompleteCallback(this, onComplete)) : -1);
    }
}
