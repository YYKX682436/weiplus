package com.tencent.maas.camstudio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class MJCamSessionCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCamSession> mjCamSessionWeakReference;
    private final java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCamoSession> mjCamoSessionWeakReference;

    public MJCamSessionCallback$BaseCallback(com.tencent.maas.camstudio.MJCamSession mJCamSession) {
        this.mjCamSessionWeakReference = new java.lang.ref.WeakReference<>(mJCamSession);
        this.mjCamoSessionWeakReference = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCamSession> weakReference = this.mjCamSessionWeakReference;
        if (weakReference != null) {
            onInvoke(weakReference.get(), (com.tencent.maas.camstudio.MJCamSession) callbackArgs);
        } else {
            onInvoke(this.mjCamoSessionWeakReference.get(), (com.tencent.maas.camstudio.MJCamoSession) callbackArgs);
        }
    }

    public abstract void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, T t17);

    public abstract void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, T t17);

    public MJCamSessionCallback$BaseCallback(com.tencent.maas.camstudio.MJCamSession mJCamSession, boolean z17) {
        super(z17);
        this.mjCamSessionWeakReference = new java.lang.ref.WeakReference<>(mJCamSession);
        this.mjCamoSessionWeakReference = null;
    }

    public MJCamSessionCallback$BaseCallback(com.tencent.maas.camstudio.MJCamoSession mJCamoSession) {
        this(mJCamoSession, true);
    }

    public MJCamSessionCallback$BaseCallback(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, boolean z17) {
        super(z17);
        this.mjCamSessionWeakReference = null;
        this.mjCamoSessionWeakReference = new java.lang.ref.WeakReference<>(mJCamoSession);
    }
}
