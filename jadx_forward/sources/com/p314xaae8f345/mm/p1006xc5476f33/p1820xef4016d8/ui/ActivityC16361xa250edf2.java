package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 */
/* loaded from: classes9.dex */
public class ActivityC16361xa250edf2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d {
    public static final java.lang.String H = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 C;
    public android.widget.ImageView D;
    public android.widget.TextView E;
    public int F;
    public android.widget.ImageView G;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f227556g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f227557h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f227558i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f227559m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f227560n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f227561o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f227562p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f227563q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f227564r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f227565s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f227566t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f227567u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f227569w;

    /* renamed from: y, reason: collision with root package name */
    public int f227571y;

    /* renamed from: z, reason: collision with root package name */
    public long f227572z;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f227568v = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f227570x = null;
    public int A = 0;
    public int B = 0;

    public final void V6() {
        boolean z17;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do receive hb");
        X6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var = this.C;
        if (s5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "ReceiveScene == null");
            W6(0, "");
            return;
        }
        if (s5Var.f227156r == 2) {
            m66165x5406100e(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5(this.f227570x, 11, 0, this.f227568v, "v1.0"), false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.u(this.f227560n, s5Var.f227152n, null, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227561o, this.C.f227154p);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var2 = this.C;
        if (s5Var2.f227156r == 1 || (i17 = s5Var2.f227155q) == 4 || i17 == 5 || i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 11, 0, 0, 0, 3);
            this.f227565s.setVisibility(8);
            this.f227567u.setVisibility(8);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C.f227157s)) {
                this.f227563q.setVisibility(8);
            } else {
                this.f227563q.setText(this.C.f227157s);
                this.f227563q.setVisibility(0);
                this.f227563q.setSingleLine(false);
            }
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f227559m.getLayoutParams();
            layoutParams.bottomMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(mo55332x76847179(), 30.0f);
            this.f227559m.setLayoutParams(layoutParams);
            z17 = true;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s5Var2.f227157s)) {
                this.f227562p.setText(this.C.f227157s);
                this.f227562p.setVisibility(0);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C.f227153o)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179(), this.f227563q, this.C.f227153o);
                this.f227563q.setVisibility(0);
                this.f227562p.setVisibility(8);
            }
            this.f227565s.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.x0(this));
            z17 = false;
        }
        if (c01.z1.r().equals(this.f227569w) || (this.A == 1 && z17)) {
            if (this.A == 1) {
                this.f227564r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573949gk1);
            }
            android.view.View view = this.f227559m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f227559m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.y0(this));
        } else {
            android.view.View view2 = this.f227559m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_receive_envelope_url");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_receive_envelope_md5");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_receive_envelope_widget_url");
        java.lang.String stringExtra4 = getIntent().getStringExtra("key_receive_envelope_widget_md5");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f227558i.getLayoutParams();
            layoutParams2.topMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(mo55332x76847179(), 118.0f);
            this.f227558i.setLayoutParams(layoutParams2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "has envelopeUrl");
            r45.wv3 wv3Var = new r45.wv3();
            r45.xv3 xv3Var = new r45.xv3();
            wv3Var.f471034g = xv3Var;
            xv3Var.f472012f = stringExtra;
            xv3Var.f472015i = stringExtra2;
            xv3Var.f472018o = stringExtra3;
            xv3Var.f472019p = stringExtra4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "render envelope");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) ((gb3.j) i95.n0.c(gb3.j.class))).aj(this.D, wv3Var, null, 0, 0, 0);
            this.D.setVisibility(0);
            if (this.F == 2) {
                this.E.setVisibility(0);
            } else {
                this.E.setVisibility(8);
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.f227558i.getLayoutParams();
            layoutParams3.topMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(mo55332x76847179(), 88.0f);
            this.f227558i.setLayoutParams(layoutParams3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.D(this.f227563q);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.D(this.f227562p);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.D(this.f227561o);
            r45.xv3 xv3Var2 = wv3Var.f471034g;
            gb3.m.a(2, xv3Var2 != null ? xv3Var2.f472012f : "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wv3Var.f471034g.f472018o) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wv3Var.f471034g.f472019p)) {
                this.G.setVisibility(8);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f227566t.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = i65.a.b(mo55332x76847179(), 24);
                    this.f227566t.setLayoutParams(marginLayoutParams);
                }
            } else {
                this.G.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z0(this));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.w2) ((gb3.j) i95.n0.c(gb3.j.class))).bj(this.G, wv3Var, null, 0, 0);
                this.G.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.A(this.G);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.f227566t.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = 0;
                    this.f227566t.setLayoutParams(marginLayoutParams2);
                }
            }
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f227557h.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77651xad7ef2f);
            com.p314xaae8f345.mm.ui.bk.p0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77651xad7ef2f));
        } else {
            this.f227557h.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560887x8);
            com.p314xaae8f345.mm.ui.bk.p0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560887x8));
        }
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(m78513xc2a54588, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f227556g;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.A(this.f227556g);
    }

    public final void W6(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "finishByResult resultCode: %d  errMsg:%s", java.lang.Integer.valueOf(i17), str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_errmsg", str);
        setResult(i17, intent);
        finish();
    }

    public final void X6() {
        android.widget.Button button = this.f227565s;
        if (button == null) {
            return;
        }
        fo3.s.INSTANCE.Tc(button.getId());
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (o17 == null || o17.length() <= 0 || !(o17.equals("zh_CN") || o17.equals("zh_TW") || o17.equals("zh_HK"))) {
            this.f227565s.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.amv);
            this.f227565s.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gmm);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bv6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f227556g = findViewById(com.p314xaae8f345.mm.R.id.j69);
        this.f227557h = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.j66);
        this.f227558i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.j6u);
        this.f227560n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j67);
        this.f227561o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j68);
        this.f227562p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6_);
        this.f227563q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6c);
        this.f227564r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6d);
        this.f227559m = findViewById(com.p314xaae8f345.mm.R.id.j6e);
        this.f227565s = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.j6g);
        this.f227567u = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j6h);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.j6f);
        this.f227566t = c22699x3dcdb352;
        c22699x3dcdb352.m82037xa10c26f6(false);
        this.f227566t.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.alt);
        this.f227566t.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s0(this));
        this.D = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j5v);
        this.E = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.j6i);
        this.G = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.j5z);
        this.f227562p.setLines(2);
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.c(this.f227562p, 1);
        android.view.View m78513xc2a54588 = m78513xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m78513xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        this.f227506e = false;
        overridePendingTransition(0, 0);
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f227568v = getIntent().getStringExtra("key_native_url");
        this.f227572z = getIntent().getLongExtra("key_msgid", 0L);
        this.f227571y = getIntent().getIntExtra("key_way", 5);
        this.B = getIntent().getIntExtra("key_static_from_scene", 0);
        this.f227569w = getIntent().getStringExtra("key_username");
        this.f227570x = getIntent().getStringExtra("key_sendid");
        this.A = getIntent().getIntExtra("key_type", 0);
        this.F = getIntent().getIntExtra("key_material_flag", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "mSendId：%s, nativeurl：%s  mWay：%s mSenderName：%s", this.f227570x, this.f227568v, java.lang.Integer.valueOf(this.f227571y), this.f227569w);
        java.lang.String stringExtra = getIntent().getStringExtra("key_lucky_money_busi_receive_resp");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "respStr is null");
            W6(0, "");
        } else {
            try {
                this.C = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.c(new org.json.JSONObject(stringExtra));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "parse failed :%s", e17.toString());
                W6(0, "");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5 s5Var = this.C;
            s5Var.f227149h = this.f227568v;
            s5Var.f227151m = this.f227571y;
            s5Var.f227150i = this.f227570x;
        }
        mo43517x10010bd5();
        V6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null || !intent.hasExtra("key_is_realname_verify_process")) {
            return;
        }
        if (intent.getIntExtra("realname_verify_process_ret", 0) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "new intent from realname verify process：succ");
            V6();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "new intent from realname verify process：cancel");
            W6(-1, "");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.AbstractActivityC16357x91f40e1d
    /* renamed from: onSceneEnd */
    public boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "onsceneend, errtype: %s, errcode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.s5;
        java.lang.String str3 = H;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do receive hb resp");
            str2 = str3;
        } else {
            str2 = str3;
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb resp");
                this.f227565s.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.H(this.f227567u);
                this.f227565s.setClickable(true);
                X6();
                if (i17 != 0 || i18 != 0) {
                    if (i18 != 416) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb fail", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        db5.e1.T(this, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str2);
                        W6(2, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str2);
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go to real name");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUPayUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet_payu");
                    this.f227565s.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c3t);
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.d(this, i18, str, m1Var, bundle, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.v0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.w0(this), 1005);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.up.a(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f573947gj5);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5 r5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r5) m1Var;
                at4.k1 k1Var = new at4.k1();
                k1Var.f66558xf7c5f050 = this.f227568v;
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var = r5Var.f227123t;
                k1Var.f66556xfcd83239 = e1Var.f226767d;
                k1Var.f66561xb3f4ee96 = e1Var.f226778q;
                k1Var.f66563xee5f688b = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var2 = r5Var.f227123t;
                k1Var.f66555x2592af31 = e1Var2.f226768e;
                k1Var.f66562xd3086e30 = e1Var2.A;
                if (k1Var.f66561xb3f4ee96 > 0) {
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().mo11260x413cb2b4(k1Var);
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0.d(r5Var.f227125v)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "should intercept");
                    mo67598xf0aced2e(8);
                    new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l0(this).b(r5Var.f227125v, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.t0(this));
                    return true;
                }
                if (r5Var.f227116m == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - open");
                    android.content.Intent intent = getIntent();
                    if (intent == null) {
                        intent = new android.content.Intent();
                    }
                    intent.setClass(mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
                    intent.putExtra("key_lucky_money_can_received", true);
                    gb3.l.b(this.f227570x, r5Var.f227123t);
                    intent.putExtra("key_jump_from", 2);
                    intent.putExtra("key_native_url", this.f227568v);
                    intent.putExtra("key_sendid", r5Var.f227114h);
                    intent.putExtra("key_static_from_scene", this.B);
                    intent.putExtra("key_hb_kind", 2);
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PlayCoinSound", 0) > 0) {
                        intent.putExtra("play_sound", true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = r5Var.f227124u;
                    if (c19088xa4b300c1 != null) {
                        intent.putExtra("key_realname_guide_helper", c19088xa4b300c1);
                    }
                    intent.putExtra("key_username", this.f227569w);
                    intent.putExtra("key_from_username", getIntent().getStringExtra("key_from_username"));
                    intent.putExtra("key_msgid", this.f227572z);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11701, 12, 0, 0, 0, 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    W6(-1, "");
                    return true;
                }
                this.f227565s.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.caz);
                this.f227565s.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gmj);
                this.f227565s.setOnClickListener(null);
                this.f227565s.setVisibility(8);
                this.f227567u.setVisibility(8);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5Var.f227123t.L)) {
                    this.f227562p.setVisibility(8);
                } else {
                    this.f227562p.setText(r5Var.f227123t.L);
                    this.f227562p.setVisibility(0);
                }
                this.f227563q.setText(r5Var.f227123t.f226769f);
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f227559m.getLayoutParams();
                layoutParams.bottomMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(mo55332x76847179(), 30.0f);
                this.f227559m.setLayoutParams(layoutParams);
                if (!c01.z1.r().equals(this.f227569w) && this.A != 1) {
                    android.view.View view = this.f227559m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return true;
                }
                android.view.View view2 = this.f227559m;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f227559m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.u0(this, r5Var));
                return true;
            }
            if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do detail hb resp");
                if (i17 != 0 || i18 != 0) {
                    db5.e1.T(this, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str2);
                    W6(2, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str2);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - detail");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5 v5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v5) m1Var;
                gb3.l.b(this.f227570x, v5Var.f227198h);
                android.content.Intent intent2 = getIntent();
                if (intent2 == null) {
                    intent2 = new android.content.Intent();
                }
                intent2.setClass(mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16358x34a9fc3c.class);
                intent2.putExtra("key_lucky_money_can_received", true);
                intent2.putExtra("key_jump_from", 2);
                intent2.putExtra("key_native_url", this.f227568v);
                intent2.putExtra("key_sendid", this.f227570x);
                intent2.putExtra("key_anim_slide", true);
                intent2.putExtra("key_username", this.f227569w);
                java.lang.String stringExtra = getIntent().getStringExtra("key_from_username");
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e1Var3 = v5Var.f227198h;
                if (e1Var3 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var3.Q)) {
                    stringExtra = v5Var.f227198h.Q;
                }
                intent2.putExtra("key_from_username", stringExtra);
                intent2.putExtra("key_way", this.f227571y);
                intent2.putExtra("key_msgid", this.f227572z);
                intent2.putExtra("key_static_from_scene", this.B);
                intent2.putExtra("key_hb_kind", 2);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent2);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                W6(-1, "");
                return true;
            }
        }
        if (i17 == 0 && i18 == 0) {
            return false;
        }
        db5.e1.T(this, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str2);
        W6(2, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str : str2);
        return false;
    }
}
