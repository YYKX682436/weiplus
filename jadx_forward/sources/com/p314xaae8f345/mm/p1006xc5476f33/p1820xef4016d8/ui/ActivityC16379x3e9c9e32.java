package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI */
/* loaded from: classes9.dex */
public class ActivityC16379x3e9c9e32 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {
    public static final /* synthetic */ int P = 0;
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public android.widget.ImageView C;
    public android.view.View D;
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a E;
    public java.lang.String G;
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 I;

    /* renamed from: J, reason: collision with root package name */
    public int f227855J;
    public boolean K;
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb L;
    public java.lang.String M;
    public final com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.q5 N;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f227856g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f227857h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719 f227858i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f227859m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f227860n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f227861o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f227862p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f227863q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227864r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f227865s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f227866t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f227867u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f227868v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f227869w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f227870x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f227871y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f227872z = null;
    public int F = 0;
    public java.lang.String H = "";

    public ActivityC16379x3e9c9e32() {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.K = false;
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.Cif(this);
    }

    public final void V6(int i17) {
        java.lang.StringBuilder sb6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() localReceiveStatus:%s newStatus:%s", java.lang.Integer.valueOf(this.f227855J), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.I;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() mEmojiInfo == null");
            return;
        }
        int i18 = this.f227855J;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (i18 == i17) {
            return;
        }
        if (i18 == 2) {
            return;
        }
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(f9Var.j());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            int indexOf = sb7.indexOf("<localreceivestatus>");
            if (indexOf <= 0 || indexOf >= sb7.length()) {
                int indexOf2 = sb7.indexOf("<emoji>");
                if (indexOf2 <= 0 || indexOf2 >= sb7.length()) {
                    int indexOf3 = sb7.indexOf("<wcpayinfo>");
                    sb8.append("<emoji><localreceivestatus>");
                    sb8.append(i17);
                    sb8.append("</localreceivestatus></emoji>");
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder(sb7.substring(0, indexOf3));
                    java.lang.String trim = sb7.substring(indexOf3).trim();
                    sb9.append((java.lang.CharSequence) sb8);
                    sb9.append(trim);
                    sb6 = sb9;
                } else {
                    sb8.append("<localreceivestatus>");
                    sb8.append(i17);
                    sb8.append("</localreceivestatus>");
                    int i19 = indexOf2 + 7;
                    sb6 = new java.lang.StringBuilder(sb7.substring(0, i19));
                    java.lang.String trim2 = sb7.substring(i19).trim();
                    sb6.append((java.lang.CharSequence) sb8);
                    sb6.append(trim2);
                }
            } else {
                sb6 = new java.lang.StringBuilder(sb7.substring(0, indexOf + 20));
                java.lang.String substring = sb7.substring(indexOf + 21);
                sb6.append(i17);
                sb6.append(substring);
            }
            this.I.d1(sb6.toString());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.I.m124847x74d37ac6(), this.I);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() success msgXml:%s", sb6);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() Exception:%s", e17.getMessage());
        }
    }

    public final void W6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6(i17, i18, str, str2, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.l(), c01.z1.l(), getIntent().getStringExtra("key_username"), "v1.0", str3), false);
    }

    public final void X6(boolean z17) {
        if (!z17) {
            this.f227870x.setVisibility(0);
            this.f227870x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.hf(this));
            this.f227871y.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnf));
        } else {
            this.f227870x.setVisibility(0);
            ((android.widget.RelativeLayout.LayoutParams) this.f227870x.getLayoutParams()).addRule(3, com.p314xaae8f345.mm.R.id.j4h);
            this.f227871y.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gng));
            this.f227870x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rf(this));
        }
    }

    public final void Y6() {
        this.f227869w.setVisibility(8);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.g6.class))).wi(this.H);
        this.L = wi6;
        if (wi6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showExpression() mEmojiInfo == null ");
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.k(wi6.N0()) > 0 || this.L.k() || this.L.I1()) {
            this.E.setVisibility(0);
            this.E.m43719xc040f7d2(this.L);
            return;
        }
        this.E.setVisibility(8);
        this.f227867u.setVisibility(0);
        this.f227868v.setImageResource(com.p314xaae8f345.mm.R.raw.f80553x3a45498e);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).cj(this.N);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).Zi(this.L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.buu;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo64405x4dab7448(-839716110);
        this.f227857h = findViewById(com.p314xaae8f345.mm.R.id.j4i);
        this.f227858i = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719) findViewById(com.p314xaae8f345.mm.R.id.j4e);
        this.f227859m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567290iy4);
        this.f227860n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4p);
        this.f227861o = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j4f);
        this.f227863q = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j4n);
        this.f227864r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4l);
        this.f227865s = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j4m);
        this.f227862p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4o);
        this.f227866t = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j4k);
        this.C = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j3p);
        this.D = findViewById(com.p314xaae8f345.mm.R.id.j3m);
        this.E = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10448x87c5001a) findViewById(com.p314xaae8f345.mm.R.id.j3f);
        this.f227869w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567334j42);
        this.f227867u = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j3r);
        this.f227868v = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) findViewById(com.p314xaae8f345.mm.R.id.f567217im5);
        this.f227870x = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.iyp);
        this.f227871y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iyq);
        this.f227869w.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jf(this));
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567338j46);
        this.A = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.kf(this));
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567337j45);
        this.B = imageView2;
        imageView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.lf(this));
        mo67598xf0aced2e(8);
        this.f227872z = db5.e1.Q(mo55332x76847179(), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mf(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G = getIntent().getStringExtra("key_username");
        this.H = getIntent().getStringExtra("key_emoji_md5");
        this.I = pt0.f0.Li(this.G, getIntent().getLongExtra("key_msgid", 0L));
        this.f227855J = getIntent().getIntExtra("key_msg_newyear_localreceivestatus", 0);
        this.M = getIntent().getStringExtra("key_native_url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "emojiMd5:" + this.H);
        java.lang.String str = this.M;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        try {
            this.f227856g = parse.getQueryParameter("sendid");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "onCreate() Exception:%s", e17.getMessage());
        }
        mo43517x10010bd5();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f227856g)) {
            finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyNewYearReceiveUI", "sendid null & finish");
            return;
        }
        m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("channelid"), 1), this.f227856g, this.M, 1, "v1.0", ""), false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227872z;
        if (u3Var != null) {
            u3Var.show();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227872z;
        if (u3Var != null && u3Var.isShowing()) {
            this.f227872z.dismiss();
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s5.class))).cj(null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.K) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "onSceneEnd() errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + " netsceneType:" + m1Var.mo808xfb85f7b0());
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6)) {
            if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6)) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f227872z;
            if (u3Var != null && u3Var.isShowing()) {
                this.f227872z.dismiss();
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 != 416) {
                    db5.e1.G(this, android.text.TextUtils.isEmpty(str) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g) : str, null, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.qf(this));
                    return true;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f227872z;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.f227872z.dismiss();
                }
                this.K = true;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNewYearReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.d(this, i18, str, m1Var, bundle, true, null, null, 1004);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6) m1Var;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(f6Var.f226823u)) {
                mo67598xf0aced2e(4);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(this);
                l0Var.f262454a = true;
                l0Var.b(f6Var.f226823u, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b0(l0Var));
                return true;
            }
            int i28 = f6Var.f226819q;
            this.F = i28;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (!(i28 == 1)) {
                android.view.View view = this.D;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.C.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = f6Var.f226813h;
            this.f227864r.setText(e1Var.f226769f);
            java.lang.String o17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(f6Var.f226813h.f226778q / 100.0d);
            this.f227858i.setContentDescription(o17);
            this.f227858i.m66162x70ee0181(o17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719 c16356x97a60719 = this.f227858i;
            c16356x97a60719.f227504x = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.pf(this, f6Var);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.j(c16356x97a60719));
            if (e1Var.f226768e == 4 && !android.text.TextUtils.isEmpty(f6Var.f226813h.f226769f)) {
                this.f227865s.setVisibility(8);
            }
            X6(false);
            mo67598xf0aced2e(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.B(this.f227857h, null);
            V6(2);
            return true;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f227872z;
            if (u3Var3 != null && u3Var3.isShowing()) {
                this.f227872z.dismiss();
            }
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6 l6Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.l6) m1Var;
        this.F = l6Var3.K;
        if (l6Var3.f226964x == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is Sender hb!");
            if (l6Var3.f226959s != 4) {
                this.f227866t.setVisibility(8);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var4 = this.f227872z;
            if (u3Var4 != null && u3Var4.isShowing()) {
                this.f227872z.dismiss();
            }
            if (l6Var3.f226959s != 5) {
                java.lang.String o18 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(l6Var3.f226958r / 100.0d);
                this.f227858i.setContentDescription(o18);
                this.f227858i.m66162x70ee0181(o18);
                this.f227858i.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227860n, l6Var3.f226963w);
                this.f227863q.setVisibility(8);
                this.f227866t.setVisibility(0);
                if (l6Var3.f226959s == 4) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f227861o, this.G);
                    V6(2);
                } else {
                    this.f227861o.setVisibility(8);
                }
                this.f227862p.setText(l6Var3.f226961u);
                this.f227862p.setTextSize(1, 16.0f);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f227866t.getLayoutParams();
                layoutParams.bottomMargin = i65.a.b(this, 82);
                this.f227866t.setLayoutParams(layoutParams);
                this.f227866t.invalidate();
            } else {
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.j4g);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4h)).setText(l6Var3.f226961u);
                ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4h)).setVisibility(0);
                ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4h)).setTextSize(24.0f);
                X6(true);
                V6(1);
            }
            mo67598xf0aced2e(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.B(this.f227857h, null);
            this.A.setVisibility(0);
            this.B.setVisibility(8);
            i19 = 5;
            l6Var = l6Var3;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is receiver hb!");
            if (!android.text.TextUtils.isEmpty(getIntent().getStringExtra("key_username"))) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f227861o, getIntent().getStringExtra("key_username"));
            } else if (!android.text.TextUtils.isEmpty(l6Var3.f226957q)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(this.f227861o, l6Var3.f226957q, l6Var3.f226966z);
            }
            this.f227862p.setTextSize(1, 16.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227862p, l6Var3.f226955o + getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573965gm5));
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f227866t.getLayoutParams();
            layoutParams2.bottomMargin = i65.a.b(this, 30);
            this.f227866t.setLayoutParams(layoutParams2);
            this.f227866t.invalidate();
            this.f227866t.setVisibility(0);
            this.f227863q.setVisibility(8);
            if (l6Var3.f226960t != 0 || (i27 = l6Var3.f226959s) == 4 || i27 == 5 || i27 == 1) {
                i19 = 5;
                l6Var = l6Var3;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var5 = this.f227872z;
                if (u3Var5 != null && u3Var5.isShowing()) {
                    this.f227872z.dismiss();
                }
                if (l6Var.f226959s != 5) {
                    java.lang.String o19 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(l6Var.f226958r / 100.0d);
                    this.f227858i.setContentDescription(o19);
                    this.f227858i.m66162x70ee0181(o19);
                    this.f227858i.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227860n, l6Var.f226963w);
                    V6(2);
                    X6(false);
                } else {
                    this.f227870x.setVisibility(8);
                    android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.j4g);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4h)).setText(l6Var.f226961u);
                    ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4h)).setVisibility(0);
                    ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j4h)).setTextSize(24.0f);
                    V6(1);
                }
                mo67598xf0aced2e(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.B(this.f227857h, null);
            } else {
                if ("0".equals(l6Var3.C)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 r4Var = this.f227505d;
                    java.lang.String str2 = l6Var3.D;
                    java.lang.String str3 = l6Var3.E;
                    java.lang.String str4 = l6Var3.F;
                    java.lang.String str5 = l6Var3.G;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nf nfVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.nf(this, l6Var3);
                    zs4.q qVar = new zs4.q();
                    qVar.f556846e = new java.lang.ref.WeakReference(this);
                    qVar.f556847f = new java.lang.ref.WeakReference(r4Var);
                    java.lang.ref.WeakReference weakReference = qVar.f556846e;
                    if (weakReference == null || weakReference.get() == null) {
                        i19 = 5;
                        l6Var2 = l6Var3;
                    } else {
                        qVar.f556845d = nfVar;
                        java.lang.String str6 = str2 + str3;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.b4(this);
                        b4Var.f261679d = new zs4.g(qVar, 1005, str4, this);
                        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                        android.text.SpannableString i29 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str6);
                        android.text.SpannableString spannableString = new android.text.SpannableString(i29);
                        spannableString.setSpan(b4Var, i29.length() - str3.length(), i29.length(), 33);
                        android.widget.TextView textView = new android.widget.TextView(this);
                        textView.setText(spannableString);
                        textView.setTextSize(0, i65.a.h(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
                        textView.setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(0, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1005);
                        i19 = 5;
                        l6Var2 = l6Var3;
                        qVar.f556848g = db5.e1.r(this, "", textView, str5, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new zs4.h(qVar, 1005), new zs4.i(qVar, 1005));
                    }
                } else {
                    i19 = 5;
                    l6Var2 = l6Var3;
                    W6(l6Var2.f226951h, l6Var2.f226952i, l6Var2.f226953m, l6Var2.f226954n, l6Var2.P);
                }
                l6Var = l6Var2;
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f227863q.getLayoutParams();
            layoutParams3.topMargin = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a5_);
            this.f227863q.setLayoutParams(layoutParams3);
            this.f227863q.invalidate();
            this.f227864r.setTextSize(1, 12.0f);
            this.A.setVisibility(8);
            this.B.setVisibility(0);
        }
        int i37 = l6Var.f226959s;
        boolean z18 = (i37 == i19 || i37 == 1) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "receiveScene.hbStatus is " + l6Var.f226959s + ", isValidStatus is " + z18);
        int i38 = this.F;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        boolean z27 = (i38 == 1) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.H);
        if (z27 && z18) {
            android.view.View view2 = this.D;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(8);
            Y6();
        } else {
            android.view.View view3 = this.D;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.C.setVisibility(0);
        }
        if (z27 && z18) {
            this.f227860n.setTextSize(1, 21.0f);
            this.f227859m.setTextSize(1, 15.0f);
            this.f227858i.c(getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a58), getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f562086a56));
            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) this.f227858i.getLayoutParams();
            layoutParams4.topMargin = getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f562080a50);
            this.f227858i.setLayoutParams(layoutParams4);
            this.f227858i.invalidate();
        } else {
            this.f227860n.setTextSize(1, 21.0f);
            this.f227859m.setTextSize(1, 18.0f);
            this.f227858i.c(getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a59), getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.a57));
            this.f227858i.invalidate();
        }
        return true;
    }
}
