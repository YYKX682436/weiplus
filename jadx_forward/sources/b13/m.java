package b13;

/* loaded from: classes14.dex */
public final class m extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0 {
    public static final /* synthetic */ int L1 = 0;
    public long A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public d13.c F1;
    public d13.c G1;
    public android.app.Activity H1;
    public boolean I1;
    public final pv.g0 J1;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d K1;

    /* renamed from: y1, reason: collision with root package name */
    public final java.lang.String f98649y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f98650z1;

    public m(java.lang.String engineId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engineId, "engineId");
        this.f98649y1 = engineId;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
        this.J1 = new ep1.k();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.K1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771>(a0Var) { // from class: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$hardCoderSystemEventListener$1
            {
                this.f39173x3fe91575 = -637576831;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771 c5637xe5a09771) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5637xe5a09771 event = c5637xe5a09771;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.hh hhVar = event.f135965g;
                if (hhVar == null) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "summerhardcoder system event [%s]", java.lang.Integer.valueOf(hhVar.f88367a));
                if (hhVar.f88367a != 1) {
                    return false;
                }
                int i17 = b13.m.L1;
                b13.m.this.I0();
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0
    public void E0(int i17) {
        cv.v0 v0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.Voip.NewVoipMgr", "swtchState, action: %s, currentState: %s", vq4.n0.d(i17), vq4.n0.d(this.f257907e.f520902a));
        boolean z17 = false;
        if (!vq4.n0.g(this.f257907e.f520902a)) {
            if (4111 == i17 || (4101 == i17 && (vq4.n0.h(this.f257907e.f520902a) || this.f257920r))) {
                this.f257906d.getClass();
                int i18 = this.E;
                if (i18 == 0 || ((v0Var = this.A) != null && 1 == i18 && 1 == v0Var.f304049a)) {
                    vq4.m0 m0Var = (vq4.m0) this.f257906d;
                    m0Var.getClass();
                    if (mx3.f0.h()) {
                        cv.v0 v0Var2 = m0Var.f520887r;
                        if (v0Var2 != null && v0Var2.f304049a == 1) {
                            z17 = true;
                        }
                        if (z17 && m0Var.f520888s == null) {
                            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                                m0Var.l(4, true);
                            } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                                m0Var.l(3, true);
                            } else {
                                m0Var.l(2, true);
                            }
                        }
                    } else {
                        cv.v0 v0Var3 = m0Var.f520889t;
                        if (v0Var3 != null && v0Var3.f304049a == 1) {
                            z17 = true;
                        }
                        if (z17) {
                            m0Var.l(2, true);
                        }
                    }
                    this.K = true;
                    cv.v0 v0Var4 = this.A;
                    if (v0Var4 != null && v0Var4.f304049a == 2) {
                        A0();
                    }
                    if (!gq4.v.Bi().x()) {
                        ((vq4.m0) this.f257906d).j();
                    }
                }
            }
        } else if (i17 != 4100) {
            if (i17 == 4101) {
                dr4.p1 p1Var = this.f257908f;
                if (p1Var != null) {
                    p1Var.n();
                }
                this.f257921s = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.k kVar = this.I;
                if (kVar != null) {
                    kVar.f258696n = false;
                }
                jq4.c1 c1Var = gq4.v.Bi().f258114x;
                if (c1Var != null) {
                    c1Var.f382758z = false;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = c1Var.B;
                    if (c18930xb402610a != null) {
                        c18930xb402610a.setVisibility(8);
                    }
                    android.view.View view = c1Var.f382769e;
                    if (view != null) {
                        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kg6);
                        int f17 = c1Var.f();
                        textView.setText(f17);
                        if (c1Var.f382773i == null) {
                            c1Var.f382773i = new jq4.c0();
                        }
                        jq4.c0 c0Var = c1Var.f382773i;
                        if (c0Var != null) {
                            c0Var.b();
                        }
                        jq4.c0 c0Var2 = c1Var.f382773i;
                        if (c0Var2 != null) {
                            java.lang.String string = view.getResources().getString(f17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            c0Var2.a(textView, string, 500);
                        }
                        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.kfp);
                        findViewById.setBackground(findViewById.getResources().getDrawable(c1Var.d()));
                    }
                }
            } else if (i17 == 4112) {
                z(true);
                gq4.v.Bi().f258091a.f257944a.X = true;
            } else if (i17 == 4113) {
                z(false);
                gq4.v.Bi().f258091a.f257944a.X = false;
            }
        } else if (!gq4.v.Bi().x()) {
            ((vq4.m0) this.f257906d).j();
        }
        vq4.o0 o0Var = this.f257907e;
        if (o0Var.b(i17)) {
            int intValue = ((java.lang.Integer) ((java.util.Map) ((java.util.HashMap) o0Var.f520903b).get(java.lang.Integer.valueOf(o0Var.f520902a))).get(java.lang.Integer.valueOf(i17))).intValue();
            vq4.n0.d(o0Var.f520902a);
            vq4.n0.d(intValue);
            vq4.n0.d(i17);
            o0Var.f520902a = intValue;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.VoipStateMachine", "can't tranform due to no such rule");
        }
        if (this.f257909g != null) {
            this.f257909g.z1(i17, this.f257907e.f520902a);
        }
        int i19 = this.f257907e.f520902a;
        if (i19 == 4 || i19 == 5) {
            if (this.f257920r) {
                nq4.f.f420547a.c();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6228x1d6c1844 c6228x1d6c1844 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6228x1d6c1844();
                c6228x1d6c1844.f136475g.f89694d = 2;
                c6228x1d6c1844.e();
            }
        } else if ((i19 == 258 || i19 == 259) && !this.f257920r) {
            nq4.f.f420547a.c();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6228x1d6c1844 c6228x1d6c18442 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6228x1d6c1844();
            c6228x1d6c18442.f136475g.f89694d = 2;
            c6228x1d6c18442.e();
        }
        if (this.f257909g instanceof d13.e) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new b13.l(i17, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0, com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void F(int i17, java.lang.String str, int i18, java.lang.String str2) {
        z03.f fVar;
        c13.b0 b0Var = c13.b0.f119393d;
        z03.f.f550752d.getClass();
        if (i17 == -9000) {
            fVar = z03.f.f550760o;
        } else if (i17 == 211) {
            fVar = z03.f.f550757i;
        } else if (i17 == 233) {
            fVar = z03.f.f550758m;
        } else if (i17 != 241) {
            if (i17 != 248) {
                if (i17 == 1200) {
                    fVar = z03.f.f550761p;
                } else if (i17 != 244 && i17 != 245) {
                    switch (i17) {
                        case 235:
                            fVar = z03.f.f550754f;
                            break;
                        case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de /* 236 */:
                            fVar = z03.f.f550756h;
                            break;
                        case 237:
                            fVar = z03.f.f550755g;
                            break;
                        default:
                            fVar = z03.f.f550753e;
                            break;
                    }
                }
            }
            fVar = z03.f.f550762q;
        } else {
            fVar = z03.f.f550759n;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new c13.j(c24132x9b57f23e, fVar, str2));
        }
        super.F(i17, str, i18, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onError " + i17 + ", " + str);
    }

    public final void F0(d13.c cVar, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "addRenderSurfaceTexture, renderMode:" + i17 + ", mVoipRenderMgr:" + this.f257908f);
        dr4.p1 p1Var = this.f257908f;
        if (p1Var != null) {
            android.graphics.SurfaceTexture surfaceTexture = cVar.f307255d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
            dr4.q qVar = new dr4.q(surfaceTexture, 0, 0);
            dr4.x1 x1Var = p1Var.f324241g;
            if (x1Var != null) {
                if (x1Var.b(qVar)) {
                    dr4.x1 x1Var2 = p1Var.f324241g;
                    if (x1Var2 != null) {
                        x1Var2.a(qVar, i17);
                    }
                    p1Var.k(qVar, i17);
                    dr4.p0 p0Var = p1Var.f324254t;
                    if (i17 == 0) {
                        dr4.o0 o0Var = p0Var.f324232a;
                        o0Var.f324227a = surfaceTexture;
                        o0Var.f324228b = qVar;
                    } else {
                        dr4.o0 o0Var2 = p0Var.f324233b;
                        o0Var2.f324227a = surfaceTexture;
                        o0Var2.f324228b = qVar;
                    }
                }
            }
            cVar.f307256e = new b13.g(p1Var, qVar, i17);
            android.graphics.SurfaceTexture surfaceTexture2 = cVar.f307255d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture2, "surfaceTexture");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onSurfaceTextureReady: " + surfaceTexture2);
            p1Var.k(qVar, i17);
            cVar.f307258g.g(p012xc85e97e9.p093xedfae76a.n.STARTED);
        }
    }

    public final void G0() {
        d13.c cVar;
        d13.c cVar2;
        if (this.C1) {
            if (!this.D1 && (cVar2 = this.F1) != null) {
                this.D1 = true;
                F0(cVar2, 0);
            }
            if (this.E1 || (cVar = this.G1) == null) {
                return;
            }
            this.E1 = true;
            F0(cVar, 1);
        }
    }

    public final boolean H0(boolean z17, yz5.l miniOk) {
        android.view.Window window;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(miniOk, "miniOk");
        if (!k0(true)) {
            miniOk.mo146xb9724478(java.lang.Boolean.FALSE);
            return false;
        }
        android.app.Activity activity = this.H1;
        android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        ep1.m.a(this.H1, false);
        ((ku5.t0) ku5.t0.f394148d).B(new b13.j(this, z17, decorView, miniOk));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void I(boolean z17) {
        c13.b0.f119393d.f(z03.b.f550740h);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Voip.NewVoipMgr", "onShutDown", new java.lang.Object[0]);
        vq4.o0 o0Var = this.f257907e;
        if (o0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Voip.NewVoipMgr", "shutdown when startVoIP() didn't get called");
        } else {
            java.lang.String string = vq4.n0.h(o0Var.f520902a) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kaa, q0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(this.B))) : this.f257920r ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574992ka4) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574990ka2);
            java.lang.String str = "voip_content_video";
            if (this.f257920r || vq4.n0.h(this.f257907e.f520902a)) {
                java.lang.String d17 = this.f257919q.d1();
                if (this.f257921s) {
                    int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                } else {
                    int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                    str = "voip_content_voice";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.c(d17, str, this.f257920r ? 1 : 0, 6, string);
            } else if (!this.f257920r && z17) {
                java.lang.String d18 = this.f257919q.d1();
                if (this.f257921s) {
                    int i19 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                } else {
                    int i27 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
                    str = "voip_content_voice";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.c(d18, str, this.f257920r ? 1 : 0, 6, string);
            }
            ((vq4.m0) this.f257906d).d();
            this.f257914n = vq4.n0.h(this.f257907e.f520902a);
            if (h0()) {
                this.f257926x = 4106;
            } else {
                E0(4106);
                m0();
            }
            gq4.v.Bi().k();
            if (!this.Q) {
                vq4.d0.j(gq4.v.Bi().m(), gq4.v.Bi().n(), !this.f257920r ? 1 : 0, 4);
                this.Q = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onShutdown withTip:" + z17);
    }

    public final void I0() {
        dr4.p1 p1Var;
        xq4.a aVar;
        if (this.f257920r) {
            return;
        }
        if (this.f257921s) {
            i();
        } else {
            l();
        }
        if (!gq4.v.Bi().f258095e || !this.f257921s || (p1Var = this.f257908f) == null || (aVar = p1Var.f324237c) == null || true == ((zq4.b) aVar).f556574a) {
            return;
        }
        o0(10);
        w0(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void J() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onRoomReady");
        if (this.f257928y && gq4.v.Bi().m() != 0) {
            this.f257928y = false;
            C0();
        }
        if (this.f257920r) {
            E0(4097);
        }
        rq4.q.f480600a.a(java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), this.f257916p, java.lang.Boolean.valueOf(this.f257920r));
        rq4.u uVar = rq4.u.f480642a;
        long m17 = gq4.v.Bi().m();
        long n17 = gq4.v.Bi().n();
        rq4.u.f480643b = m17;
        rq4.u.f480644c = n17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(gq4.v.Bi().m());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(gq4.v.Bi().n());
        rq4.t tVar = ((vq4.m0) this.f257906d).f520895z;
        if (tVar != null && valueOf != null) {
            tVar.f480640g = valueOf.intValue();
            if (valueOf2 != null) {
                tVar.f480641h = valueOf2.longValue();
            }
        }
        this.f257930z = true;
        this.f257922t = gq4.v.Bi().m();
        this.f257923u = gq4.v.Bi().n();
        this.f257924v = gq4.v.Bi().o();
        i0(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.j0.o(gq4.v.Bi().z());
        long j17 = this.f257923u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.proc.VoipTracker", "#markVoipStart: " + j17);
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Bi().putLong("voip-start-" + j17, java.lang.System.currentTimeMillis());
        uq3.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0.f257904x1;
        if (gVar != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p4) gVar).b(java.lang.Long.valueOf(this.f257923u));
        }
        ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).Di(java.lang.String.valueOf(this.f257923u), this.f257920r ? 1 : 2, this.f257924v == 0 ? 1 : 2, 1);
        this.f98650z1 = gq4.v.Bi().m();
        this.A1 = gq4.v.Bi().n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onRoomReady, roomId:" + this.f98650z1 + ", roomKey:" + this.A1);
        gq4.v.Bi().getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J0(android.app.Activity r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b13.m.J0(android.app.Activity):boolean");
    }

    public final void K0(boolean z17) {
        o0(z17 ? 2 : 1);
        vq4.m0 m0Var = (vq4.m0) this.f257906d;
        m0Var.getClass();
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var = gq4.v.Bi().f258091a.f257944a.A;
            if (i1Var.f258180b != null) {
                if (i1Var.B == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = i1Var.f258182d.f258065x;
                    c18912x54425f62.M = c18912x54425f62.m72784x1ef448df();
                    vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, opensl enableMute, audioRecorderErrorCode=" + i1Var.f258182d.f258065x.M);
                } else {
                    i1Var.f258180b.n(true);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipDeviceHandler", "qipeng, enableMute.");
                }
            }
            gq4.v.Bi().O(9, true);
            gq4.v.Bi().P(true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.i1 i1Var2 = gq4.v.Bi().f258091a.f257944a.A;
            if (i1Var2.f258180b != null) {
                if (i1Var2.B == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f622 = i1Var2.f258182d.f258065x;
                    c18912x54425f622.M = c18912x54425f622.m72783x666332de();
                    vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, opensl disableMute, audioRecorderErrorCode=" + i1Var2.f258182d.f258065x.M);
                } else {
                    i1Var2.f258180b.n(false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.VoipDeviceHandler", "qipeng, disableMute.");
                }
            }
            gq4.v.Bi().O(8, true);
            gq4.v.Bi().P(false);
        }
        m0Var.f520894y = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = 2;
        objArr[1] = 0;
        objArr[2] = java.lang.Integer.valueOf(z17 ? 2 : 1);
        g0Var.d(11080, objArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void W() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onReject");
        nq4.f.f420547a.d();
        E0(4099);
        java.lang.String d17 = this.f257919q.d1();
        if (this.f257921s) {
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_video";
        } else {
            int i18 = com.p314xaae8f345.mm.p2621x8fb0427b.f9.f275459r2;
            str = "voip_content_voice";
        }
        boolean z17 = this.f257920r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b2.c(d17, str, z17 ? 1 : 0, 6, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kai));
        m0();
        if (this.f257909g instanceof d13.e) {
            return;
        }
        c13.b0.f119393d.f(z03.b.f550738f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void a() {
        cv.v0 v0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVoipMgr", "onConnected");
        E0(4102);
        this.B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        this.G = java.lang.System.currentTimeMillis();
        if (this.f257908f != null) {
            if (gq4.v.wi().f447509j) {
                gq4.v.Bi().f258091a.o(true);
            } else {
                gq4.v.Bi().f258091a.o(false);
            }
        }
        gq4.v.wi().f447517r = java.lang.System.currentTimeMillis();
        i0(3);
        this.f257930z = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi = gq4.v.Bi();
        long j17 = this.B;
        Bi.f258112v = j17;
        boolean z17 = this.f257921s;
        boolean z18 = this.f257920r;
        java.lang.String str = this.f257916p;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, java.lang.Boolean.FALSE);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_VIDEO_MODE_BOOLEAN, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_OUT_CALL_BOOLEAN, java.lang.Boolean.valueOf(z18));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_BEFORE_TIME_LONG, java.lang.Long.valueOf(j17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOIP_STATUS_TO_USER_STRING, str);
        gm0.j1.u().c().i(true);
        if (this.f257909g != null) {
            this.f257909g.o5(this.B);
        }
        boolean q17 = gq4.v.Bi().f258091a.f257944a.q();
        boolean r17 = gq4.v.Bi().f258091a.f257944a.r();
        if (this.f257921s && this.f257920r && !r17 && !q17) {
            gq4.v.Bi().O(1, true);
        }
        if (!this.f257921s) {
            gq4.v.Bi().O(1, false);
        }
        if (!vq4.n0.g(this.f257907e.f520902a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11080, 1, 0, 0);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.h2 Bi2 = gq4.v.Bi();
        int i17 = gq4.v.Bi().f258091a.f257944a.f258065x.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3 d3Var = Bi2.f258091a;
        d3Var.getClass();
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.F = i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.c3(d3Var);
        d3Var.f257958o = c3Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c3Var, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        vq4.d.a();
        wu5.c cVar = d3Var.f257947d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        wu5.c cVar2 = d3Var.f257948e;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        wu5.c cVar3 = d3Var.f257949f;
        if (cVar3 != null) {
            cVar3.cancel(false);
        }
        d3Var.f257955l = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z2(d3Var);
        d3Var.f257956m = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.y2(d3Var);
        d3Var.f257957n = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.x2(d3Var);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z2 z2Var = d3Var.f257955l;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        d3Var.f257947d = ((ku5.t0) u0Var).e(z2Var, 0L, timeUnit.toMillis(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d3.F));
        d3Var.f257948e = ((ku5.t0) ku5.t0.f394148d).e(d3Var.f257956m, 0L, timeUnit.toMillis(3));
        d3Var.f257949f = ((ku5.t0) ku5.t0.f394148d).e(d3Var.f257957n, 0L, timeUnit.toMillis(10));
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a().c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2.a();
        a17.getClass();
        a17.f257861f = new java.lang.ref.WeakReference(this);
        int m17 = gq4.v.Bi().m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipBeautyPerfStat", "setRoomId:" + m17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.l0.f258244a = m17;
        rq4.u uVar = rq4.u.f480642a;
        rq4.u.f480648g = java.lang.System.currentTimeMillis();
        wu5.c cVar4 = this.V;
        if (cVar4 != null) {
            cVar4.cancel(false);
        }
        this.V = ((ku5.t0) ku5.t0.f394148d).d(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.RunnableC18896x5978c17(), 0L, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        if (!vq4.n0.g(this.f257907e.f520902a) && (v0Var = this.A) != null && v0Var.f304049a == 2) {
            A0();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onConnected");
        c13.b0 b0Var = c13.b0.f119393d;
        int m18 = gq4.v.Bi().m();
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89484xdba42fea(m18, new c13.h(m18));
        }
        if (((vq4.m0) this.f257906d).f520894y) {
            K0(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0
    public void m0() {
        super.m0();
        this.I1 = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0
    public void p0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "finish: activity=" + this.H1);
        if (this.H1 == null) {
            ((e50.a) ((f50.x) i95.n0.c(f50.x.class))).wi(this.f98649y1);
        }
        c13.b0.f119393d.c();
        this.K1.mo48814x2efc64();
        this.F1 = null;
        this.G1 = null;
        super.p0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void y(int i17) {
        if (this.f257909g != null) {
            this.f257909g.y(i17);
        }
        qq4.b wi6 = gq4.v.wi();
        if (i17 > 0) {
            wi6.f447507h = i17;
        } else {
            wi6.getClass();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k3
    public void z(boolean z17) {
        if (this.f257909g != null) {
            this.f257909g.z(z17);
        }
        c13.b0.f119393d.h(z17 ? z03.g.f550771n : z03.g.f550772o, null);
    }
}
