package com.p314xaae8f345.p457x3304c6.p475x4a451306;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.lowerthird.MJLowerThirdImageGeneratorCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4101xa32781a<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: mjLowerThirdImageGeneratorWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p475x4a451306.C4100x1244b2fb> f16083x8e988f78;

    public AbstractC4101xa32781a(com.p314xaae8f345.p457x3304c6.p475x4a451306.C4100x1244b2fb c4100x1244b2fb) {
        this.f16083x8e988f78 = new java.lang.ref.WeakReference<>(c4100x1244b2fb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo33795x48671b37(this.f16083x8e988f78.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo33795x48671b37(com.p314xaae8f345.p457x3304c6.p475x4a451306.C4100x1244b2fb c4100x1244b2fb, T t17);

    public AbstractC4101xa32781a(com.p314xaae8f345.p457x3304c6.p475x4a451306.C4100x1244b2fb c4100x1244b2fb, boolean z17) {
        super(z17);
        this.f16083x8e988f78 = new java.lang.ref.WeakReference<>(c4100x1244b2fb);
    }
}
