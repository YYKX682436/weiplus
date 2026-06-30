package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class op implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q f286752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.up f286753g;

    public op(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.up upVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar) {
        this.f286753g = upVar;
        this.f286750d = f9Var;
        this.f286751e = str;
        this.f286752f = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        c01.n8.c();
        c01.t8 c17 = c01.n8.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286750d;
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        boolean contains = ((java.util.ArrayList) ((zf4.l) c17).f554208g).contains(java.lang.Long.valueOf(m124847x74d37ac6));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.up upVar = this.f286753g;
        if (!contains && i17 == 0 && i18 == 0 && ((bt3.l0) m1Var).L().equals(this.f286751e)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 M1 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.M1(f9Var);
            M1.i1(f9Var.J0());
            M1.m124849x5361953a(-1L);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) upVar.f287256s.f542241c.a(sb5.q2.class))).p0().j(this.f286752f.mo79416xf806b362(), M1);
        }
        c01.d9.e().q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, upVar.f287257t);
        upVar.f287257t = null;
    }
}
