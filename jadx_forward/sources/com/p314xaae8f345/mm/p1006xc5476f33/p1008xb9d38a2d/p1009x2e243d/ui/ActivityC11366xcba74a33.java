package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobileUI */
/* loaded from: classes5.dex */
public class ActivityC11366xcba74a33 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f154564e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f154565f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154566g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f154567h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154568i;

    /* renamed from: m, reason: collision with root package name */
    public s61.m1 f154569m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f154570n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154571o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f154572p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f154573q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f154574r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f154575s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f154576t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.CheckBox f154577u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.CheckBox f154578v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f154579w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f154580x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e f154581y;

    /* renamed from: z, reason: collision with root package name */
    public int f154582z;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569729k6;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154564e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.ai6);
        this.f154565f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cjz);
        this.f154566g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565488ck1);
        this.f154567h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cjw);
        this.f154573q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ai_);
        this.f154574r = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ahu);
        this.f154575s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ai7);
        this.f154573q.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.agt));
        this.f154576t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ahv);
        this.f154579w = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.ai9);
        this.f154578v = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.f564917ai4);
        this.f154577u = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.f564916ai3);
        this.f154580x = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564918ai5);
        com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e c11133xdc5bf27e = this.f154581y;
        if (c11133xdc5bf27e != null) {
            java.lang.String str = c11133xdc5bf27e.f152809d;
            if (str != null && str.length() > 0) {
                this.f154573q.setText(this.f154581y.f152809d);
            }
            java.lang.String str2 = this.f154581y.f152810e;
            if (str2 != null && str2.length() > 0) {
                this.f154576t.setText(this.f154581y.f152810e);
            }
            int intValue = this.f154581y.f152811f.intValue();
            if (intValue == 0) {
                this.f154580x.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgh);
            } else if (intValue == 1) {
                this.f154580x.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgk);
            } else if (intValue == 2) {
                this.f154580x.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgi);
            }
        }
        int i17 = this.f154582z;
        if (i17 == 0) {
            this.f154579w.setVisibility(0);
            this.f154578v.setVisibility(0);
            this.f154576t.setVisibility(8);
        } else if (i17 == 1) {
            this.f154579w.setVisibility(8);
            this.f154578v.setVisibility(8);
            this.f154576t.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154570n) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154571o)) {
            java.lang.String simCountryIso = ((android.telephony.TelephonyManager) getSystemService("phone")).getSimCountryIso();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(simCountryIso)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
            } else {
                u11.a a17 = u11.b.a(simCountryIso);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
                } else {
                    this.f154570n = a17.f505262c;
                    this.f154571o = a17.f505261b;
                }
            }
        }
        java.lang.String str3 = this.f154570n;
        if (str3 != null && !str3.equals("")) {
            this.f154566g.setText(this.f154570n);
        }
        java.lang.String str4 = this.f154571o;
        if (str4 != null && !str4.equals("")) {
            this.f154567h.setText("+" + this.f154571o);
        }
        java.lang.String str5 = this.f154572p;
        if (str5 != null && !str5.equals("")) {
            this.f154564e.setText(this.f154572p);
        }
        this.f154574r.setOnClickListener(new p61.l2(this));
        this.f154575s.setOnClickListener(new p61.m2(this));
        if (this.A) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.afu);
            this.f154580x.setVisibility(8);
            this.f154573q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.agd);
            this.f154579w.setVisibility(8);
            this.f154578v.setVisibility(8);
            this.f154578v.setChecked(false);
            this.f154577u.setVisibility(0);
            this.f154577u.setChecked(false);
            this.f154576t.setVisibility(8);
            this.f154576t.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.afw));
            this.f154575s.setVisibility(8);
            this.f154574r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.afu);
            mo54448x9c8c0d33(new p61.n2(this));
        }
        this.f154565f.setOnClickListener(new p61.o2(this));
        this.f154565f.setOnClickListener(new p61.p2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != 100) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154570n = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f154571o = stringExtra2;
        if (!this.f154570n.equals("")) {
            this.f154566g.setText(this.f154570n);
        }
        if (this.f154571o.equals("")) {
            return;
        }
        this.f154567h.setText("+" + this.f154571o);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.agx);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154570n = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f154571o = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("bindmcontact_shortmobile");
        this.f154572p = stringExtra3 != null ? stringExtra3 : "";
        this.f154581y = (com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f154582z = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.A = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s61.m1 m1Var = this.f154569m;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }
}
