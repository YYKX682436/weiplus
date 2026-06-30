package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.moviecomposing.ExportSessionCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4144xc797d553<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: exportSessionRef */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422> f16120x17da8cf1;

    public AbstractC4144xc797d553(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422) {
        this.f16120x17da8cf1 = new java.lang.ref.WeakReference<>(c4143xe6876422);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo34065x48671b37(this.f16120x17da8cf1.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo34065x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422, T t17);

    public AbstractC4144xc797d553(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422, boolean z17) {
        super(z17);
        this.f16120x17da8cf1 = new java.lang.ref.WeakReference<>(c4143xe6876422);
    }
}
