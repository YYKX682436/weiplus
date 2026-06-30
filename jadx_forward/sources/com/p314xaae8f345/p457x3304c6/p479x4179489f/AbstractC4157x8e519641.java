package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* renamed from: com.tencent.maas.moviecomposing.ProjectManagerCallback$BaseCallback */
/* loaded from: classes5.dex */
abstract class AbstractC4157x8e519641<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

    /* renamed from: projectManagerWeakReference */
    private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.p479x4179489f.C4156x26db2a74> f16143xd7ff60bf;

    public AbstractC4157x8e519641(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4156x26db2a74 c4156x26db2a74) {
        this.f16143xd7ff60bf = new java.lang.ref.WeakReference<>(c4156x26db2a74);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
    /* renamed from: invoke */
    public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
        m34203x48671b37(this.f16143xd7ff60bf.get(), callbackArgs);
    }

    /* renamed from: onInvoke */
    public abstract void m34203x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4156x26db2a74 c4156x26db2a74, T t17);

    public AbstractC4157x8e519641(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4156x26db2a74 c4156x26db2a74, boolean z17) {
        super(z17);
        this.f16143xd7ff60bf = new java.lang.ref.WeakReference<>(c4156x26db2a74);
    }
}
