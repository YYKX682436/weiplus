package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI */
/* loaded from: classes9.dex */
public class ActivityC17134x89ac8704 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {
    public static final /* synthetic */ int I = 0;
    public android.widget.LinearLayout A;
    public android.widget.ImageView B;
    public android.widget.LinearLayout C;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f238924d;

    /* renamed from: e, reason: collision with root package name */
    public int f238925e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f238926f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f238927g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f238928h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f238929i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f238930m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f238931n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f238932o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f238933p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f238934q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f238935r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f238936s;

    /* renamed from: t, reason: collision with root package name */
    public int f238937t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f238938u;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f238941x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f238942y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.Button f238943z;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f238939v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f238940w = false;
    public boolean D = false;
    public long E = 0;
    public long F = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 G = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q6(this, null), true);
    public final y60.e H = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j6(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 activityC17134x89ac8704) {
        activityC17134x89ac8704.B.setImageBitmap(ww1.r.a(activityC17134x89ac8704, activityC17134x89ac8704.f238936s, activityC17134x89ac8704.f238926f, activityC17134x89ac8704.f238924d.L, activityC17134x89ac8704.f238934q, true, com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC17134x89ac8704, 197.0f), activityC17134x89ac8704.H, activityC17134x89ac8704.f238940w, activityC17134x89ac8704.f238937t, 0.0f, true));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17134x89ac8704.f238938u)) {
            activityC17134x89ac8704.f238941x.setText(activityC17134x89ac8704.f238938u);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC17134x89ac8704.f238935r)) {
            activityC17134x89ac8704.C.setVisibility(8);
        } else {
            activityC17134x89ac8704.f238942y.setText(activityC17134x89ac8704.f238935r);
            activityC17134x89ac8704.C.setVisibility(0);
        }
        activityC17134x89ac8704.A.removeAllViews();
        if (!activityC17134x89ac8704.f238939v.isEmpty()) {
            for (r45.sn0 sn0Var : activityC17134x89ac8704.f238939v) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17125x738f4aef c17125x738f4aef = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17125x738f4aef(activityC17134x89ac8704);
                java.lang.String str = sn0Var.f467387d;
                java.lang.String str2 = sn0Var.f467388e;
                c17125x738f4aef.f238631d.setText(str);
                c17125x738f4aef.f238632e.setText(str2);
                activityC17134x89ac8704.A.addView(c17125x738f4aef, new android.widget.LinearLayout.LayoutParams(-1, -2));
            }
        }
        activityC17134x89ac8704.A.requestLayout();
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17134x89ac8704 activityC17134x89ac8704, int i17) {
        activityC17134x89ac8704.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "send pay: %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf c5409x1e816faf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5409x1e816faf();
        am.e9 e9Var = c5409x1e816faf.f135755g;
        e9Var.f88078d = activityC17134x89ac8704;
        e9Var.f88077c = i17;
        e9Var.f88076b = 1;
        e9Var.f88075a = activityC17134x89ac8704.f238936s;
        c5409x1e816faf.e();
    }

    public boolean W6() {
        return getIntent().getBooleanExtra("from_patch_ui", false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ce7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (W6()) {
            this.f238941x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568204m30);
            this.f238942y = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.m2z);
            this.f238943z = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.m2y);
            this.B = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.m2w);
            this.A = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m2x);
            this.C = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.nek);
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById(com.p314xaae8f345.mm.R.id.kqo)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i1_, com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(this.f238925e / 100.0d)));
            this.f238943z.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l6(this));
            this.B.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m6(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (W6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "onActivityResult requestCode:%s resultCode:%s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
            if (i17 != 1) {
                if (i17 == 5) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "back from H5 cashier, finish");
                    finish();
                    return;
                }
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5902x95c1c64e c5902x95c1c64e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5902x95c1c64e();
            boolean z17 = i18 == -1;
            am.qq qqVar = c5902x95c1c64e.f136208g;
            qqVar.f89271a = z17;
            if (intent != null) {
                qqVar.f89272b = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                qqVar.f89272b = 3;
            }
            c5902x95c1c64e.e();
            if (i18 == -1) {
                setResult(-1, intent);
                finish();
            } else if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.b(intent)) {
                setResult(0, intent);
                finish();
            } else {
                if (com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.b2.c(intent)) {
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5408x2c04ed98 c5408x2c04ed98 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5408x2c04ed98();
                c5408x2c04ed98.f135754g.getClass();
                c5408x2c04ed98.e();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (W6()) {
            if (mo2533x106ab264() != null) {
                mo2533x106ab264().w(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561018a34)));
                android.view.View j17 = mo2533x106ab264().j();
                if (j17 != null) {
                    android.view.View findViewById = j17.findViewById(com.p314xaae8f345.mm.R.id.d0v);
                    if (findViewById != null) {
                        findViewById.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
                    }
                    android.view.View findViewById2 = j17.findViewById(android.R.id.text1);
                    if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                        ((android.widget.TextView) findViewById2).setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                    }
                }
            }
            android.view.Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561018a34));
            if (fp.h.c(21) && !fp.h.c(23)) {
                getWindow().setStatusBarColor(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
            }
            mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.k6(this), com.p314xaae8f345.mm.R.raw.f78582xb4b74355);
            m83090x14f40144(2736);
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hys);
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) getIntent().getParcelableExtra("key_pay_info");
            this.f238924d = c19760x34448d56;
            if (c19760x34448d56 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceF2fDynamicCodeUI", "payinfo is null");
                finish();
            }
            mo67598xf0aced2e(4);
            this.f238925e = this.f238924d.f273655u.getInt("extinfo_key_15");
            this.f238926f = this.f238924d.f273655u.getString("extinfo_key_1");
            this.f238933p = this.f238924d.f273655u.getString("extinfo_key_2");
            this.f238929i = this.f238924d.f273655u.getString("extinfo_key_17");
            this.f238930m = this.f238924d.f273655u.getString("extinfo_key_18");
            this.f238927g = getIntent().getStringExtra("key_rcvr_open_id");
            this.f238931n = getIntent().getStringExtra("key_mch_info");
            this.f238928h = getIntent().getStringExtra("key_transfer_qrcode_id");
            this.f238934q = getIntent().getStringExtra("key_mch_photo");
            getIntent().getStringExtra("show_paying_wording");
            this.f238935r = getIntent().getStringExtra("dynamic_code_spam_wording");
            this.f238940w = getIntent().getBooleanExtra("show_avatar_type", false);
            this.f238932o = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(this.f238926f);
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        if (W6()) {
            m83121xf6ff5b27(2736);
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        y60.e eVar = this.H;
        ((x60.e) fVar).getClass();
        x51.w0.e(eVar);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        if (W6()) {
            this.G.d();
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.s1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r1.f239444a.a(this);
        if (W6()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.E;
            this.F = j17 <= 0 ? 0L : com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8 - (currentTimeMillis - j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceF2fDynamicCodeUI", "last time: %s, delay: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(this.F));
            if (this.F < 0) {
                this.F = 0L;
            }
            this.G.c(this.F, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!W6() || !(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v)) {
            return true;
        }
        this.D = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v) m1Var;
        mo67598xf0aced2e(0);
        vVar.O(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.i6(this, vVar));
        return true;
    }
}
