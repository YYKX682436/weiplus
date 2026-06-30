package com.tencent.maas.camstudio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class MJAIGCBridgeServiceCallback$BaseCallback<T> extends com.tencent.maas.internal.a {
    private final java.lang.ref.WeakReference<com.tencent.maas.camstudio.MJAIGCBridgeService> serviceBridgeRef;

    public MJAIGCBridgeServiceCallback$BaseCallback(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService) {
        this.serviceBridgeRef = new java.lang.ref.WeakReference<>(mJAIGCBridgeService);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.maas.internal.a
    public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
        onInvoke(this.serviceBridgeRef.get(), callbackArgs);
    }

    public abstract void onInvoke(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, T t17);

    public MJAIGCBridgeServiceCallback$BaseCallback(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, boolean z17) {
        super(z17);
        this.serviceBridgeRef = new java.lang.ref.WeakReference<>(mJAIGCBridgeService);
    }
}
