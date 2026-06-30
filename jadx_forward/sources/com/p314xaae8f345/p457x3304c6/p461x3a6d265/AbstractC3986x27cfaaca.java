package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC3986x27cfaaca<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: serviceBridgeRef */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b> f15806x49601915;

    public AbstractC3986x27cfaaca(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b) {
        this.f15806x49601915 = new java.lang.ref.WeakReference<>(c3985x6b47324b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo32483x48671b37(this.f15806x49601915.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo32483x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b, T t17);

    public AbstractC3986x27cfaaca(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b, boolean z17) {
        super(z17);
        this.f15806x49601915 = new java.lang.ref.WeakReference<>(c3985x6b47324b);
    }
}
