package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class tj implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14398xa1f1632d f201420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f201421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f201422c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f201423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f201424e;

    public tj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14398xa1f1632d c14398xa1f1632d, r45.xn1 xn1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, yz5.p pVar, yz5.a aVar) {
        this.f201420a = c14398xa1f1632d;
        this.f201421b = xn1Var;
        this.f201422c = y0Var;
        this.f201423d = pVar;
        this.f201424e = aVar;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        if (obj instanceof r45.nw6) {
            java.lang.String str = this.f201420a.f199150d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request finderUserpagePreview username: ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.f201421b.m75936x14adae67(0);
            sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null);
            sb6.append(" success: ");
            sb6.append(((r45.nw6) obj).mo12245xcc313de3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f201422c;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sj(this.f201420a, obj, this.f201423d, this.f201424e, null), 2, null);
        }
    }
}
