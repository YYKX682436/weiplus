package com.tencent.maas.imagestudio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class MJImageSessionCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.imagestudio.MJImageSession> imageSessionRef;

    public MJImageSessionCallback$BaseCallback(com.tencent.maas.imagestudio.MJImageSession mJImageSession) {
        this.imageSessionRef = new java.lang.ref.WeakReference<>(mJImageSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.imageSessionRef.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.imagestudio.MJImageSession mJImageSession, T t17);

    public MJImageSessionCallback$BaseCallback(com.tencent.maas.imagestudio.MJImageSession mJImageSession, boolean z17) {
        super(z17);
        this.imageSessionRef = new java.lang.ref.WeakReference<>(mJImageSession);
    }
}
