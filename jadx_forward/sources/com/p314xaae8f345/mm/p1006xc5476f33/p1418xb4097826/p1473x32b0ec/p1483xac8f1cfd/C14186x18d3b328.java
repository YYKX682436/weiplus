package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd;

/* renamed from: com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC */
/* loaded from: classes3.dex */
public class C14186x18d3b328 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193085d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f193086e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f193087f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f193088g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 f193089h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f193090i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f193091m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f193092n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14187xc0697b6 f193093o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f193094p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f193095q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC$liveStartOtherActivityEventListener$1] */
    public C14186x18d3b328(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f193085d = "MicroMsg.FinderLiveAnchorWithoutAffinityUI";
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f193093o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5496x20db9ceb>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC$liveStartOtherActivityEventListener$1
            {
                this.f39173x3fe91575 = -437996325;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5496x20db9ceb c5496x20db9ceb) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5496x20db9ceb event = c5496x20db9ceb;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328.this.f193092n = true;
                return true;
            }
        };
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085, m158358x197d1fc6(), null);
    }

    public void P6() {
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78583x85ccfe01(8);
        }
        m80379x76847179().getWindow().addFlags(2097280);
        m80379x76847179().getWindow().addFlags(67108864);
        m80379x76847179().getWindow().clearFlags(1024);
        m80379x76847179().getWindow().clearFlags(512);
        m80379x76847179().getWindow().clearFlags(67108864);
        if (m80379x76847179().getResources().getConfiguration().orientation == 2) {
            m80379x76847179().getWindow().getDecorView().setSystemUiVisibility(7942);
            m80379x76847179().getWindow().addFlags(1024);
        } else {
            m80379x76847179().getWindow().getDecorView().setSystemUiVisibility(1792);
        }
        m80379x76847179().getWindow().addFlags(Integer.MIN_VALUE);
        m80379x76847179().getWindow().setStatusBarColor(0);
        m80379x76847179().getWindow().setNavigationBarColor(0);
        m80379x76847179().getWindow().setFormat(-3);
        m80379x76847179().getWindow().setSoftInputMode(51);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(gk2.e r19, dk2.x4 r20) {
        /*
            Method dump skipped, instructions count: 1715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328.Q6(gk2.e, dk2.x4):void");
    }

    public final void R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v = m158365x9616526c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f193089h;
        if (c8Var != null) {
            c8Var.p0();
        }
        qp1.h0.a(true, false, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "tryHideFloatBallWhenEnterPage hideFloatBall");
    }

    public void S6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v, m158365x9616526c())) {
            gk2.e eVar = dk2.ef.I;
            boolean z17 = false;
            if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O1) {
                gk2.e eVar2 = dk2.ef.I;
                if (!(eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).a8())) {
                    if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L6).mo141623x754a37bb()).r()).intValue() == 1 && !this.f193092n)) {
                        return;
                    }
                }
                gk2.e eVar3 = dk2.ef.I;
                if (eVar3 != null && !((mm2.c1) eVar3.a(mm2.c1.class)).U7()) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f193089h;
                    if (c8Var != null) {
                        c8Var.z();
                    }
                    if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(m80379x76847179())) {
                        qp1.h0.b();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "tryShowFloatBallWhenExitPage resumeFloatBall");
                }
            }
        }
    }

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "[LiveLifecycler]uninitBusiness " + this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            k0Var.mo46559xed5f7500();
        }
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        xg4.m.f535979a.b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aym;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            k0Var.mo46548x9d4787cb(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "[LiveLifecycler]onBackPressed " + this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            return k0Var.mo46549x4ceae47d();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        super.mo2275x62f76871(intent);
        if (this.f193090i) {
            T6();
        } else {
            this.f193094p = new te2.w1(this);
        }
        this.f193091m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onConfigurationChanged */
    public void mo2276x50e1c15d(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.mo2276x50e1c15d(newConfig);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "onConfigurationChanged newConfig:" + newConfig);
        zl2.r4 r4Var = zl2.r4.f555483a;
        if ((zl2.r4.f555489g && com.p314xaae8f345.mm.ui.bk.A()) || com.p314xaae8f345.mm.ui.fl.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) k0Var : null;
            if (v1Var != null) {
                sm2.o4 m129723x1ce28c0f = v1Var.m129723x1ce28c0f();
                m129723x1ce28c0f.getClass();
                fm2.a aVar = m129723x1ce28c0f.f101128c;
                if (aVar != null) {
                    org.json.JSONObject m57668xd2eca5dc = aVar.m57668xd2eca5dc();
                    org.json.JSONObject jSONObject = m129723x1ce28c0f.f491162o0;
                    in0.q qVar = m129723x1ce28c0f.f101130e;
                    r1 = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(aVar, m57668xd2eca5dc, jSONObject, qVar != null ? qVar.W0() : null, true, null, 16, null));
                }
                if (com.p314xaae8f345.mm.ui.fl.e()) {
                    pm0.v.X(new sm2.y2(m129723x1ce28c0f));
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, java.lang.Boolean.TRUE)) {
                    pm0.v.X(new sm2.z2(m129723x1ce28c0f));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0916, code lost:
    
        if (((java.lang.Number) ae2.in.f85221a.T().r()).intValue() == 1) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0931, code lost:
    
        if (r0 == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0773, code lost:
    
        if (r4 == null) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0366  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 2406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd.C14186x18d3b328.mo450x3e5a77bb(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "[LiveLifecycler]onDestroy " + this);
        mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8 c8Var = this.f193089h;
        if (c8Var != null) {
            c8Var.o0();
        }
        if (!this.f193091m && !this.f193095q) {
            T6();
            this.f193095q = true;
        }
        ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).wi();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    public void mo2280xc944513d(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "[LiveLifecycler]onNewIntent " + this);
        super.mo2280xc944513d(intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            k0Var.m57724xc944513d(intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "[LiveLifecycler]onPause " + this);
        super.mo2281xb01dfb57();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f193088g;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            k0Var.mo46552x65825f6();
        }
        this.f193090i = true;
        java.lang.Runnable runnable = this.f193094p;
        if (runnable != null) {
            runnable.run();
        }
        this.f193094p = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64 || grantResults[0] == 0 || z2.h.b(m158354x19263085(), "android.permission.ACCESS_FINE_LOCATION")) {
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (currentTimeMillis - j35.u.f("android.permission.ACCESS_FINE_LOCATION", 64) < 300) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity m80379x76847179 = m80379x76847179();
            ((sb0.f) jVar).getClass();
            j35.u.g(m80379x76847179);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.lang.String str = this.f193085d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[LiveLifecycler]onResume " + this);
        this.f193092n = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            k0Var.mo46554xc84dc82d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = this.f193087f;
        if (k0Var2 != null) {
            k0Var2.post(new te2.z1(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[LiveLifecycler]initBusiness " + this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onSaveInstanceState */
    public void mo2285xa71a2260(android.os.Bundle bundle) {
        super.mo2285xa71a2260(bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveLifecycle] onSaveInstanceState ");
        sb6.append(this);
        sb6.append(" curData:");
        dk2.ef efVar = dk2.ef.f314905a;
        sb6.append(dk2.ef.I);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, sb6.toString());
        gk2.e eVar = gk2.e.f354004n;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            en0.g gVar = new en0.g();
            gVar.f336779a = 0;
            gVar.f336781c = e1Var.f410521r.m75942xfb822ef2(0);
            gVar.f336795q = e1Var.f410525v;
            gVar.f336789k = e1Var.f410516m;
            gVar.f336784f = ((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).f410385o;
            gVar.f336790l = ((mm2.c1) e1Var.m147920xbba4bfc0(mm2.c1.class)).V1;
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e a17 = gVar.a();
            dk2.x4 x4Var = new dk2.x4();
            x4Var.f315851l.add(a17);
            dk2.x4.C.b(bundle, x4Var);
            if (bundle != null) {
                r45.h32 h32Var = x4Var.f315840a;
                bundle.putByteArray("KEY_PARAMS_NOTICE", h32Var != null ? h32Var.mo14344x5f01b1f6() : null);
            }
            if (bundle != null) {
                r45.uy1 uy1Var = x4Var.f315841b;
                bundle.putByteArray("KEY_PARAMS_LIVE_TASK_INFO", uy1Var != null ? uy1Var.mo14344x5f01b1f6() : null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193085d, "[LiveLifecycler]onStart " + this + ", activateUIKey:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v);
        super.mo2286xb05099c3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
        if (k0Var != null) {
            k0Var.mo46556x68ac462();
        }
        R6();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Hj();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        java.lang.String str = "[LiveLifecycler]onStop " + this + ", activateUIKey:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v;
        java.lang.String str2 = this.f193085d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        super.mo2287xc39f8281();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c8.f197762v, m158365x9616526c())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = this.f193087f;
            if (k0Var != null) {
                k0Var.mo46558x360802();
            }
            if (m158354x19263085().isChangingConfigurations()) {
                dk2.ef efVar = dk2.ef.f314905a;
                gk2.e eVar = dk2.ef.I;
                mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
                if (c1Var != null) {
                    c1Var.f410331e5 = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onStop: Activity is changing configurations, set releaseUIKeepData = true");
            }
            S6();
        }
    }
}
