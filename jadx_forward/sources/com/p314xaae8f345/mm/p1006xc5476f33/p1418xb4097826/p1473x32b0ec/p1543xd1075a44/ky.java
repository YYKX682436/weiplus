package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes2.dex */
public final class ky implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17 f200402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f200403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f200404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f200405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f200406e;

    public ky(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14412x91d09c17 c14412x91d09c17, r45.xn1 xn1Var, p3325xe03a0797.p3326xc267989b.y0 y0Var, yz5.l lVar, yz5.a aVar) {
        this.f200402a = c14412x91d09c17;
        this.f200403b = xn1Var;
        this.f200404c = y0Var;
        this.f200405d = lVar;
        this.f200406e = aVar;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        if (obj instanceof r45.nw6) {
            java.lang.String str = this.f200402a.f199232d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request finderUserpagePreview username: ");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.f200403b.m75936x14adae67(0);
            sb6.append(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null);
            sb6.append(" success: ");
            sb6.append(((r45.nw6) obj).mo12245xcc313de3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f200404c;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jy(this.f200402a, obj, this.f200405d, this.f200406e, null), 2, null);
        }
    }
}
