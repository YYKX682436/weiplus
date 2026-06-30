package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class x4 implements mp1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 f174797a;

    public x4(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var) {
        this.f174797a = s4Var;
    }

    public int a(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "swipePageToFloatBall, swipePosX:%s", java.lang.Float.valueOf(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var = this.f174797a;
        gp1.v vVar = s4Var.f174669h;
        if (vVar == null) {
            return 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = vVar != null ? vVar.t0(s4Var.f174665d) : null;
        boolean z17 = t07 != null;
        dp1.x xVar = s4Var.f174772n;
        if ((!z17 || t07.I) && !s4Var.k()) {
            pv.e0 e0Var = (pv.e0) i95.n0.c(pv.e0.class);
            android.app.Activity mo50327x19263085 = xVar.mo50327x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = s4Var.f174665d;
            boolean l17 = s4Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v0 v0Var = s4Var.f174670i;
            ((ov.i0) e0Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.ActivityC12906x5398ea7.U6(mo50327x19263085, 1, c12886x91aa2b6d, l17, v0Var);
            return 2;
        }
        if (z17) {
            s4Var.t().f174623m = 5;
        } else {
            s4Var.t().f174617d = 1;
        }
        s4Var.e();
        s4Var.f174779u = false;
        android.graphics.Point point = new android.graphics.Point(qp1.c0.f447227c, qp1.c0.f447228d);
        boolean w17 = s4Var.w();
        gp1.v vVar2 = s4Var.f174669h;
        android.graphics.Point D = w17 ? vVar2.D(1, xVar.v(), xVar.o(), point) : null;
        if (D == null) {
            D = vVar2.G();
        }
        s4Var.f174665d.f174591s = false;
        s4Var.r0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.e0.a(xVar, D, point, f17, s4Var.f174776r);
        if (vVar2 == null) {
            return 3;
        }
        vVar2.u0(false);
        return 3;
    }
}
