package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class j extends gp1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93302a;

    public j(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93302a = nVar;
    }

    @Override // gp1.b0
    public void a(int i17, int i18, int i19, int i27, boolean z17, boolean z18, int i28, int i29, boolean z19, boolean z27) {
        com.tencent.mm.plugin.ball.ui.n nVar;
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView;
        int i37;
        int i38;
        int i39;
        int i47;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallSettled-content, x:%s, y:%s, height:%s, isDockLeft: %s, collapseState: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i28));
            com.tencent.mm.plugin.ball.service.p4 f17 = com.tencent.mm.plugin.ball.service.p4.f();
            f17.getClass();
            if (i17 != com.tencent.mm.plugin.ball.service.p4.f93198i) {
                com.tencent.mm.plugin.ball.service.p4.f93198i = i17;
                com.tencent.mm.sdk.platformtools.o4.M(f17.d()).A("content_pos_x", com.tencent.mm.plugin.ball.service.p4.f93198i);
            }
            if (i18 != com.tencent.mm.plugin.ball.service.p4.f93199m) {
                com.tencent.mm.plugin.ball.service.p4.f93199m = i18;
                com.tencent.mm.sdk.platformtools.o4.M(f17.d()).A("content_pos_y", com.tencent.mm.plugin.ball.service.p4.f93199m);
            }
            if (z18 != com.tencent.mm.plugin.ball.service.p4.f93201o) {
                com.tencent.mm.plugin.ball.service.p4.f93201o = z18;
                com.tencent.mm.sdk.platformtools.o4.M(f17.d()).G("content_dock_left", com.tencent.mm.plugin.ball.service.p4.f93201o);
            }
            if (com.tencent.mm.plugin.ball.service.p4.f93202p != i28) {
                com.tencent.mm.plugin.ball.service.p4.f93202p = i28;
                com.tencent.mm.sdk.platformtools.o4.M(f17.d()).A("content_collapse_state", com.tencent.mm.plugin.ball.service.p4.f93202p);
            }
        }
        if (z27 && (floatBallView = (nVar = this.f93302a).f93318c) != null && floatBallView.a0()) {
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView2 = nVar.f93318c;
            gp1.k kVar = floatBallView2.f93531g2;
            if (kVar != null) {
                android.graphics.Point a17 = kVar.a(i17, i18);
                int i48 = a17.x;
                int i49 = a17.y;
                android.graphics.Point d17 = floatBallView2.f93531g2.d(i19, i27);
                int i57 = d17.x;
                i38 = d17.y;
                i39 = i57;
                i47 = i49;
                i37 = i48;
            } else {
                i37 = i17;
                i38 = i27;
                i39 = i19;
                i47 = i18;
            }
            android.graphics.Point x17 = floatBallView2.x(null, i37, i47, i39, i38, z18);
            if (x17 != null) {
                floatBallView2.z0(x17.x, x17.y, floatBallView2.f93535i2, false, true, false);
                floatBallView2.I0(floatBallView2.f93563x1, x17.x, x17.y, true, false);
            }
        }
    }

    @Override // gp1.b0
    public void b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onCollapseStateChanged-content old: %d, new: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!gp1.i.a(i18)) {
            if (!(i18 == 0)) {
                return;
            }
        }
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = this.f93302a.f93322g;
        if (floatBackgroundView != null) {
            floatBackgroundView.setDisableAlphaUpdate(false);
        }
    }

    @Override // gp1.b0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onCollapsedViewClicked-content");
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93302a;
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = nVar.f93319d;
        if (floatMenuView != null && floatMenuView.getVisibility() == 0) {
            com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = nVar.f93322g;
            if (floatBackgroundView != null) {
                floatBackgroundView.setDisableAlphaUpdate(true);
            }
            nVar.n();
        }
    }

    @Override // gp1.b0
    public void d(int i17, int i18) {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93302a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallDragStart needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f93324i));
        if (nVar.f93324i) {
            qp1.j.a(131072, nVar.f93318c);
            qp1.j.a(131072, nVar.f93320e);
        }
        nVar.n();
    }

    @Override // gp1.b0
    public void f() {
        gp1.v vVar;
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93302a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallDragEnd needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f93324i));
        if (!nVar.f93324i || (vVar = nVar.f93317b) == null || vVar.t(true, new com.tencent.mm.plugin.ball.ui.i(this))) {
            return;
        }
        nVar.m(131072);
    }

    @Override // gp1.b0
    public void h() {
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = this.f93302a.f93322g;
        if (floatBackgroundView != null) {
            floatBackgroundView.a(false);
        }
    }
}
