package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.OptionalPendingResultImpl */
/* loaded from: classes13.dex */
public final class C1785x193a5d34<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1751x8d3920f4<R> {
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523 zaa;

    public C1785x193a5d34(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 abstractC1752x4624a074) {
        this.zaa = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.AbstractC1771x4463523) abstractC1752x4624a074;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: addStatusListener */
    public final void mo17814xbaafdc7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener statusListener) {
        this.zaa.mo17814xbaafdc7(statusListener);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: await */
    public final R mo17815x58e7956() {
        return (R) this.zaa.mo17815x58e7956();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: cancel */
    public final void mo17729xae7a2e7a() {
        this.zaa.mo17729xae7a2e7a();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1751x8d3920f4
    public final R get() {
        if (this.zaa.m17881x7b5e8699()) {
            return (R) this.zaa.mo17816x58e7956(0L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        throw new java.lang.IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: isCanceled */
    public final boolean mo17817xc9602be3() {
        return this.zaa.mo17817xc9602be3();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1751x8d3920f4
    /* renamed from: isDone */
    public final boolean mo17813xb9a1ffcc() {
        return this.zaa.m17881x7b5e8699();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: setResultCallback */
    public final void mo17818x1deb1484(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<? super R> interfaceC1759x2ba3aba2) {
        this.zaa.mo17818x1deb1484(interfaceC1759x2ba3aba2);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: then */
    public final <S extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8<S> mo17820x364e1d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf<? super R, ? extends S> abstractC1761xc5c84baf) {
        return this.zaa.mo17820x364e1d(abstractC1761xc5c84baf);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: await */
    public final R mo17816x58e7956(long j17, java.util.concurrent.TimeUnit timeUnit) {
        return (R) this.zaa.mo17816x58e7956(j17, timeUnit);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074
    /* renamed from: setResultCallback */
    public final void mo17819x1deb1484(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<? super R> interfaceC1759x2ba3aba2, long j17, java.util.concurrent.TimeUnit timeUnit) {
        this.zaa.mo17819x1deb1484(interfaceC1759x2ba3aba2, j17, timeUnit);
    }
}
