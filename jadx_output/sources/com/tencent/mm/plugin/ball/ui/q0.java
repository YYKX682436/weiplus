package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class q0 implements gp1.y {

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.plugin.ball.ui.q0 f93345h;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.ui.n f93346d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93347e = false;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f93348f = false;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93349g = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).wi();

    public static com.tencent.mm.plugin.ball.ui.q0 e() {
        synchronized (com.tencent.mm.plugin.ball.ui.q0.class) {
            if (f93345h == null) {
                synchronized (com.tencent.mm.plugin.ball.ui.q0.class) {
                    f93345h = new com.tencent.mm.plugin.ball.ui.q0();
                }
            }
        }
        return f93345h;
    }

    @Override // gp1.y
    public void X(java.util.List list, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.ball.ui.g0 g0Var = new com.tencent.mm.plugin.ball.ui.g0(this, list, ballInfo);
        java.lang.Boolean bool = qp1.w.f365755a;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            g0Var.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(g0Var);
        }
    }

    public final void a() {
        if (this.f93346d == null) {
            this.f93346d = new com.tencent.mm.plugin.ball.ui.n(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUIManager", "attachFloatBallContainer new floatBallContainer");
            com.tencent.mm.plugin.ball.ui.n nVar = this.f93346d;
            nVar.f93319d.setVisibility(8);
            nVar.f93322g.setVisibility(8);
            com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = nVar.f93322g;
            android.view.WindowManager windowManager = nVar.f93316a;
            qp1.j.b(windowManager, floatBackgroundView);
            nVar.f93318c.setVisibility(8);
            qp1.j.c(windowManager, nVar.f93318c, qp1.w.k(), qp1.w.l(), null, null);
            com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = nVar.f93318c.L;
            if (floatBallCollapseView != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallCollapseView", "attachFloatBallCollapseViewToWindow");
                qp1.j.c(floatBallCollapseView.f93481d, floatBallCollapseView, 0, 0, null, null);
            }
            qp1.j.b(windowManager, nVar.f93319d);
            nVar.b();
            java.util.Set<gp1.b0> y07 = nVar.f93317b.y0();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "attachToWindow, add floatBallViewListeners %s", java.lang.Integer.valueOf(y07.size()));
            for (gp1.b0 listener : y07) {
                com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
                if (floatBallView != null) {
                    ((java.util.concurrent.CopyOnWriteArraySet) floatBallView.f93546p).add(listener);
                }
                com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
                if (contentFloatBallView != null) {
                    kotlin.jvm.internal.o.g(listener, "listener");
                    ((java.util.concurrent.CopyOnWriteArraySet) contentFloatBallView.f93427o).add(listener);
                }
            }
        }
        h();
    }

    public void b() {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93346d;
        if (nVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallUIManager", "clearVOIPView, container is null");
            return;
        }
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
        if (floatBallView != null) {
            com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.FloatBallView", "clearCustomView", new java.lang.Object[0]);
            android.widget.FrameLayout frameLayout = floatBallView.f93560w;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                floatBallView.f93550q = null;
                floatBallView.O1 = null;
                floatBallView.q0(false);
                if (!floatBallView.c0(floatBallView.f93524d)) {
                    floatBallView.setVisibility(8);
                }
                floatBallView.V = true;
            }
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUIManager", "detachFloatBallContainer");
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.p0(this));
            return;
        }
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93346d;
        if (nVar != null) {
            nVar.f();
            this.f93346d = null;
        }
        h();
    }

    public final void d(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView;
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93346d;
        boolean z18 = false;
        if (nVar != null) {
            com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView2 = nVar.f93319d;
            if (floatMenuView2 != null && floatMenuView2.getVisibility() == 0) {
                z18 = true;
            }
        }
        if (!z18) {
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(null);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.ball.ui.n nVar2 = this.f93346d;
        if (nVar2 == null || (floatMenuView = nVar2.f93319d) == null) {
            return;
        }
        if (z17) {
            floatMenuView.c(animatorListenerAdapter);
        } else if (floatMenuView.getVisibility() == 8) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "float menu already hide");
        } else {
            floatMenuView.setVisibility(8);
        }
    }

    public boolean f() {
        return this.f93346d != null;
    }

    public final void g(java.util.List list, java.util.List list2, java.util.List list3, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        gp1.v vVar;
        gp1.v vVar2;
        if (f()) {
            if (this.f93349g) {
                this.f93346d.k(list3, ballInfo);
                com.tencent.mm.plugin.ball.ui.n nVar = this.f93346d;
                nVar.getClass();
                java.util.List e17 = qp1.w.e(list2);
                if (qp1.w.a(list2)) {
                    list2.size();
                }
                ((java.util.Vector) e17).size();
                boolean z17 = false;
                if (qp1.w.a(e17)) {
                    boolean z18 = com.tencent.mm.app.w.INSTANCE.f53889n;
                    boolean z19 = nVar.c() || ((vVar2 = nVar.f93317b) != null && vVar2.z0());
                    nVar.f93326k = true;
                    if (!z18 || z19 || (vVar = nVar.f93317b) == null || vVar.f0()) {
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = java.lang.Boolean.valueOf(z18);
                        objArr[1] = java.lang.Boolean.valueOf(z19);
                        gp1.v vVar3 = nVar.f93317b;
                        if (vVar3 != null && vVar3.f0()) {
                            z17 = true;
                        }
                        objArr[2] = java.lang.Boolean.valueOf(z17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged-content, foreground:%s, canNotShowFloatBall:%s, forceHideAllFloatBall: %b", objArr);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged-content, show FloatBallView %b", java.lang.Boolean.FALSE);
                        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = nVar.f93320e;
                        if (contentFloatBallView != null) {
                            contentFloatBallView.J(false, true, null);
                        }
                    }
                } else {
                    nVar.f93326k = false;
                    com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = nVar.f93320e;
                    if (contentFloatBallView2 != null && contentFloatBallView2.getVisibility() == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged-content, hide FloatBallView");
                        nVar.f93320e.t(false, null);
                    }
                }
                com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView3 = nVar.f93320e;
                if (contentFloatBallView3 != null) {
                    contentFloatBallView3.X(list2, ballInfo);
                }
                nVar.o(list2);
            } else {
                this.f93346d.k(list, ballInfo);
            }
            h();
        }
    }

    public final void h() {
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93346d;
        if (nVar != null) {
            boolean z17 = this.f93347e;
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = nVar.f93318c;
            if (floatBallView != null) {
                floatBallView.setNeedTranslateAnimation(z17);
            }
        }
        this.f93347e = false;
    }
}
