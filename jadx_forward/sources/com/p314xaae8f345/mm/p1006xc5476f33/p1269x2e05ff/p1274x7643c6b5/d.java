package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class d implements gp1.r {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174665d;

    /* renamed from: e, reason: collision with root package name */
    public int f174666e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f174667f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f174668g = false;

    /* renamed from: h, reason: collision with root package name */
    public final gp1.v f174669h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.v0 f174670i;

    /* renamed from: m, reason: collision with root package name */
    public final android.os.ResultReceiver f174671m;

    public d() {
        final android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        new android.os.ResultReceiver(m77777x504cd8a2, this) { // from class: com.tencent.mm.plugin.ball.service.FloatBallHelper$ResultReceiverImpl

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f174630d;

            {
                this.f174630d = new java.lang.ref.WeakReference(this);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d dVar;
                java.lang.ref.WeakReference weakReference = this.f174630d;
                if (weakReference == null || (dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) weakReference.get()) == null || i17 != 2 || bundle == null) {
                    return;
                }
                boolean z17 = bundle.getBoolean("can_add_float_ball_when_hide", false);
                if (z17 && dVar.k()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "autoAddFloatBall onReceiveResult add new after remove floatBall done");
                    dVar.t().f174624n = 1;
                    dVar.A(true, 7);
                } else if (dVar.f174665d != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "autoAddFloatBall onReceiveResult not add, canAdd: %b", java.lang.Boolean.valueOf(z17));
                    dVar.t().f174624n = 2;
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().h(dVar.f174665d);
                }
            }
        };
        final android.os.Handler m77777x504cd8a22 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        this.f174671m = new android.os.ResultReceiver(m77777x504cd8a22, this) { // from class: com.tencent.mm.plugin.ball.service.FloatBallHelper$ResultReceiverImpl2

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f174631d;

            {
                this.f174631d = new java.lang.ref.WeakReference(this);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) this.f174631d.get();
                if (dVar == null) {
                    return;
                }
                switch (i17) {
                    case 1:
                        if (bundle == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i18 = bundle.getInt("type", 0);
                        java.lang.String string = bundle.getString("key", null);
                        if (i18 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.B(i18, string);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), string);
                            return;
                        }
                    case 2:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(UPDATE_BALL_INFO)", java.lang.Integer.valueOf(i17));
                        return;
                    case 3:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(REMOVE_BALL_INFO)", java.lang.Integer.valueOf(i17));
                        dVar.H();
                        return;
                    case 4:
                        boolean L = dVar.L();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(FINISH_WHEN_SWITCH_BALL), openFromFloatBall:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(L));
                        if (L) {
                            dVar.I();
                            return;
                        }
                        return;
                    case 5:
                        if (bundle == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(BALL_INFO_COUNT_CHANGED), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i19 = bundle.getInt("ActiveCount", 0);
                        dVar.D(i19);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(BALL_INFO_COUNT_CHANGED), activeCount:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
                        return;
                    case 6:
                        if (bundle == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_BUTTON), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i27 = bundle.getInt("type", 0);
                        java.lang.String string2 = bundle.getString("key", null);
                        if (i27 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_BUTTON), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.F(i27, string2);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_BUTTON), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), string2);
                            return;
                        }
                    case 7:
                        if (bundle == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_DELETE_BUTTON), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i28 = bundle.getInt("type", 0);
                        java.lang.String string3 = bundle.getString("key", null);
                        if (i28 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_DELETE_BUTTON), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.E(i28, string3);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_DELETE_BUTTON), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i28), string3);
                            return;
                        }
                    case 8:
                        dVar.K();
                        return;
                    case 9:
                        if (bundle == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CALLBACK_FUNCTION), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i29 = bundle.getInt("type", 0);
                        java.lang.String string4 = bundle.getString("key", null);
                        int i37 = bundle.getInt("function_type", 0);
                        if (i29 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CALLBACK_FUNCTION), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.C(i29, string4, i37, bundle.getBundle("function_param"));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CALLBACK_FUNCTION), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i29), string4);
                            return;
                        }
                    case 10:
                        if (bundle == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_MODE_SWITCH_BUTTON), no resultData", java.lang.Integer.valueOf(i17));
                            return;
                        }
                        int i38 = bundle.getInt("type", 0);
                        java.lang.String string5 = bundle.getString("key", null);
                        if (i38 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_MODE_SWITCH_BUTTON), no type", java.lang.Integer.valueOf(i17));
                            return;
                        } else {
                            dVar.G(i38, string5);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(CLICK_PLAY_MODE_SWITCH_BUTTON), type:%d, key: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i38), string5);
                            return;
                        }
                    case 11:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(IS_NO_FLOAT_BALL_PAGE_CHANGED)", java.lang.Integer.valueOf(i17));
                        dVar.J();
                        return;
                    default:
                        return;
                }
            }
        };
        this.f174669h = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        this.f174670i = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.c(this);
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
        return this.f174668g;
    }

    public void M() {
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.f(this.f174665d, this.f174671m);
        }
    }

    public void N() {
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.l(this.f174665d);
        }
    }

    public final void O() {
        gp1.v vVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "removeMessageBallIfNeed enable: %b, isFromMessageFloatBall: %b, ballInfo.contentType: %d, originFloatBallType: %d", java.lang.Boolean.valueOf(o()), java.lang.Boolean.valueOf(this.f174665d.f174579d == 20), java.lang.Integer.valueOf(this.f174665d.f174580e), java.lang.Integer.valueOf(this.f174666e));
        if (n() && o()) {
            if (!(this.f174665d.f174579d == 20) || (vVar = this.f174669h) == null) {
                return;
            }
            vVar.M(this.f174666e);
        }
    }

    public final void P() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d;
        if (n()) {
            n();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = null;
            if (n() && (c12886x91aa2b6d = this.f174665d) != null) {
                java.lang.String t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(q()).t(java.lang.String.format("%s#%s", 20, c12886x91aa2b6d.f174582g));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17)) {
                    try {
                        c12886x91aa2b6d2 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.c(new org.json.JSONObject(t17));
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallHelper", e17, "getCurrentBallFromMMKV:%s", this.f174665d);
                    }
                }
            }
            if (c12886x91aa2b6d2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 c12887x942bef81 = this.f174665d.M;
                this.f174665d = c12886x91aa2b6d2;
                synchronized (c12886x91aa2b6d2) {
                    c12886x91aa2b6d2.q(c12887x942bef81);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "replaceMessageBallIfNeed, replace current message ball reportInfo: %s", this.f174665d.M);
            }
        }
    }

    public void Q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            c12886x91aa2b6d.f174581f = i17;
        }
    }

    public void R(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallBlurInfo ballBlurInfo2 = c12886x91aa2b6d.f174588p;
            ballBlurInfo2.getClass();
            ballBlurInfo2.f174599d = ballBlurInfo.f174599d;
            ballBlurInfo2.f174600e = ballBlurInfo.f174600e;
            ballBlurInfo2.f174601f = ballBlurInfo.f174601f;
            gp1.v vVar = this.f174669h;
            if (vVar != null) {
                vVar.c(this.f174665d);
            }
        }
    }

    public void S(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            c12886x91aa2b6d.f174587o.a(ballButtonInfo);
            gp1.v vVar = this.f174669h;
            if (vVar != null) {
                vVar.b(this.f174665d);
            }
        }
    }

    public void T(java.lang.String str, boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            if (c12886x91aa2b6d.i(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = this.f174665d;
                synchronized (c12886x91aa2b6d2) {
                    z18 = c12886x91aa2b6d2.i(str) ? c12886x91aa2b6d2.G.getBoolean(str, z17) : z17;
                }
                if (z18 == z17) {
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateBooleanExtra, %s:%s", str, java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d3 = this.f174665d;
            synchronized (c12886x91aa2b6d3) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    c12886x91aa2b6d3.d();
                    c12886x91aa2b6d3.G.putBoolean(str, z17);
                }
            }
            g();
        }
    }

    public void U(java.lang.String str, byte[] bArr) {
        if (this.f174665d != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateByteArrayExtra, %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
            synchronized (c12886x91aa2b6d) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    c12886x91aa2b6d.d();
                    c12886x91aa2b6d.G.putByteArray(str, bArr);
                }
            }
            g();
        }
    }

    public void V(java.lang.String str) {
        if (this.f174665d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || m(this.f174665d.f174597y, str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateDesc, desc:%s", str);
        this.f174665d.f174597y = str;
        g();
    }

    public void W(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.f174578J == z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateHidden, hidden:%s", java.lang.Boolean.valueOf(z17));
        this.f174665d.f174578J = z17;
        g();
    }

    public void X(java.lang.String str) {
        if (this.f174665d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || m(this.f174665d.f174590r, str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateIcon, icon:%s", str);
        this.f174665d.f174590r = str;
        g();
    }

    public void Y(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            if (c12886x91aa2b6d.i(str) && this.f174665d.f(str, i17) == i17) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateIntExtra, %s:%s", str, java.lang.Integer.valueOf(i17));
            this.f174665d.m(str, i17);
            g();
        }
    }

    public void Z(java.lang.String str) {
        if (this.f174665d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        if (str.length() > 50) {
            str = str.substring(0, 50);
        }
        if (m(this.f174665d.f174596x, str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateName, name:%s", str);
        this.f174665d.f174596x = str;
        g();
    }

    public void a0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.I == z17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updatePassive, passive:%s", java.lang.Boolean.valueOf(z17));
        this.f174665d.I = z17;
        g();
    }

    @Override // gp1.r
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "gamelog.restart,create()");
        this.f174665d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(i17, str, null);
        this.f174666e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r17 = r();
        if (r17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "replaceCurrentBallIfNeed, replace current ball");
            this.f174665d = r17;
        }
        M();
        this.f174668g = u();
    }

    public void b0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d == null || c12886x91aa2b6d.H == i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "updateState, state:%s", java.lang.Integer.valueOf(i17));
        this.f174665d.H = i17;
        g();
    }

    public void c0(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            if (c12886x91aa2b6d.i(str) && m(this.f174665d.g(str, str2), str2)) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.FloatBallHelper", "updateStringExtra, %s:%s", str, str2);
            this.f174665d.n(str, str2);
            g();
        }
    }

    @Override // gp1.r
    public void d() {
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.U(this.f174665d);
        }
    }

    public void d0(boolean z17) {
        gp1.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d == null || (vVar = this.f174669h) == null) {
            return;
        }
        vVar.N(c12886x91aa2b6d, z17);
    }

    @Override // gp1.r
    public void e() {
        g();
    }

    @Override // gp1.r
    public void g() {
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.V(this.f174665d);
        }
    }

    @Override // gp1.r
    public void j() {
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.u(this.f174665d);
        }
    }

    public boolean k() {
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            return vVar.l0(this.f174665d);
        }
        return false;
    }

    public final boolean l() {
        return n() && !this.f174667f;
    }

    public final boolean m(java.lang.String str, java.lang.String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if ("".equals(str) && "".equals(str2)) {
            return true;
        }
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str.equals(str2)) ? false : true;
    }

    public boolean n() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.b0;
    }

    public boolean o() {
        return n();
    }

    public final void p() {
        this.f174667f = true;
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.S();
        }
    }

    public final java.lang.String q() {
        ((ov.i0) ((pv.e0) i95.n0.c(pv.e0.class))).getClass();
        int i17 = gm0.m.i();
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallFeatureService", "accountDataKey:%s", "float_ball_storage");
            return "float_ball_storage";
        }
        java.lang.String str = (i17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) + "#float_ball_storage";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallFeatureService", "accountDataKey:%s", str);
        return str;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r() {
        return s();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d s() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = null;
        if (c12886x91aa2b6d != null) {
            java.lang.String t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(q()).t(c12886x91aa2b6d.e());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17)) {
                try {
                    c12886x91aa2b6d2 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.c(new org.json.JSONObject(t17));
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallHelper", e17, "getCurrentBallFromMMKV:%s", this.f174665d);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallHelper", "getCurrentBallFromMMKV, data:%s, ballInfo:%s", t17, c12886x91aa2b6d2);
                return c12886x91aa2b6d2;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallHelper", "getCurrentBallFromMMKV, no saved data");
        }
        return null;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d != null) {
            return c12886x91aa2b6d.M;
        }
        throw new java.lang.IllegalStateException("call FloatBallHelper#onCreate first");
    }

    public boolean u() {
        gp1.v vVar = this.f174669h;
        return (vVar == null || vVar.t0(this.f174665d) == null) ? false : true;
    }

    public boolean v() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.b0;
    }

    public boolean w() {
        return this.f174669h.Y();
    }

    public void x() {
        this.f174667f = false;
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.w0(this.f174665d);
        }
        if (this.f174665d != null) {
            this.f174668g = u();
            P();
            O();
        }
    }

    public void z() {
        gp1.v vVar = this.f174669h;
        if (vVar != null) {
            vVar.i(this.f174665d);
        }
        if (this.f174665d != null) {
            if (l() && vVar != null) {
                vVar.o0(this.f174665d);
            }
            if (this.f174667f) {
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai().d(this.f174665d.M.f174619f, false, n());
            }
        }
    }
}
