package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowManager f93316a;

    /* renamed from: b, reason: collision with root package name */
    public final gp1.v f93317b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallView f93318c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatMenuView f93319d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.ContentFloatBallView f93320e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView f93321f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.view.FloatBackgroundView f93322g;

    /* renamed from: h, reason: collision with root package name */
    public int f93323h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f93324i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93325j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f93326k = false;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f93327l;

    /* renamed from: m, reason: collision with root package name */
    public final op1.a f93328m;

    /* renamed from: n, reason: collision with root package name */
    public int f93329n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93330o;

    public n(android.content.Context context) {
        this.f93323h = 0;
        boolean z17 = com.tencent.mm.plugin.ball.ui.q0.e().f93349g;
        this.f93327l = z17;
        this.f93329n = 1;
        this.f93330o = false;
        com.tencent.mm.plugin.ball.ui.b bVar = new com.tencent.mm.plugin.ball.ui.b(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "FloatBallContainer.constructor isMultiFloatBallMode: %s", java.lang.Boolean.valueOf(z17));
        this.f93316a = (android.view.WindowManager) context.getSystemService("window");
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        this.f93317b = Bi;
        this.f93328m = new op1.a();
        int k17 = i65.a.k(context);
        this.f93323h = k17;
        Bi.g(k17);
        com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = new com.tencent.mm.plugin.ball.view.FloatBackgroundView(context, null, 0, 6, null);
        this.f93322g = floatBackgroundView;
        ((java.util.concurrent.CopyOnWriteArraySet) floatBackgroundView.f93439d).add(new com.tencent.mm.plugin.ball.ui.l(this));
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = new com.tencent.mm.plugin.ball.view.FloatBallView(context, null);
        this.f93318c = floatBallView;
        Bi.C(floatBallView);
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView2 = this.f93318c;
        ((java.util.concurrent.CopyOnWriteArraySet) floatBallView2.f93546p).add(new com.tencent.mm.plugin.ball.ui.g(this));
        this.f93318c.setFloatBallViewDelegate(new com.tencent.mm.plugin.ball.ui.h(this));
        j(context);
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = new com.tencent.mm.plugin.ball.view.FloatMenuView(context, null);
        this.f93319d = floatMenuView;
        if (z17) {
            floatMenuView.f93581i = this.f93322g;
            floatMenuView.f93582m = this.f93318c;
        }
        ((java.util.concurrent.CopyOnWriteArraySet) floatMenuView.f93586q).add(new com.tencent.mm.plugin.ball.ui.d(this));
        this.f93319d.setOnMeasuredListener(new com.tencent.mm.plugin.ball.ui.e(this));
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(0, bVar);
    }

    public static void a(com.tencent.mm.plugin.ball.ui.n nVar, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "whenOrientationChange new:%d, last:%d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(nVar.f93329n), java.lang.Integer.valueOf(nVar.f93319d.getMeasuredHeight()));
        if (nVar.f93329n == i17) {
            return;
        }
        nVar.f93329n = i17;
        if (nVar.f93319d.getVisibility() == 0) {
            nVar.f93319d.setVisibility(8);
            com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = nVar.f93322g;
            if (floatBackgroundView != null) {
                floatBackgroundView.a(false);
            }
            nVar.d();
        }
    }

    public final void b() {
        if (com.tencent.mm.plugin.ball.ui.q0.e().f93349g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "attachContentFloatBallViewInner");
            if (this.f93320e == null) {
                j(com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            this.f93320e.setVisibility(8);
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93320e;
            com.tencent.mm.plugin.ball.service.p4.f().getClass();
            int i17 = com.tencent.mm.plugin.ball.service.p4.f93198i;
            com.tencent.mm.plugin.ball.service.p4.f().getClass();
            qp1.j.c(this.f93316a, contentFloatBallView, i17, com.tencent.mm.plugin.ball.service.p4.f93199m, null, null);
            java.util.Set<gp1.b0> y07 = this.f93317b.y0();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "attachContentFloatBallViewInner, add floatBallViewListeners %s", java.lang.Integer.valueOf(y07.size()));
            for (gp1.b0 listener : y07) {
                com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = this.f93320e;
                if (contentFloatBallView2 != null) {
                    kotlin.jvm.internal.o.g(listener, "listener");
                    ((java.util.concurrent.CopyOnWriteArraySet) contentFloatBallView2.f93427o).add(listener);
                }
            }
        }
    }

    public boolean c() {
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f93319d;
        return floatMenuView != null && floatMenuView.getVisibility() == 0;
    }

    public final void d() {
        boolean z17 = com.tencent.mm.app.w.INSTANCE.f53889n;
        boolean j17 = this.f93317b.j();
        boolean z07 = this.f93317b.z0();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "checkShowFloatBallIfNeed, isAppForeground:%s, isQBFileViewPage:%s, isNoFloatBallPage", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(j17), java.lang.Boolean.valueOf(z07));
        if (z07 || !(z17 || j17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "wechat not in foreground or qb file view page, ignore showing float ball");
            return;
        }
        this.f93318c.l0(false, null);
        if (this.f93327l) {
            this.f93318c.i0(true);
        }
        l(true);
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachContentFloatBallFromWindow");
        if (this.f93320e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachContentFloatBallViewFromWindow");
            this.f93320e.t(false, null);
            android.view.WindowManager windowManager = this.f93316a;
            try {
                if (windowManager == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallContainer", "detachContentFromWindowInternal, window manager is null");
                    return;
                }
                com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93320e;
                if (contentFloatBallView != null) {
                    contentFloatBallView.H();
                    windowManager.removeView(this.f93320e);
                    this.f93320e = null;
                }
                com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView floatBallMaskAnimationView = this.f93321f;
                if (floatBallMaskAnimationView != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMaskAnimationView", "release");
                    try {
                        floatBallMaskAnimationView.f93496g = null;
                        android.view.WindowManager windowManager2 = floatBallMaskAnimationView.f93493d;
                        if (windowManager2 != null) {
                            windowManager2.removeView(floatBallMaskAnimationView);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallMaskAnimationView", th6, "release exception", new java.lang.Object[0]);
                    }
                    this.f93321f = null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachContentFromWindowInternal, detach all views");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallContainer", e17, "detachFromWindowInternal exception", new java.lang.Object[0]);
            }
        }
    }

    public void f() {
        e();
        if (!this.f93318c.a0() && this.f93319d.getVisibility() != 0) {
            g();
            return;
        }
        if (this.f93318c.a0()) {
            boolean z17 = this.f93318c.F1;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachFromWindow, hide floatBallView, needTranslateAnimation: %b", java.lang.Boolean.valueOf(z17));
            if (z17) {
                this.f93318c.I(new com.tencent.mm.plugin.ball.ui.a(this));
                return;
            } else {
                this.f93318c.H(false, null);
                g();
                return;
            }
        }
        if (this.f93319d.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachFromWindow, hide floatMenuView");
            this.f93328m.a(1);
            this.f93319d.setCanAddFloatBallWhenHide(this.f93330o);
            this.f93330o = false;
            this.f93319d.c(null);
            g();
        }
    }

    public final void g() {
        android.view.WindowManager windowManager = this.f93316a;
        try {
            if (windowManager == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FloatBallContainer", "detachFromWindowInternal, window manager is null");
                return;
            }
            com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93318c;
            if (floatBallView != null) {
                floatBallView.f93546p.clear();
                floatBallView.M = false;
                floatBallView.f93531g2 = null;
                com.tencent.mm.plugin.ball.view.FloatBallCollapseView floatBallCollapseView = floatBallView.L;
                if (floatBallCollapseView != null) {
                    try {
                        android.view.WindowManager windowManager2 = floatBallCollapseView.f93481d;
                        if (windowManager2 != null) {
                            windowManager2.removeView(floatBallCollapseView);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallCollapseView", th6, "releaseCollapseView exception", new java.lang.Object[0]);
                    }
                }
                windowManager.removeView(this.f93318c);
            }
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = this.f93320e;
            if (contentFloatBallView != null) {
                windowManager.removeView(contentFloatBallView);
                this.f93320e = null;
            }
            com.tencent.mm.plugin.ball.view.FloatBackgroundView floatBackgroundView = this.f93322g;
            if (floatBackgroundView != null) {
                windowManager.removeView(floatBackgroundView);
            }
            com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f93319d;
            if (floatMenuView != null) {
                windowManager.removeView(floatMenuView);
            }
            gp1.v vVar = this.f93317b;
            if (vVar != null) {
                vVar.s0();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "detachFromWindowInternal, detach all views");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallContainer", e17, "detachFromWindowInternal exception", new java.lang.Object[0]);
        }
    }

    public void h(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.f93318c != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "hide FloatBallView, animation:%s", java.lang.Boolean.valueOf(z17));
            this.f93318c.H(z17, animatorListenerAdapter);
        }
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f93319d;
        if (floatMenuView == null || floatMenuView.E) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "hide FloatMenuView, animation:%s", java.lang.Boolean.valueOf(z17));
        this.f93319d.c(animatorListenerAdapter);
    }

    public final void i() {
        this.f93330o = false;
        com.tencent.mm.plugin.ball.ui.m mVar = new com.tencent.mm.plugin.ball.ui.m(this);
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f93319d;
        if (floatMenuView != null) {
            floatMenuView.c(mVar);
        }
    }

    public final void j(android.content.Context context) {
        if (com.tencent.mm.plugin.ball.ui.q0.e().f93349g) {
            if (this.f93321f == null) {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.g(context2, "context");
                com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView floatBallMaskAnimationView = new com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView(context2, null);
                this.f93321f = floatBallMaskAnimationView;
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMaskAnimationView", "attachMaskAnimationViewToWindow");
                qp1.j.c(floatBallMaskAnimationView.f93493d, floatBallMaskAnimationView, 0, 0, -1, -1);
            }
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = new com.tencent.mm.plugin.ball.view.ContentFloatBallView(context, null);
            this.f93320e = contentFloatBallView;
            contentFloatBallView.d(this.f93322g);
            com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = this.f93320e;
            com.tencent.mm.plugin.ball.ui.j jVar = new com.tencent.mm.plugin.ball.ui.j(this);
            contentFloatBallView2.getClass();
            ((java.util.concurrent.CopyOnWriteArraySet) contentFloatBallView2.f93427o).add(jVar);
            this.f93320e.setFloatBallViewDelegate(new com.tencent.mm.plugin.ball.ui.k(this));
        }
    }

    public void k(java.util.List list, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.util.List e17 = qp1.w.e(list);
        if (qp1.w.a(list)) {
            list.size();
        }
        java.util.Vector vector = (java.util.Vector) e17;
        vector.size();
        if (qp1.w.a(e17)) {
            com.tencent.mm.plugin.ball.model.BallInfo j17 = qp1.w.j(e17);
            if (j17 != null && vector.size() == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatMenuView for VIDEO");
                com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView = this.f93319d;
                if (floatMenuView.getVisibility() == 8) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatMenuView", "float menu already hide");
                } else {
                    floatMenuView.setVisibility(8);
                }
            }
            this.f93325j = true;
            boolean z17 = com.tencent.mm.app.w.INSTANCE.f53889n;
            boolean z18 = c() || this.f93317b.z0();
            if (!z17 || z18 || this.f93317b.f0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, foreground:%s, canNotShowFloatBall:%s, forceHideAllFloatBall: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(this.f93317b.f0()));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, show FloatBallView %b", java.lang.Boolean.valueOf(this.f93318c.F1));
                com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93318c;
                if (!floatBallView.F1) {
                    floatBallView.m0(false, true, null);
                }
            }
            if (j17 != null && !c() && !this.f93317b.f0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, show FloatBallView for VIDEO, nonHiddenSize: %d", java.lang.Integer.valueOf(vector.size()));
                this.f93318c.l0(false, null);
            }
        } else {
            this.f93325j = false;
            if (this.f93319d.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView and FloatMenuView");
                this.f93319d.c(null);
                this.f93318c.H(false, null);
            } else if (this.f93318c.a0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView");
                this.f93318c.H(false, null);
            }
        }
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView2 = this.f93318c;
        if (floatBallView2 != null) {
            floatBallView2.X(list, ballInfo);
        }
        com.tencent.mm.plugin.ball.view.FloatMenuView floatMenuView2 = this.f93319d;
        if (floatMenuView2 != null) {
            floatMenuView2.X(list, ballInfo);
        }
        this.f93328m.f347236b = list;
        o(list);
    }

    public final void l(boolean z17) {
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView;
        if (!this.f93326k || (contentFloatBallView = this.f93320e) == null) {
            return;
        }
        if (z17) {
            contentFloatBallView.J(false, false, null);
            return;
        }
        if (contentFloatBallView != null) {
            contentFloatBallView.h();
        }
        this.f93320e.t(false, null);
    }

    public void m(int i17) {
        qp1.j.d(i17, this.f93318c);
        qp1.j.d(i17, this.f93320e);
    }

    public final void n() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f93318c;
        if (floatBallView != null) {
            floatBallView.i0(true);
        }
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.util.List r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L6c
            int r0 = r3.size()
            if (r0 != 0) goto L9
            goto L6c
        L9:
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            com.tencent.mm.plugin.ball.model.BallInfo r0 = (com.tencent.mm.plugin.ball.model.BallInfo) r0
            int r0 = r0.f93047e
            r1 = 2
            if (r0 == r1) goto L4c
            r1 = 6
            if (r0 == r1) goto L42
            r1 = 16
            if (r0 == r1) goto L38
            r1 = 23
            if (r0 == r1) goto L2e
            r1 = 50
            if (r0 == r1) goto L4c
            android.content.res.Resources r0 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r1 = 2131777645(0x7f10586d, float:1.9186796E38)
            java.lang.String r0 = r0.getString(r1)
            goto L55
        L2e:
            android.content.res.Resources r0 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r1 = 2131777669(0x7f105885, float:1.9186845E38)
            java.lang.String r0 = r0.getString(r1)
            goto L55
        L38:
            android.content.res.Resources r0 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r1 = 2131777636(0x7f105864, float:1.9186778E38)
            java.lang.String r0 = r0.getString(r1)
            goto L55
        L42:
            android.content.res.Resources r0 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r1 = 2131777665(0x7f105881, float:1.9186837E38)
            java.lang.String r0 = r0.getString(r1)
            goto L55
        L4c:
            android.content.res.Resources r0 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r1 = 2131777624(0x7f105858, float:1.9186754E38)
            java.lang.String r0 = r0.getString(r1)
        L55:
            int r3 = r3.size()
            r1 = 1
            if (r3 <= r1) goto L65
            android.content.res.Resources r3 = com.tencent.mm.sdk.platformtools.x2.f193075e
            r0 = 2131777664(0x7f105880, float:1.9186835E38)
            java.lang.String r0 = r3.getString(r0)
        L65:
            com.tencent.mm.plugin.ball.view.FloatBallView r3 = r2.f93318c
            android.widget.LinearLayout r3 = r3.f93554s
            r3.setContentDescription(r0)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ball.ui.n.o(java.util.List):void");
    }
}
