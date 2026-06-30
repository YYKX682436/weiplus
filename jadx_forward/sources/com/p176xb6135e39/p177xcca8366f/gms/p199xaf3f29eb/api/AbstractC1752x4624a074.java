package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api;

/* renamed from: com.google.android.gms.common.api.PendingResult */
/* loaded from: classes13.dex */
public abstract class AbstractC1752x4624a074<R extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> {

    /* renamed from: com.google.android.gms.common.api.PendingResult$StatusListener */
    /* loaded from: classes13.dex */
    public interface StatusListener {
        /* renamed from: onComplete */
        void mo17821x815f5438(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12);
    }

    /* renamed from: addStatusListener */
    public void mo17814xbaafdc7(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener statusListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: await */
    public abstract R mo17815x58e7956();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: await */
    public abstract R mo17816x58e7956(long j17, java.util.concurrent.TimeUnit timeUnit);

    /* renamed from: cancel */
    public abstract void mo17729xae7a2e7a();

    /* renamed from: isCanceled */
    public abstract boolean mo17817xc9602be3();

    /* renamed from: setResultCallback */
    public abstract void mo17818x1deb1484(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<? super R> interfaceC1759x2ba3aba2);

    /* renamed from: setResultCallback */
    public abstract void mo17819x1deb1484(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1759x2ba3aba2<? super R> interfaceC1759x2ba3aba2, long j17, java.util.concurrent.TimeUnit timeUnit);

    /* renamed from: then */
    public <S extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1758x91b2b43d> com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1764xea3f0ce8<S> mo17820x364e1d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1761xc5c84baf<? super R, ? extends S> abstractC1761xc5c84baf) {
        throw new java.lang.UnsupportedOperationException();
    }
}
