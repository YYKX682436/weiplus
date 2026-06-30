package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qu implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f195582d;

    public qu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar) {
        this.f195582d = ivVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f195582d;
        if (m75939xb282bd08 != 0) {
            db5.t7.m123883x26a183b(ivVar.R0().getContext(), ivVar.B.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7h), 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ivVar.f194549r, "kicked member failed:" + ret.m75939xb282bd08(1));
            return;
        }
        java.lang.String str = null;
        qo0.c.a(ivVar.f194548q, qo0.b.f446872d2, null, 2, null);
        db5.t7.m123883x26a183b(ivVar.R0().getContext(), ivVar.B.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7g), 0).show();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("kicked member succ");
        r45.xn1 xn1Var = ivVar.f194559y0;
        if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
            str = c19782x23db1cfa.m76197x6c03c64c();
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ivVar.f194549r, sb6.toString());
    }
}
