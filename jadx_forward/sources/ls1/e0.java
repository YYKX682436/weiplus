package ls1;

/* loaded from: classes8.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 {

    /* renamed from: i2, reason: collision with root package name */
    public static final ls1.c f402507i2 = new ls1.c(null);
    public final r45.wm6 N1;
    public final jz5.g O1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 P1;
    public long Q1;
    public long R1;
    public long S1;
    public boolean T1;
    public boolean U1;
    public final long V1;
    public final jz5.g W1;
    public java.lang.String X1;
    public java.lang.String Y1;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final java.lang.String f402508a2;

    /* renamed from: b2, reason: collision with root package name */
    public final java.util.List f402509b2;

    /* renamed from: c2, reason: collision with root package name */
    public final java.lang.String f402510c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f402511d2;

    /* renamed from: e2, reason: collision with root package name */
    public final java.util.HashSet f402512e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f402513f2;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f402514g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.lang.Runnable f402515h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r45.wm6 tmplParams, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 viewWV) {
        super(viewWV, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6(), new zg0.k2(null, false, false, false, false, 0, false, 127, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmplParams, "tmplParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWV, "viewWV");
        this.N1 = tmplParams;
        this.O1 = jz5.h.b(new ls1.d(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 i0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0();
        i0Var.f175801a = tmplParams;
        this.P1 = i0Var;
        this.T1 = true;
        this.V1 = 5000L;
        this.W1 = jz5.h.b(new ls1.w(this, viewWV));
        this.f402508a2 = "__tmpl_webview_inject_data";
        ls1.f0 f0Var = viewWV instanceof ls1.f0 ? (ls1.f0) viewWV : null;
        if (f0Var != null) {
            f0Var.m146262xe1737d19(new ls1.a(this));
            f0Var.m146261x66e22616(new ls1.b(this));
        }
        java.util.List list = this.f263498y0;
        list.addAll(kz5.c0.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$UpdateData
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812
            /* renamed from: verify */
            public boolean mo54393xcf208879() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 m74139x143f1b92 = m74139x143f1b92();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m74139x143f1b92, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return m74141x42891314(-102) && m74141x42891314(-111);
            }
        }, new ls1.i(this)), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$StartPreload
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812
            /* renamed from: verify */
            public boolean mo54393xcf208879() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 m74139x143f1b92 = m74139x143f1b92();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m74139x143f1b92, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return m74141x42891314(((ls1.e0) m74139x143f1b92).f263466i0);
            }
        }, new ls1.k(this)), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$PreloadNext
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812
            /* renamed from: verify */
            public boolean mo54393xcf208879() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 m74139x143f1b92 = m74139x143f1b92();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m74139x143f1b92, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return m74141x42891314(-130);
            }
        }, new ls1.l(this)), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$NotifyAuth
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812
            /* renamed from: verify */
            public boolean mo54393xcf208879() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 m74139x143f1b92 = m74139x143f1b92();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m74139x143f1b92, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return m74141x42891314(-102) && ((m74141x42891314(((ls1.e0) m74139x143f1b92).f263464h0) && m74141x42891314(-121)) || m74141x42891314(-122));
            }
        }, new ls1.m(this)), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController$ForceUrl
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.AbstractC19235x5ccbd812
            /* renamed from: verify */
            public boolean mo54393xcf208879() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 m74139x143f1b92 = m74139x143f1b92();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m74139x143f1b92, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.MpWebViewController");
                return (m74141x42891314(-103) || m74141x42891314(-113) || m74141x42891314(-124)) && m74141x42891314(((ls1.e0) m74139x143f1b92).f263466i0);
            }
        }, new ls1.n(this))));
        this.f402509b2 = list;
        this.f402510c2 = "__tmpl_webview_inject_data.__getString()";
        this.f402512e2 = new java.util.HashSet();
        this.f402515h2 = new ls1.p(this);
    }

    public static final java.lang.String G1(nw4.y2 y2Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("performance", (java.lang.String) y2Var.f422323a.get("performance"));
        jSONObject.put("injectPageDataResult", (java.lang.String) y2Var.f422323a.get("injectPageDataResult"));
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean A0() {
        return false;
    }

    public final java.lang.String B1() {
        return (java.lang.String) ((jz5.n) this.O1).mo141623x754a37bb();
    }

    public final r45.zb5 C1() {
        return (r45.zb5) ((jz5.n) this.W1).mo141623x754a37bb();
    }

    public final void D1(java.lang.String forceUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forceUrl, "forceUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "loadForceUrl");
        this.P1.f175824l0 = true;
        H1();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k0.a().getBoolean("preload_tmpl_test_noredir", false)) {
            return;
        }
        M();
        this.f263454c0 = true;
        V0(E1(forceUrl), true, 8);
    }

    public final java.lang.String E1(java.lang.String str) {
        return hy4.i.b(hy4.i.d(hy4.i.d(hy4.i.d(str, "fasttmpl_flag", false, 2, null), "fasttmpl_type", false, 2, null), "fasttmpl_fullversion", false, 2, null), "forceh5", "1");
    }

    public final void F1(java.lang.String str) {
        hy4.k0 k0Var = this.V;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 i0Var = this.P1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "notifyPageInfo pageInfo:" + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("performance"));
            long optLong = jSONObject2.optLong("compileTime");
            long optLong2 = jSONObject2.optLong("receivePageDataTimestamp");
            long optLong3 = jSONObject2.optLong("firstScreenTimestamp");
            long optLong4 = jSONObject2.optLong("firstScreenTime");
            k0Var.a("firstScreenTimestamp", optLong3);
            k0Var.a("firstScreenTime", optLong4);
            i0Var.f175827n = optLong;
            i0Var.f175829o = optLong2;
            i0Var.f175821k = optLong3;
            i0Var.f175825m = optLong4;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("injectPageDataResult", "fail"), "ok")) {
                this.f402513f2 = true;
                i0Var.X = true;
                i0Var.l(new ls1.t(this));
                ax4.a.b(this.N1.f470833o, 131, 1, true);
                ax4.a.c(108);
            } else {
                i0Var.f175824l0 = true;
                I(-124);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "notifyPageInfo fail");
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(B1(), e17, "notifyPageInfo", new java.lang.Object[0]);
            i0Var.f175824l0 = true;
            I(-124);
        }
        i0Var.B = java.lang.System.currentTimeMillis();
        J1();
        H1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    /* renamed from: G0 */
    public void e(int i17, java.lang.String reqUrl, java.lang.String fullUrl, r45.s83 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (i17 == 0) {
            this.f263497y = fullUrl;
            Q0(fullUrl);
            P0(fullUrl);
            this.C = fullUrl;
        }
        super.e(i17, reqUrl, fullUrl, response);
        if (i17 == 0) {
            this.X1 = fullUrl;
            java.util.Map g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d.g(response.f467095x);
            ax4.a.b(this.N1.f470833o, 117, 1, true);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 i0Var = this.P1;
            i0Var.f175836t = currentTimeMillis;
            i0Var.W = true;
            J1();
            i0Var.l(new ls1.u(this));
            K1(reqUrl, fullUrl, g17);
            I(-121);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean H(java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.N1.f470827f)) {
            return true;
        }
        return str != null && r26.i0.y(str, "file://", false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public void H0() {
        char c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "onStartLoad");
        android.content.Intent d07 = d0();
        B1();
        this.B = d07;
        this.R1 = java.lang.System.currentTimeMillis();
        boolean z17 = true;
        this.T1 = d07.getBooleanExtra(com.p314xaae8f345.mm.ui.w2.f292723c, true);
        this.Q1 = d07.getLongExtra(com.p314xaae8f345.mm.ui.w2.f292724d, 0L);
        km0.a aVar = ((km0.c) gm0.j1.p().a()).f390524e;
        java.lang.String stringExtra = d07.getStringExtra(com.p314xaae8f345.mm.ui.w2.f292725e);
        java.lang.String stringExtra2 = d07.getStringExtra("rawUrl");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f263449a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 i0Var = this.P1;
        if (stringExtra2 == null || stringExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(B1(), "rawUrl is null, " + com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.w.d(d07));
            ax4.a.c(151);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(17260, 1, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.w.d(d07));
            z17 = false;
        } else {
            boolean z18 = aVar.f390519f < this.Q1;
            i0Var.U = z18;
            ax4.a.c(z18 ? 104 : 103);
            int intExtra = d07.getIntExtra(com.p314xaae8f345.mm.ui.w2.f292729i, -1);
            long j17 = this.Q1;
            int myPid = android.os.Process.myPid();
            long j18 = aVar.f390514a;
            jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.f176021a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(intExtra);
            sb6.append('-');
            sb6.append(j17);
            int hashCode = sb6.toString().hashCode();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getInt("_tmpl_lastest_mm_open", 0) == hashCode) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(myPid);
                sb7.append('-');
                sb7.append(j18);
                int hashCode2 = sb7.toString().hashCode();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().getInt("_tmpl_lastest_mp_open", 0) == hashCode2) {
                    c17 = 2;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().putInt("_tmpl_lastest_mp_open", hashCode2);
                    c17 = 1;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z1.g().putInt("_tmpl_lastest_mm_open", hashCode);
                c17 = 0;
            }
            if (c17 == 1) {
                i0Var.V = 1;
                this.Q1 = aVar.f390514a;
            } else if (c17 == 2) {
                i0Var.V = 2;
                this.Q1 = -1L;
            }
            i0Var.Q = C1().f473425q;
            i0Var.R = C1().f473426r;
            i0Var.S = nw4.v2.c(c22633x83752a59);
            i0Var.T = C1().f473428t;
            i0Var.C = aVar.f390514a;
            i0Var.D = aVar.f390515b;
            i0Var.E = aVar.f390516c;
            i0Var.F = 0L;
            i0Var.G = 0L;
            i0Var.H = 0L;
            i0Var.I = aVar.f390517d;
            i0Var.f175800J = aVar.f390518e;
            i0Var.K = aVar.f390519f;
            i0Var.f175819j = this.Q1;
            i0Var.f175831p = this.R1;
            i0Var.f175828n0 = C1().f473419h;
            java.lang.String stringExtra3 = d07.getStringExtra("srcUsername");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.h(this, stringExtra, C1(), stringExtra3, new ls1.v(this));
        }
        if (!z17) {
            E0();
            return;
        }
        i0Var.getClass();
        r45.wm6 wm6Var = this.N1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wm6Var, "<set-?>");
        i0Var.f175801a = wm6Var;
        java.lang.String i17 = i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i17, "<set-?>");
        i0Var.f175805c = i17;
        boolean p07 = p0(-102);
        i0Var.M = p07;
        i0Var.L = this.U1;
        i0Var.f175820j0 = c22633x83752a59.m120143xc7aa84d5().name();
        ax4.a.c(p07 ? 106 : 105);
        z1(Y(), i(), this.V0, e42.d0.clicfg_android_webview_menu_search_ai_mp);
        U0(i(), false);
        if (this.f402513f2) {
            return;
        }
        H1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "check notifyPage");
        this.f402514g2 = false;
        b0().mo77786xdceccb8e(this.f402515h2, this.V1);
    }

    public final void H1() {
        B1();
        b0().mo50300x3fa464aa(this.f402515h2);
        this.f402514g2 = true;
    }

    public final void I1(java.lang.String contentId, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentId, "contentId");
        B1();
        i();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.m(i());
        java.lang.String i17 = i();
        this.f263497y = i17;
        Q0(i17);
        P0(i17);
        this.C = i17;
        this.Y1 = contentId;
        this.Q1 = j17;
        this.S1 = j18;
        I(-111);
    }

    public final void J1() {
        B1();
        hy4.k0 k0Var = this.V;
        long b17 = k0Var.b("onInjectStart", 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.i0 i0Var = this.P1;
        i0Var.f175839w = b17;
        i0Var.f175840x = k0Var.b("onInjectEnd", 0L);
        i0Var.f175842z = k0Var.b("onTmplLoadStart", 0L);
        i0Var.A = k0Var.b("onTmplLoadEnd", 0L);
        i0Var.f175837u = k0Var.b("onCreateStart", 0L);
        i0Var.f175838v = k0Var.b("onCreateEnd", 0L);
        i0Var.N = this.f402511d2;
        i0Var.f175841y = k0Var.b("onWebInjectEnd", 0L);
        java.lang.String m81403xce19f7b8 = this.f263449a.m81403xce19f7b8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m81403xce19f7b8, "getRandomStr(...)");
        i0Var.f175803b = m81403xce19f7b8;
        i0Var.O = p0(-102);
    }

    public final void K1(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "[updatePageAuth]reqUrl:" + str + " fullUrl:" + str2 + " httpHeader:" + map);
        java.lang.String g17 = this.f263449a.mo120153xd15cf999().g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getUserAgentString(...)");
        map.put("User-agent", g17);
        g0().L = new org.json.JSONObject(map).toString();
        g0().K = android.net.Uri.parse(str2).getQueryParameter("pass_ticket");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public java.util.List S() {
        return this.f402509b2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public void S0(boolean z17) {
        T0(z17, null);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        if (e17 != null) {
            e17.g(new ls1.x(this, e17));
        }
        pw4.c cVar = this.f263471l;
        if (cVar.f440263s == null) {
            cVar.f440263s = new java.util.HashMap();
        }
        java.util.Map map = cVar.f440263s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        if (map.get("photoAccount") == null) {
            java.util.Map map2 = cVar.f440263s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ox.g gVar = (ox.g) ((tk.o) i95.n0.c(tk.o.class));
            jSONObject.put("enable", gVar.Di());
            jSONObject.put("picTextNameVersion", gVar.Ui() ? 1 : 0);
            org.json.JSONObject put = jSONObject.put("supportViewPhotoAcct", gVar.Ui() ? 1 : 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(put);
            map2.put("photoAccount", put);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean U0(java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, this.N1.f470827f) && super.U0(url, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean X() {
        return p0(-112) || p0(-113);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean Y0(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return super.Y0(url) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, this.N1.f470827f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean Z0(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return super.Y0(url) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, this.N1.f470827f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean b1() {
        return p0(this.f263468j0) && p0(-102);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void c(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        super.c(i17, reqUrl, i18, i19, errMsg);
        if (i17 == 0) {
            this.X1 = reqUrl;
            I(-122);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean c1() {
        boolean contains;
        synchronized (this) {
            contains = this.D0.contains(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.C19237xf32a40b1.class).g());
        }
        return contains && p0(-121);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0, zg0.q2
    public java.lang.String i() {
        try {
            return r26.i0.x(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0.Q0.a(d0()), "http://", "https://", false, 4, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(B1(), java.lang.String.valueOf(e17.getMessage()));
            E0();
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0, zg0.q2
    public void j(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        super.j(intent);
        S0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r3.f268334d.a(i(), intent));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3, com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        super.n(c27816xac2547f9, str);
        r45.wm6 wm6Var = this.N1;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, wm6Var.f470827f) || p0(-102) || p0(-101)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "checkInject start");
        ax4.a.b(wm6Var.f470833o, 113, 1, true);
        L("JSON.stringify(window.__appmsg_skeleton_success__)", new ls1.o(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f263449a;
        int B = i65.a.B(c22633x83752a59.getContext());
        float g17 = i65.a.g(c22633x83752a59.getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "adjustInnerWidth() screenWidth:" + B + ", density:" + g17);
        if (B > 0 && g17 > 0.0f) {
            int ceil = (int) java.lang.Math.ceil(B / g17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "adjustInnerWidth() innerWidth:" + ceil);
            L("window.innerWidth = " + ceil, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "[onPageReady]");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public void r0() {
        r45.wm6 wm6Var = this.N1;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f263449a;
        E(new ls1.h(wm6Var, c22633x83752a59));
        super.r0();
        c22633x83752a59.mo120128x74041feb(new ls1.q(this), this.f402508a2);
        g0().x0(true);
        g0().f422440u = new ls1.r(this);
        java.lang.String str = wm6Var.f470827f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "WebView-Trace loadTmpl getResourceResponse, requrl:%s, url:%s", str, wm6Var.f470828g);
        java.lang.String initFilePath = wm6Var.f470828g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(initFilePath, "initFilePath");
        B1();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (ls1.c.a(f402507i2, c22633x83752a59, initFilePath) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(B1(), "return intercepted null");
            ax4.a.b(wm6Var.f470833o, 126, 1, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(B1(), "return intercepted success");
            I(this.f263470k0);
            c22633x83752a59.mo32265x141096a9(str);
            I(this.f263468j0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3
    public void r1() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f263449a;
        c22633x83752a59.mo120520x57c53c73(false);
        c22633x83752a59.mo120519x347eaca1(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3
    public boolean v1(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.ui.ActivityC13018x47b52238.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0
    public boolean w0() {
        return p0(this.f263468j0);
    }
}
