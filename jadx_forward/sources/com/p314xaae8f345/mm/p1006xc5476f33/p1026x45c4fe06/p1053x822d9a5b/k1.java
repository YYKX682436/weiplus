package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b;

/* loaded from: classes7.dex */
public class k1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {
    public volatile boolean A;
    public volatile boolean B;
    public boolean C;
    public android.view.Surface D;
    public final boolean E;
    public boolean F;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.u0 G;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f159640v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f159641w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 f159642x;

    /* renamed from: y, reason: collision with root package name */
    public tf1.f f159643y;

    /* renamed from: z, reason: collision with root package name */
    public tf1.e f159644z;

    public k1(dp1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(xVar);
        java.lang.String str = "MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper#" + hashCode();
        this.f159640v = str;
        this.f159644z = null;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = null;
        this.F = false;
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.z0(this);
        this.f159641w = o6Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.E = rh1.b.a();
        this.f159642x = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0.class);
        x0();
    }

    public static void t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d;
        k1Var.getClass();
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(k1Var.f174772n.mo50327x19263085());
        if (!Ui) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "not has float ball perm");
        }
        if (k1Var.u() || k1Var.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.f159640v, "onSendBackgroundRunningOperation, add audio of video background play state to float ball");
            pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
            int i17 = k1Var.f174665d.H;
            ((ov.p0) j0Var).getClass();
            java.lang.Boolean bool = qp1.w.f447288a;
            k1Var.b0(i17 | 18432);
            if (!k1Var.B && Ui) {
                k1Var.y0();
            }
            k1Var.a0(true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.f159640v, "onSendBackgroundRunningOperation, add passive audio of video background play float ball");
        k1Var.Z(k1Var.v0());
        k1Var.a0(true);
        k1Var.W(false);
        pv.j0 j0Var2 = (pv.j0) i95.n0.c(pv.j0.class);
        int i18 = k1Var.f174665d.H;
        ((ov.p0) j0Var2).getClass();
        java.lang.Boolean bool2 = qp1.w.f447288a;
        k1Var.b0(i18 | 18432);
        if (k1Var.E && (c12886x91aa2b6d = k1Var.f174665d) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d.f174587o;
            ballButtonInfo.f174610o = !k1Var.F;
            k1Var.S(ballButtonInfo);
        }
        k1Var.t().f174619f = 13;
        k1Var.g();
        gp1.v vVar = k1Var.f174669h;
        if (vVar != null) {
            vVar.w(k1Var.f174665d, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.f1(k1Var, Ui));
        }
        k1Var.A = true;
    }

    public static void u0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.k1 k1Var, boolean z17) {
        java.lang.String str = k1Var.f159640v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "ignoreRuntimeResumePauseOnce");
        tf1.f fVar = (tf1.f) k1Var.f159641w.k(tf1.f.class);
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "ignoreRuntimeResumePauseOnce, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.k(!z17);
        }
    }

    public static void w0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var;
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.f174579d != 40) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
        java.lang.String string = c12886x91aa2b6d.G.getString("appId");
        java.lang.String string2 = c12886x91aa2b6d.G.getString(dm.i4.f66875xa013b0d5);
        int i17 = c12886x91aa2b6d.G.getInt("versionType");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1131;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) || (h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "openAppBrand, launch:%s#%s", string, java.lang.Integer.valueOf(i17));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string2, string, i17, -1, null, c12559xbdae8559);
    }

    public final void A0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.d(this.f159641w.f156336n);
        java.lang.String str = this.f159640v;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onRuntimeBackground, type: " + d17);
        tf1.f fVar = (tf1.f) this.f159641w.k(tf1.f.class);
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "onRuntimeBackground, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.s(d17);
        }
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this.f174772n.mo50327x19263085())) {
            B0(i17);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.t.a(this.f174772n.mo50327x19263085(), 40, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.c1(this, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void B(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedBallInfoAddedEvent, runtime:%s, type: %d, key: %s", java.lang.Integer.valueOf(this.f159641w.hashCode()), java.lang.Integer.valueOf(i17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedBallInfoAddedEvent, myType: %d, myKey: %s", java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d), this.f174665d.f174582g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
        if (c12886x91aa2b6d2 != null && i17 == c12886x91aa2b6d2.f174579d && java.util.Objects.equals(str, c12886x91aa2b6d2.f174582g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedBallInfoAddedEvent, myself");
            return;
        }
        if (6 == i17 || 18 == i17 || 9 == i17 || 17 == i17 || 40 == i17) {
            d();
            this.A = false;
        }
    }

    public final void B0(int i17) {
        t().f174623m = f0(i17);
        g();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.e0.b(this.f174772n, this.f174669h.G(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.g1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void C(int i17, java.lang.String str, int i18, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedBallInfoCallbackFunction, type:%d, key:%s, functionType:%d, isPlaying:%b", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.C));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d == null || i17 != c12886x91aa2b6d.f174579d || !java.util.Objects.equals(str, c12886x91aa2b6d.f174582g) || i18 == 2 || i18 != 1 || bundle == null) {
            return;
        }
        bundle.setClassLoader(android.view.Surface.class.getClassLoader());
        android.view.Surface surface = (android.view.Surface) bundle.getParcelable("surface");
        this.D = surface;
        if (surface == null || !this.C) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "SetPlaybackSurface");
        this.f159643y.t(this.D);
    }

    public final void C0() {
        tf1.e eVar;
        gp1.v vVar = this.f174669h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d t07 = vVar != null ? vVar.t0(this.f174665d) : null;
        if (t07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "removeBackgroundPlayAudioBall, no this float ball");
            pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
            int i17 = this.f174665d.H;
            ((ov.p0) j0Var).getClass();
            java.lang.Boolean bool = qp1.w.f447288a;
            b0(i17 & (-18433));
        } else if (t07.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "removeBackgroundPlayAudioBall, remove passive float ball");
            d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f159640v, "removeBackgroundPlayAudioBall, passive is false");
        }
        tf1.f fVar = this.f159643y;
        if (fVar != null && (eVar = this.f159644z) != null) {
            fVar.f500396i.remove(eVar);
        }
        this.A = false;
        this.B = false;
    }

    public final void D0(android.graphics.Bitmap bitmap, float f17) {
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.y0(this, bitmap, f17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void E(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        java.lang.String str2 = this.f159640v;
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onReceivedBallInfoDeleteButtonClickEvent, myType: %d, myKey: %s", java.lang.Integer.valueOf(c12886x91aa2b6d.f174579d), this.f174665d.f174582g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
        if (c12886x91aa2b6d2 != null && i17 == c12886x91aa2b6d2.f174579d && java.util.Objects.equals(str, c12886x91aa2b6d2.f174582g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onReceivedBallInfoDeleteButtonClickEvent, delete myself");
            C0();
            tf1.f fVar = this.f159643y;
            if (fVar != null) {
                fVar.f();
            }
            this.C = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void F(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null && i17 == c12886x91aa2b6d.f174579d && java.util.Objects.equals(str, c12886x91aa2b6d.f174582g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedBallInfoPlayButtonClickEvent, myself");
            tf1.f fVar = this.f159643y;
            if (fVar != null) {
                if (!this.C) {
                    fVar.w(null);
                    this.C = true;
                } else {
                    fVar.u(null);
                    if (rh1.b.a()) {
                        this.f159643y.f500402r = false;
                    }
                    this.C = false;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void G(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null && i17 == c12886x91aa2b6d.f174579d && java.util.Objects.equals(str, c12886x91aa2b6d.f174582g)) {
            java.lang.String str2 = "onReceivedBallInfoPlayModeSwitchButtonClickEvent, myself, isOnlyAudioMode:" + this.F;
            java.lang.String str3 = this.f159640v;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            if (!this.E || this.f159643y == null) {
                return;
            }
            this.F = !this.F;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "update isOnlyAudioMode:" + this.F);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = this.f174665d.f174587o;
            ballButtonInfo.f174610o = this.F ^ true;
            S(ballButtonInfo);
            java.lang.String h17 = this.f159643y.h();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d0.c(this.f159641w.C0(), h17, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.e1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f159641w.hashCode()));
        n0();
        this.A = false;
        z0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f159641w.hashCode()));
        this.f174772n.q(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void K() {
        if (this.f174665d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onReceivedPauseBallInfoEvent, myself");
            tf1.f fVar = this.f159643y;
            if (fVar != null) {
                fVar.u(null);
                this.f159643y.f500402r = false;
                this.C = false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159642x;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).wi(this.G);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean m0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onClose, runtime:%s", java.lang.Integer.valueOf(this.f159641w.hashCode()));
        if (!u() && !this.A) {
            return false;
        }
        if (u() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().i("has_shown_appbrand_video_tip", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onClose, should show voip tip");
            android.app.Activity mo50327x19263085 = this.f174772n.mo50327x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.a1(this, i17);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo50327x19263085);
            u1Var.g(mo50327x19263085.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a5l));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.a5m);
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.b1(this, a1Var));
            u1Var.q(false);
        } else {
            A0(i17);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f159641w.hashCode()));
        super.o0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.v0 v0Var = this.f159642x;
        if (v0Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) v0Var).Bi(this.G);
        }
    }

    public final java.lang.String v0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f159641w;
        tf1.f fVar = (tf1.f) o6Var.k(tf1.f.class);
        java.lang.String i17 = fVar != null ? fVar.i() : null;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17) ? o6Var.u0().f158812e : i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f159641w.hashCode()));
        if (s() != null) {
            d0(false);
        }
        this.F = false;
    }

    public final void x0() {
        tf1.f fVar = (tf1.f) this.f159641w.k(tf1.f.class);
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "find AppBrandRuntimeAudioOfVideoBackgroundPlayManager fail");
            return;
        }
        this.f159643y = fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i1 i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.i1(this);
        this.f159644z = i1Var;
        java.util.ArrayList arrayList = fVar.f500396i;
        if (arrayList.contains(i1Var)) {
            return;
        }
        arrayList.add(i1Var);
    }

    public final void y0() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "initViewPanelView");
        tf1.f fVar = this.f159643y;
        if (fVar == null) {
            x0();
        } else {
            tf1.e eVar = this.f159644z;
            if (eVar != null) {
                java.util.ArrayList arrayList = fVar.f500396i;
                if (!arrayList.contains(eVar)) {
                    arrayList.add(eVar);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        c12886x91aa2b6d.F = true;
        c12886x91aa2b6d.L = false;
        tf1.f fVar2 = this.f159643y;
        if (fVar2 != null) {
            this.C = fVar2.l();
        } else {
            this.C = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = this.f174665d.f174587o;
        boolean z17 = this.C;
        ballButtonInfo.f174602d = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "initViewPanelView isPlaying:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo2 = this.f174665d.f174587o;
        ballButtonInfo2.f174603e = true;
        ballButtonInfo2.f174606h = true;
        ballButtonInfo2.f174605g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        this.f174665d.f174587o.f174608m = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        S(this.f174665d.f174587o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo = this.f174665d.f174588p;
        ballBlurInfo.f174599d = "";
        R(ballBlurInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.h1(this);
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.x(c12886x91aa2b6d2, h1Var);
        }
        tf1.f fVar3 = this.f159643y;
        if (fVar3 != null) {
            tf.q g17 = fVar3.g();
            if (g17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshot, videoPlayer:" + g17.mo10361xfb82e301());
                tf.s sVar = (tf.s) g17.h(tf.s.class);
                if (sVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshot, videoPlayerAddOnGetSnapshot is null");
                } else {
                    android.graphics.Bitmap g18 = sVar.g();
                    if (g18 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshotCached, bitmap is null");
                    }
                    sVar.d(new tf1.c(fVar3));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshot, success");
                    bitmap = g18;
                    if (bitmap != null || bitmap.isRecycled()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "getVideoSnapshot bmp is null");
                    } else {
                        D0(bitmap, this.f159643y.j());
                    }
                }
            }
            bitmap = null;
            if (bitmap != null) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "getVideoSnapshot bmp is null");
        }
        this.B = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "onExitPage, runtime:%s", java.lang.Integer.valueOf(this.f159641w.hashCode()));
        if (s() != null) {
            d0(true);
        }
    }

    public final void z0() {
        if (this.f159642x == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f c11741xcdfabd1f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11741xcdfabd1f();
        c11741xcdfabd1f.f158478d = this.f159641w.f156336n;
        c11741xcdfabd1f.f158479e = 64;
        c11741xcdfabd1f.f158480f = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f159640v, "maybeStopBackgroundPlayAudio, appId:%s", this.f159641w.f156336n);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.k) this.f159642x).Ai(c11741xcdfabd1f);
    }
}
