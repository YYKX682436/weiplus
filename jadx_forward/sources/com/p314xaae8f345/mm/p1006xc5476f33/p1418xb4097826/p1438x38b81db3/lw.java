package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class lw extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nw f185485b;

    public lw(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nw nwVar) {
        this.f185484a = s0Var;
        this.f185485b = nwVar;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) this.f185484a.f374658i;
                if (ysVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nw nwVar = this.f185485b;
                    java.util.List subList = ysVar.f192725d.m75941xfb821914(4).subList(0, java.lang.Math.min(3, ysVar.f192725d.m75941xfb821914(4).size()));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
                    java.util.Iterator it = subList.iterator();
                    java.lang.String str = "";
                    while (it.hasNext()) {
                        str = str + pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()) + '|';
                    }
                    r45.qt2 qt2Var = nwVar.f185666e;
                    if (qt2Var != null) {
                        ey2.e2 e2Var = (ey2.e2) pf5.u.f435469a.e(c61.l7.class).a(ey2.e2.class);
                        e2Var.getClass();
                        java.lang.Integer num = (java.lang.Integer) e2Var.f338891f.get(ey2.e2.f338889i.a(ysVar));
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Mk(str, num == null ? -1 : num.intValue(), qt2Var);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.StreamCardFeedConvert", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
