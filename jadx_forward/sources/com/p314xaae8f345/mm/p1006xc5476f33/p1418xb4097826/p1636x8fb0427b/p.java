package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes2.dex */
public final class p implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q f208870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0 f208871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f208872f;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0 tj0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        this.f208870d = qVar;
        this.f208871e = tj0Var;
        this.f208872f = c19782x23db1cfa;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        ya2.g gVar;
        ya2.b2 b17;
        r45.lh2 req = (r45.lh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        this.f208870d.f208931b.remove(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.tj0 tj0Var = this.f208871e;
        if (tj0Var != null) {
            tj0Var.a(ret.m75939xb282bd08(1) == 0);
        }
        if (ret.m75939xb282bd08(1) == 0 && req.m75939xb282bd08(1) == 0 && (b17 = (gVar = ya2.h.f542017a).b(this.f208872f.m76197x6c03c64c())) != null) {
            b17.f69308x26b1b2e8 &= -16385;
            gVar.o(b17);
        }
    }
}
