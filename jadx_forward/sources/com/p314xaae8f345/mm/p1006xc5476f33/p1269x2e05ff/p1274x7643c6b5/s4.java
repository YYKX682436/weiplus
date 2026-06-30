package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class s4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d {

    /* renamed from: n, reason: collision with root package name */
    public final dp1.x f174772n;

    /* renamed from: o, reason: collision with root package name */
    public mp1.h f174773o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 f174774p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p f174775q;

    /* renamed from: r, reason: collision with root package name */
    public mp1.b f174776r;

    /* renamed from: s, reason: collision with root package name */
    public pv.g0 f174777s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f174778t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f174779u = true;

    public s4(dp1.x xVar) {
        this.f174772n = xVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void A(boolean z17, int i17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "onMenuFloatBallSelected, enter float ball");
            e0(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4(this, i17));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "onMenuFloatBallSelected, exit float ball");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r17 = r();
        if (r17 == null) {
            return;
        }
        if (r17.H != 0) {
            a0(true);
            return;
        }
        t().f174623m = 8;
        e();
        d();
        n0();
        dp1.x xVar = this.f174772n;
        if (xVar.mo50327x19263085() != null) {
            db5.t7.h(xVar.mo50327x19263085(), xVar.mo50327x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571518hl));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void D(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 c12930x168b4c78;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = this.f174774p;
        if (u0Var == null || (c12930x168b4c78 = u0Var.f174893c) == null) {
            return;
        }
        c12930x168b4c78.a(i17, w());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        n0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        this.f174779u = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean L() {
        if (this.f174668g) {
            return true;
        }
        return ep1.m.g(this.f174772n.mo54480x1e885992());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        this.f174772n.l(this.f174665d.f174579d);
        this.f174773o = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.x4(this);
        this.f174776r = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.w4(this);
        if (!v()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "onCreate, do not support swipe to float ball");
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.ball.service.s4$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 s4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r17 = s4Var.r();
                boolean w17 = s4Var.w();
                dp1.x xVar = s4Var.f174772n;
                if (r17 != null && !r17.I && !w17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p(xVar, s4Var.f174773o);
                    s4Var.f174775q = pVar;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallFadeInController", "start FloatBallFadeInController");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallFadeInController", "float ball isSupportSwipeToFloatBall: %s", java.lang.Boolean.valueOf(xVar.t()));
                    if (xVar.t()) {
                        xVar.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.o(pVar));
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0(xVar, s4Var.f174773o);
                s4Var.f174774p = u0Var;
                u0Var.c();
                int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(s4Var.q()).o("ActiveCount", 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "onCreate, activeCount:%s", java.lang.Integer.valueOf(o17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12930x168b4c78 c12930x168b4c78 = s4Var.f174774p.f174893c;
                if (c12930x168b4c78 != null) {
                    c12930x168b4c78.a(o17, w17);
                }
            }
        };
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(runnable);
        }
    }

    public void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.f5 f5Var) {
        if (f5Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.u4) f5Var).a();
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
        if (this.f174772n.mo50327x19263085() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, activity is null");
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        pv.g0 j07 = j0();
        this.f174777s = j07;
        if (j07 != null) {
            return h0(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.z4(this, runnable), true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, floatBallAnimationHelper is null");
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    public final boolean h0(qn5.a aVar, boolean z17) {
        android.graphics.Point point;
        android.graphics.Point G;
        dp1.x xVar = this.f174772n;
        android.app.Activity mo50327x19263085 = xVar.mo50327x19263085();
        if (mo50327x19263085 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, activity is null");
            if (aVar != null) {
                aVar.a(null);
            }
            return false;
        }
        pv.g0 j07 = j0();
        this.f174777s = j07;
        if (j07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, floatBallAnimationHelper is null");
            if (aVar != null) {
                aVar.a(null);
            }
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        gp1.v vVar = this.f174669h;
        if (c12886x91aa2b6d != null && vVar != null && z17) {
            vVar.B0(c12886x91aa2b6d, xVar.mo50328x12501425());
        }
        ep1.m.a(mo50327x19263085, false);
        boolean f17 = xVar.f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation, needFloatMaskAnimation: %s", java.lang.Boolean.valueOf(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
        if ((c12886x91aa2b6d2 != null ? c12886x91aa2b6d2.f174581f : 1) == 1 && w() && f17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12898x7fe1649b c12898x7fe1649b = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12898x7fe1649b();
            c12898x7fe1649b.f174650d = xVar.v();
            c12898x7fe1649b.f174651e = xVar.o();
            c12898x7fe1649b.f174652f = xVar.n();
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c12898x7fe1649b, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d5.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.b5(this));
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = this.f174665d;
        int i17 = c12886x91aa2b6d3 != null ? c12886x91aa2b6d3.f174581f : 1;
        pv.y yVar = new pv.y();
        i0(yVar, f17);
        if (i17 == 1 && w()) {
            point = new android.graphics.Point(qp1.c0.f447230f, qp1.c0.f447231g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d4 = this.f174665d;
            G = vVar.D(c12886x91aa2b6d4 != null ? c12886x91aa2b6d4.f174581f : 1, xVar.v(), xVar.o(), point);
            yVar.f440045i = true;
        } else {
            point = new android.graphics.Point(qp1.c0.f447227c, qp1.c0.f447228d);
            G = vVar.G();
            yVar.f440045i = false;
        }
        yVar.f440042f = G;
        yVar.f440041e = point;
        if (f17) {
            yVar.f440046j = 200L;
        }
        yVar.f440047k = new yz5.a() { // from class: com.tencent.mm.plugin.ball.service.s4$$c
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4.this.l0();
                return null;
            }
        };
        boolean f18 = ((ep1.k) this.f174777s).f(yVar, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.a5(this, aVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "doExitPageAnimation ret %s", java.lang.Boolean.valueOf(f18));
        return f18;
    }

    public final void i0(pv.y yVar, boolean z17) {
        dp1.x xVar = this.f174772n;
        android.view.View s17 = xVar.s();
        if (s17 == null && !xVar.p()) {
            yVar.f440040d = xVar.a();
            yVar.f440043g = null;
            yVar.f440044h = false;
        } else if (s17 != null) {
            yVar.f440040d = xVar.u();
            yVar.f440043g = s17;
            yVar.f440044h = true;
        } else {
            yVar.f440040d = xVar.u();
            yVar.f440043g = null;
            yVar.f440044h = true;
        }
        if (z17) {
            pv.d0 d0Var = (pv.d0) i95.n0.c(pv.d0.class);
            android.graphics.Bitmap n17 = xVar.n();
            ov.i0 i0Var = (ov.i0) d0Var;
            i0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.q0.e().f174879d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12926x7a5e63a2 c12926x7a5e63a2 = nVar != null ? nVar.f174854f : null;
            i0Var.f430617d = c12926x7a5e63a2;
            if (c12926x7a5e63a2 != null) {
                c12926x7a5e63a2.mo54156x8a98093d(n17);
            }
            java.lang.Object obj = i0Var.f430617d;
            if (obj instanceof android.view.View) {
                yVar.f440040d = (android.view.View) obj;
            }
        }
    }

    public pv.g0 j0() {
        if (this.f174777s == null) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
            this.f174777s = new ep1.k();
        }
        return this.f174777s;
    }

    public boolean k0() {
        return ep1.m.h(this.f174772n.mo54480x1e885992());
    }

    public void l0() {
    }

    public boolean m0(int i17) {
        this.f174778t = false;
        if (!s0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "onClose, do not need animation");
            return false;
        }
        if (!u() || this.f174669h == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "onClose, resume this ball");
        t().f174623m = f0(i17);
        e();
        this.f174665d.f174591s = false;
        r0();
        h0(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.t4(this), true);
        return true;
    }

    public final void n0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.p pVar = this.f174775q;
        if (pVar != null) {
            pVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallFadeInController", "stop FloatIndicatorController");
            pVar.f174872a.g(null);
        }
        if (v()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0(this.f174772n, this.f174773o);
            this.f174774p = u0Var;
            u0Var.c();
        }
    }

    public void o0() {
        N();
        this.f174778t = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = this.f174774p;
        if (u0Var != null) {
            u0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "stop FloatIndicatorController");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.t0(u0Var));
            u0Var.f174891a.g(null);
        }
    }

    public void p0() {
        this.f174667f = false;
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.m0(this.f174665d);
        }
        if (this.f174665d != null) {
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
            if (c12886x91aa2b6d.f174579d == 20) {
                c12886x91aa2b6d.f174579d = c12886x91aa2b6d.f174580e;
                c12886x91aa2b6d.H = 0;
            }
            j();
        }
    }

    public boolean s0() {
        if (!w() || !u()) {
            return false;
        }
        dp1.x xVar = this.f174772n;
        return xVar.h() && k0() && this.f174779u && !xVar.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        super.x();
        this.f174779u = true;
        if (!this.f174778t && w()) {
            dp1.x xVar = this.f174772n;
            if (xVar.i()) {
                android.app.Activity mo50327x19263085 = xVar.mo50327x19263085();
                if (mo50327x19263085 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "doEnterPageAnimation, activity is null");
                } else {
                    android.content.Intent intent = mo50327x19263085.getIntent();
                    if (intent == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "doEnterPageAnimation, intent is null");
                    } else if (k0()) {
                        this.f174778t = true;
                        ep1.m.a(mo50327x19263085, false);
                        pv.g0 j07 = j0();
                        this.f174777s = j07;
                        if (j07 != null) {
                            pv.y yVar = new pv.y();
                            yVar.f440039c = intent;
                            i0(yVar, false);
                            yVar.f440037a = true;
                            yVar.f440038b = mo50327x19263085.getResources().getConfiguration().orientation == 1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b r17 = this.f174669h.r(this.f174665d);
                            yVar.f440042f = r17.f174629e;
                            yVar.f440041e = r17.f174628d;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
                            if ((c12886x91aa2b6d != null ? c12886x91aa2b6d.f174581f : 1) == 1 && w()) {
                                yVar.f440045i = true;
                            }
                            yVar.f440047k = new yz5.a() { // from class: com.tencent.mm.plugin.ball.service.s4$$b
                                @Override // yz5.a
                                /* renamed from: invoke */
                                public final java.lang.Object mo152xb9724478() {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4.this.getClass();
                                    return null;
                                }
                            };
                            ((ep1.k) this.f174777s).d(yVar, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.y4(this));
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageFloatBallHelper", "doEnterPageAnimation not enterFromFloatBallWithAnimation");
                    }
                }
            }
        }
        q0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        super.z();
    }
}
