package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

@db5.a(m123858x6ac9171 = 2)
/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI */
/* loaded from: classes9.dex */
public class ActivityC19003x7959c734 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements mp5.v {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public double f259364d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f259365e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f259366f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f259367g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f259368h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f259369i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f259370m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f259371n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f259372o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f259373p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f259374q;

    /* renamed from: r, reason: collision with root package name */
    public ss4.m0 f259375r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f259376s;

    /* renamed from: t, reason: collision with root package name */
    public hs4.d f259377t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f259378u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f259379v;

    /* renamed from: w, reason: collision with root package name */
    public int f259380w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f259381x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Runnable f259382y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f259383z;

    public ActivityC19003x7959c734() {
        i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 270);
        this.f259376s = false;
        this.f259379v = false;
        this.f259380w = 0;
        this.f259381x = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.b2(this);
        this.f259382y = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c2(this);
        this.f259383z = new java.util.HashMap();
    }

    public void U6() {
        if (this.f259366f != null) {
            if (W6()) {
                double d17 = this.f259364d;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f259366f;
                X6(d17, "CNY", c19091x9511676c.f69225xed6d60f6, c19091x9511676c.f69223x58802fcb);
                return;
            } else {
                double d18 = this.f259364d;
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = this.f259366f;
                m83098x5406100e(new rr4.d(d18, "CNY", c19091x9511676c2.f69225xed6d60f6, c19091x9511676c2.f69223x58802fcb));
                return;
            }
        }
        at4.n a17 = at4.n.a();
        if (a17.b()) {
            db5.e1.s(this, a17.f95435b, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        } else if (W6()) {
            X6(this.f259364d, "CNY", "", "");
        } else {
            m83098x5406100e(new rr4.d(this.f259364d, "CNY", "", ""));
        }
    }

    public final void V6() {
        if (this.f259375r == null) {
            this.f259371n.setVisibility(8);
            return;
        }
        this.f259371n.setVisibility(0);
        this.f259372o.setText(this.f259375r.f493629a);
        this.f259373p.setText(this.f259375r.f493630b);
        this.f259371n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.v1(this));
    }

    public final boolean W6() {
        com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
        com.p314xaae8f345.mm.p2802xd031a825.b a17 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
        a17.getClass();
        boolean d17 = a17.d(e42.d0.clicfg_open_kinda_wallet_balance_save, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "wallet balance save isOpenKinda isKindaEnable: %s，isKindaWalletBalanceSave: %s", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(d17));
        return d17;
    }

    public final void X6(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("payScene", 11);
        bundle.putString("totalFee", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString());
        bundle.putString("feeType", str);
        bundle.putString("bankType", str3);
        bundle.putString("bindSerial", str2);
        bundle.putString("reportSessionId", this.f259378u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "startWalletBalanceSaveUseCase totalFee：%s reportSessionId %s", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.h0("" + d17, "100", 0, java.math.RoundingMode.HALF_UP).toString(), this.f259378u);
        this.f259379v = true;
        ((h45.q) i95.n0.c(h45.q.class)).mo24842xcebd96f9(this, bundle);
    }

    public final void Y6() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f259368h.m83183xfb85ada3(), 0.0d) <= 0.0d || !this.f259368h.n()) {
            this.f39912xe2ad5320.e(false);
        } else {
            this.f39912xe2ad5320.e(true);
        }
    }

    public final void Z6() {
        android.widget.LinearLayout linearLayout = this.f259369i;
        if (linearLayout != null) {
            if (this.f259366f != null) {
                android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ael);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f259366f;
                at4.k c17 = dt4.b.c(this, c19091x9511676c.f69223x58802fcb, c19091x9511676c.F0());
                java.lang.String str = c17 != null ? c17.f95411a : "";
                imageView.setImageBitmap(null);
                if (this.f259366f.v0()) {
                    imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ch9);
                } else {
                    y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                    gt4.c1 c1Var = new gt4.c1(str);
                    ((x60.e) fVar).getClass();
                    android.graphics.Bitmap d17 = x51.w0.d(c1Var);
                    ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.u1(this, imageView));
                    if (d17 != null) {
                        imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(d17, getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.ae9), true, false));
                    }
                }
                android.widget.TextView textView = (android.widget.TextView) this.f259369i.findViewById(com.p314xaae8f345.mm.R.id.acd);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = this.f259366f;
                textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfi, c19091x9511676c2.f69217xaef0808c, c19091x9511676c2.f69222x587fd4e1));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f259366f.f69216xb07db88b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "hy: wording's missing. use default");
                    ((android.widget.TextView) this.f259369i.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setText("");
                } else {
                    ((android.widget.TextView) this.f259369i.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setText(this.f259366f.f69216xb07db88b);
                    ((android.widget.TextView) this.f259369i.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setVisibility(0);
                }
            } else {
                ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.acd)).setText(this.f259367g);
                ((android.widget.TextView) this.f259369i.findViewById(com.p314xaae8f345.mm.R.id.h0a)).setText("");
                ((android.widget.ImageView) this.f259369i.findViewById(com.p314xaae8f345.mm.R.id.ael)).setImageBitmap(null);
            }
            ((android.widget.TextView) this.f259369i.findViewById(com.p314xaae8f345.mm.R.id.f569215pf5)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.kfh);
        }
    }

    /* renamed from: fetchData */
    public final void m73813xb6377d84() {
        at4.x1 Ai = vr4.f1.wi().Ai();
        java.util.ArrayList j17 = Ai.j();
        this.f259365e = j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c k17 = Ai.k(j17, null, false, true);
        this.f259366f = k17;
        if (k17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17.f69239x93565523)) {
            this.f259366f = null;
            int i17 = 0;
            while (true) {
                if (i17 >= this.f259365e.size()) {
                    break;
                }
                if (this.f259365e.get(i17) != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f259365e.get(i17)).f69239x93565523)) {
                    this.f259366f = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f259365e.get(i17);
                    break;
                }
                i17++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f259366f;
        if (c19091x9511676c != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19091x9511676c.f69239x93565523)) {
            this.f259366f = null;
        }
        java.util.ArrayList arrayList = this.f259365e;
        if (arrayList == null) {
            return;
        }
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) arrayList.get(i18)).f69239x93565523;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d5b;
    }

    @Override // mp5.v
    public void h4(float f17) {
        android.view.ViewGroup viewGroup = this.f259370m;
        if (viewGroup != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.bottomMargin = (int) f17;
            this.f259370m.setLayoutParams(layoutParams);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kfo);
        this.f259370m = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.m9s);
        this.f259368h = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById(com.p314xaae8f345.mm.R.id.f567505jq4);
        this.f259371n = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.iw9);
        this.f259372o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iw_);
        this.f259373p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iw8);
        this.f39912xe2ad5320 = new com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223(this);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f259374q = c22905xef04d72d;
        c22905xef04d72d.a();
        qp5.p.g(this.f259368h);
        this.f259368h.m83186xefe232c4().setText(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b());
        this.f39912xe2ad5320.d(this, -1);
        m83130x21cc23c2(this.f259368h.m83169xe7297452(), true, false);
        this.f39912xe2ad5320.m82979x8ac63285(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kf8));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((or4.c) pf5.z.f435481a.a(activity).a(or4.c.class)).m42291x53d8522f("keyboard_title_key", getString(com.p314xaae8f345.mm.R.C30867xcad56011.kf8));
        final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6();
        c6241x543927b6.f136488g.f88426a = "19";
        c6241x543927b6.f273897d = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734.this.f259374q.m83148xdedf72f8(c6241x543927b6.f136489h.f88531e);
            }
        };
        c6241x543927b6.e();
        this.f259368h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.d2(this));
        this.f259368h.m83169xe7297452().setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.h1(this, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.e2(this)));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.acc);
        this.f259369i = linearLayout;
        if (linearLayout != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.acd));
            this.f259369i.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.i1(this));
        }
        m83129xcfb55a41(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.j1(this));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: isHandleAutoShowNormalStWcKb */
    public boolean mo48628x7c5cc589() {
        this.f39912xe2ad5320.o();
        return this.f39912xe2ad5320.o();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        this.f259378u = java.util.UUID.randomUUID().toString();
        if (!c01.z1.I()) {
            m83099x5406100e(new ss4.h0(null, 3), false);
        }
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77712x682bd8ec));
        mo78530x8b45058f();
        m73813xb6377d84();
        this.f259367g = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kfk);
        mo43517x10010bd5();
        java.lang.String str = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.g) ((j05.f) i95.n0.c(j05.f.class))).wi().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BALANCE_LQT_OPERATION_STRING_SYNC, "");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            try {
                this.f259375r = ss4.m0.a(new org.json.JSONObject(str));
                V6();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletBalanceSaveUI", e17, "", new java.lang.Object[0]);
            }
        }
        Z6();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(3, 0);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f259381x);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f259382y);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l
    /* renamed from: onDialogDismiss */
    public void mo48629xdbdf3083(android.app.Dialog dialog) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "onDialogDismiss()");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f259381x, 300L);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f39912xe2ad5320;
        if (c22894x55bf3223 == null || !c22894x55bf3223.onKeyUp(i17, keyEvent)) {
            return super.onKeyUp(i17, keyEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f39912xe2ad5320.p()) {
            return;
        }
        this.f259380w = 3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f259376s) {
            m83099x5406100e(new ss4.h0(null, 3), false);
        }
        if (this.f259380w == 3 && mo48628x7c5cc589() && !this.f259379v) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f259382y, 300L);
        }
        this.f259380w = 2;
        Y6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        rr4.d dVar;
        boolean z17;
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof rr4.d) {
                rr4.d dVar2 = (rr4.d) m1Var;
                if ("1".equals(dVar2.f480761e)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "need realname verify");
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".balance.ui.WalletBalanceSaveUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet");
                    dVar = dVar2;
                    z17 = zs4.q.g(this, dVar2.f480762f, 0, dVar2.f480763g, dVar2.f480764h, bundle, mo63463x4510f9c8(), null, null, 0, 2);
                } else {
                    dVar = dVar2;
                    if ("2".equals(dVar.f480761e)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "need upload credit");
                        zs4.q.h(this, dVar.f480762f, dVar.f480765i, dVar.f480763g, dVar.f480764h, mo63463x4510f9c8(), null);
                        z17 = true;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceSaveUI", "realnameGuideFlag =  " + dVar.f480761e);
                        z17 = false;
                    }
                }
                if (z17) {
                    return false;
                }
                java.lang.String str2 = dVar.f480760d;
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(11, str2, i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f259366f;
                java.lang.String str3 = c19091x9511676c == null ? "" : c19091x9511676c.f69225xed6d60f6;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                    c19760x34448d56.f273647m = str2;
                    c19760x34448d56.f273649o = "";
                    c19760x34448d56.f273650p = null;
                    c19760x34448d56.f273642e = 11;
                    c19760x34448d56.f273654t = null;
                    c19760x34448d56.f273644g = 0;
                    h45.a0.g(this, true, str3, c19760x34448d56, null, new android.content.Intent(), 1);
                }
            } else if (m1Var instanceof ss4.h0) {
                ss4.h0 h0Var = (ss4.h0) m1Var;
                if (!this.f259376s) {
                    m73813xb6377d84();
                    Z6();
                }
                this.f259376s = false;
                this.f259375r = h0Var.E;
                V6();
            }
        } else if (m1Var instanceof rr4.d) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.b(11, "", i18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f259381x, 300L);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(or4.c.class);
    }
}
