package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.camstudio.MJCDNBridgeServiceCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4002x535c3e39<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: cdnBridgeServiceRef */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c> f15854xdc0c3454;

    public AbstractC4002x535c3e39(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c c4001x1040777c) {
        this.f15854xdc0c3454 = new java.lang.ref.WeakReference<>(c4001x1040777c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo32594x48671b37(this.f15854xdc0c3454.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo32594x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c c4001x1040777c, T t17);

    public AbstractC4002x535c3e39(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c c4001x1040777c, boolean z17) {
        super(z17);
        this.f15854xdc0c3454 = new java.lang.ref.WeakReference<>(c4001x1040777c);
    }
}
