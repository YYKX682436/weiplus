package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class n extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t f203350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f203351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vp2.c f203352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f203353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f203356g;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t tVar, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, vp2.c cVar, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, in5.s0 s0Var, yz5.p pVar) {
        this.f203350a = tVar;
        this.f203351b = c22849x81a93d25;
        this.f203352c = cVar;
        this.f203353d = z17;
        this.f203354e = h0Var;
        this.f203355f = s0Var;
        this.f203356g = pVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.String str = this.f203350a.f203475h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindAggregationCardRecyclerView isExposed: ");
        sb6.append(z17);
        sb6.append(", curCardId: ");
        sb6.append(this.f203351b.getTag());
        sb6.append(" cardId: ");
        vp2.c cVar = this.f203352c;
        sb6.append(cVar.f520443d.f460880d);
        sb6.append(" loopIndex: ");
        sb6.append(cVar.f520445f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f203354e;
        if (!z17 || !this.f203353d) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) h0Var.f391656d;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                return;
            }
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = (p3325xe03a0797.p3326xc267989b.r2) h0Var.f391656d;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f203355f.f374653d;
        h0Var.f391656d = y0Var != null ? p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m(this.f203356g, null), 3, null) : null;
    }
}
