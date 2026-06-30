package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class g extends gp1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f93291a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93292b;

    public g(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93292b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // gp1.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r13, int r14, int r15, int r16, boolean r17, boolean r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.ui.g.a(int, int, int, int, boolean, boolean, int, int, boolean, boolean):void");
    }

    @Override // gp1.b0
    public void b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17, int i18) {
        if (ballInfo == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onCollapseStateChanged current: %d, old: %d, new: %d", java.lang.Integer.valueOf(this.f93291a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((this.f93291a == 0) && gp1.i.a(i18)) {
            com.tencent.mm.plugin.ball.service.h.b(ballInfo, 17);
        } else if (gp1.i.a(this.f93291a)) {
            if (i18 == 0) {
                com.tencent.mm.plugin.ball.service.h.b(ballInfo, 18);
            }
        }
        if (!gp1.i.a(i18)) {
            if (!(i18 == 0)) {
                return;
            }
        }
        this.f93291a = i18;
    }

    @Override // gp1.b0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onCollapsedViewClicked-normal");
        this.f93292b.n();
    }

    @Override // gp1.b0
    public void d(int i17, int i18) {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93292b;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallDragStart needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f93324i));
        if (nVar.f93324i) {
            qp1.j.a(131072, nVar.f93318c);
            qp1.j.a(131072, nVar.f93320e);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
        if (contentFloatBallView != null && !contentFloatBallView.w()) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallView.I(contentFloatBallView, false, contentFloatBallView.A, false, true, null, false, null, 116, null);
        }
        nVar.n();
    }

    @Override // gp1.c0, gp1.b0
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallLongPressed");
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93292b;
        op1.a aVar = nVar.f93328m;
        aVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        aVar.f347235a = java.lang.System.currentTimeMillis();
        nVar.l(false);
        nVar.f93318c.H(false, null);
        nVar.f93319d.setInLongPressMode(true);
        nVar.f93319d.h(null);
    }

    @Override // gp1.b0
    public void f() {
        gp1.v vVar;
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93292b;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallDragEnd needProcessFloatViewFlags: %b", java.lang.Boolean.valueOf(nVar.f93324i));
        if (!nVar.f93324i || (vVar = nVar.f93317b) == null || vVar.v(true, new com.tencent.mm.plugin.ball.ui.f(this))) {
            return;
        }
        nVar.m(131072);
    }

    @Override // gp1.c0, gp1.b0
    public void g(android.view.MotionEvent motionEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallLongPressTouchEvent");
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f93292b.f93319d;
        if (floatMenuView.f93595z) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    floatMenuView.e(motionEvent);
                    return;
                } else {
                    if (action != 3) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "onBallLongPressTouchEvent, CANCEL(%s, %s)", java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
                    return;
                }
            }
            floatMenuView.e(motionEvent);
            android.view.View view = floatMenuView.C;
            if (view == null || !(view.getTag() instanceof com.tencent.mm.plugin.ball.model.BallInfo)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "no lastTouchedItemView, call back pressed");
                floatMenuView.d();
            } else {
                floatMenuView.g(floatMenuView.C);
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) floatMenuView.C.getTag();
                if (ballInfo.I) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "passive ballInfo, call back pressed");
                    floatMenuView.d();
                } else {
                    ballInfo.M.f93090m = 2;
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) floatMenuView.f93586q).iterator();
                    while (it.hasNext()) {
                        ((com.tencent.mm.plugin.ball.ui.d) ((mp1.f) it.next())).a(ballInfo);
                    }
                }
            }
            floatMenuView.f93595z = false;
            floatMenuView.C = null;
            floatMenuView.D = -1;
        }
    }

    @Override // gp1.b0
    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onBallClicked");
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93292b;
        op1.a aVar = nVar.f93328m;
        aVar.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        aVar.f347235a = java.lang.System.currentTimeMillis();
        if (nVar.f93327l) {
            nVar.f93318c.i0(false);
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
            if (contentFloatBallView != null && contentFloatBallView.y() && nVar.f93320e.s() && nVar.f93320e.x()) {
                com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = nVar.f93322g;
                if (floatBackgroundView != null) {
                    floatBackgroundView.setDisableAlphaUpdate(true);
                }
                com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = nVar.f93320e;
                if (contentFloatBallView2 != null) {
                    contentFloatBallView2.h();
                }
            }
        } else {
            nVar.f93318c.H(false, null);
            nVar.l(false);
        }
        nVar.f93319d.setInLongPressMode(false);
        nVar.f93319d.h(null);
    }

    @Override // gp1.c0, gp1.b0
    public void onOrientationChange(int i17) {
        com.tencent.mm.plugin.ball.ui.n.a(this.f93292b, i17);
    }
}
