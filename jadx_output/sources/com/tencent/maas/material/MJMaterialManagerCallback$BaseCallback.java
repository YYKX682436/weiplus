package com.tencent.maas.material;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class MJMaterialManagerCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.material.MJMaterialManager> mjMaterialManagerWeakReference;

    public MJMaterialManagerCallback$BaseCallback(com.tencent.maas.material.MJMaterialManager mJMaterialManager) {
        this.mjMaterialManagerWeakReference = new java.lang.ref.WeakReference<>(mJMaterialManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.mjMaterialManagerWeakReference.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.material.MJMaterialManager mJMaterialManager, T t17);

    public MJMaterialManagerCallback$BaseCallback(com.tencent.maas.material.MJMaterialManager mJMaterialManager, boolean z17) {
        super(z17);
        this.mjMaterialManagerWeakReference = new java.lang.ref.WeakReference<>(mJMaterialManager);
    }
}
