package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI */
/* loaded from: classes9.dex */
public class ActivityC16360x5abdc0d6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f227538J = 0;
    public int D;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 G;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 H;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f227539g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f227540h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f227541i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f227542m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f227543n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f227544o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f227545p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f227546q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227547r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f227548s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f227549t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f227550u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f227551v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f227552w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f227553x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f227554y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.CheckBox f227555z;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 A = null;
    public java.lang.String B = null;
    public java.lang.String C = null;
    public int E = 0;
    public int F = 0;
    public boolean I = false;

    public void V6() {
        this.A = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.h0(this));
        int i17 = this.D;
        if (i17 == 3) {
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q5(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3), false);
        } else if (i17 == 4) {
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q5(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), 4, getIntent().getStringExtra("key_wxapi_sign"), getIntent().getStringExtra("key_wxapi_package_name")), false);
        } else {
            try {
                java.lang.String str = this.B;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                this.C = android.net.Uri.parse(str).getQueryParameter("sendid");
            } catch (java.lang.Exception unused) {
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
                finish();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyBusiReceiveUI", "sendid null & finish");
            } else {
                m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5(this.C, this.B, this.D, getIntent().getStringExtra("packageExt")), false);
            }
        }
        W6(0, "");
    }

    public final void W6(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "markResult resultCode:%d errMsg:%s", java.lang.Integer.valueOf(i17), str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_errmsg", str);
        setResult(i17, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (this.I) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "finish from normalBusiLuckyMoney");
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559435eq, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570773bu3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f227548s = findViewById(com.p314xaae8f345.mm.R.id.iy_);
        this.f227539g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.iyd);
        this.f227540h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iye);
        this.f227542m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iya);
        this.f227541i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iyi);
        this.f227543n = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iyb);
        this.f227544o = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j6h);
        this.f227545p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.iyl);
        this.f227546q = findViewById(com.p314xaae8f345.mm.R.id.iy9);
        this.f227547r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iy8);
        this.f227549t = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.iym);
        this.f227550u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iyk);
        this.f227551v = findViewById(com.p314xaae8f345.mm.R.id.iyf);
        this.f227552w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iyg);
        this.f227553x = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iyn);
        this.f227554y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iyc);
        this.f227555z = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.iyo);
        this.f227545p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i0(this));
        mo67598xf0aced2e(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2) {
                W6(i18, intent != null ? intent.getStringExtra("key_result_errmsg") : "");
                finish();
            }
        } else if (i18 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 12, 0, 0, 0, 3, stringExtra);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n6(stringExtra, this.C, 1, "v1.0"));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.B = getIntent().getStringExtra("key_native_url");
        this.D = getIntent().getIntExtra("key_way", 5);
        this.F = getIntent().getIntExtra("key_static_from_scene", 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nativeurl=");
        java.lang.String str = this.B;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", mWay=");
        sb6.append(this.D);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", sb6.toString());
        V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 10, 0, 0, 0, 1);
        mo43517x10010bd5();
        m66163x14f40144(980);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.A;
        if (u3Var != null && u3Var.isShowing()) {
            this.A.dismiss();
        }
        m66169xf6ff5b27(980);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null || !intent.hasExtra("key_is_realname_verify_process")) {
            return;
        }
        if (intent.getIntExtra("realname_verify_process_ret", 0) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process succ");
            V6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process cancel");
            W6(-1, "");
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 h0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 h0Var2;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h0 h0Var3;
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5) {
            if (i17 == 0 && i18 == 0) {
                this.G = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5) m1Var;
                at4.k1 k1Var = new at4.k1();
                k1Var.f66558xf7c5f050 = this.B;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var = this.G;
                k1Var.f66556xfcd83239 = s5Var.f227163y;
                k1Var.f66555x2592af31 = s5Var.f227155q;
                k1Var.f66562xd3086e30 = s5Var.f227156r;
                ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo11260x413cb2b4(k1Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var2 = this.G;
                this.C = s5Var2.f227150i;
                this.E = s5Var2.f227163y;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(13050, java.lang.Integer.valueOf(this.F), 1, this.G.f227161w);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.v() && (h0Var3 = this.G.B) != null && h0Var3.f226837d != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "is not atomic luckymoney, go to LuckyMoneyBusiReceiveUIV2");
                    this.I = true;
                    android.content.Intent intent = getIntent();
                    if (intent == null) {
                        intent = new android.content.Intent();
                    }
                    intent.putExtra("key_sendid", this.C);
                    intent.putExtra("key_type", this.E);
                    intent.putExtra("key_lucky_money_busi_receive_resp", this.G.f227164z);
                    intent.setClass(mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.pay.ui.ActivityC19189xb47cac76.class);
                    startActivityForResult(intent, 2);
                    mo67598xf0aced2e(8);
                    return true;
                }
                this.I = false;
                if (this.G.f227156r == 2) {
                    W6(-1, "");
                    m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(this.C, 11, 0, this.B, "v1.0"), false);
                } else {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.A;
                    if (u3Var != null && u3Var.isShowing()) {
                        this.A.hide();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.u(this.f227539g, this.G.f227152n, null, true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227540h, this.G.f227154p);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.u(this.f227549t, this.G.f227158t, null, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var3 = this.G;
                    if (s5Var3.f227156r == 1 || (i19 = s5Var3.f227155q) == 4 || i19 == 5 || i19 == 1) {
                        g0Var.d(11701, 11, 0, 0, 0, 3);
                        this.f227541i.setVisibility(4);
                        this.f227542m.setText(this.G.f227157s);
                        this.f227543n.setVisibility(8);
                        this.f227544o.setVisibility(8);
                        if (this.E == 1) {
                            this.f227550u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.k0(this));
                            this.f227550u.setVisibility(0);
                        } else {
                            this.f227550u.setVisibility(8);
                        }
                    } else {
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s5Var3.f227161w)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var4 = this.G;
                            java.lang.String str2 = s5Var4.f227161w;
                            if (s5Var4.f227162x == 1) {
                                this.f227555z.setVisibility(8);
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "show checkbox for " + this.G.f227161w);
                                if (this.G.f227159u == 1) {
                                    this.f227555z.setChecked(true);
                                } else {
                                    this.f227555z.setChecked(false);
                                }
                                this.f227555z.setText(this.G.f227160v);
                            }
                        }
                        this.f227543n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j0(this));
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G.f227157s)) {
                            this.f227541i.setVisibility(8);
                        } else {
                            this.f227541i.setText(this.G.f227157s);
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G.f227153o)) {
                            this.f227542m.setVisibility(8);
                        } else {
                            this.f227542m.setText(this.G.f227153o);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.B(this.f227548s, null);
                    android.view.View m78513xc2a54588 = m78513xc2a54588();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return true;
            }
        } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5) {
            this.f227543n.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.H(this.f227544o);
            if (i17 == 0 && i18 == 0) {
                W6(-1, "");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5) m1Var;
                at4.k1 k1Var2 = new at4.k1();
                k1Var2.f66558xf7c5f050 = this.B;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = r5Var.f227123t;
                k1Var2.f66556xfcd83239 = e1Var.f226767d;
                k1Var2.f66561xb3f4ee96 = e1Var.f226778q;
                k1Var2.f66563xee5f688b = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var2 = r5Var.f227123t;
                k1Var2.f66555x2592af31 = e1Var2.f226768e;
                k1Var2.f66562xd3086e30 = e1Var2.A;
                if (k1Var2.f66561xb3f4ee96 > 0) {
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo11260x413cb2b4(k1Var2);
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(r5Var.f227125v)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "should intercept");
                    mo67598xf0aced2e(8);
                    new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(this).b(r5Var.f227125v, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l0(this));
                    return true;
                }
                if (r5Var.f227116m != 2) {
                    this.f227541i.setVisibility(4);
                    this.f227542m.setText(r5Var.f227117n);
                    this.f227543n.setVisibility(8);
                    this.f227544o.setVisibility(8);
                    if (this.E != 1) {
                        this.f227550u.setVisibility(8);
                        return true;
                    }
                    this.f227550u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.r0(this, r5Var));
                    this.f227550u.setVisibility(0);
                    return true;
                }
                if (r5Var.f227120q <= 1 || !((h0Var = r5Var.f227121r) == null || h0Var.f226837d == 1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can not atomic go detail");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_sendid", r5Var.f227114h);
                    intent2.putExtra("key_static_from_scene", this.F);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = r5Var.f227124u;
                    if (c19088xa4b300c1 != null) {
                        intent2.putExtra("key_realname_guide_helper", c19088xa4b300c1);
                    }
                    try {
                        intent2.putExtra("key_detail_info", r5Var.f227123t.mo14344x5f01b1f6());
                        intent2.putExtra("key_jump_from", 2);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e17.getLocalizedMessage());
                    }
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0) > 0) {
                        z17 = true;
                        intent2.putExtra("play_sound", true);
                    } else {
                        z17 = true;
                    }
                    j45.l.j(mo55332x76847179(), "luckymoney", ".ui.LuckyMoneyBusiDetailUI", intent2, null);
                    finish();
                    return z17;
                }
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.iyj);
                android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, -findViewById.getHeight());
                translateAnimation.setDuration(400L);
                translateAnimation.setFillAfter(true);
                translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.m0(this, findViewById));
                findViewById.startAnimation(translateAnimation);
                this.f227547r.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(r5Var.f227119p / 100.0d));
                this.f227540h.setText(r5Var.f227115i);
                this.f227541i.setVisibility(8);
                this.f227542m.setVisibility(8);
                android.view.View view = this.f227546q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f227543n.setVisibility(8);
                this.f227544o.setVisibility(8);
                this.f227553x.setText(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5Var.f227122s) ? r5Var.f227122s : getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnx));
                this.f227554y.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 12, 0, 0, 0, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "totalNum:" + r5Var.f227120q);
                if (r5Var.f227120q > 1 || ((h0Var2 = r5Var.f227121r) != null && h0Var2.f226837d == 1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can atomic");
                    this.H = r5Var.f227124u;
                    this.f227553x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p0(this, r5Var));
                } else {
                    this.f227553x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.q0(this));
                }
                this.f227553x.setVisibility(0);
                return true;
            }
            if (i18 == 416) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.A;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.A.hide();
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                this.f227543n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c3t);
                return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.d(this, i18, str, m1Var, bundle, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.g0(this), 1005);
            }
        } else {
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n6) {
                if (i17 != 0 || i18 != 0) {
                    db5.e1.T(this, str);
                    return true;
                }
                db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 12, 0, 0, 0, 4);
                finish();
                return true;
            }
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.q5) {
                if (i17 == 0 && i18 == 0) {
                    m66164x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5(this.C, this.B, this.D, getIntent().getStringExtra("packageExt")));
                    return true;
                }
            } else if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.A;
                if (u3Var3 != null && u3Var3.isShowing()) {
                    this.A.hide();
                }
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) m1Var;
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.setClass(mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16359x81eae2a6.class);
                    try {
                        intent3.putExtra("key_detail_info", v5Var.f227198h.mo14344x5f01b1f6());
                        intent3.putExtra("key_jump_from", 2);
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e18.getLocalizedMessage());
                    }
                    intent3.putExtra("key_native_url", this.B);
                    intent3.putExtra("key_sendid", this.C);
                    intent3.putExtra("key_static_from_scene", this.F);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent3);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                    return true;
                }
            }
        }
        if (i17 == 0 && i18 == 0) {
            return false;
        }
        W6(2, str);
        return false;
    }
}
