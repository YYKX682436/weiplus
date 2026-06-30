package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class x4 implements mp1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.service.s4 f93264a;

    public x4(com.tencent.mm.plugin.ball.service.s4 s4Var) {
        this.f93264a = s4Var;
    }

    public int a(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "swipePageToFloatBall, swipePosX:%s", java.lang.Float.valueOf(f17));
        com.tencent.mm.plugin.ball.service.s4 s4Var = this.f93264a;
        gp1.v vVar = s4Var.f93136h;
        if (vVar == null) {
            return 1;
        }
        com.tencent.mm.plugin.ball.model.BallInfo t07 = vVar != null ? vVar.t0(s4Var.f93132d) : null;
        boolean z17 = t07 != null;
        dp1.x xVar = s4Var.f93239n;
        if ((!z17 || t07.I) && !s4Var.k()) {
            pv.e0 e0Var = (pv.e0) i95.n0.c(pv.e0.class);
            android.app.Activity activity = xVar.getActivity();
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = s4Var.f93132d;
            boolean l17 = s4Var.l();
            com.tencent.mm.plugin.ball.ui.v0 v0Var = s4Var.f93137i;
            ((ov.i0) e0Var).getClass();
            com.tencent.mm.plugin.ball.ui.FloatBallProxyUI.U6(activity, 1, ballInfo, l17, v0Var);
            return 2;
        }
        if (z17) {
            s4Var.t().f93090m = 5;
        } else {
            s4Var.t().f93084d = 1;
        }
        s4Var.e();
        s4Var.f93246u = false;
        android.graphics.Point point = new android.graphics.Point(qp1.c0.f365694c, qp1.c0.f365695d);
        boolean w17 = s4Var.w();
        gp1.v vVar2 = s4Var.f93136h;
        android.graphics.Point D = w17 ? vVar2.D(1, xVar.v(), xVar.o(), point) : null;
        if (D == null) {
            D = vVar2.G();
        }
        s4Var.f93132d.f93058s = false;
        s4Var.r0();
        com.tencent.mm.plugin.ball.ui.e0.a(xVar, D, point, f17, s4Var.f93243r);
        if (vVar2 == null) {
            return 3;
        }
        vVar2.u0(false);
        return 3;
    }
}
