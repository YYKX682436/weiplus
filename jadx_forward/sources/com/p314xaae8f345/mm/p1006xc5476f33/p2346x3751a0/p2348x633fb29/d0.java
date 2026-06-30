package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public abstract class d0 extends gq4.a implements dr4.i {

    /* renamed from: x1, reason: collision with root package name */
    public static final uq3.g f257904x1 = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).aj("NewVoipMgr", null);
    public cv.v0 A;
    public int E;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k I;
    public boolean U;
    public wu5.c V;
    public boolean W;
    public final boolean X;
    public final boolean Y;
    public gi.q0 Z;

    /* renamed from: d, reason: collision with root package name */
    public final vq4.z f257906d;

    /* renamed from: e, reason: collision with root package name */
    public vq4.o0 f257907e;

    /* renamed from: f, reason: collision with root package name */
    public dr4.p1 f257908f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f f257909g;

    /* renamed from: l1, reason: collision with root package name */
    public long f257912l1;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f257916p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.content.BroadcastReceiver f257917p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f257918p1;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f257919q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f257920r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f257921s;

    /* renamed from: t, reason: collision with root package name */
    public int f257922t;

    /* renamed from: u, reason: collision with root package name */
    public long f257923u;

    /* renamed from: v, reason: collision with root package name */
    public long f257924v;

    /* renamed from: x0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f257927x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f257929y0;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.RunnableC18866x4b22ab7a f257910h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257911i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f257913m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f257914n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f257915o = new java.lang.Object();

    /* renamed from: w, reason: collision with root package name */
    public boolean f257925w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f257926x = 4096;

    /* renamed from: y, reason: collision with root package name */
    public boolean f257928y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f257930z = false;
    public long B = -1;
    public boolean C = false;
    public boolean D = false;
    public int F = 0;
    public long G = -1;
    public boolean H = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f257905J = false;
    public boolean K = false;
    public java.lang.String L = null;
    public long M = 0;
    public long N = 0;
    public int P = 0;
    public boolean Q = false;
    public boolean R = false;
    public int S = 0;
    public boolean T = false;

    public d0() {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("getSignalStrength");
        this.U = false;
        this.V = null;
        this.W = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p957x53236a1b.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class))).wi()).contains(6);
        this.X = vq4.b0.f();
        this.Y = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_cancel_fullscreen_notification_when_init_voip_mgr, true);
        this.f257917p0 = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                java.lang.String action = intent.getAction();
                android.os.PowerManager powerManager = (android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
                boolean equals = "android.intent.action.USER_PRESENT".equals(action);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                boolean z17 = true;
                if (equals && powerManager.isScreenOn()) {
                    dr4.p1 p1Var = d0Var.f257908f;
                    if (p1Var != null) {
                        p1Var.q(false);
                        d0Var.f257908f.f324238d = false;
                        if (!gq4.v.wi().f447509j) {
                            gq4.v.Bi().f258091a.o(false);
                        }
                        d0Var.f257908f.l(false);
                    }
                } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                    dr4.p1 p1Var2 = d0Var.f257908f;
                    if (p1Var2 != null) {
                        p1Var2.q(false);
                        d0Var.f257908f.f324238d = false;
                        if (!gq4.v.wi().f447509j) {
                            gq4.v.Bi().f258091a.o(false);
                        }
                        d0Var.f257908f.l(false);
                    }
                    ((vq4.m0) d0Var.f257906d).c(true);
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        dr4.p1 p1Var3 = d0Var.f257908f;
                        if (p1Var3 != null) {
                            p1Var3.f324238d = true;
                            p1Var3.l(true);
                            d0Var.f257908f.q(true);
                            gq4.v.Bi().f258091a.o(true);
                        }
                        if (!d0Var.f257911i) {
                            ((vq4.m0) d0Var.f257906d).c(true);
                        }
                        d0Var.D0();
                    }
                    z17 = false;
                }
                ((b13.m) d0Var).getClass();
                c13.b0 b0Var = c13.b0.f119393d;
                ((ku5.t0) ku5.t0.f394148d).B(new c13.o(z17));
            }
        };
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f257927x0 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe>(a0Var) { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$2
            {
                this.f39173x3fe91575 = 1403859438;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe2 = c6229x2bb765fe;
                if (c6229x2bb765fe2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe) {
                    am.w00 w00Var = c6229x2bb765fe2.f136476g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                    w00Var.f89778a = vq4.n0.g(d0Var.f257907e.f520902a);
                    dr4.p1 p1Var = d0Var.f257908f;
                    boolean z17 = (p1Var == null || p1Var.f324237c == null) ? false : true;
                    am.w00 w00Var2 = c6229x2bb765fe2.f136476g;
                    w00Var2.f89779b = z17;
                    w00Var2.f89780c = true;
                    w00Var2.f89781d = d0Var.f257916p;
                }
                return false;
            }
        };
        this.f257929y0 = false;
        this.f257912l1 = 0L;
        this.f257918p1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18858x8f03c38e(this, a0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        vq4.z zVar = gq4.v.Bi().D;
        this.f257906d = zVar;
        if (zVar == null) {
            vq4.m0 m0Var = new vq4.m0();
            this.f257906d = m0Var;
            gq4.v.Bi().D = m0Var;
        }
        this.f257922t = gq4.v.Bi().m();
        this.f257923u = gq4.v.Bi().n();
        this.f257924v = gq4.v.Bi().o();
        rq4.q.f480600a.a(java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), this.f257916p, java.lang.Boolean.valueOf(this.f257920r));
        vq4.z zVar2 = this.f257906d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(gq4.v.Bi().m());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(gq4.v.Bi().n());
        rq4.t tVar = ((vq4.m0) zVar2).f520895z;
        if (tVar != null && valueOf != null) {
            tVar.f480640g = valueOf.intValue();
            if (valueOf2 != null) {
                tVar.f480641h = valueOf2.longValue();
            }
        }
        dr4.p1 p1Var = gq4.v.Bi().E;
        this.f257908f = p1Var;
        if (p1Var != null) {
            p1Var.f324253s = this;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void A(boolean z17) {
        dr4.x1 x1Var;
        dr4.n0 n0Var;
        oq4.b bVar;
        dr4.p1 p1Var = this.f257908f;
        if (p1Var == null || (x1Var = p1Var.f324241g) == null || (n0Var = x1Var.f324297d) == null || (bVar = n0Var.f324206v) == null) {
            return;
        }
        rq4.j jVar = qq4.c.f447523d;
        if (jVar != null) {
            if (jVar.G == 0) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                jVar.G = java.lang.System.currentTimeMillis();
            }
            long j17 = jVar.G;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
            if (201 <= currentTimeMillis && currentTimeMillis < 500) {
                jVar.B++;
                jVar.E += currentTimeMillis;
            } else if (currentTimeMillis > 500) {
                jVar.C++;
                jVar.F += currentTimeMillis;
            }
            jVar.D++;
            jVar.G = java.lang.System.currentTimeMillis();
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        bVar.f428928a = currentTimeMillis2;
        if (bVar.f428929b) {
            bVar.f428929b = false;
            rq4.j jVar2 = qq4.c.f447523d;
            if (jVar2 != null) {
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                jVar2.o(false, java.lang.System.currentTimeMillis() - currentTimeMillis2);
            }
        }
    }

    public void A0() {
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.d0$$d
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (d0Var.f257909g == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onSensorEvent, voipUI is null, ignore");
                    return -1L;
                }
                if ((!d0Var.f257920r && !vq4.n0.h(d0Var.f257907e.f520902a)) || vq4.n0.g(d0Var.f257907e.f520902a)) {
                    return -1L;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onSensorEvent, isOn: %s", bool);
                d0Var.f257909g.mo72878x1aec5e91(bool.booleanValue());
                d0Var.f257911i = bool.booleanValue();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                return java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
            }
        };
        vq4.m0 m0Var = (vq4.m0) this.f257906d;
        m0Var.getClass();
        m0Var.n();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = m0Var.f520870a;
        if (n3Var != null) {
            n3Var.mo50293x3498a0(new vq4.h0(m0Var, lVar));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void B(int i17) {
        dr4.n0 n0Var;
        dr4.r1 r1Var;
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "setHWDecMode, hwdec: %d, before changeSurfaceRender :%d", java.lang.Integer.valueOf(i17), 0);
            dr4.x1 x1Var = p1Var.f324241g;
            if (x1Var != null && (n0Var = x1Var.f324297d) != null && (r1Var = n0Var.f324219l) != null) {
                r1Var.E(0);
            }
            p1Var.f324249o.f480549a.a(26);
        }
    }

    public void B0(cv.v0 v0Var) {
        int i17 = v0Var.f304049a;
        if (i17 != 2) {
            ((vq4.m0) this.f257906d).n();
        } else {
            cv.v0 v0Var2 = this.A;
            if (v0Var2 == null) {
                if (!vq4.n0.g(this.f257907e.f520902a)) {
                    A0();
                }
            } else if (v0Var2.f304049a != 2 && i17 == 2) {
                A0();
            }
        }
        rq4.q qVar = rq4.q.f480600a;
        rq4.q.f480606g.add(new jz5.l(java.lang.Integer.valueOf(v0Var.f304049a), java.lang.Long.valueOf(gq4.v.Bi().f258112v != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(gq4.v.Bi().f258112v) : 0L)));
        this.A = v0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void C(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "steve:[simucall]onNewSimulCallAutoAccept, callType: " + i17);
        if (this.f257907e.b(4100)) {
            gq4.v.Bi().a(i17 == 1, i17 == 1);
            D0();
            if (i17 == 1 && vq4.n0.g(this.f257907e.f520902a)) {
                E0(4101);
            }
            E0(4100);
        }
    }

    public final boolean C0() {
        if (!this.f257907e.b(4101)) {
            return false;
        }
        this.f257921s = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = this.I;
        if (kVar != null) {
            kVar.f258696n = false;
        }
        E0(4101);
        int i17 = this.f257907e.f520902a;
        if (261 == i17 || 7 == i17) {
            gq4.v.Bi().O(1, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(11046, 2, java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Integer.valueOf(gq4.v.Bi().m()), 0, java.lang.Integer.valueOf(this.f257920r ? 1 : 0));
            g0Var.d(11080, 2, 0, 0);
        } else if (1 == i17 || 3 == i17) {
            gq4.v.Bi().O(1, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11046, 1, java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Integer.valueOf(gq4.v.Bi().m()), 0, java.lang.Integer.valueOf(this.f257920r ? 1 : 0));
        }
        gq4.v.Bi().f258091a.f257944a.t();
        gq4.v.Bi().f258091a.f257944a.s();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void D(int i17) {
        dr4.n0 n0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "setSharpenFilter1080p, isON: " + i17 + "，mVoipUI: " + this.f257909g);
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            p1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "setSharpenFilter1080p, mIsStarted:%b, isON:%d", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i17));
            dr4.x1 x1Var = p1Var.f324241g;
            if (x1Var == null || (n0Var = x1Var.f324297d) == null) {
                return;
            }
            n0Var.d(new dr4.m0(n0Var, i17));
        }
    }

    public void D0() {
        vq4.z zVar = this.f257906d;
        if (zVar != null) {
            ((vq4.m0) zVar).C = false;
            ((vq4.m0) zVar).getClass();
            nq4.e.f420541a.a();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "close");
        bundle.putLong("roomKey", gq4.v.Bi().f258091a.f());
        bundle.putBoolean("isVideoCall", this.f257921s);
        bundle.putBoolean("isOutCall", this.f257920r);
        bundle.putString(dm.i4.f66875xa013b0d5, this.f257916p);
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.VOIP, bundle);
        if (zVar != null) {
            ((vq4.m0) zVar).C = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void E() {
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            p1Var.f324249o.getClass();
            rq4.d dVar = qq4.c.f447524e;
            if (dVar != null) {
                int i17 = gq4.v.wi().f447518s;
                int[] iArr = dVar.f480490g;
                if (i17 > kz5.z.K(iArr)) {
                    iArr[0] = i17;
                }
                int e07 = kz5.z.e0(iArr);
                if (i17 != 0 && (i17 < e07 || e07 == 0)) {
                    iArr[1] = i17;
                }
                int i18 = dVar.f480488e + i17;
                dVar.f480488e = i18;
                dVar.f480488e = i18 / 2;
                if (java.lang.Math.abs(dVar.f480489f - i17) > 50) {
                    if (dVar.f480489f > i17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPEncoderReport", "encode bitrate down ");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPEncoderReport", "encode bitrate up ");
                    }
                }
                dVar.f480489f = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderReport", "encode bitrate refresh ,current is " + dVar.f480489f + ' ');
            }
            rq4.d dVar2 = qq4.c.f447524e;
            if (dVar2 != null) {
                long j17 = gq4.v.wi().f447519t;
                long[] jArr = dVar2.f480491h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jArr, "<this>");
                if (jArr.length == 0) {
                    throw new java.util.NoSuchElementException("Array is empty.");
                }
                if (j17 > jArr[0]) {
                    jArr[0] = j17;
                }
                if (jArr.length == 0) {
                    throw new java.util.NoSuchElementException("Array is empty.");
                }
                long j18 = jArr[jArr.length - 1];
                if (j17 != 0 && (j17 < j18 || j18 == 0)) {
                    jArr[1] = j17;
                }
                long j19 = dVar2.f480493j + j17;
                dVar2.f480493j = j19;
                dVar2.f480493j = j19 / 2;
                if (java.lang.Math.abs(dVar2.f480492i - j17) > 50) {
                    if (dVar2.f480492i > j17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPEncoderReport", "encode frameRate down ");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPEncoderReport", "encode frameRate up ");
                    }
                }
                dVar2.f480492i = j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPEncoderReport", "encode frameRate refresh ,current is " + dVar2.f480492i + ' ');
            }
        }
    }

    public abstract void E0(int i17);

    public void F(int i17, java.lang.String str, final int i18, java.lang.String str2) {
        java.lang.String string;
        java.lang.String str3;
        java.lang.String str4;
        vq4.z zVar = this.f257906d;
        if (zVar != null) {
            ((vq4.m0) zVar).d();
        }
        if (i17 == 241 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = r0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcs);
        }
        if (this.f257909g != null) {
            this.f257909g.H5(i17, str);
        }
        rq4.q qVar = rq4.q.f480600a;
        rq4.q.f480603d = rq4.o.f480594h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onError, errCode: %s, roomId: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(gq4.v.Bi().m()));
        if (vq4.n0.h(c0())) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kco, q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B)));
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            string = i17 == 235 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kag) : i17 == 233 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574993ka5) : i17 == 237 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kag) : i17 == 236 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574993ka5) : i17 == 211 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kaf) : (i17 == 1200 || i17 == 1201) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ka_) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kcp);
        }
        E0(4109);
        if (gq4.v.Bi().m() != 0) {
            if (((java.util.HashMap) gq4.v.Bi().f258100j).get(java.lang.Integer.valueOf(gq4.v.Bi().m())) == null) {
                java.lang.String d17 = this.f257919q.d1();
                if (this.f257921s) {
                    int i19 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                    str4 = "voip_content_video";
                } else {
                    int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                    str4 = "voip_content_voice";
                }
                boolean z17 = this.f257920r;
                if (vq4.n0.h(this.f257907e.f520902a)) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kab, q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B)));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.e(d17, str4, z17 ? 1 : 0, 6, string, true, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$7
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        java.util.Map map = gq4.v.Bi().f258100j;
                        java.util.HashMap hashMap = (java.util.HashMap) map;
                        hashMap.put(java.lang.Integer.valueOf(gq4.v.Bi().m()), (java.lang.Long) obj);
                        int i28 = i18;
                        if (i28 == -1) {
                            return null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.v0(i28);
                        return null;
                    }
                });
                gq4.v.Bi().k();
                m0();
            }
        }
        if (gq4.v.Bi().m() == 0) {
            java.lang.String d18 = this.f257919q.d1();
            if (this.f257921s) {
                int i28 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                str3 = "voip_content_video";
            } else {
                int i29 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                str3 = "voip_content_voice";
            }
            boolean z18 = this.f257920r;
            if (vq4.n0.h(this.f257907e.f520902a)) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kab, q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B)));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.e(d18, str3, z18 ? 1 : 0, 6, string, true, null);
        }
        gq4.v.Bi().k();
        m0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void G(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onSessionBeingCalled, callType: " + i17);
        if (this.f257907e.b(4110)) {
            gq4.v.Bi().a(i17 == 1, i17 == 1);
            D0();
            if (i17 == 1 && vq4.n0.g(this.f257907e.f520902a)) {
                E0(4101);
            }
            E0(4110);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public long H() {
        long j17 = ((vq4.m0) this.f257906d).f520878i;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Voip.NewVoipMgr", "totalDeviceNearTime: %s", java.lang.Long.valueOf(j17));
        return j17 / 1000;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void K(int i17) {
        B0(i17 != 2 ? i17 != 3 ? i17 != 4 ? new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p), 3) : new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m), 3) : new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o), 3) : new cv.v0(i17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n), 3));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void L(int i17, int i18, int i19, byte[] bArr) {
        dr4.x1 x1Var;
        dr4.n0 n0Var;
        if (this.f257908f != null) {
            if (this.f257909g != null && this.f257929y0 && !gq4.v.Bi().w()) {
                this.f257909g.z(false);
                this.f257908f.getClass();
            }
            this.f257929y0 = gq4.v.Bi().w();
            dr4.p1 p1Var = this.f257908f;
            if (p1Var == null || (x1Var = p1Var.f324241g) == null || bArr == null || (n0Var = x1Var.f324297d) == null) {
                return;
            }
            n0Var.d(new dr4.h0(n0Var, i17, i18, bArr));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void M() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onNoResp");
        E0(4105);
        java.lang.String d17 = this.f257919q.d1();
        if (this.f257921s) {
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_video";
        } else {
            int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_voice";
        }
        boolean z17 = this.f257920r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.c(d17, str, z17 ? 1 : 0, 4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.kah : com.p314xaae8f345.mm.R.C30867xcad56011.kad));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11518, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 6, java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40071x6a054172(r0())));
        m0();
        int i19 = this.f257922t;
        long j17 = this.f257923u;
        long j18 = this.f257924v;
        boolean a17 = nq4.f.f420547a.a();
        boolean z18 = this.f257920r;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
        c7006x6281fdcd.f143206d = i19;
        c7006x6281fdcd.f143207e = j17;
        c7006x6281fdcd.f143208f = (int) j18;
        c7006x6281fdcd.f143209g = a17 ? 1 : 0;
        c7006x6281fdcd.f143211i = z18 ? 4 : 3;
        c7006x6281fdcd.o();
        c7006x6281fdcd.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void N(int i17) {
        dr4.n0 n0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "setSharpenFilter, isON: " + i17 + "，mVoipUI: " + this.f257909g);
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            p1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "setSharpenFilter, mIsStarted:%b, isON:%d", java.lang.Boolean.TRUE, java.lang.Integer.valueOf(i17));
            dr4.x1 x1Var = p1Var.f324241g;
            if (x1Var == null || (n0Var = x1Var.f324297d) == null) {
                return;
            }
            n0Var.d(new dr4.l0(n0Var, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void O(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "remote voip mode changed, cmd:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 1 || i17 == 3 || i17 == 5 || i17 == 6 || i17 == 7) {
            if (this.f257921s) {
                E0(4101);
                gq4.v.Bi().f258091a.f257944a.t();
                gq4.v.Bi().f258091a.f257944a.s();
                return;
            }
            return;
        }
        if (i17 == 101) {
            E0(4113);
        } else {
            if (i17 != 102) {
                return;
            }
            E0(4112);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void P() {
        dr4.x1 x1Var;
        dr4.c0 c0Var;
        dr4.p1 p1Var = this.f257908f;
        if (p1Var == null || (x1Var = p1Var.f324241g) == null || (c0Var = x1Var.f324295b) == null) {
            return;
        }
        c0Var.b(new dr4.v1(x1Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void Q(int i17, int i18) {
        dr4.x1 x1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "adjustHWViewAspectRatio, HWDecsize:%dx%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        dr4.p1 p1Var = this.f257908f;
        if (p1Var == null || i17 == 0 || i18 == 0) {
            return;
        }
        if (p1Var.f324242h) {
            if (!p1Var.f324248n || (x1Var = p1Var.f324241g) == null) {
                return;
            }
            android.util.Size size = new android.util.Size(i18, i17);
            dr4.n0 n0Var = x1Var.f324297d;
            if (n0Var != null) {
                n0Var.l(size);
                return;
            }
            return;
        }
        dr4.x1 x1Var2 = p1Var.f324241g;
        if (x1Var2 != null) {
            p1Var.f324242h = true;
            android.util.Size size2 = new android.util.Size(i18, i17);
            dr4.n0 n0Var2 = x1Var2.f324297d;
            if (n0Var2 != null) {
                n0Var2.l(size2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void R() {
        if (this.D || this.f257909g == null || this.f257909g.J4() == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.d0$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                d0Var.getClass();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
                try {
                    j0Var = db5.e1.y(d0Var.f257909g.J4(), d0Var.f257909g.J4().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575005kc5), null, d0Var.f257909g.J4().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.d0$$i
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.t0(4103);
                            gq4.v.Bi().k();
                            dialogInterface.dismiss();
                        }
                    });
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Voip.NewVoipMgr", e17, "failed to show alert", new java.lang.Object[0]);
                }
                if (j0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.NewVoipMgr", "new dialog failed");
                    return;
                }
                j0Var.setCancelable(false);
                j0Var.setCanceledOnTouchOutside(false);
                j0Var.show();
                d0Var.D = true;
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void S() {
        cv.v0 v0Var;
        cv.v0 v0Var2;
        boolean z17 = this.K;
        boolean z18 = this.f257921s;
        vq4.m0 m0Var = (vq4.m0) this.f257906d;
        m0Var.getClass();
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.h0.f340630c, m0Var.f520883n);
        m0Var.f520884o = m96;
        if (m96 != null && ((g25.e) m96).f349513c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "requestAudioFocus: gain focus");
            m0Var.k(false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIP.VoIPAudioManager", "requestAudioFocus: not gain focus");
            m0Var.k(true);
        }
        if (mx3.f0.i()) {
            i95.m c17 = i95.n0.c(cv.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            cv.w0.f9((cv.w0) c17, 3, null, 2, null);
        }
        m0Var.f520893x = z18;
        boolean h17 = mx3.f0.h();
        xm1.o oVar = m0Var.f520890u;
        if (h17 && (v0Var2 = m0Var.f520888s) != null) {
            oVar.c(v0Var2.f304049a, true);
            return;
        }
        if (!mx3.f0.h() && (v0Var = m0Var.f520889t) != null) {
            oVar.c(v0Var.f304049a, true);
            return;
        }
        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
            oVar.c(4, false);
            return;
        }
        if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
            oVar.c(3, false);
            return;
        }
        if (z17 && !m0Var.f520885p) {
            oVar.c(2, false);
            return;
        }
        if (z18) {
            oVar.c(1, false);
        } else if (mx3.f0.h()) {
            cv.v0 v0Var3 = m0Var.f520888s;
            oVar.c(v0Var3 != null ? v0Var3.f304049a : 2, false);
        } else {
            cv.v0 v0Var4 = m0Var.f520889t;
            oVar.c(v0Var4 != null ? v0Var4.f304049a : 2, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void T() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "on accept");
        D0();
        E0(4100);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean U() {
        int i17 = this.f257922t;
        long j17 = this.f257923u;
        long j18 = this.f257924v;
        boolean a17 = nq4.f.f420547a.a();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
        c7006x6281fdcd.f143206d = i17;
        c7006x6281fdcd.f143207e = j17;
        c7006x6281fdcd.f143208f = (int) j18;
        c7006x6281fdcd.f143209g = a17 ? 1 : 0;
        c7006x6281fdcd.f143210h = 0;
        c7006x6281fdcd.f143211i = 2;
        c7006x6281fdcd.o();
        c7006x6281fdcd.k();
        return y0(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void V() {
        o0(13);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void X(boolean z17, boolean z18, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!this.H || android.os.Build.VERSION.SDK_INT < 29 || com.p314xaae8f345.mm.app.w.INSTANCE.f135422n) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "start channel ring, now:" + currentTimeMillis);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void Z() {
        java.lang.String string;
        java.lang.String str;
        if (vq4.n0.h(this.f257907e.f520902a)) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kab, q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B)));
        } else {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(this.f257920r ? com.p314xaae8f345.mm.R.C30867xcad56011.f574991ka3 : com.p314xaae8f345.mm.R.C30867xcad56011.kad);
        }
        java.lang.String str2 = string;
        java.lang.String d17 = this.f257919q.d1();
        if (this.f257921s) {
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_video";
        } else {
            int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_voice";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.e(d17, str, this.f257920r ? 1 : 0, 6, str2, false, new yz5.l() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$6
            @Override // yz5.l
            /* renamed from: invoke */
            public java.lang.Object mo146xb9724478(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.v0(4);
                return null;
            }
        });
        if (this.f257920r && !vq4.n0.h(this.f257907e.f520902a)) {
            gq4.v.Bi().c();
        }
        gq4.v.Bi().s(7);
        m0();
        this.R = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void a0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11522, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), java.lang.Integer.valueOf(!this.f257920r ? 1 : 0), 1);
        vq4.d0.j(gq4.v.Bi().m(), gq4.v.Bi().n(), !this.f257920r ? 1 : 0, 3);
        ((o95.k) ((ve0.e) i95.n0.c(ve0.e.class))).getClass();
        o95.k.f425283n = 0;
        int[] iArr = o95.k.f425279g;
        iArr[0] = 0;
        iArr[1] = 0;
        o95.k.f425284o = 0;
        o95.k.f425282m.mo50293x3498a0(new o95.j());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onResumeGoodNetStatus");
        if (this.f257909g != null) {
            this.f257909g.W2();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void b0(int i17, int i18, int i19, java.nio.ByteBuffer byteBuffer) {
        dr4.x1 x1Var;
        dr4.n0 n0Var;
        if (this.f257908f != null) {
            if (this.f257909g != null && !gq4.v.Bi().w()) {
                this.f257909g.z(false);
            }
            dr4.p1 p1Var = this.f257908f;
            if (p1Var == null || (x1Var = p1Var.f324241g) == null || byteBuffer == null || (n0Var = x1Var.f324297d) == null) {
                return;
            }
            n0Var.d(new dr4.i0(n0Var, i17, i18, byteBuffer));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar) {
        this.F++;
        if (this.f257909g != null) {
            this.f257909g = null;
            ((vq4.m0) this.f257906d).i(this.f257909g);
        }
        x0(fVar, 2);
        int i17 = this.f257907e.f520902a;
        if (261 != i17) {
        }
        cv.v0 v0Var = this.A;
        if (v0Var != null) {
            int i18 = v0Var.f304049a;
        }
        if (256 == i17 && 257 == i17) {
            D0();
        }
    }

    @Override // gq4.a
    public int c0() {
        vq4.o0 o0Var = this.f257907e;
        if (o0Var == null) {
            return -1;
        }
        return o0Var.f520902a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void d() {
        boolean z17 = this.f257920r;
        vq4.z zVar = this.f257906d;
        if (!z17 || !vq4.n0.f(c0()) || !gq4.v.Bi().x()) {
            if (vq4.n0.e(c0()) && gq4.v.Bi().x()) {
                this.W = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p957x53236a1b.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class))).wi()).contains(6);
                boolean Ui = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui();
                if (!this.W && this.X && Ui) {
                    return;
                }
                ((vq4.m0) zVar).e(this.f257916p, this.f257921s, this.f257920r);
                return;
            }
            return;
        }
        ((vq4.m0) zVar).e(this.f257916p, this.f257921s, this.f257920r);
        if (this.f257920r) {
            vq4.m0 m0Var = (vq4.m0) zVar;
            m0Var.getClass();
            if ((((java.util.ArrayList) ((com.p314xaae8f345.mm.p957x53236a1b.t) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b6.class))).wi()).contains(6) || !m0Var.f520886q) && !m0Var.f520892w) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIP.VoIPAudioManager", "car online not allow to start bt");
                return;
            }
            char c17 = (m0Var.f520893x || !m0Var.f520892w) ? (char) 1 : (char) 2;
            xm1.o oVar = m0Var.f520890u;
            oVar.getClass();
            gl.i iVar = (gl.i) ((cv.w0) i95.n0.c(cv.w0.class));
            oVar.c((iVar.Ui() ? new cv.v0(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6m), 0, 4, null) : iVar.aj() ? new cv.v0(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6o), 0, 4, null) : c17 == 1 ? new cv.v0(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6p), 0, 4, null) : new cv.v0(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a6n), 0, 4, null)).f304049a, false);
        }
    }

    @Override // gq4.a
    public dr4.p1 d0() {
        return this.f257908f;
    }

    @Override // xq4.d
    public void e(int i17) {
    }

    @Override // gq4.a
    public void e0(boolean z17, boolean z18) {
        int c17 = vq4.n0.c(z17, z18);
        if (this.f257925w) {
            if (c17 == 0) {
                c17 = 1;
            } else if (256 == c17) {
                c17 = 257;
            }
        }
        if (z17) {
            this.f257907e = vq4.n0.b(c17);
        } else {
            this.f257907e = vq4.n0.a(c17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "steve:[simucall] resetStateMachine, initState:%d,isOutCall:%s,isVideoCall:%s", java.lang.Integer.valueOf(c17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        this.f257920r = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = this.I;
        if (kVar != null) {
            kVar.M4(false);
            this.I = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        Bi.f258106p = false;
        Bi.f258107q = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // gq4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f0(final android.content.Context r17, java.lang.String r18, boolean r19, boolean r20, long r21) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.f0(android.content.Context, java.lang.String, boolean, boolean, long):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void g(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a) {
    }

    public final boolean g0() {
        if (!this.f257907e.b(4100)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onAcceptVoiceInvite");
        D0();
        gq4.v.Bi().a(true, this.f257921s);
        E0(4111);
        E0(4100);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void h(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a view, int i17) {
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            p1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            view.setSurfaceTextureListener(new dr4.t0(new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), p1Var, i17));
        }
    }

    public final boolean h0() {
        if (!vq4.n0.h(this.f257907e.f520902a)) {
            return false;
        }
        android.content.SharedPreferences sharedPreferences = r0().getSharedPreferences("voip_plugin_prefs", 0);
        if (sharedPreferences.getBoolean("voip_shortcut_has_added", false)) {
            return false;
        }
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VOIPShortcutAutoadd");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "voip shortcut autoAdd is %s", d17);
        if (d17 == null || !d17.equals("0") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B) <= 30) {
            if (d17 == null || !d17.equals("1") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B) <= 15) {
                return false;
            }
            n0(sharedPreferences);
            return false;
        }
        int i17 = sharedPreferences.getInt("voip_shortcut_prompt_times", 0);
        boolean z17 = sharedPreferences.getBoolean("voip_shortcut_never_show_anymore", false);
        if (i17 >= 3 || z17) {
            return false;
        }
        android.content.Context r07 = r0();
        android.view.View inflate = android.view.View.inflate(r07, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxs, null);
        final android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.jld);
        checkBox.setChecked(false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jlf);
        if (1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VOIPCallType"), 0)) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k_v);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.k_w);
        }
        db5.e1.I(r07, false, r07.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), inflate, r07.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu), r07.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$10
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.n0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.r0().getSharedPreferences("voip_plugin_prefs", 0));
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                int i19 = d0Var.f257926x;
                if (4096 != i19) {
                    d0Var.E0(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.f257926x = 4096;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$10.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.p0();
                    }
                });
            }
        }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$11
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                if (checkBox != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.r0().getSharedPreferences("voip_plugin_prefs", 0).edit().putBoolean("voip_shortcut_never_show_anymore", checkBox.isChecked()).commit();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                int i19 = d0Var.f257926x;
                if (4096 != i19) {
                    d0Var.E0(i19);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.f257926x = 4096;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$11.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this.p0();
                    }
                });
            }
        });
        sharedPreferences.edit().putInt("voip_shortcut_prompt_times", i17 + 1).commit();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean i() {
        vq4.o0 o0Var = this.f257907e;
        if (o0Var == null || !o0Var.b(4100)) {
            return false;
        }
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            p1Var.getClass();
            pq4.c l17 = gq4.v.Bi().l("CAMERA");
            if (l17 != null) {
                l17.b(new dr4.i1(p1Var));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onAcceptVideoInvite");
        D0();
        gq4.v.Bi().a(false, this.f257921s);
        E0(4100);
        return true;
    }

    public void i0(int i17) {
        boolean z17 = this.f257921s;
        boolean z18 = !gq4.v.wi().f447509j;
        vq4.m0 m0Var = (vq4.m0) this.f257906d;
        boolean z19 = !m0Var.f520894y;
        boolean b17 = m0Var.b();
        ar4.c cVar = ar4.c.f94934a;
        boolean z27 = ar4.c.f94935b != null;
        boolean z28 = 1 != this.E;
        gq4.v.wi().getClass();
        sq4.a aVar = new sq4.a(z17, z19, b17, z18, z27, false, z28);
        int i18 = this.f257922t;
        long j17 = this.f257923u;
        long j18 = this.f257924v;
        boolean z29 = this.f257920r;
        long j19 = i17;
        m0Var.f520890u.getClass();
        java.lang.String c17 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().c();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 c7011xe05dc99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99();
        c7011xe05dc99.f143237d = i18;
        c7011xe05dc99.f143238e = j17;
        c7011xe05dc99.f143239f = j18 == 0 ? 1L : 2L;
        c7011xe05dc99.f143240g = z29 ? 1L : 2L;
        c7011xe05dc99.p(aVar.m165056x9616526c());
        c7011xe05dc99.f143243j = j19;
        c7011xe05dc99.f143242i = java.lang.System.currentTimeMillis();
        c7011xe05dc99.q(c17);
        c7011xe05dc99.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public void j(boolean z17, boolean z18) {
    }

    public final boolean j0(boolean z17) {
        if (!this.f257907e.b(4098)) {
            return false;
        }
        t0(4098);
        gq4.v.Bi().k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", z17 ? "onCancelVideoInvite" : "onCancelVoiceInvite");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onNetWorkCostMax");
        if (this.f257909g != null) {
            this.f257909g.k();
        }
    }

    public boolean k0(boolean z17) {
        if (gq4.v.Bi().f258106p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "current state is mini, cannot mini!");
            return false;
        }
        if (!this.f257905J || z17) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "has phone call  cannot mini!");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean l() {
        int i17 = this.f257922t;
        long j17 = this.f257923u;
        long j18 = this.f257924v;
        boolean a17 = nq4.f.f420547a.a();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
        c7006x6281fdcd.f143206d = i17;
        c7006x6281fdcd.f143207e = j17;
        c7006x6281fdcd.f143208f = (int) j18;
        c7006x6281fdcd.f143209g = a17 ? 1 : 0;
        c7006x6281fdcd.f143210h = 0;
        c7006x6281fdcd.f143211i = 0;
        c7006x6281fdcd.o();
        c7006x6281fdcd.k();
        return g0();
    }

    public final void l0() {
        synchronized (this.f257915o) {
            rq4.q qVar = rq4.q.f480600a;
            long j17 = this.B;
            qVar.b(j17 == -1 ? 0L : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(j17), this.f257921s ? 1L : 0L);
            rq4.u.f480642a.a();
            dr4.p1 p1Var = this.f257908f;
            if (p1Var != null) {
                p1Var.n();
            }
            gq4.v.wi().d();
            vq4.m0 m0Var = (vq4.m0) this.f257906d;
            m0Var.n();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = m0Var.f520870a;
            if (n3Var != null) {
                n3Var.m77787xbe88f509();
            }
            m0Var.f520870a = null;
            vq4.m0 m0Var2 = (vq4.m0) this.f257906d;
            boolean z17 = m0Var2.f520879j;
            xm1.o oVar = m0Var2.f520890u;
            if (z17) {
                oVar.getClass();
                gl.a aVar = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).f354289g;
                if (aVar != null) {
                    aVar.b();
                }
            } else if (m0Var2.b()) {
                oVar.getClass();
                gl.a aVar2 = ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).f354289g;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }
            oVar.b();
            f25.m0 m0Var3 = m0Var2.f520884o;
            if (m0Var3 != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var3);
            }
            m0Var2.f520884o = null;
            m0Var2.j();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onBadNetStatus");
        if (this.f257909g != null) {
            this.f257909g.Q2(z17);
        }
        if (!vq4.n0.g(this.f257907e.f520902a) && !((vq4.m0) this.f257906d).b()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f257912l1 > 30000) {
                this.f257912l1 = currentTimeMillis;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "bad_net");
                ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.VOIP, bundle);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report the bad net toast room key is ");
        sb6.append(gq4.v.Bi().n());
        sb6.append("and in the side");
        sb6.append(z17 ? 1 : 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(gq4.v.Bi().n());
        objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
        g0Var.r(17151, true, true, objArr);
    }

    public void m0() {
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 d0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.this;
                d0Var.L = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "it is uninit voip report");
                if (!d0Var.T) {
                    o95.k kVar = (o95.k) ((ve0.e) i95.n0.c(ve0.e.class));
                    kVar.getClass();
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = o95.k.f425282m;
                    n3Var.mo50302x6b17ad39(null);
                    n3Var.mo50299x35224f();
                    if (o95.k.f425284o == 0) {
                        kVar.wi(o95.k.f425280h);
                    }
                    if ((o95.k.f425284o != 0) != false) {
                        d0Var.T = true;
                        ((o95.k) ((ve0.e) i95.n0.c(ve0.e.class))).getClass();
                        int i17 = fp.h.a(31) ? o95.k.f425280h : o95.k.f425281i;
                        ((o95.k) ((ve0.e) i95.n0.c(ve0.e.class))).getClass();
                        int i18 = o95.k.f425283n / o95.k.f425284o;
                        int i19 = !d0Var.f257920r ? 1 : 0;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "before convert, beforeNetType:%s, afterNetType:%s", java.lang.Integer.valueOf(i17), 0);
                        int i27 = i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? i17 != 6 ? i17 : 6 : 3 : 5 : 2 : 4;
                        if (i17 == 2) {
                            i17 = 4;
                        } else if (i17 == 3) {
                            i17 = 2;
                        } else if (i17 == 4) {
                            i17 = 5;
                        } else if (i17 == 5) {
                            i17 = 3;
                        } else if (i17 == 6) {
                            i17 = 6;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "after convert, beforeNetType:%s, afterNetType:%s", java.lang.Integer.valueOf(i27), 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(16519, true, true, java.lang.Long.valueOf(gq4.v.Bi().o()), java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17), 0, 0, java.lang.Integer.valueOf(i18));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHelper", "reportVoipNetChangeCost is memberIdx =" + i19 + "|switchNetworkTimestamp " + currentTimeMillis + "|beforeNetType " + i27 + "|afterNetType" + i17 + "|beforeNetStrength0|afterNetStrength0|avgNetStrength" + i18);
                    }
                }
                d0Var.p0();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean n() {
        return j0(true);
    }

    public final void n0(android.content.SharedPreferences sharedPreferences) {
        android.content.Intent intent = new android.content.Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra("duplicate", false);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.action.BIZSHORTCUT");
        intent2.addFlags(67108864);
        if (1 == com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VOIPCallType"), 0)) {
            intent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip");
            intent.putExtra("android.intent.extra.shortcut.NAME", r0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571958um));
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(r0(), com.p314xaae8f345.mm.R.C30861xcebc809e.bfo));
            intent.putExtra("shortcut_icon_resource_id", com.p314xaae8f345.mm.R.C30861xcebc809e.bfo);
        } else {
            intent2.putExtra("LauncherUI.Shortcut.LaunchType", "launch_type_voip_audio");
            intent.putExtra("android.intent.extra.shortcut.NAME", r0().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571960uo));
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", android.content.Intent.ShortcutIconResource.fromContext(r0(), com.p314xaae8f345.mm.R.C30861xcebc809e.bfp));
            intent.putExtra("shortcut_icon_resource_id", com.p314xaae8f345.mm.R.C30861xcebc809e.bfp);
        }
        intent.putExtra("android.intent.extra.shortcut.INTENT", intent2);
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        android.content.Context r07 = r0();
        ((zd0.e) hVar).getClass();
        xp1.c.a(r07, intent, null, null, false);
        sharedPreferences.edit().putBoolean("voip_shortcut_has_added", true).commit();
    }

    public void o0(int i17) {
        if (this.f257930z) {
            int i18 = gq4.v.wi().f447517r == 0 ? 2 : 4;
            long j17 = this.f257922t;
            long j18 = this.f257923u;
            long j19 = this.f257924v;
            boolean z17 = this.f257920r;
            long j27 = i18;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 c7011xe05dc99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99();
            c7011xe05dc99.f143237d = j17;
            c7011xe05dc99.f143238e = j18;
            c7011xe05dc99.f143239f = j19 == 0 ? 1L : 2L;
            c7011xe05dc99.p(java.lang.String.valueOf(i17));
            c7011xe05dc99.f143240g = z17 ? 1L : 2L;
            c7011xe05dc99.f143243j = j27;
            c7011xe05dc99.f143242i = java.lang.System.currentTimeMillis();
            c7011xe05dc99.q("");
            c7011xe05dc99.k();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1
    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onNetWorkChangeMobileNet");
        if (this.f257909g != null) {
            this.f257909g.v1();
        }
        rq4.q qVar = rq4.q.f480600a;
        rq4.q.f480602c = java.lang.Long.valueOf(gq4.v.Bi().f258112v != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(gq4.v.Bi().f258112v) : 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04b1  */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.tencent.mm.plugin.voip.model.NewVoipMgr$CleanRunnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p0() {
        /*
            Method dump skipped, instructions count: 1219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.p0():void");
    }

    public final java.lang.String q0(long j17) {
        return java.lang.String.format("%02d:%02d", java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean r() {
        int i17 = this.f257922t;
        long j17 = this.f257923u;
        long j18 = this.f257924v;
        boolean a17 = nq4.f.f420547a.a();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
        c7006x6281fdcd.f143206d = i17;
        c7006x6281fdcd.f143207e = j17;
        c7006x6281fdcd.f143208f = (int) j18;
        c7006x6281fdcd.f143209g = a17 ? 1 : 0;
        c7006x6281fdcd.f143210h = 0;
        c7006x6281fdcd.f143211i = 2;
        c7006x6281fdcd.o();
        c7006x6281fdcd.k();
        return y0(true);
    }

    public android.content.Context r0() {
        android.content.Context J4 = this.f257909g != null ? this.f257909g.J4() : null;
        return J4 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : J4;
    }

    public boolean s0() {
        if (!this.f257907e.b(4103)) {
            return false;
        }
        int i17 = this.f257922t;
        long j17 = this.f257923u;
        long j18 = this.f257924v;
        boolean a17 = nq4.f.f420547a.a();
        boolean z17 = this.f257920r;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd c7006x6281fdcd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7006x6281fdcd();
        c7006x6281fdcd.f143206d = i17;
        c7006x6281fdcd.f143207e = j17;
        c7006x6281fdcd.f143208f = (int) j18;
        c7006x6281fdcd.f143209g = a17 ? 1 : 0;
        c7006x6281fdcd.f143210h = 0;
        c7006x6281fdcd.f143211i = z17 ? 6 : 1;
        c7006x6281fdcd.o();
        c7006x6281fdcd.k();
        t0(4103);
        gq4.v.Bi().k();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean t() {
        return j0(false);
    }

    public final void t0(int i17) {
        java.lang.String str;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "hangupTalkingOrCancelInvite");
        if (true == h0()) {
            this.f257926x = i17;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String string = vq4.n0.h(this.f257907e.f520902a) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kaa, q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B))) : this.f257920r ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574991ka3) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574990ka2);
        java.lang.String d17 = this.f257919q.d1();
        if (this.f257921s) {
            int i19 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_video";
        } else {
            int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_voice";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.c(d17, str, this.f257920r ? 1 : 0, 6, string);
        if (!this.f257920r || vq4.n0.h(this.f257907e.f520902a)) {
            this.f257913m = true;
            this.f257914n = true;
            gq4.v.Bi().r();
            if (4096 == this.f257926x) {
                E0(i17);
                m0();
                return;
            }
            return;
        }
        D0();
        if (this.f257920r && !vq4.n0.h(this.f257907e.f520902a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "hangupVoipButton OnClick call cancelCall");
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
            Bi.getClass();
            rq4.q qVar = rq4.q.f480600a;
            rq4.q.f480603d = rq4.o.f480591e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = Bi.f258091a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelCall, roomId:");
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.g1 g1Var = d3Var.f257944a;
            sb6.append(g1Var.f258065x.f258410q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipServiceEx", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = g1Var.f258065x;
            if (c18912x54425f62.f258410q == 0 && c18912x54425f62.f258419t == 0) {
                d3Var.n();
            } else {
                int i28 = g1Var.f258041a;
                if (i28 == 1) {
                    i18 = 0;
                } else {
                    i18 = 2;
                    if (i28 == 2 || i28 == 3) {
                        i18 = 1;
                    } else if (i28 != 4) {
                        i18 = 3;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l1 l1Var = c18912x54425f62.M1;
                l1Var.f258246a = i18;
                l1Var.f258259m = 3;
                if (i28 < 6) {
                    l1Var.f258261o = 1;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(11521, true, true, java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), java.lang.Long.valueOf(gq4.v.Bi().o()), 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                d3Var.b(1);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "hangupVoipButton OnClick call hangUp");
        gq4.v.Bi().r();
        if (4096 == this.f257926x) {
            E0(i17);
            m0();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void u() {
        if (this.f257909g != null) {
            this.f257909g.u();
        }
    }

    public boolean u0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "isMinimized mUIType: " + this.E);
        if (2 != this.E) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "already is widget");
        return true;
    }

    public void v0(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onShowRecallTip() called with: reason = [" + i17 + "]");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.d()) {
            this.R = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.b(this.f257919q.d1(), i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "" : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n2t) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ka7) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ka6) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ka8), this.f257921s, 0L, i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean w() {
        return s0();
    }

    public boolean w0(yz5.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onSwitchCamera");
        if (this.f257908f != null) {
            gq4.v.wi().getClass();
            o0(9);
            dr4.p1 p1Var = this.f257908f;
            p1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPRenderMgr", "onSwitchCamera");
            dr4.x1 x1Var = p1Var.f324241g;
            if (x1Var != null) {
                dr4.h1 h1Var = new dr4.h1(p1Var, lVar);
                dr4.c0 c0Var = x1Var.f324295b;
                if (c0Var != null) {
                    c0Var.b(new dr4.b0(c0Var, h1Var));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11079, 1);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g
    public boolean x(boolean z17) {
        if (!k0(z17)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.Voip.NewVoipMgr", "miniOnlyHidenVoip: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onMinimizeVoip, async to minimize");
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = this.I;
        if (kVar != null) {
            kVar.M4(false);
            this.I = null;
        }
        b13.m mVar = (b13.m) this;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "do minimizeVoip");
        int i17 = mVar.f257907e.f520902a;
        if (262 == i17 || 8 == i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVoipMgr", "voip call has finished!，state is %s", java.lang.Integer.valueOf(i17));
        } else {
            if (mVar.f257909g != null) {
                mVar.f257909g.mo72878x1aec5e91(true);
            }
            mVar.o0(14);
            mVar.E = 2;
            mVar.F++;
            mVar.I = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k(mVar, mVar.f257907e.f520902a, mVar.f257919q, mVar.f257921s, mVar.f257920r, z17);
            int i18 = mVar.f257907e.f520902a;
            if ((260 == i18 || 6 == i18) && 1 != gm0.j1.u().c().q(327948, 0)) {
                gm0.j1.u().c().z(327948, 1);
            }
            int i19 = mVar.f257907e.f520902a;
            if (256 == i19 || 257 == i19) {
                mVar.D0();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
            Bi.f258106p = true;
            Bi.f258107q = z17;
        }
        return true;
    }

    public void x0(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f fVar, int i17) {
        android.graphics.SurfaceTexture surfaceTexture;
        dr4.q qVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onVoipUICreated, uiType: %s,  mVoicePlayDevice: %s", java.lang.Integer.valueOf(i17), this.A);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(40);
        gq4.v.Bi().b(this.f257916p, this.f257921s, false, this.f257923u);
        if (1 == i17) {
            if (this.f257909g != null) {
                this.f257909g.M4(false);
            }
            o0(13);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
            long currentTimeMillis = Bi.f258091a.f257944a.f258065x.f258401n > 0 ? java.lang.System.currentTimeMillis() - Bi.f258091a.f257944a.f258065x.f258401n : 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = Bi.f258091a.f257944a.f258065x;
            c18912x54425f62.f258404o += currentTimeMillis;
            c18912x54425f62.f258401n = 0L;
        } else if (2 == i17) {
            gq4.v.Bi().f258091a.f257944a.f258065x.f258401n = java.lang.System.currentTimeMillis();
        }
        if (gq4.v.Bi().f258091a.i()) {
            this.f257930z = true;
        }
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            boolean z17 = 1 == i17;
            if (p1Var.H == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("CameraPreviewInvalidChecker", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new dr4.w0(p1Var), true);
                p1Var.H = b4Var;
                b4Var.c(0L, 1000L);
            }
            gq4.v.wi().f447510k = z17;
            if (z17) {
                for (int i18 = 0; i18 < 2; i18++) {
                    dr4.p0 p0Var = p1Var.f324254t;
                    if (i18 == 0) {
                        dr4.o0 o0Var = p0Var.f324232a;
                        surfaceTexture = o0Var.f324227a;
                        qVar = o0Var.f324228b;
                    } else {
                        dr4.o0 o0Var2 = p0Var.f324233b;
                        surfaceTexture = o0Var2.f324227a;
                        qVar = o0Var2.f324228b;
                    }
                    if (qVar == null) {
                        break;
                    }
                    dr4.x1 x1Var = p1Var.f324241g;
                    if (x1Var != null) {
                        x1Var.a(qVar, i18);
                    }
                    p1Var.k(qVar, i18);
                    if (i18 == 0) {
                        dr4.o0 o0Var3 = p0Var.f324232a;
                        o0Var3.f324227a = surfaceTexture;
                        o0Var3.f324228b = qVar;
                    } else {
                        dr4.o0 o0Var4 = p0Var.f324233b;
                        o0Var4.f324227a = surfaceTexture;
                        o0Var4.f324228b = qVar;
                    }
                    dr4.x1 x1Var2 = p1Var.f324241g;
                    if (x1Var2 != null) {
                        dr4.d2 d2Var = x1Var2.f324296c;
                        if (d2Var != null) {
                            if (i18 == 0) {
                                d2Var.f324214g = qVar;
                            } else {
                                d2Var.f324215h = qVar;
                            }
                        }
                        dr4.n0 n0Var = x1Var2.f324297d;
                        if (n0Var != null) {
                            if (i18 == 0) {
                                n0Var.f324214g = qVar;
                            } else {
                                n0Var.f324215h = qVar;
                            }
                        }
                    }
                    if (x1Var2 != null) {
                        x1Var2.d();
                    }
                }
            }
            p1Var.f324249o.f480549a.a(z17 ? 23 : 24);
        }
        this.f257909g = fVar;
        this.E = i17;
        ((vq4.m0) this.f257906d).i(this.f257909g);
        this.f257909g.z1(-1, this.f257907e.f520902a);
        this.f257909g.o5(this.B);
        if (this.f257909g instanceof android.app.Activity) {
            ((android.view.WindowManager) ((android.app.Activity) this.f257909g).getSystemService("window")).getDefaultDisplay().getRotation();
        }
    }

    public final boolean y0(boolean z17) {
        java.lang.String str;
        if (!z17) {
            vq4.o0 o0Var = this.f257907e;
            if (o0Var == null || !o0Var.b(4099)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onRejectVoiceInvite");
        } else {
            if (!this.f257907e.b(4099)) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onRejectVideoInvite");
        }
        java.lang.String d17 = this.f257919q.d1();
        if (this.f257921s) {
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_video";
        } else {
            int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_voice";
        }
        boolean z18 = this.f257920r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.c(d17, str, z18 ? 1 : 0, 6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kae));
        D0();
        final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        final java.lang.String str2 = Bi.f258091a.f257964u;
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.h2$$e
            @Override // java.lang.Runnable
            public final void run() {
                jq4.c1 c1Var;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2.this;
                h2Var.getClass();
                if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                    ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
                    java.lang.String str3 = ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b;
                    java.lang.String str4 = str2;
                    if (str3.equals(str4) || (c1Var = h2Var.f258114x) == null || str4 == null) {
                        return;
                    }
                    c1Var.z(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str4);
                }
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 300L, false);
        rq4.q qVar = rq4.q.f480600a;
        rq4.q.f480603d = rq4.o.f480597n;
        Bi.f258091a.m();
        E0(4099);
        m0();
        return true;
    }

    public void z0(java.lang.String str, int i17) {
        int i18 = gq4.v.wi().f447517r == 0 ? 2 : 4;
        long j17 = this.f257922t;
        long j18 = this.f257923u;
        long j19 = this.f257924v;
        boolean z17 = this.f257920r;
        long j27 = i18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((vq4.m0) this.f257906d).f520890u.getClass();
        sb6.append(((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Bi().c());
        sb6.append("#");
        sb6.append(str);
        java.lang.String audioDeviceType = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioDeviceType, "audioDeviceType");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99 c7011xe05dc99 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7011xe05dc99();
        c7011xe05dc99.f143237d = j17;
        c7011xe05dc99.f143238e = j18;
        c7011xe05dc99.f143239f = j19 == 0 ? 1L : 2L;
        c7011xe05dc99.p(java.lang.String.valueOf(i17));
        c7011xe05dc99.f143240g = z17 ? 1L : 2L;
        c7011xe05dc99.f143243j = j27;
        c7011xe05dc99.f143242i = java.lang.System.currentTimeMillis();
        c7011xe05dc99.q(audioDeviceType);
        c7011xe05dc99.k();
    }
}
