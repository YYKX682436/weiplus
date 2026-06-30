package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class f6 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 f191539a;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var) {
        this.f191539a = p6Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        so2.j5 j5Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p6 p6Var = this.f191539a;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa = p6Var.m56636x4905e9fa();
            int u07 = m56636x4905e9fa != null ? m56636x4905e9fa.u0(k3Var.f3639x46306858) : 0;
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            long mo2128x1ed62e84 = (s0Var == null || (j5Var = (so2.j5) s0Var.f374658i) == null) ? 0L : j5Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 a6Var = p6Var.f191932e;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = a6Var.f191183d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            int i17 = a6Var.f191185f == 2 ? 1 : 2;
            java.lang.String str = (java.lang.String) kz5.n0.Z(a6Var.f191195s);
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.pj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, V6, a6Var.f191194r, 2, i17, str2, a6Var.f191193q, 0, mo2128x1ed62e84, u07, 64, null);
        }
    }
}
