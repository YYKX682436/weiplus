package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class yp implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f287629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q f287631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.aq f287632g;

    public yp(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.aq aqVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar) {
        this.f287632g = aqVar;
        this.f287629d = f9Var;
        this.f287630e = str;
        this.f287631f = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        c01.n8.c();
        c01.t8 c17 = c01.n8.c();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f287629d;
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        boolean contains = ((java.util.ArrayList) ((zf4.l) c17).f554208g).contains(java.lang.Long.valueOf(m124847x74d37ac6));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.aq aqVar = this.f287632g;
        if (!contains && i17 == 0 && i18 == 0 && ((bt3.l0) m1Var).L().equals(this.f287630e)) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) aqVar.f284935s.f542241c.a(sb5.q2.class))).p0().k(this.f287631f.mo79416xf806b362(), f9Var);
        }
        c01.d9.e().q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, aqVar.f284936t);
        aqVar.f284936t = null;
    }
}
