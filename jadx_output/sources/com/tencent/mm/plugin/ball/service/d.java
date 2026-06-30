package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public class d implements gp1.r {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.ball.model.BallInfo f93132d;

    /* renamed from: e, reason: collision with root package name */
    public int f93133e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93134f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93135g = false;

    /* renamed from: h, reason: collision with root package name */
    public final gp1.v f93136h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.ui.v0 f93137i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.ResultReceiver f93138m;

    public d() {
        final android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        new android.os.ResultReceiver(createFreeHandler, this) { // from class: com.tencent.mm.plugin.ball.service.FloatBallHelper$ResultReceiverImpl

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f93097d;

            {
                this.f93097d = new java.lang.ref.WeakReference(this);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.tencent.mm.plugin.ball.service.d dVar;
                java.lang.ref.WeakReference weakReference = this.f93097d;
                if (weakReference == null || (dVar = (com.tencent.mm.plugin.ball.service.d) weakReference.get()) == null || i17 != 2 || bundle == null) {
                    return;
                }
                boolean z17 = bundle.getBoolean("can_add_float_ball_when_hide", false);
                if (z17 && dVar.k()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "autoAddFloatBall onReceiveResult add new after remove floatBall done");
                    dVar.t().f93091n = 1;
                    dVar.A(true, 7);
                } else if (dVar.f93132d != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "autoAddFloatBall onReceiveResult not add, canAdd: %b", java.lang.Boolean.valueOf(z17));
                    dVar.t().f93091n = 2;
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h(dVar.f93132d);
                }
            }
        };
        final android.os.Handler createFreeHandler2 = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
        this.f93138m = new android.os.ResultReceiver(createFreeHandler2, this) { // from class: com.tencent.mm.plugin.ball.service.FloatBallHelper$ResultReceiverImpl2

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f93098d;

            {
                this.f93098d = new java.lang.ref.WeakReference(this);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.tencent.mm.plugin.ball.service.d dVar = (com.tencent.mm.plugin.ball.service.d) this.f93098d.get();
                if (dVar == null) {
                    return;
                }
                switch (i17) {
                    case 1:
                        if (bundle == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i18 = bundle.getInt("type", 0);
                        java.lang.String string = bundle.getString("key", null);
                        if (i18 == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.B(i18, string);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), string);
                            return;
                        }
                    case 2:
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(UPDATE_BALL_INFO)", java.lang.Integer.valueOf(i17));
                        return;
                    case 3:
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(REMOVE_BALL_INFO)", java.lang.Integer.valueOf(i17));
                        dVar.H();
                        return;
                    case 4:
                        boolean L = dVar.L();
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(FINISH_WHEN_SWITCH_BALL), openFromFloatBall:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(L));
                        if (L) {
                            dVar.I();
                            return;
                        }
                        return;
                    case 5:
                        if (bundle == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(BALL_INFO_COUNT_CHANGED), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i19 = bundle.getInt("ActiveCount", 0);
                        dVar.D(i19);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(BALL_INFO_COUNT_CHANGED), activeCount:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
                        return;
                    case 6:
                        if (bundle == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_BUTTON), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i27 = bundle.getInt("type", 0);
                        java.lang.String string2 = bundle.getString("key", null);
                        if (i27 == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_BUTTON), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.F(i27, string2);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_BUTTON), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), string2);
                            return;
                        }
                    case 7:
                        if (bundle == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_DELETE_BUTTON), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i28 = bundle.getInt("type", 0);
                        java.lang.String string3 = bundle.getString("key", null);
                        if (i28 == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_DELETE_BUTTON), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.E(i28, string3);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_DELETE_BUTTON), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i28), string3);
                            return;
                        }
                    case 8:
                        dVar.K();
                        return;
                    case 9:
                        if (bundle == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CALLBACK_FUNCTION), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i29 = bundle.getInt("type", 0);
                        java.lang.String string4 = bundle.getString("key", null);
                        int i37 = bundle.getInt("function_type", 0);
                        if (i29 == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CALLBACK_FUNCTION), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.C(i29, string4, i37, bundle.getBundle("function_param"));
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CALLBACK_FUNCTION), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i29), string4);
                            return;
                        }
                    case 10:
                        if (bundle == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_MODE_SWITCH_BUTTON), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i38 = bundle.getInt("type", 0);
                        java.lang.String string5 = bundle.getString("key", null);
                        if (i38 == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_MODE_SWITCH_BUTTON), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.G(i38, string5);
                            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_MODE_SWITCH_BUTTON), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i38), string5);
                            return;
                        }
                    case 11:
                        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(IS_NO_FLOAT_BALL_PAGE_CHANGED)", java.lang.Integer.valueOf(i17));
                        dVar.J();
                        return;
                    default:
                        return;
                }
            }
        };
        this.f93136h = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        this.f93137i = new com.tencent.mm.plugin.ball.service.c(this);
    }

    public void A(boolean z17, int i17) {
    }

    public void B(int i17, java.lang.String str) {
    }

    public void C(int i17, java.lang.String str, int i18, android.os.Bundle bundle) {
    }

    public void D(int i17) {
    }

    public void E(int i17, java.lang.String str) {
    }

    public void F(int i17, java.lang.String str) {
    }

    public void G(int i17, java.lang.String str) {
    }

    public void H() {
    }

    public void I() {
    }

    public void J() {
    }

    public void K() {
    }

    public boolean L() {
        return this.f93135g;
    }

    public void M() {
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.f(this.f93132d, this.f93138m);
        }
    }

    public void N() {
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.l(this.f93132d);
        }
    }

    public final void O() {
        gp1.v vVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "removeMessageBallIfNeed enable: %b, isFromMessageFloatBall: %b, ballInfo.contentType: %d, originFloatBallType: %d", java.lang.Boolean.valueOf(o()), java.lang.Boolean.valueOf(this.f93132d.f93046d == 20), java.lang.Integer.valueOf(this.f93132d.f93047e), java.lang.Integer.valueOf(this.f93133e));
        if (n() && o()) {
            if (!(this.f93132d.f93046d == 20) || (vVar = this.f93136h) == null) {
                return;
            }
            vVar.M(this.f93133e);
        }
    }

    public final void P() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo;
        if (n()) {
            n();
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = null;
            if (n() && (ballInfo = this.f93132d) != null) {
                java.lang.String t17 = com.tencent.mm.sdk.platformtools.o4.M(q()).t(java.lang.String.format("%s#%s", 20, ballInfo.f93049g));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
                    try {
                        ballInfo2 = com.tencent.mm.plugin.ball.model.BallInfo.c(new org.json.JSONObject(t17));
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallHelper", e17, "getCurrentBallFromMMKV:%s", this.f93132d);
                    }
                }
            }
            if (ballInfo2 != null) {
                com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = this.f93132d.M;
                this.f93132d = ballInfo2;
                synchronized (ballInfo2) {
                    ballInfo2.q(ballReportInfo);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "replaceMessageBallIfNeed, replace current message ball reportInfo: %s", this.f93132d.M);
            }
        }
    }

    public void Q(int i17) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            ballInfo.f93048f = i17;
        }
    }

    public void R(com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo2 = ballInfo.f93055p;
            ballBlurInfo2.getClass();
            ballBlurInfo2.f93066d = ballBlurInfo.f93066d;
            ballBlurInfo2.f93067e = ballBlurInfo.f93067e;
            ballBlurInfo2.f93068f = ballBlurInfo.f93068f;
            gp1.v vVar = this.f93136h;
            if (vVar != null) {
                vVar.c(this.f93132d);
            }
        }
    }

    public void S(com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            ballInfo.f93054o.a(ballButtonInfo);
            gp1.v vVar = this.f93136h;
            if (vVar != null) {
                vVar.b(this.f93132d);
            }
        }
    }

    public void T(java.lang.String str, boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            if (ballInfo.i(str)) {
                com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
                synchronized (ballInfo2) {
                    z18 = ballInfo2.i(str) ? ballInfo2.G.getBoolean(str, z17) : z17;
                }
                if (z18 == z17) {
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateBooleanExtra, %s:%s", str, java.lang.Boolean.valueOf(z17));
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = this.f93132d;
            synchronized (ballInfo3) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ballInfo3.d();
                    ballInfo3.G.putBoolean(str, z17);
                }
            }
            g();
        }
    }

    public void U(java.lang.String str, byte[] bArr) {
        if (this.f93132d != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateByteArrayExtra, %s", str);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
            synchronized (ballInfo) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ballInfo.d();
                    ballInfo.G.putByteArray(str, bArr);
                }
            }
            g();
        }
    }

    public void V(java.lang.String str) {
        if (this.f93132d == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || m(this.f93132d.f93064y, str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateDesc, desc:%s", str);
        this.f93132d.f93064y = str;
        g();
    }

    public void W(boolean z17) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo == null || ballInfo.f93045J == z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateHidden, hidden:%s", java.lang.Boolean.valueOf(z17));
        this.f93132d.f93045J = z17;
        g();
    }

    public void X(java.lang.String str) {
        if (this.f93132d == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || m(this.f93132d.f93057r, str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateIcon, icon:%s", str);
        this.f93132d.f93057r = str;
        g();
    }

    public void Y(java.lang.String str, int i17) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            if (ballInfo.i(str) && this.f93132d.f(str, i17) == i17) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateIntExtra, %s:%s", str, java.lang.Integer.valueOf(i17));
            this.f93132d.m(str, i17);
            g();
        }
    }

    public void Z(java.lang.String str) {
        if (this.f93132d == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (str.length() > 50) {
            str = str.substring(0, 50);
        }
        if (m(this.f93132d.f93063x, str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateName, name:%s", str);
        this.f93132d.f93063x = str;
        g();
    }

    public void a0(boolean z17) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo == null || ballInfo.I == z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updatePassive, passive:%s", java.lang.Boolean.valueOf(z17));
        this.f93132d.I = z17;
        g();
    }

    @Override // gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "gamelog.restart,create()");
        this.f93132d = new com.tencent.mm.plugin.ball.model.BallInfo(i17, str, null);
        this.f93133e = i17;
        com.tencent.mm.plugin.ball.model.BallInfo r17 = r();
        if (r17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "replaceCurrentBallIfNeed, replace current ball");
            this.f93132d = r17;
        }
        M();
        this.f93135g = u();
    }

    public void b0(int i17) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo == null || ballInfo.H == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "updateState, state:%s", java.lang.Integer.valueOf(i17));
        this.f93132d.H = i17;
        g();
    }

    public void c0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            if (ballInfo.i(str) && m(this.f93132d.g(str, str2), str2)) {
                return;
            }
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.FloatBallHelper", "updateStringExtra, %s:%s", str, str2);
            this.f93132d.n(str, str2);
            g();
        }
    }

    @Override // gp1.r
    public void d() {
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.U(this.f93132d);
        }
    }

    public void d0(boolean z17) {
        gp1.v vVar;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo == null || (vVar = this.f93136h) == null) {
            return;
        }
        vVar.N(ballInfo, z17);
    }

    @Override // gp1.r
    public void e() {
        g();
    }

    @Override // gp1.r
    public void g() {
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.V(this.f93132d);
        }
    }

    @Override // gp1.r
    public void j() {
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.u(this.f93132d);
        }
    }

    public boolean k() {
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            return vVar.l0(this.f93132d);
        }
        return false;
    }

    public final boolean l() {
        return n() && !this.f93134f;
    }

    public final boolean m(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if ("".equals(str) && "".equals(str2)) {
            return true;
        }
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str.equals(str2)) ? false : true;
    }

    public boolean n() {
        return this instanceof com.tencent.mm.plugin.choosemsgfile.ui.b0;
    }

    public boolean o() {
        return n();
    }

    public final void p() {
        this.f93134f = true;
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.S();
        }
    }

    public final java.lang.String q() {
        ((ov.i0) ((pv.e0) i95.n0.c(pv.e0.class))).getClass();
        int i17 = gm0.m.i();
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallFeatureService", "accountDataKey:%s", "float_ball_storage");
            return "float_ball_storage";
        }
        java.lang.String str = (i17 & io.flutter.embedding.android.KeyboardMap.kValueMask) + "#float_ball_storage";
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallFeatureService", "accountDataKey:%s", str);
        return str;
    }

    public com.tencent.mm.plugin.ball.model.BallInfo r() {
        return s();
    }

    public com.tencent.mm.plugin.ball.model.BallInfo s() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = null;
        if (ballInfo != null) {
            java.lang.String t17 = com.tencent.mm.sdk.platformtools.o4.M(q()).t(ballInfo.e());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
                try {
                    ballInfo2 = com.tencent.mm.plugin.ball.model.BallInfo.c(new org.json.JSONObject(t17));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallHelper", e17, "getCurrentBallFromMMKV:%s", this.f93132d);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallHelper", "getCurrentBallFromMMKV, data:%s, ballInfo:%s", t17, ballInfo2);
                return ballInfo2;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallHelper", "getCurrentBallFromMMKV, no saved data");
        }
        return null;
    }

    public com.tencent.mm.plugin.ball.model.BallReportInfo t() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo != null) {
            return ballInfo.M;
        }
        throw new java.lang.IllegalStateException("call FloatBallHelper#onCreate first");
    }

    public boolean u() {
        gp1.v vVar = this.f93136h;
        return (vVar == null || vVar.t0(this.f93132d) == null) ? false : true;
    }

    public boolean v() {
        return this instanceof com.tencent.mm.plugin.choosemsgfile.ui.b0;
    }

    public boolean w() {
        return this.f93136h.Y();
    }

    public void x() {
        this.f93134f = false;
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.w0(this.f93132d);
        }
        if (this.f93132d != null) {
            this.f93135g = u();
            P();
            O();
        }
    }

    public void z() {
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.i(this.f93132d);
        }
        if (this.f93132d != null) {
            if (l() && vVar != null) {
                vVar.o0(this.f93132d);
            }
            if (this.f93134f) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai().d(this.f93132d.M.f93086f, false, n());
            }
        }
    }
}
