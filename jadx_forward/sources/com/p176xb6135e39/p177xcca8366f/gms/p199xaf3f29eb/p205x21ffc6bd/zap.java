package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
final class zap implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 zaa;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc zab;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.ResultConverter zac;
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zas zad;

    public zap(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074 abstractC1752x4624a074, com.p176xb6135e39.p177xcca8366f.gms.p241x6907b8e.C2440x4f4de6dc c2440x4f4de6dc, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1922x695faa96.ResultConverter resultConverter, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zas zasVar) {
        this.zaa = abstractC1752x4624a074;
        this.zab = c2440x4f4de6dc;
        this.zac = resultConverter;
        this.zad = zasVar;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1752x4624a074.StatusListener
    /* renamed from: onComplete */
    public final void mo17821x815f5438(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.C1763x9432bc12 c1763x9432bc12) {
        if (!c1763x9432bc12.m17855x6e268779()) {
            this.zab.m19603xb411020d(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1898x7a082917.m18078x8098ec3c(c1763x9432bc12));
        } else {
            this.zab.m19604x209a1f1f(this.zac.mo17330x38b81db3(this.zaa.mo17816x58e7956(0L, java.util.concurrent.TimeUnit.MILLISECONDS)));
        }
    }
}
