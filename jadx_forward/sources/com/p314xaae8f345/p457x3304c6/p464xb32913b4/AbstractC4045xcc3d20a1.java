package com.p314xaae8f345.p457x3304c6.p464xb32913b4;

/* renamed from: com.tencent.maas.export.MJMovieExporterCallback$BaseCallback */
/* loaded from: classes5.dex */
abstract class AbstractC4045xcc3d20a1<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: mjMovieExporterRef */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4044x4821e414> f15919xc765f7df;

    public AbstractC4045xcc3d20a1(com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4044x4821e414 c4044x4821e414) {
        this.f15919xc765f7df = new java.lang.ref.WeakReference<>(c4044x4821e414);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        m32965x48671b37(this.f15919xc765f7df.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void m32965x48671b37(com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4044x4821e414 c4044x4821e414, T t17);

    public AbstractC4045xcc3d20a1(com.p314xaae8f345.p457x3304c6.p464xb32913b4.C4044x4821e414 c4044x4821e414, boolean z17) {
        super(z17);
        this.f15919xc765f7df = new java.lang.ref.WeakReference<>(c4044x4821e414);
    }
}
