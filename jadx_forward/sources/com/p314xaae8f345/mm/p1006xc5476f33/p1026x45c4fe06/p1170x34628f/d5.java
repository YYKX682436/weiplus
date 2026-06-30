package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class d5 extends we.a implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f168055p1 = 0;
    public android.widget.FrameLayout M;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public long S;
    public long T;
    public long U;
    public java.lang.String V;
    public java.lang.String W;

    /* renamed from: l1, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd[] f168056l1;

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.Deque f168057p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f168058x0;

    /* renamed from: y0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f168059y0;

    static {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ka.f166253a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ModularizingPkgRetrieverContract", "<clinit>");
    }

    public d5(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(context, o6Var);
        this.P = false;
        this.Q = false;
        this.R = false;
        this.f168057p0 = new java.util.LinkedList();
        if (!mo52154x9a3f0ba2().q2() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) {
            m52186x725c90a2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.d());
        }
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f168059y0 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1118x5c6729a.C12265x8d23f931>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$1
            {
                this.f39173x3fe91575 = 839890650;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1118x5c6729a.C12265x8d23f931 c12265x8d23f931) {
                if (c12265x8d23f931 == null) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] receive weishi play event");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5.f168055p1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5.this;
                if (d5Var.M != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed");
                    android.widget.FrameLayout frameLayout = d5Var.M;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo52154x9a3f0ba2 = d5Var.mo52154x9a3f0ba2();
                    mo52154x9a3f0ba2.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e5(d5Var, frameLayout), 300L);
                    d5Var.M = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = mo52154x9a3f0ba2.f156344t;
                    if (vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zc) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed, hide");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zc) vcVar).e(true, "", null);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.b();
                return false;
            }
        };
        this.f168056l1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.APP_LAUNCH, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.RE_LAUNCH, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REDIRECT_TO};
        m52181xa7687c07(this);
        m52189xff4f16fc((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jb) o6Var.C0().z1(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe.class));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void A() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var = this.N;
        if (x1Var == null) {
            super.A();
        } else {
            x1Var.dismiss();
            this.N = null;
        }
    }

    @Override // we.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void B() {
        android.view.View rootView;
        super.B();
        if (m52169xfdaa7672() != null && m52169xfdaa7672().mo14682x9dee9c37() != null) {
            if (mo52154x9a3f0ba2().g2() == 1118) {
                if (this.P && !this.Q) {
                    java.lang.String Y1 = m52169xfdaa7672().mo14682x9dee9c37().Y1();
                    java.lang.String str = this.V;
                    if (str != null && str.equals(Y1)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "statPageTime onBackground");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.h w37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) m52169xfdaa7672().mo14682x9dee9c37()).w3();
                        this.S = w37 == null ? 0L : w37.a();
                        this.Q = true;
                    }
                }
                this.U = java.lang.System.currentTimeMillis() - this.T;
                if (this.P && this.Q && mo52154x9a3f0ba2().l2() != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "report pageStayTime:%d, appStayTime:%d", java.lang.Long.valueOf(this.S), java.lang.Long.valueOf(this.U));
                    long j17 = this.S;
                    long j18 = this.U;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd c12558x591103cd = mo52154x9a3f0ba2().l2().f169329o;
                    if (c12558x591103cd != null) {
                        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
                        ik1.h0.a().m77784x795fa299(new x81.e(1, j17, j18, c12558x591103cd));
                    }
                }
            }
            if (this.R && mo52154x9a3f0ba2().g2() == 1162 && java.lang.System.currentTimeMillis() - this.T >= 3000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11810xcb772e0b c11810xcb772e0b = mo52154x9a3f0ba2().u0().f158836p2;
                java.lang.String str2 = c11810xcb772e0b.f158847d;
                int i17 = c11810xcb772e0b.f158849f;
                java.lang.String str3 = c11810xcb772e0b.f158850g;
                java.lang.String str4 = c11810xcb772e0b.f158851h;
                int i18 = c11810xcb772e0b.f158852i;
                java.lang.String str5 = c11810xcb772e0b.f158853m;
                java.lang.String str6 = this.W;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str6 == null) {
                    str6 = "";
                }
                if (!str6.equals(str3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19724, 4, 0, 0, java.lang.Integer.valueOf(i18), 0, null, 0, 0, 0, str2, null, null, str3, 0, null, str4, java.lang.Integer.valueOf(i17), null, null, str5);
                    this.W = str3;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = mo52154x9a3f0ba2().H2;
        l0Var.f172732e.c();
        if (l0Var.e().c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = l0Var.f172728a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = o6Var.f156329e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hcVar != null ? hcVar.mo48805xd384d23c() : null, o6Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = o6Var.x0();
                android.view.KeyEvent.Callback findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.p314xaae8f345.mm.R.id.w_);
                hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
                if (eVar != null) {
                    eVar.m133672xef2521ec(8);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = l0Var.e().f158899p;
            if (c11820x84c5f368 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppHalfScreenStatusChangeListener", "notifyHalfScreenPause");
                android.os.ResultReceiver resultReceiver = c11820x84c5f368.f158930e;
                if (resultReceiver != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    k91.q3[] q3VarArr = k91.q3.f387266d;
                    bundle.putInt("action", 6);
                    resultReceiver.send(0, bundle);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void C() {
        if (m52173x328fb10a() > 0) {
            mo51924x62662257().a((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) m52169xfdaa7672().mo14682x9dee9c37());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var = this.N;
        if (x1Var != null) {
            x1Var.i();
            this.N = null;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f168059y0;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }

    @Override // we.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void D() {
        android.view.View rootView;
        super.D();
        mi1.v vVar = mo52154x9a3f0ba2().f156354z;
        if (vVar.f408236b != null) {
            vVar.c().setBackgroundColor(0);
        }
        o0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = mo52154x9a3f0ba2().H2;
        l0Var.l();
        l0Var.k();
        if (l0Var.e().c()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = l0Var.f172728a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = runtime.x0();
            android.view.KeyEvent.Callback findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.p314xaae8f345.mm.R.id.w_);
            hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
            if (eVar != null) {
                eVar.m133672xef2521ec(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11820x84c5f368 c11820x84c5f368 = l0Var.e().f158899p;
            if (c11820x84c5f368 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppHalfScreenStatusChangeListener", "notifyHalfScreenResume");
                android.os.ResultReceiver resultReceiver = c11820x84c5f368.f158930e;
                if (resultReceiver != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    k91.q3[] q3VarArr = k91.q3.f387266d;
                    bundle.putInt("action", 5);
                    resultReceiver.send(0, bundle);
                }
            }
        }
    }

    @Override // we.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 out, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        ni1.f fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 E = super.E(out, w2Var);
        mo52154x9a3f0ba2().Q2().b(w2Var.mo14683xad58292c());
        re.n nVar = mo52154x9a3f0ba2().f167701e3;
        if (nVar != null) {
            nVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
            ((ku5.t0) ku5.t0.f394148d).B(new re.k(nVar));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37 = w2Var.mo14682x9dee9c37();
            if (mo14682x9dee9c37 != null && (fVar = (ni1.f) mo14682x9dee9c37.B1(ni1.f.class)) != null) {
                fVar.P();
            }
        }
        return E;
    }

    @Override // we.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37;
        ni1.f fVar;
        super.F(w2Var, w2Var2, type);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var = this.N;
        if (x1Var != null) {
            x1Var.setVisibility(8);
            x1Var.i();
            this.N = null;
        }
        mo52154x9a3f0ba2().Q2().b(w2Var2.mo14683xad58292c());
        re.n nVar = mo52154x9a3f0ba2().f167701e3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_TO;
        if (nVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB;
            if (wdVar == type) {
                nVar.d(type);
                try {
                    if (nVar.f475811a.y0() > nVar.f475813c) {
                        final re.m mVar = new re.m(nVar);
                        w2Var2.N(new java.lang.Runnable(mVar) { // from class: re.o

                            /* renamed from: d, reason: collision with root package name */
                            public final /* synthetic */ yz5.a f475819d;

                            {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "function");
                                this.f475819d = mVar;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.f475819d.mo152xb9724478();
                            }
                        });
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th6, "[wxa_reload]tryPauseRenderingOfInvisiblePages appId[" + nVar.f475812b + "] type[" + type + "] maxKeepPageCount[" + nVar.f475813c + "] keepInvisbileTabbarPagesActive[" + nVar.f475814d + ']', new java.lang.Object[0]);
                }
            } else if (wdVar2 == type) {
                try {
                    if (!nVar.f475814d) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = nVar.f475811a.x0();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = x07 != null ? x07.m52169xfdaa7672() : null;
                        if ((m52169xfdaa7672 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) && (mo14682x9dee9c37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) m52169xfdaa7672).mo14682x9dee9c37()) != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1 y1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) m52169xfdaa7672;
                            y1Var.getClass();
                            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var : ((java.util.HashMap) y1Var.f168803x1).values()) {
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo14682x9dee9c37, v5Var)) {
                                    break;
                                }
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v5Var);
                                ni1.f fVar2 = (ni1.f) v5Var.B1(ni1.f.class);
                                if (fVar2 != null) {
                                    fVar2.V();
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.WXA.AppBrandPageViewMemoryRecycleStrategy", th7, "[wxa_reload]tryPauseRenderingOfInvisibleTabbarPages appId[" + nVar.f475812b + "], switch[" + nVar.f475814d + ']', new java.lang.Object[0]);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c372 = w2Var2.mo14682x9dee9c37();
            if (mo14682x9dee9c372 != null && (fVar = (ni1.f) mo14682x9dee9c372.B1(ni1.f.class)) != null) {
                fVar.P();
            }
            if (wdVar2 != type && wdVar != type) {
                ((ku5.t0) ku5.t0.f394148d).B(new re.l(nVar, type));
            }
        }
        if (w2Var != null && type == wdVar && mo52154x9a3f0ba2().g2() == 1118 && this.P && !this.Q) {
            java.lang.String Y1 = w2Var.mo14682x9dee9c37() == null ? "" : w2Var.mo14682x9dee9c37().Y1();
            java.lang.String str = this.V;
            if (str == null || !str.equals(Y1)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "statPageTime");
            this.S = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) w2Var.mo14682x9dee9c37()).w3().a();
            this.Q = true;
        }
    }

    @Override // we.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 G(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type, java.lang.String str, boolean z17) {
        gf.n2 n2Var;
        gf.d2 d2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 G = super.G(w2Var, w2Var2, type, str, z17);
        if ((w2Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(mo52154x9a3f0ba2())) {
            zl1.t m52251x308dc334 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y1) w2Var2).m52251x308dc334();
            if (m52251x308dc334 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "checkSinglePageModeLogic tab null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "checkSinglePageModeLogic set tab gone");
                if (m52251x308dc334.getVisibility() == 0) {
                    m52251x308dc334.setVisibility(8);
                }
            }
        }
        if (w2Var2.mo14682x9dee9c37().p2() && (n2Var = (gf.n2) mo52154x9a3f0ba2().p0(gf.n2.class, false)) != null && n2Var.f352678h && n2Var.f352680m && n2Var.f352681n && (d2Var = n2Var.f352679i) != null && d2Var.f352569c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(mo52154x9a3f0ba2());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = mo52154x9a3f0ba2().S2(false);
            if (a17 != null && S2 != null) {
                java.lang.String a18 = nf.z.a(str);
                java.util.HashSet hashSet = new java.util.HashSet();
                for (gf.e2 e2Var : d2Var.f352569c) {
                    java.util.List list = e2Var.f352575d;
                    boolean isEmpty = list.isEmpty();
                    if (!isEmpty && a18 != null && !a18.isEmpty()) {
                        isEmpty = list.contains(a18);
                    }
                    if (isEmpty) {
                        if (hashSet.add((a18 == null || a18.isEmpty()) ? "" : a18)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "wxa_expt_hitStruct ID:21627 has reported  targetUrl =" + str);
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7178xca5d697f c7178xca5d697f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7178xca5d697f();
                            c7178xca5d697f.f144756d = c7178xca5d697f.b("AppId", mo52154x9a3f0ba2().f156336n, true);
                            c7178xca5d697f.f144757e = a17.f169672i;
                            c7178xca5d697f.f144758f = a17.f169669f;
                            c7178xca5d697f.f144759g = c7178xca5d697f.b("libVersion", S2.W0(), true);
                            c7178xca5d697f.f144760h = c7178xca5d697f.b("libUpdateTime", S2.B7(), true);
                            c7178xca5d697f.f144761i = e2Var.f352573b;
                            java.lang.String str2 = e2Var.f352574c;
                            c7178xca5d697f.f144762j = c7178xca5d697f.b("exptParam", str2 != null ? fp.s0.a(str2) : null, true);
                            c7178xca5d697f.f144763k = 3L;
                            c7178xca5d697f.f144764l = a17.K ? 1L : 2L;
                            c7178xca5d697f.k();
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.a(mo52154x9a3f0ba2());
        re.n nVar = mo52154x9a3f0ba2().f167701e3;
        if (nVar != null) {
            nVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            nVar.c(w2Var2);
        }
        return G;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void H(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = mo52154x9a3f0ba2().H2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) w2Var.mo14682x9dee9c37();
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        pageView.mo32091x9a3f0ba2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.h1 h1Var = mo52154x9a3f0ba2().R2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.d1 d1Var = h1Var == null ? null : h1Var.f169735d;
        if (d1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 page = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) w2Var.mo14682x9dee9c37();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
            if (!d1Var.f169696b || d1Var.c(page)) {
                return;
            }
            d1Var.b(page, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j0.f169742d, d1Var.f169698d);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchCancel]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = mo52154x9a3f0ba2().H2;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = l0Var.f172728a;
        if (l0Var.a(o6Var, type)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getInitConfig(...)");
            if (((java.lang.Boolean) l0Var.z(w2Var, w2Var2, u07).f384366d).booleanValue()) {
                l0Var.s(!((java.lang.Boolean) r3.f384367e).booleanValue(), false);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z zVar;
        super.K(type, w2Var, w2Var2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchEnd]");
        if (mo52154x9a3f0ba2() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo52154x9a3f0ba2 = mo52154x9a3f0ba2();
        boolean z17 = false;
        if (type == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH) {
            bm5.x0 x0Var = mo52154x9a3f0ba2.f167702f3;
            java.lang.Runnable runnable = (java.lang.Runnable) x0Var.d();
            if (runnable != null) {
                mo52154x9a3f0ba2.f156343s.removeCallbacks(runnable);
                x0Var.m10823x6761d4f();
            }
            mo52154x9a3f0ba2.K("onPageSwitchEnd getPageContainer().setTranslationY(0)", new java.lang.Object[0]);
            mo52154x9a3f0ba2.x0().setTranslationY(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = mo52154x9a3f0ba2.H2;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = l0Var.f172728a;
        if (l0Var.a(o6Var2, type)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var2.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getInitConfig(...)");
            jz5.l z18 = l0Var.z(w2Var, w2Var2, u07);
            if (((java.lang.Boolean) z18.f384366d).booleanValue()) {
                l0Var.s(((java.lang.Boolean) z18.f384367e).booleanValue(), false);
            }
        }
        l0Var.l();
        if (!android.text.TextUtils.isEmpty(o6Var2.u0().C2) && !l0Var.h(w2Var) && l0Var.f(w2Var2)) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.h hVar = o6Var2.I2;
        if (z17) {
            if (hVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08 = hVar.f172670a.u0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u08, "getInitConfig(...)");
                hVar.b(u08);
                return;
            }
            return;
        }
        if (hVar == null || (o6Var = hVar.f172670a) == null || (zVar = o6Var.D1) == null) {
            return;
        }
        zVar.C();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void L(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f c17;
        if (mo52154x9a3f0ba2() == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = mo52154x9a3f0ba2().H2;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = l0Var.f172728a;
        if (l0Var.a(o6Var, type)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getInitConfig(...)");
            jz5.l z17 = l0Var.z(w2Var, w2Var2, u07);
            if (((java.lang.Boolean) z17.f384366d).booleanValue() && (c17 = l0Var.c()) != null) {
                java.lang.Boolean bool = (java.lang.Boolean) z17.f384367e;
                c17.m52148xb526290f(bool.booleanValue() ? f17 : 100 - f17);
                int color = c17.getContext().getResources().getColor(c17.h(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                if (!bool.booleanValue()) {
                    f17 = 100 - f17;
                }
                int argb = android.graphics.Color.argb((int) ((f17 * 255.0f) / 100), android.graphics.Color.red(color), android.graphics.Color.green(color), android.graphics.Color.blue(color));
                mi1.v vVar = o6Var.f156354z;
                if (vVar.f408236b != null) {
                    vVar.c().setBackgroundColor(argb);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void M(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd type, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2) {
        super.M(type, w2Var, w2Var2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[onPageSwitchStart]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = mo52154x9a3f0ba2().H2;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 e17 = l0Var.e();
        if (!(e17.c() && e17.f158897n) || w2Var2 == null) {
            return;
        }
        w2Var2.m52231x4e564163(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void N() {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11544x7f79c0cd().C(mo52154x9a3f0ba2().f156336n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public boolean P(boolean z17) {
        df.w1 t17;
        if (!p0()) {
            return false;
        }
        s0();
        super.P(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d7 Q1 = this.f168248u.Q1();
        if (!z17 || !(Q1 instanceof gf.d0) || (t17 = ((gf.d0) Q1).f0().t()) == null) {
            return true;
        }
        t17.s();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public int R() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.app.Activity r07 = mo52154x9a3f0ba2().r0();
        float f17 = (r07 == null || (resources = r07.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = 20 * f17;
        float B = (i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 5) - f18;
        float f19 = (100 * f17) + 0.5f;
        if (B > 0.0f) {
            f18 = B;
        }
        return (int) java.lang.Math.min(f19, f18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public int S() {
        if (rh1.b.f477157a) {
            return (int) ((getContext().getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public java.lang.Object T(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public java.lang.Object U(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public java.lang.Object V(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public java.lang.Object W(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        return android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public int X(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(mo52154x9a3f0ba2()) || mo52154x9a3f0ba2().e3() || r(w2Var) != null || (android.os.Build.VERSION.SDK_INT >= 34 && !mo52154x9a3f0ba2().Q0())) ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd r4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 r5, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 r6) {
        /*
            r2 = this;
            iz5.a.f(r2, r5)
            com.tencent.mm.plugin.appbrand.o6 r5 = r2.mo52154x9a3f0ba2()
            com.tencent.mm.plugin.appbrand.page.wd[] r0 = r2.f168056l1
            boolean r0 = u46.a.b(r0, r4)
            boolean r5 = gf.y0.b(r5, r3, r0)
            if (r5 == 0) goto L21
            gf.t0 r5 = new gf.t0
            com.tencent.mm.plugin.appbrand.o6 r0 = r2.mo52154x9a3f0ba2()
            r5.<init>(r6, r0)
            r2.s0()
        L1f:
            r6 = r5
            goto L35
        L21:
            boolean r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.f159108a
            java.lang.Class<com.tencent.mm.plugin.appbrand.da> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.class
            monitor-enter(r5)
            boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.f159109b     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L35
            com.tencent.mm.plugin.appbrand.page.bf r5 = new com.tencent.mm.plugin.appbrand.page.bf
            com.tencent.mm.plugin.appbrand.o6 r0 = r2.mo52154x9a3f0ba2()
            r5.<init>(r6, r0)
            goto L1f
        L35:
            com.tencent.mm.plugin.appbrand.o6 r5 = r2.mo52154x9a3f0ba2()
            boolean r5 = r5.a2()
            r0 = 0
            if (r5 == 0) goto L43
            r6.mo52132x15e8c79f(r0)
        L43:
            com.tencent.mm.plugin.appbrand.o6 r5 = r2.mo52154x9a3f0ba2()
            ph1.h r5 = r5.R
            boolean r1 = r5.e()
            if (r1 != 0) goto L58
            com.tencent.mm.plugin.appbrand.page.i5 r0 = new com.tencent.mm.plugin.appbrand.page.i5
            r0.<init>(r2, r6)
            r5.g(r3, r4, r0)
            goto L5b
        L58:
            r2.q0(r3, r4, r6, r0)
        L5b:
            r3 = 1
            return r3
        L5d:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5d
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5.b(java.lang.String, com.tencent.mm.plugin.appbrand.page.wd, com.tencent.mm.plugin.appbrand.page.i3, com.tencent.mm.plugin.appbrand.page.u4):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        if (v5Var == null) {
            return false;
        }
        boolean a17 = gf.y0.a(mo52154x9a3f0ba2(), str);
        if (!v5Var.p2() && !a17) {
            return true;
        }
        if (!v5Var.p2() || !a17) {
            return false;
        }
        ((java.util.LinkedList) this.f168057p0).pollFirst();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 d(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, java.util.concurrent.Callable callable) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.APP_LAUNCH == wdVar && mo52154x9a3f0ba2().Z1()) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.m(getContext(), this);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4
    public boolean e(java.lang.String str) {
        boolean z17;
        if (!mo52154x9a3f0ba2().q2()) {
            if (mo52154x9a3f0ba2().C0().K1() && p0()) {
                mo52154x9a3f0ba2().C0().Z1();
            }
            k91.h hVar = mo52154x9a3f0ba2().m0().f387288y;
            java.lang.String[] strArr = hVar.f387129b;
            if (((strArr.length == 1 && u46.a.b(strArr, "skyline")) || u46.l.c(hVar.f387128a, "skyline")) && !nd1.j0.f72944x24728b.equals(str) && p0()) {
                return true;
            }
        }
        boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.f159108a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.class) {
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.f159109b;
        }
        if (z17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k5(this, str));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public boolean e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.APP_LAUNCH == wdVar && ((java.lang.Boolean) ((jz5.n) mo52154x9a3f0ba2().f167722u2.f156487c).mo141623x754a37bb()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public boolean g0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.a(mo52154x9a3f0ba2());
        boolean[] zArr = {super.g0(w2Var), !mo52154x9a3f0ba2().e3(), !mo52154x9a3f0ba2().q2(), true, !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(mo52154x9a3f0ba2())};
        for (int i17 = 0; i17 < 5; i17++) {
            if (!zArr[i17]) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[%s,%s]->shouldShowActionBarHomeButton: test fail cause #[%d] condition", w2Var.m52222x74292566(), w2Var.mo14683xad58292c(), java.lang.Integer.valueOf(i17));
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public void h() {
        synchronized (this.f168057p0) {
            this.f168057p0.forEach(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12506x599d1f0());
            ((java.util.LinkedList) this.f168057p0).clear();
        }
        super.h();
    }

    public final void o0() {
        if (m52169xfdaa7672() == null || m52169xfdaa7672().mo14682x9dee9c37() == null) {
            return;
        }
        if (mo52154x9a3f0ba2().g2() == 1118) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12558x591103cd c12558x591103cd = mo52154x9a3f0ba2().l2() == null ? null : mo52154x9a3f0ba2().l2().f169329o;
            if (c12558x591103cd != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "recommendStatObj is got");
                java.lang.String str = c12558x591103cd.f169313h;
                if (!android.text.TextUtils.isEmpty(str)) {
                    java.lang.String str2 = c12558x591103cd.f169314i;
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        this.V = str + "?" + str2;
                        this.P = true;
                        this.T = java.lang.System.currentTimeMillis();
                    }
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    this.V = mo52154x9a3f0ba2().t0();
                } else {
                    this.V = str;
                }
                this.P = true;
                this.T = java.lang.System.currentTimeMillis();
            }
        }
        if (mo52154x9a3f0ba2().g2() == 1162) {
            this.R = true;
            this.T = java.lang.System.currentTimeMillis();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ve.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) view);
        }
    }

    public final boolean p0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = m52169xfdaa7672();
        if (m52169xfdaa7672 != null && (mo14682x9dee9c37 = m52169xfdaa7672.mo14682x9dee9c37()) != null && mo14682x9dee9c37.p2()) {
            return true;
        }
        gf.n2 n2Var = (gf.n2) mo52154x9a3f0ba2().p0(gf.n2.class, false);
        return n2Var != null && n2Var.b();
    }

    public final void q0(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 u4Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(937, z17 ? 5 : 1);
        mo52154x9a3f0ba2().R.g(str, wdVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q5(this, u4Var, wdVar, str, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, java.lang.String str) {
        boolean a17 = gf.y0.a(mo52154x9a3f0ba2(), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = null;
        if (!android.text.TextUtils.isEmpty(this.f168058x0) && !a17) {
            synchronized (this.f168057p0) {
                java.util.Iterator it = this.f168057p0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) it.next();
                    if (n7Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.md) {
                        it.remove();
                        n7Var = n7Var2;
                        break;
                    }
                }
            }
            return n7Var != null ? n7Var : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.md(this.f168058x0);
        }
        if (a17) {
            mo52154x9a3f0ba2().C0().Z1();
        }
        synchronized (this.f168057p0) {
            java.util.Iterator it6 = this.f168057p0.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) it6.next();
                if (!(a17 || n7Var3.p2()) || (a17 && n7Var3.p2())) {
                    it6.remove();
                    n7Var = n7Var3;
                    break;
                }
            }
        }
        if (n7Var == null) {
            return a17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.I3(mo52154x9a3f0ba2().M2(str)) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7();
        }
        if (a17) {
            mo52154x9a3f0ba2().A0(str);
        }
        return n7Var;
    }

    public final void s0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("MicroMsg.AppBrandPageContainerWC", "preloadSkylineViewInner", new java.lang.Object[0]);
        fh1.s0 s0Var = fh1.x0.I;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f352619a;
        fh1.p0 p0Var = new fh1.p0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineTextureManager", "registerHandler type:".concat("magic-brush-frame"));
        gf.h1.f352619a.put("magic-brush-frame", p0Var);
        com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe c3955x2d990bfe = (com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) mo52154x9a3f0ba2().C0().z1(com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 service = mo52154x9a3f0ba2().C0();
        c3955x2d990bfe.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        gf.l0.d(new gf.r(c3955x2d990bfe, service));
        if (c3955x2d990bfe.f129240c) {
            return;
        }
        synchronized (this.f168057p0) {
            java.util.Iterator it = this.f168057p0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    n7Var = null;
                    break;
                } else {
                    n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) it.next();
                    if (n7Var.p2()) {
                        break;
                    }
                }
            }
        }
        if (n7Var == null) {
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5> it6 = m52175xcedc51a6().iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 next = it6.next();
                if (next.p2()) {
                    n7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) next;
                    break;
                }
            }
        }
        if (n7Var == null) {
            n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.I3(mo52154x9a3f0ba2().M2("preload_skyline"));
            n7Var.A3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadBeforeRuntimeInit);
            synchronized (this.f168057p0) {
                ((java.util.LinkedList) this.f168057p0).add(n7Var);
            }
        }
        n7Var.f168448g2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.H3(mo52154x9a3f0ba2()) ? 1 : 0;
        gf.a2 f07 = ((gf.d0) n7Var.Q1()).f0();
        java.util.Objects.requireNonNull(f07);
        gf.l0.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.j5(this, f07, c3955x2d990bfe));
    }

    /* renamed from: setWAAutoWebViewJs */
    public void m52155xe8687f07(java.lang.String str) {
        this.f168058x0 = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public final boolean t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4 g4Var;
        java.util.Iterator h07 = h0(false);
        do {
            g4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.g4) h07;
            if (!g4Var.hasNext()) {
                return false;
            }
        } while (!(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) g4Var.next()) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.m));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0065, code lost:
    
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3 != false) goto L6;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.m52168x74292566()
            kg1.a r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35233x62683b2b
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(r0, r1)
            java.lang.String r0 = r3.m52168x74292566()
            kg1.a r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35234x1e366c0
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(r0, r1)
            java.lang.String r0 = r3.m52168x74292566()
            kg1.a r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35211xe0ec6e6b
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(r0, r1)
            java.lang.String r0 = r3.m52168x74292566()
            kg1.a r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35212x439b5566
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(r0, r1)
            java.lang.String r0 = r3.m52168x74292566()
            kg1.a r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35235xf4b4a31
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(r0, r1)
            super.u(r4)
            java.lang.String r4 = r3.m52168x74292566()
            kg1.a r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35211xe0ec6e6b
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(r4, r0)
            java.lang.String r4 = r3.m52168x74292566()
            kg1.a r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35234x1e366c0
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(r4, r0)
            java.lang.String r4 = r3.m52168x74292566()
            kg1.a r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35212x439b5566
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(r4, r0)
            java.lang.String r4 = r3.m52168x74292566()
            kg1.a r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35235xf4b4a31
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(r4, r0)
            com.tencent.mm.plugin.appbrand.o6 r4 = r3.mo52154x9a3f0ba2()
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r4 = r4.E0()
            boolean r4 = r4.f128829w
            if (r4 != 0) goto L67
            r3.mo52154x9a3f0ba2()
            boolean r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3
            if (r4 == 0) goto L75
        L67:
            com.tencent.mm.plugin.appbrand.o6 r4 = r3.mo52154x9a3f0ba2()
            com.tencent.mm.plugin.appbrand.page.g5 r0 = new com.tencent.mm.plugin.appbrand.page.g5
            r0.<init>(r3)
            r1 = 10000(0x2710, double:4.9407E-320)
            r4.j(r0, r1)
        L75:
            com.tencent.mm.plugin.appbrand.report.quality.j r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a     // Catch: java.lang.Throwable -> L7b
            r4.a(r3)     // Catch: java.lang.Throwable -> L7b
            goto L87
        L7b:
            r4 = move-exception
            java.lang.String r0 = "pagecontainerInitReport %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = "MicroMsg.AppBrandPageContainerWC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r0, r4)
        L87:
            r3.o0()
            com.tencent.mm.plugin.appbrand.o6 r4 = r3.mo52154x9a3f0ba2()
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5.u(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    public boolean w() {
        if (mo52154x9a3f0ba2().u0().Z) {
            return false;
        }
        return (mo52154x9a3f0ba2().q2() ^ true) || mo52154x9a3f0ba2().u0().L1.c() || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(mo52154x9a3f0ba2());
    }

    @Override // we.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3
    /* renamed from: getRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo52154x9a3f0ba2() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) super.mo52154x9a3f0ba2();
    }

    public d5(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r4 r4Var) {
        super(context, o6Var);
        this.P = false;
        this.Q = false;
        this.R = false;
        this.f168057p0 = new java.util.LinkedList();
        if (!mo52154x9a3f0ba2().q2() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) {
            m52186x725c90a2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.d());
        }
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f168059y0 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1118x5c6729a.C12265x8d23f931>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC$1
            {
                this.f39173x3fe91575 = 839890650;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.p1118x5c6729a.C12265x8d23f931 c12265x8d23f931) {
                if (c12265x8d23f931 == null) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] receive weishi play event");
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5.f168055p1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5.this;
                if (d5Var.M != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed");
                    android.widget.FrameLayout frameLayout = d5Var.M;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo52154x9a3f0ba2 = d5Var.mo52154x9a3f0ba2();
                    mo52154x9a3f0ba2.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e5(d5Var, frameLayout), 300L);
                    d5Var.M = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = mo52154x9a3f0ba2.f156344t;
                    if (vcVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zc) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainerWC", "[weishi] hideWeishiCoverImageIfNeed, hide");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.zc) vcVar).e(true, "", null);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1218xd0d16f79.c.b();
                return false;
            }
        };
        this.f168056l1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.APP_LAUNCH, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.RE_LAUNCH, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REDIRECT_TO};
        m52181xa7687c07(r4Var);
    }
}
