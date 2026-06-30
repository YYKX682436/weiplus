package b13;

/* loaded from: classes14.dex */
public final class m extends com.tencent.mm.plugin.voip.model.d0 {
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
    public final com.tencent.mm.sdk.event.IListener K1;

    /* renamed from: y1, reason: collision with root package name */
    public final java.lang.String f17116y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f17117z1;

    public m(java.lang.String engineId) {
        kotlin.jvm.internal.o.g(engineId, "engineId");
        this.f17116y1 = engineId;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).getClass();
        this.J1 = new ep1.k();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.K1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HardCoderSystemEvent>(a0Var) { // from class: com.tencent.mm.plugin.flutter.voip.manager.FlutterVoipMgr$hardCoderSystemEventListener$1
            {
                this.__eventId = -637576831;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HardCoderSystemEvent hardCoderSystemEvent) {
                com.tencent.mm.autogen.events.HardCoderSystemEvent event = hardCoderSystemEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.hh hhVar = event.f54432g;
                if (hhVar == null) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "summerhardcoder system event [%s]", java.lang.Integer.valueOf(hhVar.f6834a));
                if (hhVar.f6834a != 1) {
                    return false;
                }
                int i17 = b13.m.L1;
                b13.m.this.I0();
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.voip.model.d0
    public void E0(int i17) {
        cv.v0 v0Var;
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.Voip.NewVoipMgr", "swtchState, action: %s, currentState: %s", vq4.n0.d(i17), vq4.n0.d(this.f176374e.f439369a));
        boolean z17 = false;
        if (!vq4.n0.g(this.f176374e.f439369a)) {
            if (4111 == i17 || (4101 == i17 && (vq4.n0.h(this.f176374e.f439369a) || this.f176387r))) {
                this.f176373d.getClass();
                int i18 = this.E;
                if (i18 == 0 || ((v0Var = this.A) != null && 1 == i18 && 1 == v0Var.f222516a)) {
                    vq4.m0 m0Var = (vq4.m0) this.f176373d;
                    m0Var.getClass();
                    if (mx3.f0.h()) {
                        cv.v0 v0Var2 = m0Var.f439354r;
                        if (v0Var2 != null && v0Var2.f222516a == 1) {
                            z17 = true;
                        }
                        if (z17 && m0Var.f439355s == null) {
                            if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).Ui()) {
                                m0Var.l(4, true);
                            } else if (((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).aj()) {
                                m0Var.l(3, true);
                            } else {
                                m0Var.l(2, true);
                            }
                        }
                    } else {
                        cv.v0 v0Var3 = m0Var.f439356t;
                        if (v0Var3 != null && v0Var3.f222516a == 1) {
                            z17 = true;
                        }
                        if (z17) {
                            m0Var.l(2, true);
                        }
                    }
                    this.K = true;
                    cv.v0 v0Var4 = this.A;
                    if (v0Var4 != null && v0Var4.f222516a == 2) {
                        A0();
                    }
                    if (!gq4.v.Bi().x()) {
                        ((vq4.m0) this.f176373d).j();
                    }
                }
            }
        } else if (i17 != 4100) {
            if (i17 == 4101) {
                dr4.p1 p1Var = this.f176375f;
                if (p1Var != null) {
                    p1Var.n();
                }
                this.f176388s = false;
                com.tencent.mm.plugin.voip.widget.k kVar = this.I;
                if (kVar != null) {
                    kVar.f177163n = false;
                }
                jq4.c1 c1Var = gq4.v.Bi().f176581x;
                if (c1Var != null) {
                    c1Var.f301225z = false;
                    com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = c1Var.B;
                    if (voIPRenderTextureView != null) {
                        voIPRenderTextureView.setVisibility(8);
                    }
                    android.view.View view = c1Var.f301236e;
                    if (view != null) {
                        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kg6);
                        int f17 = c1Var.f();
                        textView.setText(f17);
                        if (c1Var.f301240i == null) {
                            c1Var.f301240i = new jq4.c0();
                        }
                        jq4.c0 c0Var = c1Var.f301240i;
                        if (c0Var != null) {
                            c0Var.b();
                        }
                        jq4.c0 c0Var2 = c1Var.f301240i;
                        if (c0Var2 != null) {
                            java.lang.String string = view.getResources().getString(f17);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            c0Var2.a(textView, string, 500);
                        }
                        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.kfp);
                        findViewById.setBackground(findViewById.getResources().getDrawable(c1Var.d()));
                    }
                }
            } else if (i17 == 4112) {
                z(true);
                gq4.v.Bi().f176558a.f176411a.X = true;
            } else if (i17 == 4113) {
                z(false);
                gq4.v.Bi().f176558a.f176411a.X = false;
            }
        } else if (!gq4.v.Bi().x()) {
            ((vq4.m0) this.f176373d).j();
        }
        vq4.o0 o0Var = this.f176374e;
        if (o0Var.b(i17)) {
            int intValue = ((java.lang.Integer) ((java.util.Map) ((java.util.HashMap) o0Var.f439370b).get(java.lang.Integer.valueOf(o0Var.f439369a))).get(java.lang.Integer.valueOf(i17))).intValue();
            vq4.n0.d(o0Var.f439369a);
            vq4.n0.d(intValue);
            vq4.n0.d(i17);
            o0Var.f439369a = intValue;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.VoipStateMachine", "can't tranform due to no such rule");
        }
        if (this.f176376g != null) {
            this.f176376g.z1(i17, this.f176374e.f439369a);
        }
        int i19 = this.f176374e.f439369a;
        if (i19 == 4 || i19 == 5) {
            if (this.f176387r) {
                nq4.f.f339014a.c();
                com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent = new com.tencent.mm.autogen.events.VoipCallingStatusEvent();
                voipCallingStatusEvent.f54942g.f8161d = 2;
                voipCallingStatusEvent.e();
            }
        } else if ((i19 == 258 || i19 == 259) && !this.f176387r) {
            nq4.f.f339014a.c();
            com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent2 = new com.tencent.mm.autogen.events.VoipCallingStatusEvent();
            voipCallingStatusEvent2.f54942g.f8161d = 2;
            voipCallingStatusEvent2.e();
        }
        if (this.f176376g instanceof d13.e) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new b13.l(i17, this));
    }

    @Override // com.tencent.mm.plugin.voip.model.d0, com.tencent.mm.plugin.voip.model.k3
    public void F(int i17, java.lang.String str, int i18, java.lang.String str2) {
        z03.f fVar;
        c13.b0 b0Var = c13.b0.f37860d;
        z03.f.f469219d.getClass();
        if (i17 == -9000) {
            fVar = z03.f.f469227o;
        } else if (i17 == 211) {
            fVar = z03.f.f469224i;
        } else if (i17 == 233) {
            fVar = z03.f.f469225m;
        } else if (i17 != 241) {
            if (i17 != 248) {
                if (i17 == 1200) {
                    fVar = z03.f.f469228p;
                } else if (i17 != 244 && i17 != 245) {
                    switch (i17) {
                        case 235:
                            fVar = z03.f.f469221f;
                            break;
                        case com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX /* 236 */:
                            fVar = z03.f.f469223h;
                            break;
                        case 237:
                            fVar = z03.f.f469222g;
                            break;
                        default:
                            fVar = z03.f.f469220e;
                            break;
                    }
                }
            }
            fVar = z03.f.f469229q;
        } else {
            fVar = z03.f.f469226n;
        }
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new c13.j(voIPFlutterApi, fVar, str2));
        }
        super.F(i17, str, i18, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onError " + i17 + ", " + str);
    }

    public final void F0(d13.c cVar, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "addRenderSurfaceTexture, renderMode:" + i17 + ", mVoipRenderMgr:" + this.f176375f);
        dr4.p1 p1Var = this.f176375f;
        if (p1Var != null) {
            android.graphics.SurfaceTexture surfaceTexture = cVar.f225722d;
            kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
            dr4.q qVar = new dr4.q(surfaceTexture, 0, 0);
            dr4.x1 x1Var = p1Var.f242708g;
            if (x1Var != null) {
                if (x1Var.b(qVar)) {
                    dr4.x1 x1Var2 = p1Var.f242708g;
                    if (x1Var2 != null) {
                        x1Var2.a(qVar, i17);
                    }
                    p1Var.k(qVar, i17);
                    dr4.p0 p0Var = p1Var.f242721t;
                    if (i17 == 0) {
                        dr4.o0 o0Var = p0Var.f242699a;
                        o0Var.f242694a = surfaceTexture;
                        o0Var.f242695b = qVar;
                    } else {
                        dr4.o0 o0Var2 = p0Var.f242700b;
                        o0Var2.f242694a = surfaceTexture;
                        o0Var2.f242695b = qVar;
                    }
                }
            }
            cVar.f225723e = new b13.g(p1Var, qVar, i17);
            android.graphics.SurfaceTexture surfaceTexture2 = cVar.f225722d;
            kotlin.jvm.internal.o.g(surfaceTexture2, "surfaceTexture");
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onSurfaceTextureReady: " + surfaceTexture2);
            p1Var.k(qVar, i17);
            cVar.f225725g.g(androidx.lifecycle.n.STARTED);
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
        kotlin.jvm.internal.o.g(miniOk, "miniOk");
        if (!k0(true)) {
            miniOk.invoke(java.lang.Boolean.FALSE);
            return false;
        }
        android.app.Activity activity = this.H1;
        android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        ep1.m.a(this.H1, false);
        ((ku5.t0) ku5.t0.f312615d).B(new b13.j(this, z17, decorView, miniOk));
        return true;
    }

    @Override // com.tencent.mm.plugin.voip.model.k3
    public void I(boolean z17) {
        c13.b0.f37860d.f(z03.b.f469207h);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.NewVoipMgr", "onShutDown", new java.lang.Object[0]);
        vq4.o0 o0Var = this.f176374e;
        if (o0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Voip.NewVoipMgr", "shutdown when startVoIP() didn't get called");
        } else {
            java.lang.String string = vq4.n0.h(o0Var.f439369a) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kaa, q0(com.tencent.mm.sdk.platformtools.t8.H1(this.B))) : this.f176387r ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493459ka4) : com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493457ka2);
            java.lang.String str = "voip_content_video";
            if (this.f176387r || vq4.n0.h(this.f176374e.f439369a)) {
                java.lang.String d17 = this.f176386q.d1();
                if (this.f176388s) {
                    int i17 = com.tencent.mm.storage.f9.f193926r2;
                } else {
                    int i18 = com.tencent.mm.storage.f9.f193926r2;
                    str = "voip_content_voice";
                }
                com.tencent.mm.plugin.voip.model.b2.c(d17, str, this.f176387r ? 1 : 0, 6, string);
            } else if (!this.f176387r && z17) {
                java.lang.String d18 = this.f176386q.d1();
                if (this.f176388s) {
                    int i19 = com.tencent.mm.storage.f9.f193926r2;
                } else {
                    int i27 = com.tencent.mm.storage.f9.f193926r2;
                    str = "voip_content_voice";
                }
                com.tencent.mm.plugin.voip.model.b2.c(d18, str, this.f176387r ? 1 : 0, 6, string);
            }
            ((vq4.m0) this.f176373d).d();
            this.f176381n = vq4.n0.h(this.f176374e.f439369a);
            if (h0()) {
                this.f176393x = 4106;
            } else {
                E0(4106);
                m0();
            }
            gq4.v.Bi().k();
            if (!this.Q) {
                vq4.d0.j(gq4.v.Bi().m(), gq4.v.Bi().n(), !this.f176387r ? 1 : 0, 4);
                this.Q = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onShutdown withTip:" + z17);
    }

    public final void I0() {
        dr4.p1 p1Var;
        xq4.a aVar;
        if (this.f176387r) {
            return;
        }
        if (this.f176388s) {
            i();
        } else {
            l();
        }
        if (!gq4.v.Bi().f176562e || !this.f176388s || (p1Var = this.f176375f) == null || (aVar = p1Var.f242704c) == null || true == ((zq4.b) aVar).f475041a) {
            return;
        }
        o0(10);
        w0(null);
    }

    @Override // com.tencent.mm.plugin.voip.model.k3
    public void J() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "onRoomReady");
        if (this.f176395y && gq4.v.Bi().m() != 0) {
            this.f176395y = false;
            C0();
        }
        if (this.f176387r) {
            E0(4097);
        }
        rq4.q.f399067a.a(java.lang.Integer.valueOf(gq4.v.Bi().m()), java.lang.Long.valueOf(gq4.v.Bi().n()), this.f176383p, java.lang.Boolean.valueOf(this.f176387r));
        rq4.u uVar = rq4.u.f399109a;
        long m17 = gq4.v.Bi().m();
        long n17 = gq4.v.Bi().n();
        rq4.u.f399110b = m17;
        rq4.u.f399111c = n17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(gq4.v.Bi().m());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(gq4.v.Bi().n());
        rq4.t tVar = ((vq4.m0) this.f176373d).f439362z;
        if (tVar != null && valueOf != null) {
            tVar.f399107g = valueOf.intValue();
            if (valueOf2 != null) {
                tVar.f399108h = valueOf2.longValue();
            }
        }
        this.f176397z = true;
        this.f176389t = gq4.v.Bi().m();
        this.f176390u = gq4.v.Bi().n();
        this.f176391v = gq4.v.Bi().o();
        i0(1);
        com.tencent.mm.plugin.voip.model.j0.o(gq4.v.Bi().z());
        long j17 = this.f176390u;
        com.tencent.mars.xlog.Log.i("MiroMsg.proc.VoipTracker", "#markVoipStart: " + j17);
        ((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Bi().putLong("voip-start-" + j17, java.lang.System.currentTimeMillis());
        uq3.g gVar = com.tencent.mm.plugin.voip.model.d0.f176371x1;
        if (gVar != null) {
            ((com.tencent.mm.feature.performance.p4) gVar).b(java.lang.Long.valueOf(this.f176390u));
        }
        ((kg0.m) ((bd0.n) i95.n0.c(bd0.n.class))).Di(java.lang.String.valueOf(this.f176390u), this.f176387r ? 1 : 2, this.f176391v == 0 ? 1 : 2, 1);
        this.f17117z1 = gq4.v.Bi().m();
        this.A1 = gq4.v.Bi().n();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onRoomReady, roomId:" + this.f17117z1 + ", roomKey:" + this.A1);
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
        vq4.m0 m0Var = (vq4.m0) this.f176373d;
        m0Var.getClass();
        if (z17) {
            com.tencent.mm.plugin.voip.model.i1 i1Var = gq4.v.Bi().f176558a.f176411a.A;
            if (i1Var.f176647b != null) {
                if (i1Var.B == 1) {
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = i1Var.f176649d.f176532x;
                    v2protocalVar.M = v2protocalVar.OpenSLEnableMute();
                    vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, opensl enableMute, audioRecorderErrorCode=" + i1Var.f176649d.f176532x.M);
                } else {
                    i1Var.f176647b.n(true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "qipeng, enableMute.");
                }
            }
            gq4.v.Bi().O(9, true);
            gq4.v.Bi().P(true);
        } else {
            com.tencent.mm.plugin.voip.model.i1 i1Var2 = gq4.v.Bi().f176558a.f176411a.A;
            if (i1Var2.f176647b != null) {
                if (i1Var2.B == 1) {
                    com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = i1Var2.f176649d.f176532x;
                    v2protocalVar2.M = v2protocalVar2.OpenSLDisableMute();
                    vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, opensl disableMute, audioRecorderErrorCode=" + i1Var2.f176649d.f176532x.M);
                } else {
                    i1Var2.f176647b.n(false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "qipeng, disableMute.");
                }
            }
            gq4.v.Bi().O(8, true);
            gq4.v.Bi().P(false);
        }
        m0Var.f439361y = z17;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = 2;
        objArr[1] = 0;
        objArr[2] = java.lang.Integer.valueOf(z17 ? 2 : 1);
        g0Var.d(11080, objArr);
    }

    @Override // com.tencent.mm.plugin.voip.model.k3
    public void W() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "onReject");
        nq4.f.f339014a.d();
        E0(4099);
        java.lang.String d17 = this.f176386q.d1();
        if (this.f176388s) {
            int i17 = com.tencent.mm.storage.f9.f193926r2;
            str = "voip_content_video";
        } else {
            int i18 = com.tencent.mm.storage.f9.f193926r2;
            str = "voip_content_voice";
        }
        boolean z17 = this.f176387r;
        com.tencent.mm.plugin.voip.model.b2.c(d17, str, z17 ? 1 : 0, 6, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kai));
        m0();
        if (this.f176376g instanceof d13.e) {
            return;
        }
        c13.b0.f37860d.f(z03.b.f469205f);
    }

    @Override // com.tencent.mm.plugin.voip.model.k3
    public void a() {
        cv.v0 v0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "onConnected");
        E0(4102);
        this.B = com.tencent.mm.sdk.platformtools.t8.i1();
        this.G = java.lang.System.currentTimeMillis();
        if (this.f176375f != null) {
            if (gq4.v.wi().f365976j) {
                gq4.v.Bi().f176558a.o(true);
            } else {
                gq4.v.Bi().f176558a.o(false);
            }
        }
        gq4.v.wi().f365984r = java.lang.System.currentTimeMillis();
        i0(3);
        this.f176397z = true;
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        long j17 = this.B;
        Bi.f176579v = j17;
        boolean z17 = this.f176388s;
        boolean z18 = this.f176387r;
        java.lang.String str = this.f176383p;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, java.lang.Boolean.FALSE);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_VIDEO_MODE_BOOLEAN, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_OUT_CALL_BOOLEAN, java.lang.Boolean.valueOf(z18));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_BEFORE_TIME_LONG, java.lang.Long.valueOf(j17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_TO_USER_STRING, str);
        gm0.j1.u().c().i(true);
        if (this.f176376g != null) {
            this.f176376g.o5(this.B);
        }
        boolean q17 = gq4.v.Bi().f176558a.f176411a.q();
        boolean r17 = gq4.v.Bi().f176558a.f176411a.r();
        if (this.f176388s && this.f176387r && !r17 && !q17) {
            gq4.v.Bi().O(1, true);
        }
        if (!this.f176388s) {
            gq4.v.Bi().O(1, false);
        }
        if (!vq4.n0.g(this.f176374e.f439369a)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11080, 1, 0, 0);
        }
        com.tencent.mm.sdk.platformtools.t8.L1(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
        com.tencent.mm.plugin.voip.model.h2 Bi2 = gq4.v.Bi();
        int i17 = gq4.v.Bi().f176558a.f176411a.f176532x.I;
        com.tencent.mm.plugin.voip.model.d3 d3Var = Bi2.f176558a;
        d3Var.getClass();
        if (i17 > 0) {
            com.tencent.mm.plugin.voip.model.d3.F = i17;
        }
        com.tencent.mm.plugin.voip.model.c3 c3Var = new com.tencent.mm.plugin.voip.model.c3(d3Var);
        d3Var.f176425o = c3Var;
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(c3Var, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        vq4.d.a();
        wu5.c cVar = d3Var.f176414d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        wu5.c cVar2 = d3Var.f176415e;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        wu5.c cVar3 = d3Var.f176416f;
        if (cVar3 != null) {
            cVar3.cancel(false);
        }
        d3Var.f176422l = new com.tencent.mm.plugin.voip.model.z2(d3Var);
        d3Var.f176423m = new com.tencent.mm.plugin.voip.model.y2(d3Var);
        d3Var.f176424n = new com.tencent.mm.plugin.voip.model.x2(d3Var);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.voip.model.z2 z2Var = d3Var.f176422l;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        d3Var.f176414d = ((ku5.t0) u0Var).e(z2Var, 0L, timeUnit.toMillis(com.tencent.mm.plugin.voip.model.d3.F));
        d3Var.f176415e = ((ku5.t0) ku5.t0.f312615d).e(d3Var.f176423m, 0L, timeUnit.toMillis(3));
        d3Var.f176416f = ((ku5.t0) ku5.t0.f312615d).e(d3Var.f176424n, 0L, timeUnit.toMillis(10));
        com.tencent.mm.plugin.voip.model.a2.a().c();
        com.tencent.mm.plugin.voip.model.a2 a17 = com.tencent.mm.plugin.voip.model.a2.a();
        a17.getClass();
        a17.f176328f = new java.lang.ref.WeakReference(this);
        int m17 = gq4.v.Bi().m();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipBeautyPerfStat", "setRoomId:" + m17);
        com.tencent.mm.plugin.voip.model.l0.f176711a = m17;
        rq4.u uVar = rq4.u.f399109a;
        rq4.u.f399115g = java.lang.System.currentTimeMillis();
        wu5.c cVar4 = this.V;
        if (cVar4 != null) {
            cVar4.cancel(false);
        }
        this.V = ((ku5.t0) ku5.t0.f312615d).d(new com.tencent.mm.plugin.voip.model.d0$$c(), 0L, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        if (!vq4.n0.g(this.f176374e.f439369a) && (v0Var = this.A) != null && v0Var.f222516a == 2) {
            A0();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "onConnected");
        c13.b0 b0Var = c13.b0.f37860d;
        int m18 = gq4.v.Bi().m();
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onConnected(m18, new c13.h(m18));
        }
        if (((vq4.m0) this.f176373d).f439361y) {
            K0(true);
        }
    }

    @Override // com.tencent.mm.plugin.voip.model.d0
    public void m0() {
        super.m0();
        this.I1 = true;
    }

    @Override // com.tencent.mm.plugin.voip.model.d0
    public void p0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVoipMgr", "finish: activity=" + this.H1);
        if (this.H1 == null) {
            ((e50.a) ((f50.x) i95.n0.c(f50.x.class))).wi(this.f17116y1);
        }
        c13.b0.f37860d.c();
        this.K1.dead();
        this.F1 = null;
        this.G1 = null;
        super.p0();
    }

    @Override // com.tencent.mm.plugin.voip.model.k3
    public void y(int i17) {
        if (this.f176376g != null) {
            this.f176376g.y(i17);
        }
        qq4.b wi6 = gq4.v.wi();
        if (i17 > 0) {
            wi6.f365974h = i17;
        } else {
            wi6.getClass();
        }
    }

    @Override // com.tencent.mm.plugin.voip.model.k3
    public void z(boolean z17) {
        if (this.f176376g != null) {
            this.f176376g.z(z17);
        }
        c13.b0.f37860d.h(z17 ? z03.g.f469238n : z03.g.f469239o, null);
    }
}
