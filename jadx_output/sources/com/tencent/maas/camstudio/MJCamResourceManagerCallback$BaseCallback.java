package com.tencent.maas.camstudio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class MJCamResourceManagerCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCamResourceManager> mjCamResourceManagerWeakReference;
    private final java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCamoSession> mjCamoSessionWeakReference;

    public MJCamResourceManagerCallback$BaseCallback(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager) {
        this.mjCamResourceManagerWeakReference = new java.lang.ref.WeakReference<>(mJCamResourceManager);
        this.mjCamoSessionWeakReference = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCamResourceManager> weakReference = this.mjCamResourceManagerWeakReference;
        com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager = weakReference != null ? weakReference.get() : null;
        java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCamoSession> weakReference2 = this.mjCamoSessionWeakReference;
        com.tencent.maas.camstudio.MJCamoSession mJCamoSession = weakReference2 != null ? weakReference2.get() : null;
        if (mJCamResourceManager != null) {
            onInvoke(mJCamResourceManager, (com.tencent.maas.camstudio.MJCamResourceManager) callbackArgs);
        } else if (mJCamoSession != null) {
            onInvoke(mJCamoSession, (com.tencent.maas.camstudio.MJCamoSession) callbackArgs);
        }
    }

    public abstract void onInvoke(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, T t17);

    public abstract void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, T t17);

    public MJCamResourceManagerCallback$BaseCallback(com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, boolean z17) {
        super(z17);
        this.mjCamResourceManagerWeakReference = new java.lang.ref.WeakReference<>(mJCamResourceManager);
        this.mjCamoSessionWeakReference = null;
    }

    public MJCamResourceManagerCallback$BaseCallback(com.tencent.maas.camstudio.MJCamoSession mJCamoSession) {
        this.mjCamoSessionWeakReference = new java.lang.ref.WeakReference<>(mJCamoSession);
        this.mjCamResourceManagerWeakReference = null;
    }

    public MJCamResourceManagerCallback$BaseCallback(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, boolean z17) {
        super(z17);
        this.mjCamoSessionWeakReference = new java.lang.ref.WeakReference<>(mJCamoSession);
        this.mjCamResourceManagerWeakReference = null;
    }
}
