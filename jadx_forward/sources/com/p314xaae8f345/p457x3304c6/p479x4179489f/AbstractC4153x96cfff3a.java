package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.maas.moviecomposing.PlaybackSessionCallback$BaseCallback */
/* loaded from: classes5.dex */
public abstract class AbstractC4153x96cfff3a<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: playbackSessionRef */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db> f16132xde2cba98;

    public AbstractC4153x96cfff3a(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db) {
        this.f16132xde2cba98 = new java.lang.ref.WeakReference<>(c4152x8b3cf7db);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        mo34186x48671b37(this.f16132xde2cba98.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void mo34186x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, T t17);

    public AbstractC4153x96cfff3a(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db, boolean z17) {
        super(z17);
        this.f16132xde2cba98 = new java.lang.ref.WeakReference<>(c4152x8b3cf7db);
    }
}
