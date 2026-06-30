package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class x0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 implements sx4.z {

    /* renamed from: i2, reason: collision with root package name */
    public static final /* synthetic */ int f221481i2 = 0;
    public android.view.View E1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19413xc8846f1c F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public boolean J1;
    public boolean K1;
    public final sx4.v L1;
    public final com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc M1;
    public long N1;
    public long O1;
    public final sx4.d0 P1;
    public long Q1;
    public final java.util.Map R1;
    public android.view.ViewGroup S1;
    public boolean T1;
    public boolean U1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l V1;
    public boolean W1;
    public boolean X1;
    public boolean Y1;
    public long Z1;

    /* renamed from: a2, reason: collision with root package name */
    public long f221482a2;

    /* renamed from: b2, reason: collision with root package name */
    public long f221483b2;

    /* renamed from: c2, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f221484c2;

    /* renamed from: d2, reason: collision with root package name */
    public java.lang.String f221485d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f221486e2;

    /* renamed from: f2, reason: collision with root package name */
    public long f221487f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.w0 f221488g2;

    /* renamed from: h2, reason: collision with root package name */
    public zq1.v f221489h2;

    public x0(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        h53.i iVar;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.Q1 = 0L;
        this.R1 = new java.util.HashMap();
        this.U1 = false;
        this.W1 = false;
        this.X1 = true;
        this.Y1 = false;
        this.Z1 = 0L;
        this.f221482a2 = 0L;
        this.f221483b2 = 0L;
        this.f221484c2 = null;
        this.f221486e2 = false;
        this.f221487f2 = 0L;
        this.f221489h2 = null;
        this.L1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.m0(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "initWebPageEnd, __Time__， time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String string = bundle.getString("rawUrl");
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(string);
        this.M1 = b17;
        b17.f149708e = P();
        b17.B = java.lang.System.currentTimeMillis();
        this.P1 = R(string);
        android.os.Bundle bundle2 = this.f488190n;
        java.lang.String string2 = bundle2.getString("rawUrl");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            android.net.Uri parse = android.net.Uri.parse(string2);
            java.lang.String queryParameter = com.p314xaae8f345.mm.ui.bk.C() ? parse.getQueryParameter("darkmode_nav_color") : parse.getQueryParameter("nav_color");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                try {
                    bundle2.putInt("customize_status_bar_color", android.graphics.Color.parseColor("#" + queryParameter));
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        java.lang.String N = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N(string);
        if (N != null && N.equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy))) {
            this.f488188i.f488152e = td.c.f499116a;
        }
        S().f523297l = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k0(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0) this.f488188i.h()).m64583x20631b29(string);
        uw4.n nVar = this.f263713p;
        if (nVar != null) {
            nVar.mo14660x738236e6(";(function(){return window.devicePixelRatio})();", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.o());
        }
        this.f263713p.mo120128x74041feb(new h53.m(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this)), "WxGameJsCoreNative");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_game_create_jscore_android, false)) {
            java.util.LinkedList linkedList = h53.j.f360588m;
            synchronized (h53.j.class) {
                java.util.LinkedList linkedList2 = h53.j.f360588m;
                h53.j jVar = (h53.j) linkedList2.peek();
                if (jVar != null && (iVar = jVar.f360591h) != h53.i.destroyed) {
                    if (iVar == h53.i.stopped) {
                        jVar.f360591h = h53.i.inited;
                        jVar.f360589f.a(new h53.f(jVar, "onResume"));
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsCore", "create new");
                linkedList2.addFirst(new h53.j());
            }
            N("created", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this), string);
        }
        this.f221488g2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.n0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public void C(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "onUrlLoadingFinished, url = %s, __Time__, time = %d", str, java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k.b(this.f263713p);
        this.f263719t.m74262xd4333bda(true);
        w();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x2 x2Var = this.D;
        if (x2Var != null) {
            x2Var.c0("rawUrl", str);
            x2Var.t0(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = this.F;
        if (c16092xbbe22aef != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            c16092xbbe22aef.m65140xca029dad(str);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.F);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.M1;
        if (c10723x8ab106bc.F == 0) {
            c10723x8ab106bc.F = currentTimeMillis;
        }
        sx4.d0 d0Var = this.P1;
        if (d0Var.f495119e == 0) {
            d0Var.f495119e = currentTimeMillis;
        }
        try {
            if (!this.H1) {
                this.H1 = true;
                jj0.a.a().b(7, java.net.URLEncoder.encode(s()), "", currentTimeMillis - d0Var.f495115a);
            }
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.v0.a(this.f488188i, this.P);
        sx4.u uVar = this.L1.f495199f;
        uVar.getClass();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        sx4.v vVar = uVar.f495193a;
        vVar.f495196c = currentTimeMillis2;
        vVar.f495197d = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public void D(int i17, java.lang.String str, java.lang.String str2) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "onReceivedError, errorCode: %d, description: %s, failingUrl: %s , time: %d", java.lang.Integer.valueOf(i17), str, str2, java.lang.Long.valueOf(currentTimeMillis));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("errcode", i17);
            jSONObject.put("errurl", str2);
            jj0.a.a().b(8, java.net.URLEncoder.encode(s()), java.net.URLEncoder.encode(jSONObject.toString()), currentTimeMillis - this.P1.f495115a);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public void E(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onUrlRedirect, reqUrl = %s, full = %s", str, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
            this.P = str2;
        }
        uw4.n nVar = this.f263713p;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x(str2, map, nVar));
        }
        sd.o0 m170656x86b160dd = this.f263713p.m170656x86b160dd();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w(m170656x86b160dd, str2));
        }
        boolean y17 = y(str);
        sd.o0 o0Var = this.f488188i;
        if (!y17 && !this.T && !this.f263714p0 && !this.Z) {
            o0Var.f488166i.mo32269xc77ccada();
            if (map == null || map.size() <= 0) {
                o0Var.j(str2);
            } else {
                o0Var.f488166i.mo32266x141096a9(str2, map);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0) o0Var.h();
        b0Var.S = str2;
        b0Var.T = map;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, fullUrl is null");
        } else if (android.net.Uri.parse(str2).getHost().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.h0.f221092a = str2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.h0.f221093b = java.lang.System.currentTimeMillis() / 1000;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameUinKeyHolder", "setFullUrlAndHeaders, host is not wxgame");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean equals = str.equals(s());
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.M1;
        if (equals) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "getA8Key end, __Time__, time: %d", java.lang.Long.valueOf(currentTimeMillis));
            c10723x8ab106bc.H = currentTimeMillis;
        }
        if (c10723x8ab106bc.D == 0) {
            c10723x8ab106bc.D = currentTimeMillis;
        }
        sx4.d0 d0Var = this.P1;
        if (d0Var.f495121g == 0) {
            d0Var.f495121g = java.lang.System.currentTimeMillis();
        }
        uw4.n nVar2 = this.f263713p;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || nVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.u0(str2, map, nVar2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.v0.a(o0Var, str2);
        this.J1 = true;
    }

    public final void L() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f221485d2)) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270741l).mo141623x754a37bb()).booleanValue()) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270745p && com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270746q != 2) {
                b0Var.v(9L);
                b0Var.a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270734e, true, 5, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.u.f271000d);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270745p = false;
            java.lang.String str = this.f221485d2;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "startCheck fail bizUserName is null");
                return;
            }
            if (this.f221489h2 == null) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                this.f221489h2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h(9);
            }
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h) this.f221489h2).a(str);
        }
    }

    public void M(java.lang.Runnable runnable) {
        if (!this.Y1) {
            this.Y1 = true;
            this.f263713p.mo14660x738236e6("window.performance.getEntriesByName('first-contentful-paint')[0].startTime", new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.s0(this, runnable));
        } else if (runnable != null) {
            runnable.run();
        }
    }

    @Override // sx4.z
    public java.util.Map M1() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(21, P());
        hashMap.put(22, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        hashMap.put(23, java.lang.String.valueOf(y7.c.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        java.lang.String s17 = s();
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            hashMap.put(24, fp.s0.b(s17 == null ? "" : s17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.UnsupportedEncodingException unused) {
        }
        hashMap.put(25, java.lang.Integer.valueOf(y(s17) ? 1 : 0));
        hashMap.put(26, 1);
        if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c1) {
            hashMap.put(27, 1);
        } else {
            hashMap.put(27, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda = S().f523291f;
        hashMap.put(28, c19543x781c5eda != null ? c19543x781c5eda.f269909f : "");
        S().getClass();
        hashMap.put(29, vz4.b.a());
        return hashMap;
    }

    public final void N(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (h53.j.d() != null) {
            h53.j d17 = h53.j.d();
            d17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameJsCore", "onPageLifeChanged, state:[%s], pageId:[%s], url:[%s]", str, str2, str3);
            d17.f360589f.a(new h53.g(d17, str, str3, str2));
        }
    }

    public java.lang.String O() {
        return this.f488190n.getString("game_pre_inject_data");
    }

    public java.lang.String P() {
        return (hashCode() & Integer.MAX_VALUE) + "_" + (s().hashCode() & Integer.MAX_VALUE);
    }

    public java.lang.String Q() {
        java.lang.String string = this.f488190n.getString("key_extData");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("extData", string);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebPage", e17.getMessage());
        }
        return jSONObject.toString();
    }

    public sx4.d0 R(java.lang.String str) {
        return sx4.d0.b(str);
    }

    public vz4.x S() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0) this.f263713p).m64580x8eda3bb();
    }

    public void T(boolean z17) {
        android.content.Context context = this.f488143d;
        if (z17) {
            this.f263719t.setVisibility(8);
            this.f263726y.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.c.a(((android.app.Activity) context).getWindow(), true);
        } else {
            this.f263719t.setVisibility(0);
            this.f263726y.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2411x36f002.c.a(((android.app.Activity) context).getWindow(), false);
        }
        android.os.Bundle bundle = this.f488190n;
        if (bundle.getBoolean("show_full_screen", false)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bundle.getString("game_hv_menu_appid"))) {
                this.f263726y.setVisibility(0);
                return;
            }
            if (this.F1 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19413xc8846f1c c19413xc8846f1c = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19413xc8846f1c(context);
                this.F1 = c19413xc8846f1c;
                c19413xc8846f1c.a(this.f263717r, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.t0(this));
            }
            this.f263726y.setVisibility(8);
        }
    }

    public void U() {
        F(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean V(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.s()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L2a
            com.tencent.mm.game.report.api.GameWebPerformanceInfo r0 = r5.M1
            long r1 = r0.G
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2a
            long r1 = java.lang.System.currentTimeMillis()
            r0.G = r1
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r6, r0}
            java.lang.String r1 = "MicroMsg.GameWebPage"
            java.lang.String r2 = "startGetA8Key, url: %s, time: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
        L2a:
            com.tencent.mm.plugin.webview.permission.d r0 = r5.f263711J
            java.util.HashSet r0 = r0.f264914a
            boolean r0 = r0.contains(r6)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L39
            r5.Q = r2
            goto L5d
        L39:
            com.tencent.mm.plugin.webview.permission.d r0 = r5.f263711J
            com.tencent.mm.plugin.webview.permission.a r3 = r5.B1
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L61
            r4 = -1
            com.tencent.mm.plugin.webview.permission.i r3 = r0.t(r6, r1, r4, r3)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r0)
            com.tencent.mm.plugin.webview.permission.i r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.i.WILL_GET
            if (r3 != r0) goto L4b
            r1 = r2
        L4b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = "MicroMsg.LuggageMMWebPage"
            java.lang.String r2 = "startGetA8Key, url: %s, ret: %b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r6)
            r5.Q = r1
        L5d:
            return r1
        L5e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L61
            throw r6     // Catch: java.lang.Throwable -> L61
        L61:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0.V(java.lang.String):boolean");
    }

    @Override // sd.u0, sd.k
    public void b(java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "load url, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        sx4.d0 d0Var = this.P1;
        if (d0Var.f495117c == 0) {
            d0Var.f495117c = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.v0 v0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.v0(this, str, bundle);
        if (com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "activeIpcTask, service is alive");
            v0Var.run();
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = new com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19267xf1e5d915 c19267xf1e5d915 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19267xf1e5d915();
        c19267xf1e5d915.f263761f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c0(this, currentTimeMillis, c19267xf1e5d915, c19762x487075a, v0Var, str);
        c19267xf1e5d915.d();
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.e0(this, c19762x487075a, v0Var), 1000L);
    }

    @Override // sd.k
    public void d() {
        tx4.l lVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        if (this.G1) {
            this.G1 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "onBackground, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f221484c2;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
                this.f221484c2 = null;
            }
            zq1.v vVar = this.f221489h2;
            if (vVar != null) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h) vVar).b();
            }
            M(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.o0(this));
            sd.x xVar = this.f488145f;
            int indexOf = ((sd.u) xVar).f488186a.f488196d.indexOf(this);
            if (indexOf <= 1 || !(((sd.k) ((sd.u) xVar).f488186a.f488196d.get(indexOf - 1)) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onBackground");
                this.X = false;
                B("onPause");
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u) this.f263719t;
                a53.b bVar = uVar.G;
                if (bVar != null && (k0Var = bVar.f264172c) != null) {
                    k0Var.u();
                }
                b53.f fVar = uVar.H;
                if (fVar != null && (lVar = fVar.f99620c) != null) {
                    lVar.b();
                }
                this.f263713p.mo74095xb01dfb57();
                this.U = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x2 x2Var = this.D;
                if (x2Var != null) {
                    x2Var.z();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x3 x3Var = this.E;
                if (x3Var != null) {
                    x3Var.A();
                }
                java.util.Iterator it = this.R1.values().iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b) it.next()).d();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "report page background");
                e53.b.c(hashCode());
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.M1;
                long j17 = c10723x8ab106bc.I;
                long j18 = this.N1;
                c10723x8ab106bc.I = j17 + (currentTimeMillis - j18);
                this.O1 += currentTimeMillis - j18;
                this.L1.f495199f.b();
                if (!this.X1 && currentTimeMillis - this.f221487f2 > 1000) {
                    e53.e.b((int) ((currentTimeMillis - this.N1) / 1000), u(), this.f263728y1);
                    this.f221487f2 = currentTimeMillis;
                }
                N("background", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this), null);
            }
        }
    }

    @Override // sd.k
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "onDestroy, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        boolean z17 = this.V;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x3 x3Var = this.E;
        if (!z17) {
            this.V = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onDestroy");
            this.A1.mo48814x2efc64();
            this.B.f264202j = null;
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264159a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264161c.remove(this);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264162d.remove(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this));
            }
            this.f263717r.removeAllViews();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            sd.o0 o0Var = this.f488188i;
            o0Var.l(context);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.x2 x2Var = this.D;
            if (x2Var != null) {
                x2Var.o0();
            }
            if (x3Var != null) {
                if (x3Var.s()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = x3Var.f381610a;
                    java.lang.String str = c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar = this.f263711J;
                    java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z2.f264254a;
                    if (!hashMap.containsKey(str)) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.k2.f264080a;
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sd.q0.f488178a;
                        o0Var.l(context2);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = o0Var.f488151d;
                        java.util.Iterator it = concurrentHashMap2.keySet().iterator();
                        while (it.hasNext()) {
                            o0Var.f488167m.f426053e.remove((java.lang.String) it.next());
                        }
                        concurrentHashMap2.clear();
                        o0Var.f488165h = null;
                        o0Var.f488152e = null;
                        o0Var.f488168n = true;
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = sd.q0.f488178a;
                        concurrentHashMap3.put(java.lang.Integer.valueOf(o0Var.hashCode()), o0Var);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sd.q0.class.getSimpleName(), "stash, holding size: %d", java.lang.Integer.valueOf(concurrentHashMap3.size()));
                        int intValue = java.lang.Integer.valueOf(o0Var.hashCode()).intValue();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.l.f264960a.put(java.lang.Integer.valueOf(o0Var.hashCode()), dVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallManager", "onMultiTaskItemClick, stash, ballKey = %s, ticket = %d", str, java.lang.Integer.valueOf(intValue));
                        hashMap.put(str, java.lang.Integer.valueOf(intValue));
                    }
                } else {
                    B("onDestroy");
                }
            }
            if (this.F != null) {
                ((d73.i) i95.n0.c(d73.i.class)).Ef(this.F);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar2 = this.f263711J;
            dVar2.f264929p = true;
            dVar2.f264915b.clear();
            this.f263719t.d();
            android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = this.f263725x1;
            if (accessibilityStateChangeListener != null) {
                this.f263715p1.removeAccessibilityStateChangeListener(accessibilityStateChangeListener);
            }
        }
        e53.b.a(hashCode());
        this.L1.f495199f.a();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.M1;
        c10723x8ab106bc.f149706J = currentTimeMillis;
        if (!this.f488190n.getBoolean("from_bag", false)) {
            jj0.a a17 = jj0.a.a();
            if (a17 != null) {
                a17.e(c10723x8ab106bc);
            }
            try {
                if (!this.I1) {
                    this.I1 = true;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    long j17 = this.Q1;
                    sx4.d0 d0Var = this.P1;
                    if (j17 == 0) {
                        jSONObject.put("render_duration", 0);
                    } else {
                        jSONObject.put("render_duration", j17 - d0Var.f495115a);
                    }
                    jj0.a.a().b(9, java.net.URLEncoder.encode(s()), java.net.URLEncoder.encode(jSONObject.toString()), java.lang.System.currentTimeMillis() - d0Var.f495115a);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        java.util.Collection values = ((java.util.HashMap) this.R1).values();
        if (values != null && values.size() > 0) {
            java.util.Iterator it6 = values.iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b) it6.next()).f();
            }
            if (x3Var.s()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = x3Var.f381610a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z2.a(c16601x7ed0e40c2 != null ? c16601x7ed0e40c2.f66791xc8a07680 : null);
            }
        }
        N("destroyed", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this), null);
    }

    @Override // sd.k
    public void g() {
        m53.i5 p17;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264160b || this.G1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "onForeground, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        this.G1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = this.f263719t;
        if ((y1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u) && this.f221484c2 == null) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u) y1Var;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5195x575f32c5> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5195x575f32c5>(uVar) { // from class: com.tencent.mm.plugin.game.luggage.page.GameWebPage$BizFinderLineStatusChangedEventListenerImpl

                /* renamed from: d, reason: collision with root package name */
                public final java.lang.ref.WeakReference f221400d;

                {
                    super(com.p314xaae8f345.mm.app.a0.f134821d);
                    this.f221400d = new java.lang.ref.WeakReference(uVar);
                    this.f39173x3fe91575 = -1230141771;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5195x575f32c5 c5195x575f32c5) {
                    java.lang.ref.WeakReference weakReference = this.f221400d;
                    if (weakReference == null || weakReference.get() == null) {
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "callback");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u uVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u) weakReference.get();
                    uVar2.getClass();
                    uVar2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.s(uVar2));
                    return false;
                }
            };
            this.f221484c2 = abstractC20980x9b9ad01d;
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        e53.b.b(hashCode());
        L();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc c10723x8ab106bc = this.M1;
        if (c10723x8ab106bc.f149726z == 0) {
            c10723x8ab106bc.f149726z = java.lang.System.currentTimeMillis();
        }
        this.N1 = java.lang.System.currentTimeMillis();
        this.L1.f495199f.d();
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264159a) {
            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264161c;
            if (linkedList.contains(this)) {
                linkedList.remove(this);
                linkedList.addLast(this);
            } else {
                linkedList.add(this);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264162d.put(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this), this);
            }
        }
        if (!this.X) {
            this.X = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebPage", "onForeground");
            if (this.W) {
                p(false);
            } else {
                l();
                T(this.f488190n.getBoolean("show_full_screen", false));
                if (!this.R) {
                    int i17 = this.f488190n.getInt("customize_status_bar_color");
                    this.S = i17;
                    if (i17 == 0 && (p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.p()) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.f405328d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.f405330f)) {
                        try {
                            if (com.p314xaae8f345.mm.ui.bk.C()) {
                                this.S = android.graphics.Color.parseColor(p17.f405330f);
                            } else {
                                this.S = android.graphics.Color.parseColor(p17.f405328d);
                            }
                        } catch (java.lang.IllegalArgumentException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebPage", "parse color: " + e17.getMessage());
                        }
                        if (this.S == 0) {
                            this.S = b3.l.m9702x7444d5ad(this.f488143d, com.p314xaae8f345.mm.R.C30859x5a72f63.f560119bk);
                        }
                    }
                }
                if (!this.K1) {
                    this.K1 = true;
                    G();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var2 = this.f263719t;
                java.lang.Integer num = y1Var2.B;
                if (num != null) {
                    vj5.h hVar = y1Var2.f264225d;
                    hVar.f519248u = null;
                    vj5.a.a(hVar, num.intValue(), !y1Var2.C);
                }
                B("onResume");
                this.f263713p.mo74096x57429eec();
                this.U = true;
                r(0);
                if (this.Y) {
                    this.D.x();
                    this.E.z();
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u) this.f263719t).l();
            }
        }
        this.f221483b2 = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.HashMap) this.R1).values().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b) it.next()).g();
        }
        N("foreground", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.a(this), null);
        this.X1 = false;
    }

    @Override // sd.u0
    public void i() {
        if (this.U) {
            this.f221482a2 += java.lang.System.currentTimeMillis() - this.f221483b2;
        }
        M(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.p0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0, sd.u0
    public android.view.View k() {
        android.view.View k17 = super.k();
        android.view.View inflate = android.view.LayoutInflater.from(this.f488143d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgw, (android.view.ViewGroup) this.f263729z, false);
        this.E1 = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "initContentView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "initContentView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f263729z.addView(this.E1, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "create vie end, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        return k17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public android.view.View m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.u(this);
        this.f263719t = uVar;
        return uVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public boolean v(int i17) {
        td.c cVar = this.f488188i.f488152e;
        td.c cVar2 = td.c.f499116a;
        if ((cVar == null ? cVar2 : cVar) == cVar2) {
            return true;
        }
        if (cVar == null) {
            cVar = cVar2;
        }
        return cVar != td.c.f499117b && this.f263711J.h(u()).d(i17) == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public void w() {
        android.view.View view = this.E1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/page/GameWebPage", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // sx4.z
    public java.util.Map w5() {
        java.util.HashMap hashMap = new java.util.HashMap();
        sx4.d0 c17 = sx4.d0.c(s());
        if (c17 != null) {
            hashMap.put(30, java.lang.Long.valueOf(c17.f495117c - c17.f495116b));
            hashMap.put(31, java.lang.Long.valueOf(c17.f495118d - c17.f495116b));
            hashMap.put(32, java.lang.Long.valueOf(c17.f495119e - c17.f495118d));
            hashMap.put(33, java.lang.Long.valueOf(c17.f495121g - c17.f495120f));
            hashMap.put(34, java.lang.Long.valueOf(c17.f495123i - c17.f495122h));
            hashMap.put(45, java.lang.Long.valueOf(c17.f495124j));
            hashMap.put(50, java.lang.Long.valueOf(c17.f495125k));
            hashMap.put(38, java.lang.Long.valueOf(c17.f495126l));
            hashMap.put(39, java.lang.Long.valueOf(c17.f495127m));
            hashMap.put(40, java.lang.Long.valueOf(c17.f495128n));
            hashMap.put(41, java.lang.Long.valueOf(c17.f495129o));
            hashMap.put(42, java.lang.Long.valueOf(c17.f495130p));
            hashMap.put(43, java.lang.Long.valueOf(c17.f495131q));
            hashMap.put(44, java.lang.Long.valueOf(c17.f495132r));
            hashMap.put(51, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            hashMap.put(52, java.lang.Long.valueOf(c17.f495133s));
            hashMap.put(70, java.lang.Long.valueOf(c17.f495116b - c17.f495124j));
        }
        vz4.x S = S();
        if (!S.f523289d) {
            S.f523302q = null;
        }
        hashMap.put(49, java.lang.Integer.valueOf(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(S.f523302q) ? 1 : 0));
        hashMap.put(53, java.lang.Integer.valueOf(this.X1 ? 1 : 0));
        hashMap.put(54, java.lang.Integer.valueOf(this.W1 ? 1 : 0));
        hashMap.put(55, java.lang.Long.valueOf(this.Z1));
        hashMap.put(56, java.lang.Long.valueOf(this.f221482a2));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public boolean y(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0) this.f263713p;
        boolean z17 = b0Var.Q;
        vz4.x xVar = b0Var.P;
        if (!z17) {
            xVar.e(str, true, false);
            b0Var.Q = true;
        }
        return xVar.d(str);
    }
}
