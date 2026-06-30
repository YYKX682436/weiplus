package com.tencent.maas.camstudio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class MJCDNBridgeServiceCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJCDNBridgeService> cdnBridgeServiceRef;

    public MJCDNBridgeServiceCallback$BaseCallback(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService) {
        this.cdnBridgeServiceRef = new java.lang.ref.WeakReference<>(mJCDNBridgeService);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.cdnBridgeServiceRef.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, T t17);

    public MJCDNBridgeServiceCallback$BaseCallback(com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService, boolean z17) {
        super(z17);
        this.cdnBridgeServiceRef = new java.lang.ref.WeakReference<>(mJCDNBridgeService);
    }
}
