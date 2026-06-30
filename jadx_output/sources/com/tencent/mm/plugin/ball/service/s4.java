package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class s4 extends com.tencent.mm.plugin.ball.service.d {

    /* renamed from: n, reason: collision with root package name */
    public final dp1.x f93239n;

    /* renamed from: o, reason: collision with root package name */
    public mp1.h f93240o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.ui.u0 f93241p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.ui.p f93242q;

    /* renamed from: r, reason: collision with root package name */
    public mp1.b f93243r;

    /* renamed from: s, reason: collision with root package name */
    public pv.g0 f93244s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f93245t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f93246u = true;

    public s4(dp1.x xVar) {
        this.f93239n = xVar;
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void A(boolean z17, int i17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "onMenuFloatBallSelected, enter float ball");
            e0(new com.tencent.mm.plugin.ball.service.u4(this, i17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "onMenuFloatBallSelected, exit float ball");
        com.tencent.mm.plugin.ball.model.BallInfo r17 = r();
        if (r17 == null) {
            return;
        }
        if (r17.H != 0) {
            a0(true);
            return;
        }
        t().f93090m = 8;
        e();
        d();
        n0();
        dp1.x xVar = this.f93239n;
        if (xVar.getActivity() != null) {
            db5.t7.h(xVar.getActivity(), xVar.getActivity().getString(com.tencent.mm.R.string.f489985hl));
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void D(int i17) {
        com.tencent.mm.plugin.ball.view.FloatIndicatorView floatIndicatorView;
        com.tencent.mm.plugin.ball.ui.u0 u0Var = this.f93241p;
        if (u0Var == null || (floatIndicatorView = u0Var.f93360c) == null) {
            return;
        }
        floatIndicatorView.a(i17, w());
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void H() {
        n0();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean L() {
        if (this.f93135g) {
            return true;
        }
        return ep1.m.g(this.f93239n.getIntent());
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        this.f93239n.l(this.f93132d.f93046d);
        this.f93240o = new com.tencent.mm.plugin.ball.service.x4(this);
        this.f93243r = new com.tencent.mm.plugin.ball.service.w4(this);
        if (!v()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "onCreate, do not support swipe to float ball");
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.ball.service.s4$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.ball.service.s4 s4Var = com.tencent.mm.plugin.ball.service.s4.this;
                com.tencent.mm.plugin.ball.model.BallInfo r17 = s4Var.r();
                boolean w17 = s4Var.w();
                dp1.x xVar = s4Var.f93239n;
                if (r17 != null && !r17.I && !w17) {
                    com.tencent.mm.plugin.ball.ui.p pVar = new com.tencent.mm.plugin.ball.ui.p(xVar, s4Var.f93240o);
                    s4Var.f93242q = pVar;
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallFadeInController", "start FloatBallFadeInController");
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallFadeInController", "float ball isSupportSwipeToFloatBall: %s", java.lang.Boolean.valueOf(xVar.t()));
                    if (xVar.t()) {
                        xVar.g(new com.tencent.mm.plugin.ball.ui.o(pVar));
                        return;
                    }
                    return;
                }
                com.tencent.mm.plugin.ball.ui.u0 u0Var = new com.tencent.mm.plugin.ball.ui.u0(xVar, s4Var.f93240o);
                s4Var.f93241p = u0Var;
                u0Var.c();
                int o17 = com.tencent.mm.sdk.platformtools.o4.M(s4Var.q()).o("ActiveCount", 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "onCreate, activeCount:%s", java.lang.Integer.valueOf(o17));
                com.tencent.mm.plugin.ball.view.FloatIndicatorView floatIndicatorView = s4Var.f93241p.f93360c;
                if (floatIndicatorView != null) {
                    floatIndicatorView.a(o17, w17);
                }
            }
        };
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(runnable);
        }
    }

    public void e0(com.tencent.mm.plugin.ball.service.f5 f5Var) {
        if (f5Var != null) {
            ((com.tencent.mm.plugin.ball.service.u4) f5Var).a();
        }
    }

    public int f0(int i17) {
        if (i17 == 1) {
            return 4;
        }
        if (i17 == 2) {
            return 7;
        }
        return i17 == 3 ? 5 : 6;
    }

    public boolean g0(java.lang.Runnable runnable) {
        if (this.f93239n.getActivity() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, activity is null");
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        pv.g0 j07 = j0();
        this.f93244s = j07;
        if (j07 != null) {
            return h0(new com.tencent.mm.plugin.ball.service.z4(this, runnable), true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, floatBallAnimationHelper is null");
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    public final boolean h0(qn5.a aVar, boolean z17) {
        android.graphics.Point point;
        android.graphics.Point G;
        dp1.x xVar = this.f93239n;
        android.app.Activity activity = xVar.getActivity();
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, activity is null");
            if (aVar != null) {
                aVar.a(null);
            }
            return false;
        }
        pv.g0 j07 = j0();
        this.f93244s = j07;
        if (j07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, floatBallAnimationHelper is null");
            if (aVar != null) {
                aVar.a(null);
            }
            return false;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        gp1.v vVar = this.f93136h;
        if (ballInfo != null && vVar != null && z17) {
            vVar.B0(ballInfo, xVar.getBitmap());
        }
        ep1.m.a(activity, false);
        boolean f17 = xVar.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, needFloatMaskAnimation: %s", java.lang.Boolean.valueOf(f17));
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
        if ((ballInfo2 != null ? ballInfo2.f93048f : 1) == 1 && w() && f17 && com.tencent.mm.sdk.platformtools.x2.j()) {
            com.tencent.mm.plugin.ball.service.PageFloatBallHelper$ExitPageAnimationInfo pageFloatBallHelper$ExitPageAnimationInfo = new com.tencent.mm.plugin.ball.service.PageFloatBallHelper$ExitPageAnimationInfo();
            pageFloatBallHelper$ExitPageAnimationInfo.f93117d = xVar.v();
            pageFloatBallHelper$ExitPageAnimationInfo.f93118e = xVar.o();
            pageFloatBallHelper$ExitPageAnimationInfo.f93119f = xVar.n();
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, pageFloatBallHelper$ExitPageAnimationInfo, com.tencent.mm.plugin.ball.service.d5.class, new com.tencent.mm.plugin.ball.service.b5(this));
            return true;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = this.f93132d;
        int i17 = ballInfo3 != null ? ballInfo3.f93048f : 1;
        pv.y yVar = new pv.y();
        i0(yVar, f17);
        if (i17 == 1 && w()) {
            point = new android.graphics.Point(qp1.c0.f365697f, qp1.c0.f365698g);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo4 = this.f93132d;
            G = vVar.D(ballInfo4 != null ? ballInfo4.f93048f : 1, xVar.v(), xVar.o(), point);
            yVar.f358512i = true;
        } else {
            point = new android.graphics.Point(qp1.c0.f365694c, qp1.c0.f365695d);
            G = vVar.G();
            yVar.f358512i = false;
        }
        yVar.f358509f = G;
        yVar.f358508e = point;
        if (f17) {
            yVar.f358513j = 200L;
        }
        yVar.f358514k = new yz5.a() { // from class: com.tencent.mm.plugin.ball.service.s4$$c
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.plugin.ball.service.s4.this.l0();
                return null;
            }
        };
        boolean f18 = ((ep1.k) this.f93244s).f(yVar, null, new com.tencent.mm.plugin.ball.service.a5(this, aVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation ret %s", java.lang.Boolean.valueOf(f18));
        return f18;
    }

    public final void i0(pv.y yVar, boolean z17) {
        dp1.x xVar = this.f93239n;
        android.view.View s17 = xVar.s();
        if (s17 == null && !xVar.p()) {
            yVar.f358507d = xVar.a();
            yVar.f358510g = null;
            yVar.f358511h = false;
        } else if (s17 != null) {
            yVar.f358507d = xVar.u();
            yVar.f358510g = s17;
            yVar.f358511h = true;
        } else {
            yVar.f358507d = xVar.u();
            yVar.f358510g = null;
            yVar.f358511h = true;
        }
        if (z17) {
            pv.d0 d0Var = (pv.d0) i95.n0.c(pv.d0.class);
            android.graphics.Bitmap n17 = xVar.n();
            ov.i0 i0Var = (ov.i0) d0Var;
            i0Var.getClass();
            com.tencent.mm.plugin.ball.ui.n nVar = com.tencent.mm.plugin.ball.ui.q0.e().f93346d;
            com.tencent.mm.plugin.ball.view.FloatBallMaskAnimationView floatBallMaskAnimationView = nVar != null ? nVar.f93321f : null;
            i0Var.f349084d = floatBallMaskAnimationView;
            if (floatBallMaskAnimationView != null) {
                floatBallMaskAnimationView.setMaskBitmap(n17);
            }
            java.lang.Object obj = i0Var.f349084d;
            if (obj instanceof android.view.View) {
                yVar.f358507d = (android.view.View) obj;
            }
        }
    }

    public pv.g0 j0() {
        if (this.f93244s == null) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
            this.f93244s = new ep1.k();
        }
        return this.f93244s;
    }

    public boolean k0() {
        return ep1.m.h(this.f93239n.getIntent());
    }

    public void l0() {
    }

    public boolean m0(int i17) {
        this.f93245t = false;
        if (!s0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "onClose, do not need animation");
            return false;
        }
        if (!u() || this.f93136h == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "onClose, resume this ball");
        t().f93090m = f0(i17);
        e();
        this.f93132d.f93058s = false;
        r0();
        h0(new com.tencent.mm.plugin.ball.service.t4(this), true);
        return true;
    }

    public final void n0() {
        com.tencent.mm.plugin.ball.ui.p pVar = this.f93242q;
        if (pVar != null) {
            pVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallFadeInController", "stop FloatIndicatorController");
            pVar.f93339a.g(null);
        }
        if (v()) {
            com.tencent.mm.plugin.ball.ui.u0 u0Var = new com.tencent.mm.plugin.ball.ui.u0(this.f93239n, this.f93240o);
            this.f93241p = u0Var;
            u0Var.c();
        }
    }

    public void o0() {
        N();
        this.f93245t = false;
        com.tencent.mm.plugin.ball.ui.u0 u0Var = this.f93241p;
        if (u0Var != null) {
            u0Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "stop FloatIndicatorController");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.t0(u0Var));
            u0Var.f93358a.g(null);
        }
    }

    public void p0() {
        this.f93134f = false;
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.m0(this.f93132d);
        }
        if (this.f93132d != null) {
            P();
            O();
        }
    }

    public void q0() {
    }

    public final void r0() {
        a0(false);
        boolean w17 = w();
        if (!u() || w17) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
            if (ballInfo.f93046d == 20) {
                ballInfo.f93046d = ballInfo.f93047e;
                ballInfo.H = 0;
            }
            j();
        }
    }

    public boolean s0() {
        if (!w() || !u()) {
            return false;
        }
        dp1.x xVar = this.f93239n;
        return xVar.h() && k0() && this.f93246u && !xVar.k();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void x() {
        super.x();
        this.f93246u = true;
        if (!this.f93245t && w()) {
            dp1.x xVar = this.f93239n;
            if (xVar.i()) {
                android.app.Activity activity = xVar.getActivity();
                if (activity == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doEnterPageAnimation, activity is null");
                } else {
                    android.content.Intent intent = activity.getIntent();
                    if (intent == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doEnterPageAnimation, intent is null");
                    } else if (k0()) {
                        this.f93245t = true;
                        ep1.m.a(activity, false);
                        pv.g0 j07 = j0();
                        this.f93244s = j07;
                        if (j07 != null) {
                            pv.y yVar = new pv.y();
                            yVar.f358506c = intent;
                            i0(yVar, false);
                            yVar.f358504a = true;
                            yVar.f358505b = activity.getResources().getConfiguration().orientation == 1;
                            com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo r17 = this.f93136h.r(this.f93132d);
                            yVar.f358509f = r17.f93096e;
                            yVar.f358508e = r17.f93095d;
                            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
                            if ((ballInfo != null ? ballInfo.f93048f : 1) == 1 && w()) {
                                yVar.f358512i = true;
                            }
                            yVar.f358514k = new yz5.a() { // from class: com.tencent.mm.plugin.ball.service.s4$$b
                                @Override // yz5.a
                                public final java.lang.Object invoke() {
                                    com.tencent.mm.plugin.ball.service.s4.this.getClass();
                                    return null;
                                }
                            };
                            ((ep1.k) this.f93244s).d(yVar, null, new com.tencent.mm.plugin.ball.service.y4(this));
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.PageFloatBallHelper", "doEnterPageAnimation not enterFromFloatBallWithAnimation");
                    }
                }
            }
        }
        q0();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void z() {
        super.z();
    }
}
