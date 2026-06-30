package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI */
/* loaded from: classes9.dex */
public class ActivityC16105xbfd7a3da extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {
    public static final /* synthetic */ int E = 0;
    public int C;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f223898f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f223899g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f223900h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f223901i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f223902m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f223903n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f223904o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f223905p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f223906q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f223907r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f223908s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f223909t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.CheckBox f223910u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f223911v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f223912w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f223913x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f223914y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f223915z;
    public java.lang.String A = "";
    public boolean B = false;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z D = new v73.g1(this);

    public final void V6(r45.tg5 tg5Var) {
        W6(tg5Var);
        r45.cx3 cx3Var = tg5Var.f467940f;
        if (cx3Var != null) {
            mo54450xbf7c1df6(cx3Var.f453425p);
        }
        this.f223914y.m83148xdedf72f8(tg5Var.f467944m);
        this.f223914y.m83149xa5089f5c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
        this.f223914y.m83150x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
    }

    public final void W6(r45.tg5 tg5Var) {
        r45.cx3 cx3Var = tg5Var.f467940f;
        if (cx3Var == null) {
            return;
        }
        this.f223903n.setText(cx3Var.f453429t);
        android.widget.TextView textView = this.f223905p;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        java.lang.String str = cx3Var.f453426q;
        float textSize = this.f223905p.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x76847179, str, textSize));
        android.widget.TextView textView2 = this.f223905p;
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
        java.lang.String str2 = cx3Var.f453426q;
        float textSize2 = this.f223905p.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471792, str2, textSize2));
        android.text.SpannableString spannableString = new android.text.SpannableString(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxf) + " " + com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(cx3Var.f453418f / 100));
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017 c19157x23598017 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19157x23598017(null, 0, -1, null, null);
        c19157x23598017.f262380d = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(this, 4);
        spannableString.setSpan(c19157x23598017, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxf).length(), spannableString.length(), 18);
        this.f223906q.setText(spannableString);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("click_help", true);
        this.f223907r.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).ij(mo55332x76847179(), cx3Var.f453428s, (int) this.f223907r.getTextSize(), 1, bundle));
        this.f223907r.setClickable(true);
        this.f223907r.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tg5Var.f467941g)) {
            this.f223901i.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7 d7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7(7, new v73.j1(this, tg5Var), true);
            android.text.SpannableString spannableString2 = new android.text.SpannableString(tg5Var.f467941g);
            spannableString2.setSpan(d7Var, 0, spannableString2.length(), 18);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(this.f223901i);
            this.f223901i.setText(spannableString2);
            this.f223901i.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
            this.f223901i.setClickable(true);
        }
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxq, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h(cx3Var.f453417e, 10), cx3Var.f453425p);
        android.widget.TextView textView3 = this.f223900h;
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f223900h.getContext();
        float textSize3 = this.f223900h.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize3));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f223898f, cx3Var.f453417e, 0.06f);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t0(this.f223899g, cx3Var.f453417e, 10);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t0(this.f223908s, cx3Var.f453417e, 10);
        int i17 = cx3Var.f453430u;
        if (i17 == 1) {
            this.f223904o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fwv);
        } else if (i17 == 2) {
            this.f223904o.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fxg);
        } else {
            android.widget.TextView textView4 = this.f223904o;
            le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String I = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.I(c01.z1.l(), 16);
            float textSize4 = this.f223904o.getTextSize();
            ((ke0.e) xVar4).getClass();
            textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, I, textSize4));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cx3Var.f453427r)) {
            this.f223913x.setImageResource(u73.h.d(cx3Var.f453430u));
        } else {
            this.f223913x.b(cx3Var.f453427r, 0, 0, u73.h.d(cx3Var.f453430u));
        }
        if (!tg5Var.f467945n) {
            this.B = false;
            this.f223909t.setVisibility(8);
            return;
        }
        this.B = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24522, 2, 1);
        this.f223909t.setVisibility(0);
        r45.xw3 xw3Var = tg5Var.f467946o;
        java.lang.String str3 = xw3Var.f472088d;
        java.lang.String str4 = xw3Var.f472089e;
        java.lang.String str5 = xw3Var.f472090f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return;
        }
        r45.xw3 xw3Var2 = tg5Var.f467946o;
        this.A = xw3Var2.f472089e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(xw3Var2.f472088d);
        int length = sb6.length();
        sb6.append(tg5Var.f467946o.f472089e);
        this.f223911v.setText(sb6.toString());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tg5Var.f467946o.f472089e)) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(this.f223911v, sb6.toString(), length, sb6.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new v73.f1(this, tg5Var), true), this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bjv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f223898f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h4o);
        this.f223899g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4t);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566809h51);
        this.f223904o = textView;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView);
        this.f223900h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4u);
        this.f223908s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4x);
        this.f223901i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4p);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.h4y);
        this.f223902m = button;
        com.p314xaae8f345.mm.ui.bk.r0(button.getPaint(), 0.8f);
        this.f223903n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4z);
        this.f223905p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f566810h52);
        this.f223906q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4r);
        this.f223907r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4q);
        this.f223913x = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) findViewById(com.p314xaae8f345.mm.R.id.h4w);
        this.f223914y = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f223909t = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.h4m);
        this.f223910u = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.h4l);
        this.f223911v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.h4n);
        this.f223912w = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.h4s);
        this.f223902m.setOnClickListener(new v73.h1(this));
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f223912w.setImageResource(com.p314xaae8f345.mm.R.raw.f79481x8e9a3755);
            this.f223902m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            this.f223910u.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.agk);
        } else {
            this.f223912w.setImageResource(com.p314xaae8f345.mm.R.raw.f79480x9a77b0f3);
            this.f223902m.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            this.f223910u.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.agj);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f223794e = com.p314xaae8f345.mm.R.C30859x5a72f63.aaw;
        super.onCreate(bundle);
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).wi(this.D);
        m83090x14f40144(2613);
        m83090x14f40144(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27792x78e4cdb4);
        this.f223915z = getIntent().getStringExtra("key_card_no");
        this.C = getIntent().getIntExtra("key_scene", 0);
        mo43517x10010bd5();
        int i17 = this.C;
        java.lang.String str = this.f223793d;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "qry user detail");
            r73.m mVar = new r73.m(this.f223915z);
            mVar.K(this);
            m83099x5406100e(mVar, true);
            return;
        }
        r45.tg5 tg5Var = new r45.tg5();
        try {
            tg5Var.mo11468x92b714fd(getIntent().getByteArrayExtra("key_qry_response"));
            V6(tg5Var);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "qry user detail");
            r73.m mVar2 = new r73.m(this.f223915z);
            mVar2.K(this);
            m83099x5406100e(mVar2, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Ni(this.D);
        m83121xf6ff5b27(2613);
        m83121xf6ff5b27(com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.f27792x78e4cdb4);
        if (this.B) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24522, 2, 3);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof r73.m) {
            r73.m mVar = (r73.m) m1Var;
            if (mVar.f295564i || mVar.f295565m) {
                return true;
            }
            W6(mVar.f474711r);
            return true;
        }
        if (!(m1Var instanceof r73.e)) {
            return true;
        }
        r73.e eVar = (r73.e) m1Var;
        eVar.O(new v73.i1(this, eVar));
        if (eVar.f295565m) {
            if (eVar.f474701r.f452293f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f223793d, "do real name");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayReceiveCardUI");
                u73.h.i(this, bundle, eVar.f474701r.f452293f, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 5L, 1L);
        }
        if (!eVar.f295564i) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 5L, 1L);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(v73.k1.class);
    }
}
