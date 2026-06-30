package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class k1 extends com.tencent.mm.plugin.ball.service.s4 {
    public volatile boolean A;
    public volatile boolean B;
    public boolean C;
    public android.view.Surface D;
    public final boolean E;
    public boolean F;
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.u0 G;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f78107v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f78108w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.backgroundrunning.v0 f78109x;

    /* renamed from: y, reason: collision with root package name */
    public tf1.f f78110y;

    /* renamed from: z, reason: collision with root package name */
    public tf1.e f78111z;

    public k1(dp1.x xVar, com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(xVar);
        java.lang.String str = "MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper#" + hashCode();
        this.f78107v = str;
        this.f78111z = null;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = null;
        this.F = false;
        this.G = new com.tencent.mm.plugin.appbrand.floatball.z0(this);
        this.f78108w = o6Var;
        com.tencent.mars.xlog.Log.i(str, "create, runtime:%s", java.lang.Integer.valueOf(o6Var.hashCode()));
        this.E = rh1.b.a();
        this.f78109x = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.v0.class);
        x0();
    }

    public static void t0(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo;
        k1Var.getClass();
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(k1Var.f93239n.getActivity());
        if (!Ui) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "not has float ball perm");
        }
        if (k1Var.u() || k1Var.A) {
            com.tencent.mars.xlog.Log.i(k1Var.f78107v, "onSendBackgroundRunningOperation, add audio of video background play state to float ball");
            pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
            int i17 = k1Var.f93132d.H;
            ((ov.p0) j0Var).getClass();
            java.lang.Boolean bool = qp1.w.f365755a;
            k1Var.b0(i17 | 18432);
            if (!k1Var.B && Ui) {
                k1Var.y0();
            }
            k1Var.a0(true);
            return;
        }
        com.tencent.mars.xlog.Log.i(k1Var.f78107v, "onSendBackgroundRunningOperation, add passive audio of video background play float ball");
        k1Var.Z(k1Var.v0());
        k1Var.a0(true);
        k1Var.W(false);
        pv.j0 j0Var2 = (pv.j0) i95.n0.c(pv.j0.class);
        int i18 = k1Var.f93132d.H;
        ((ov.p0) j0Var2).getClass();
        java.lang.Boolean bool2 = qp1.w.f365755a;
        k1Var.b0(i18 | 18432);
        if (k1Var.E && (ballInfo = k1Var.f93132d) != null) {
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
            ballButtonInfo.f93077o = !k1Var.F;
            k1Var.S(ballButtonInfo);
        }
        k1Var.t().f93086f = 13;
        k1Var.g();
        gp1.v vVar = k1Var.f93136h;
        if (vVar != null) {
            vVar.w(k1Var.f93132d, new com.tencent.mm.plugin.appbrand.floatball.f1(k1Var, Ui));
        }
        k1Var.A = true;
    }

    public static void u0(com.tencent.mm.plugin.appbrand.floatball.k1 k1Var, boolean z17) {
        java.lang.String str = k1Var.f78107v;
        com.tencent.mars.xlog.Log.i(str, "ignoreRuntimeResumePauseOnce");
        tf1.f fVar = (tf1.f) k1Var.f78108w.k(tf1.f.class);
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(str, "ignoreRuntimeResumePauseOnce, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.k(!z17);
        }
    }

    public static void w0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        com.tencent.mm.plugin.appbrand.service.h6 h6Var;
        if (ballInfo == null || ballInfo.f93046d != 40) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "handleBallInfoClicked, appbrand voip float ball");
        java.lang.String string = ballInfo.G.getString("appId");
        java.lang.String string2 = ballInfo.G.getString(dm.i4.COL_USERNAME);
        int i17 = ballInfo.G.getInt("versionType");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1131;
        if ((com.tencent.mm.sdk.platformtools.t8.K0(string2) && com.tencent.mm.sdk.platformtools.t8.K0(string)) || (h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "openAppBrand, launch:%s#%s", string, java.lang.Integer.valueOf(i17));
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, string2, string, i17, -1, null, appBrandStatObject);
    }

    public final void A0(int i17) {
        com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(this.f78108w.f74803n);
        java.lang.String str = this.f78107v;
        com.tencent.mars.xlog.Log.i(str, "onRuntimeBackground, type: " + d17);
        tf1.f fVar = (tf1.f) this.f78108w.k(tf1.f.class);
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w(str, "onRuntimeBackground, audioOfVideoBackgroundPlayManager is null");
        } else {
            fVar.s(d17);
        }
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(this.f93239n.getActivity())) {
            B0(i17);
        } else {
            com.tencent.mm.plugin.appbrand.floatball.t.a(this.f93239n.getActivity(), 40, new com.tencent.mm.plugin.appbrand.floatball.c1(this, i17));
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void B(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedBallInfoAddedEvent, runtime:%s, type: %d, key: %s", java.lang.Integer.valueOf(this.f78108w.hashCode()), java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedBallInfoAddedEvent, myType: %d, myKey: %s", java.lang.Integer.valueOf(ballInfo.f93046d), this.f93132d.f93049g);
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
        if (ballInfo2 != null && i17 == ballInfo2.f93046d && java.util.Objects.equals(str, ballInfo2.f93049g)) {
            com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedBallInfoAddedEvent, myself");
            return;
        }
        if (6 == i17 || 18 == i17 || 9 == i17 || 17 == i17 || 40 == i17) {
            d();
            this.A = false;
        }
    }

    public final void B0(int i17) {
        t().f93090m = f0(i17);
        g();
        com.tencent.mm.plugin.ball.ui.e0.b(this.f93239n, this.f93136h.G(), new com.tencent.mm.plugin.appbrand.floatball.g1(this));
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void C(int i17, java.lang.String str, int i18, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedBallInfoCallbackFunction, type:%d, key:%s, functionType:%d, isPlaying:%b", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.C));
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo == null || i17 != ballInfo.f93046d || !java.util.Objects.equals(str, ballInfo.f93049g) || i18 == 2 || i18 != 1 || bundle == null) {
            return;
        }
        bundle.setClassLoader(android.view.Surface.class.getClassLoader());
        android.view.Surface surface = (android.view.Surface) bundle.getParcelable("surface");
        this.D = surface;
        if (surface == null || !this.C) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "SetPlaybackSurface");
        this.f78110y.t(this.D);
    }

    public final void C0() {
        tf1.e eVar;
        gp1.v vVar = this.f93136h;
        com.tencent.mm.plugin.ball.model.BallInfo t07 = vVar != null ? vVar.t0(this.f93132d) : null;
        if (t07 == null) {
            com.tencent.mars.xlog.Log.i(this.f78107v, "removeBackgroundPlayAudioBall, no this float ball");
            pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
            int i17 = this.f93132d.H;
            ((ov.p0) j0Var).getClass();
            java.lang.Boolean bool = qp1.w.f365755a;
            b0(i17 & (-18433));
        } else if (t07.I) {
            com.tencent.mars.xlog.Log.i(this.f78107v, "removeBackgroundPlayAudioBall, remove passive float ball");
            d();
        } else {
            com.tencent.mars.xlog.Log.w(this.f78107v, "removeBackgroundPlayAudioBall, passive is false");
        }
        tf1.f fVar = this.f78110y;
        if (fVar != null && (eVar = this.f78111z) != null) {
            fVar.f418863i.remove(eVar);
        }
        this.A = false;
        this.B = false;
    }

    public final void D0(android.graphics.Bitmap bitmap, float f17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.floatball.y0(this, bitmap, f17));
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void E(int i17, java.lang.String str) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        java.lang.String str2 = this.f78107v;
        if (ballInfo != null) {
            com.tencent.mars.xlog.Log.i(str2, "onReceivedBallInfoDeleteButtonClickEvent, myType: %d, myKey: %s", java.lang.Integer.valueOf(ballInfo.f93046d), this.f93132d.f93049g);
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
        if (ballInfo2 != null && i17 == ballInfo2.f93046d && java.util.Objects.equals(str, ballInfo2.f93049g)) {
            com.tencent.mars.xlog.Log.i(str2, "onReceivedBallInfoDeleteButtonClickEvent, delete myself");
            C0();
            tf1.f fVar = this.f78110y;
            if (fVar != null) {
                fVar.f();
            }
            this.C = false;
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void F(int i17, java.lang.String str) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null && i17 == ballInfo.f93046d && java.util.Objects.equals(str, ballInfo.f93049g)) {
            com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedBallInfoPlayButtonClickEvent, myself");
            tf1.f fVar = this.f78110y;
            if (fVar != null) {
                if (!this.C) {
                    fVar.w(null);
                    this.C = true;
                } else {
                    fVar.u(null);
                    if (rh1.b.a()) {
                        this.f78110y.f418869r = false;
                    }
                    this.C = false;
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void G(int i17, java.lang.String str) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null && i17 == ballInfo.f93046d && java.util.Objects.equals(str, ballInfo.f93049g)) {
            java.lang.String str2 = "onReceivedBallInfoPlayModeSwitchButtonClickEvent, myself, isOnlyAudioMode:" + this.F;
            java.lang.String str3 = this.f78107v;
            com.tencent.mars.xlog.Log.i(str3, str2);
            if (!this.E || this.f78110y == null) {
                return;
            }
            this.F = !this.F;
            com.tencent.mars.xlog.Log.i(str3, "update isOnlyAudioMode:" + this.F);
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = this.f93132d.f93054o;
            ballButtonInfo.f93077o = this.F ^ true;
            S(ballButtonInfo);
            java.lang.String h17 = this.f78110y.h();
            if (com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.utils.d0.c(this.f78108w.C0(), h17, null, new com.tencent.mm.plugin.appbrand.floatball.e1(this));
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedBallInfoRemovedEvent, runtime:%s", java.lang.Integer.valueOf(this.f78108w.hashCode()));
        n0();
        this.A = false;
        z0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedFinishWhenSwitchBallEvent, runtime:%s", java.lang.Integer.valueOf(this.f78108w.hashCode()));
        this.f93239n.q(true);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void K() {
        if (this.f93132d != null) {
            com.tencent.mars.xlog.Log.i(this.f78107v, "onReceivedPauseBallInfoEvent, myself");
            tf1.f fVar = this.f78110y;
            if (fVar != null) {
                fVar.u(null);
                this.f78110y.f418869r = false;
                this.C = false;
            }
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(3);
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78109x;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).wi(this.G);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onClose, runtime:%s", java.lang.Integer.valueOf(this.f78108w.hashCode()));
        if (!u() && !this.A) {
            return false;
        }
        if (u() && !com.tencent.mm.sdk.platformtools.o4.L().i("has_shown_appbrand_video_tip", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "onClose, should show voip tip");
            android.app.Activity activity = this.f93239n.getActivity();
            com.tencent.mm.plugin.appbrand.floatball.a1 a1Var = new com.tencent.mm.plugin.appbrand.floatball.a1(this, i17);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
            u1Var.g(activity.getString(com.tencent.mm.R.string.a5l));
            u1Var.m(com.tencent.mm.R.string.a5m);
            u1Var.l(new com.tencent.mm.plugin.appbrand.floatball.b1(this, a1Var));
            u1Var.q(false);
        } else {
            A0(i17);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onDestroy, runtime:%s", java.lang.Integer.valueOf(this.f78108w.hashCode()));
        super.o0();
        com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var = this.f78109x;
        if (v0Var != null) {
            ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var).Bi(this.G);
        }
    }

    public final java.lang.String v0() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78108w;
        tf1.f fVar = (tf1.f) o6Var.k(tf1.f.class);
        java.lang.String i17 = fVar != null ? fVar.i() : null;
        return com.tencent.mm.sdk.platformtools.t8.K0(i17) ? o6Var.u0().f77279e : i17;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onEnterPage, runtime:%s", java.lang.Integer.valueOf(this.f78108w.hashCode()));
        if (s() != null) {
            d0(false);
        }
        this.F = false;
    }

    public final void x0() {
        tf1.f fVar = (tf1.f) this.f78108w.k(tf1.f.class);
        if (fVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "find AppBrandRuntimeAudioOfVideoBackgroundPlayManager fail");
            return;
        }
        this.f78110y = fVar;
        com.tencent.mm.plugin.appbrand.floatball.i1 i1Var = new com.tencent.mm.plugin.appbrand.floatball.i1(this);
        this.f78111z = i1Var;
        java.util.ArrayList arrayList = fVar.f418863i;
        if (arrayList.contains(i1Var)) {
            return;
        }
        arrayList.add(i1Var);
    }

    public final void y0() {
        android.graphics.Bitmap bitmap;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "initViewPanelView");
        tf1.f fVar = this.f78110y;
        if (fVar == null) {
            x0();
        } else {
            tf1.e eVar = this.f78111z;
            if (eVar != null) {
                java.util.ArrayList arrayList = fVar.f418863i;
                if (!arrayList.contains(eVar)) {
                    arrayList.add(eVar);
                }
            }
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        ballInfo.F = true;
        ballInfo.L = false;
        tf1.f fVar2 = this.f78110y;
        if (fVar2 != null) {
            this.C = fVar2.l();
        } else {
            this.C = true;
        }
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = this.f93132d.f93054o;
        boolean z17 = this.C;
        ballButtonInfo.f93069d = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "initViewPanelView isPlaying:%b", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo2 = this.f93132d.f93054o;
        ballButtonInfo2.f93070e = true;
        ballButtonInfo2.f93073h = true;
        ballButtonInfo2.f93072g = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478553an);
        this.f93132d.f93054o.f93075m = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478553an);
        S(this.f93132d.f93054o);
        com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = this.f93132d.f93055p;
        ballBlurInfo.f93066d = "";
        R(ballBlurInfo);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
        com.tencent.mm.plugin.appbrand.floatball.h1 h1Var = new com.tencent.mm.plugin.appbrand.floatball.h1(this);
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.x(ballInfo2, h1Var);
        }
        tf1.f fVar3 = this.f78110y;
        if (fVar3 != null) {
            tf.q g17 = fVar3.g();
            if (g17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshot, videoPlayer:" + g17.getName());
                tf.s sVar = (tf.s) g17.h(tf.s.class);
                if (sVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshot, videoPlayerAddOnGetSnapshot is null");
                } else {
                    android.graphics.Bitmap g18 = sVar.g();
                    if (g18 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshotCached, bitmap is null");
                    }
                    sVar.d(new tf1.c(fVar3));
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoSnapshot, success");
                    bitmap = g18;
                    if (bitmap != null || bitmap.isRecycled()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "getVideoSnapshot bmp is null");
                    } else {
                        D0(bitmap, this.f78110y.j());
                    }
                }
            }
            bitmap = null;
            if (bitmap != null) {
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandVideoBackgroundPlayFloatBallHelper", "getVideoSnapshot bmp is null");
        }
        this.B = true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mars.xlog.Log.i(this.f78107v, "onExitPage, runtime:%s", java.lang.Integer.valueOf(this.f78108w.hashCode()));
        if (s() != null) {
            d0(true);
        }
    }

    public final void z0() {
        if (this.f78109x == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel mMBackgroundRunningOperationParcel = new com.tencent.mm.plugin.appbrand.backgroundrunning.MMBackgroundRunningOperationParcel();
        mMBackgroundRunningOperationParcel.f76945d = this.f78108w.f74803n;
        mMBackgroundRunningOperationParcel.f76946e = 64;
        mMBackgroundRunningOperationParcel.f76947f = 2;
        com.tencent.mars.xlog.Log.i(this.f78107v, "maybeStopBackgroundPlayAudio, appId:%s", this.f78108w.f74803n);
        ((com.tencent.mm.plugin.appbrand.backgroundrunning.k) this.f78109x).Ai(mMBackgroundRunningOperationParcel);
    }
}
