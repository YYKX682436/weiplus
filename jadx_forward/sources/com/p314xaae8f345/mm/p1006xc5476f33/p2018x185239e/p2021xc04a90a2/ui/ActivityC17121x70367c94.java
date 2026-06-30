package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI */
/* loaded from: classes9.dex */
public class ActivityC17121x70367c94 extends com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f238145y0 = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public android.widget.TextView C;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 D;
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 E;
    public android.widget.RelativeLayout F;
    public android.widget.TextView G;
    public android.widget.RelativeLayout H;
    public android.widget.LinearLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f238146J;
    public android.widget.TextView K;
    public android.widget.RelativeLayout L;
    public android.widget.TextView M;
    public java.lang.String N;
    public double P;
    public java.lang.String Q;
    public int R;
    public java.lang.String U;
    public android.content.Intent V;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f238147d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f238148e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f238149f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238150g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238151h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238152i;

    /* renamed from: m, reason: collision with root package name */
    public int f238153m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f238155o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f238156p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f238158q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238159r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238160s;

    /* renamed from: t, reason: collision with root package name */
    public int f238161t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f238162u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ScrollView f238163v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f238164w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f238165x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f238167y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f238168z;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f238154n = new java.util.ArrayList();
    public int S = 0;
    public int T = 0;
    public final java.util.Map W = new java.util.HashMap();
    public final java.util.Map X = new java.util.HashMap();
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d Y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5709xac465b98>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI.1
        {
            this.f39173x3fe91575 = 251598728;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5709xac465b98 c5709xac465b98) {
            java.lang.String str = c5709xac465b98.f136029g.f89550a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "MobilePayCheckEvent reqKey:%s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94.this;
            java.util.HashMap hashMap = (java.util.HashMap) activityC17121x70367c94.W;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2) hashMap.get(str);
            hashMap.size();
            if (b2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "no data for: %s", str);
            } else {
                gm0.j1.d().g(new sw3.j(str, b2Var.f238178a, b2Var.f238179b, b2Var.f238180c, b2Var.f238181d, b2Var.f238182e, b2Var.f238183f, b2Var.f238184g));
            }
            java.util.Map map = activityC17121x70367c94.X;
            if (map == null || !((java.util.HashMap) map).containsKey(str)) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2 b2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2) ((java.util.HashMap) activityC17121x70367c94.W).get(str);
            java.lang.String str2 = b2Var2 != null ? b2Var2.f238178a : "";
            if (((java.lang.Boolean) ((java.util.HashMap) map).get(str)).booleanValue()) {
                activityC17121x70367c94.Y6(7, str2);
                return false;
            }
            activityC17121x70367c94.Y6(6, str2);
            return false;
        }
    };
    public int Z = 0;

    /* renamed from: p0, reason: collision with root package name */
    public final java.lang.Runnable f238157p0 = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.e1(this);

    /* renamed from: x0, reason: collision with root package name */
    public final tw3.a f238166x0 = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.l1(this);

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17121x70367c94.Q)) {
            activityC17121x70367c94.f238146J.setVisibility(8);
            activityC17121x70367c94.K.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hyc);
            activityC17121x70367c94.K.setVisibility(0);
            return;
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(activityC17121x70367c94.mo55332x76847179());
        java.lang.String string = activityC17121x70367c94.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574357i05);
        java.lang.String string2 = activityC17121x70367c94.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9z, activityC17121x70367c94.Q, string);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activityC17121x70367c94, string2);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(i17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(activityC17121x70367c94.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)), i17.length() - string.length(), i17.length(), 34);
        activityC17121x70367c94.f238146J.setText(spannableStringBuilder);
        activityC17121x70367c94.K.setVisibility(8);
        activityC17121x70367c94.f238146J.setVisibility(0);
    }

    public final void W6(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b c7056xe1fb940b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b();
        c7056xe1fb940b.f143654d = i17;
        c7056xe1fb940b.k();
    }

    public final void X6(boolean z17, boolean z18) {
        m83099x5406100e(new sw3.k(this.f238147d, this.f238148e, this.f238158q, this.P, this.Q, this.R, this.f238160s, this.f238159r, z17, this.f238162u, z18), true);
    }

    public final void Y6(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7057xf29162c5 c7057xf29162c5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7057xf29162c5();
        c7057xf29162c5.f143657d = i17;
        c7057xf29162c5.f143658e = c7057xf29162c5.b("ReqKey", str, true);
        c7057xf29162c5.k();
    }

    public final void Z6(sw3.k kVar) {
        r45.rp6 rp6Var = kVar.f495009t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2((rp6Var == null ? null : rp6Var).f466621o, (rp6Var == null ? null : rp6Var).f466622p, (rp6Var == null ? null : rp6Var).f466623q, this.f238147d, kVar.f495010u, (rp6Var == null ? null : rp6Var).f466625s, this.f238148e, (rp6Var == null ? null : rp6Var).f466624r, kVar.f495011v, kVar.f495012w, kVar.f495013x);
        java.util.Map map = this.W;
        if (rp6Var == null) {
            rp6Var = null;
        }
        ((java.util.HashMap) map).put(rp6Var.f466621o, b2Var);
    }

    public final void a7(int i17) {
        m83133x1e3567d1();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0(this);
        java.lang.String str = this.f238155o;
        java.lang.String str2 = this.f238156p;
        b0Var.f239174b = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.z1(this, i17);
        android.view.View inflate = android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.ccc, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ht7);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.g6u);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.cgi)).b(str);
        textView.setText(str2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxh);
        aVar.L = inflate;
        ck5.f b17 = ck5.f.b(editText);
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1;
        b17.f124094f = 1;
        b17.f124093e = 1;
        b17.f124089a = false;
        b17.d(null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.u(b0Var, editText), 200L);
        aVar.f293265v = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxd);
        aVar.W = -2141754475;
        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.v(b0Var, editText);
        aVar.Z = false;
        aVar.f293266w = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj);
        aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.w(b0Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        editText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.x(b0Var, editText, j0Var));
    }

    public final void b7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() reqKey:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2 b2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.b2) ((java.util.HashMap) this.W).get(str);
        if (b2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() strut == null fail!!");
            return;
        }
        if (b2Var.f238186i) {
            ((java.util.HashMap) this.X).put(str, java.lang.Boolean.valueOf(b2Var.f238187j));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        c19760x34448d56.f273647m = str;
        c19760x34448d56.f273642e = 56;
        c19760x34448d56.f273644g = tw3.b.f504012a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("extinfo_key_1", b2Var.f238178a);
        bundle.putString("extinfo_key_2", b2Var.f238179b);
        bundle.putString("extinfo_key_3", b2Var.f238180c);
        bundle.putString("extinfo_key_4", b2Var.f238183f);
        bundle.putInt("extinfo_key_5", b2Var.f238181d);
        bundle.putString("extinfo_key_6", b2Var.f238184g);
        bundle.putString("extinfo_key_7", b2Var.f238182e);
        bundle.putInt("extinfo_key_8", b2Var.f238185h);
        bundle.putString("extinfo_key_9", this.f238149f);
        bundle.putString("extinfo_key_10", this.f238150g);
        bundle.putString("extinfo_key_11", str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.N)) {
            bundle.putString("extinfo_key_12", getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwv, this.f238149f, this.N));
        }
        c19760x34448d56.f273655u = bundle;
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "isKindaEnable: %s，isKindaMobileRemittanceEnable ：%s", bool, bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "startPay() for kinda");
        m83114xe5d7a18f();
        mo48627xce38d9a();
        android.content.Intent intent = new android.content.Intent(mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17119xa7d39434.class);
        this.V = intent;
        intent.putExtras(bundle);
        m83137x918cb44a();
        ((h45.q) i95.n0.c(h45.q.class)).mo24830x8e9ecb12(mo55332x76847179(), c19760x34448d56);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c2_;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01fa  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isHandleAutoShowNormalStWcKb */
    public boolean mo48628x7c5cc589() {
        return this.f238164w.o();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "reqcode=" + i17 + ", resultCode=" + i18);
        if (i17 == 1) {
            boolean z17 = i18 == -1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "processResult() isOk:%s", java.lang.Boolean.valueOf(z17));
            if (z17) {
                finish();
            } else if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.b(intent)) {
                finish();
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.c(intent);
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f238147d = getIntent().getStringExtra("key_rcvr_openid");
        this.f238148e = getIntent().getStringExtra("key_rcvr_token");
        this.f238149f = getIntent().getStringExtra("key_wx_name");
        this.f238150g = getIntent().getStringExtra("key_real_name");
        this.f238151h = getIntent().getStringExtra("key_phone");
        this.f238152i = getIntent().getStringExtra("key_img_url");
        this.f238153m = getIntent().getIntExtra("key_amount_remind_bit", 4);
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17112xb8098213> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("key_delay_options");
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            java.util.List list = this.f238154n;
            int i17 = sw3.h.f495001w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.cgi.C17112xb8098213 c17112xb8098213 : parcelableArrayListExtra) {
                r45.bd0 bd0Var = new r45.bd0();
                bd0Var.f452206d = c17112xb8098213.f238087d;
                bd0Var.f452207e = c17112xb8098213.f238088e;
                arrayList.add(bd0Var);
            }
            ((java.util.ArrayList) list).addAll(arrayList);
        }
        this.f238155o = getIntent().getStringExtra("key_check_name_wording");
        this.f238156p = getIntent().getStringExtra("key_check_name_mask");
        this.f238158q = getIntent().getStringExtra("key_get_rcvr_ext");
        this.f238159r = getIntent().getStringExtra("key_timestamp_ms");
        mo43517x10010bd5();
        m83090x14f40144(2878);
        m83090x14f40144(2694);
        this.Y.mo48813x58998cd();
        this.Z = 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.Y.mo48814x2efc64();
        m83121xf6ff5b27(2878);
        m83121xf6ff5b27(2694);
        java.util.Map map = this.W;
        if (map != null) {
            ((java.util.HashMap) map).clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l
    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "onDialogDismiss()");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f238157p0, 300L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f238164w;
        if (c22894x55bf3223 == null || !c22894x55bf3223.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "onPause()");
        if (this.f238164w.p()) {
            return;
        }
        this.Z = 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.AbstractActivityC17115xe34aa8, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "onResume()");
        if (this.Z == 3 && mo48628x7c5cc589()) {
            m83136xb67ebaa8();
        }
        this.Z = 2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " scenetype:" + m1Var.mo808xfb85f7b0());
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof sw3.b) {
                sw3.b bVar = (sw3.b) m1Var;
                r45.dp6 dp6Var = bVar.f494994t;
                if (dp6Var == null) {
                    dp6Var = null;
                }
                if (dp6Var == null) {
                    db5.e1.E(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk), "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gww), false, null).show();
                } else {
                    if (dp6Var.f454185h != null) {
                        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.d(mo55332x76847179(), dp6Var.f454185h, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.f1(this));
                    } else if (dp6Var.f454181d == 0) {
                        this.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gxf);
                        this.C.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a09));
                        this.C.setOnClickListener(null);
                        this.C.setOnTouchListener(null);
                        this.f238168z.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxe, dp6Var.f454184g));
                        this.N = dp6Var.f454184g;
                        this.f238160s = dp6Var.f454183f;
                        if (bVar.f494995u == 2) {
                            X6(true, true);
                            Y6(2, "");
                        } else {
                            android.widget.Toast m125854x26a183b = dp.a.m125854x26a183b(mo55332x76847179(), "", 0);
                            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
                            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568889oe2)).setImageResource(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gxg));
                            m125854x26a183b.setGravity(17, 0, 0);
                            m125854x26a183b.setView(inflate);
                            m125854x26a183b.show();
                            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.g1(this, m125854x26a183b, m1Var), 750L);
                        }
                        W6(9);
                    } else {
                        db5.e1.E(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dp6Var.f454182e) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : dp6Var.f454182e, "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gww), false, null).show();
                    }
                    this.f238160s = dp6Var.f454183f;
                }
                return true;
            }
            if (m1Var instanceof sw3.k) {
                sw3.k kVar = (sw3.k) m1Var;
                r45.rp6 rp6Var = kVar.f495009t;
                if (rp6Var == null) {
                    rp6Var = null;
                }
                if (rp6Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder placeOrderResp is null");
                    return true;
                }
                int i19 = rp6Var.f466613d;
                if (i19 == 0) {
                    this.f238162u = rp6Var.f466626t;
                    this.U = rp6Var.f466627u;
                    if (rp6Var.f466616g != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show jump_win");
                        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.d(mo55332x76847179(), rp6Var.f466616g, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.i1(this));
                    } else if (rp6Var.f466617h != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show verify dilog");
                        a7(2);
                        Y6(1, "");
                    } else {
                        r45.po5 po5Var = rp6Var.f466618i;
                        tw3.a aVar = this.f238166x0;
                        if (po5Var != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show remind_win");
                            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.d(mo55332x76847179(), rp6Var.f466618i, rp6Var.f466621o, aVar);
                            Z6(kVar);
                        } else if (rp6Var.f466619m != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show check_win");
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                            r45.e30 e30Var = rp6Var.f466619m;
                            java.lang.String str2 = rp6Var.f466621o;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.j1(this, rp6Var);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.k1 k1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.k1(this, rp6Var);
                            if (e30Var == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() checkWin == null");
                            } else if (e30Var.f454499g == null || e30Var.f454500h == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() left_button == null || right_button == null");
                            } else {
                                java.util.LinkedList linkedList = e30Var.f454498f;
                                if (linkedList == null || linkedList.isEmpty()) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpItemUtil", "showCheckWin() check_item == null || check_item.isEmpty()");
                                } else {
                                    android.view.View inflate2 = android.view.LayoutInflater.from(mo55332x76847179).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570134yb, (android.view.ViewGroup) null);
                                    ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.nrk)).setText(e30Var.f454497e);
                                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate2.findViewById(com.p314xaae8f345.mm.R.id.hhb);
                                    for (int i27 = 0; i27 < linkedList.size(); i27++) {
                                        android.view.View inflate3 = android.view.LayoutInflater.from(mo55332x76847179).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570133ya, (android.view.ViewGroup) null);
                                        ((android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.f566913hi0)).setText(((r45.f44) linkedList.get(i27)).f455539d);
                                        ((android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.hjw)).setText(((r45.f44) linkedList.get(i27)).f455540e);
                                        linearLayout.addView(inflate3);
                                    }
                                    db5.e1.I(mo55332x76847179, false, e30Var.f454496d, inflate2, e30Var.f454500h.f462581d, e30Var.f454499g.f462581d, new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x(mo55332x76847179, e30Var, str2, k1Var), new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.y(mo55332x76847179, e30Var, str2, j1Var)).show();
                                }
                            }
                            Z6(kVar);
                        } else if (rp6Var.f466620n != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder show dup_pay_win");
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                            r45.oo5 oo5Var = rp6Var.f466620n;
                            java.lang.String str3 = rp6Var.f466621o;
                            if (oo5Var == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpItemUtil", "showRemindWin3() remindWin3 == null");
                            } else {
                                java.lang.String str4 = oo5Var.f463931d;
                                java.lang.String str5 = oo5Var.f463933f.f462581d;
                                java.lang.String str6 = oo5Var.f463932e.f462581d;
                                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z zVar = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.z(mo55332x768471792, oo5Var, str3, aVar);
                                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a0 a0Var = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a0(mo55332x768471792, oo5Var, str3, aVar);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                                aVar2.f293242a = "";
                                aVar2.f293262s = str4;
                                aVar2.f293265v = str5;
                                aVar2.E = zVar;
                                aVar2.f293266w = str6;
                                aVar2.F = a0Var;
                                aVar2.A = false;
                                aVar2.B = true;
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x768471792, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                                j0Var.e(aVar2);
                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar2.f293256m;
                                if (d0Var != null) {
                                    d0Var.a(j0Var.f293370r);
                                }
                                j0Var.show();
                                db5.e1.a(mo55332x768471792, j0Var);
                            }
                            Z6(kVar);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "go to start pay");
                            Z6(kVar);
                            b7(rp6Var.f466621o);
                        }
                    }
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "NetSceneMobileRemitPlaceOrder ret_code:%s ret_code_action:%s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(rp6Var.f466615f));
                db5.e1.E(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rp6Var.f466614e) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkk) : rp6Var.f466614e, "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gww), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.h1(this, rp6Var)).show();
            }
        } else {
            if (!(m1Var instanceof sw3.b)) {
                boolean z17 = m1Var instanceof sw3.k;
            }
            if (i18 == 0) {
                db5.e1.E(mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwx) : str, "", getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gww), false, null).show();
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.d2.class);
    }
}
