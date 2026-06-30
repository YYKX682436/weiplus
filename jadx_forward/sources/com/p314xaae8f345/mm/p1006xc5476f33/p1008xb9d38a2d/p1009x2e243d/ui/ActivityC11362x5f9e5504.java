package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMContactUI */
/* loaded from: classes5.dex */
public class ActivityC11362x5f9e5504 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f154517w = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f154518e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f154519f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f154520g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f154521h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f154522i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154523m;

    /* renamed from: n, reason: collision with root package name */
    public s61.m1 f154524n;

    /* renamed from: t, reason: collision with root package name */
    public d71.d f154530t;

    /* renamed from: u, reason: collision with root package name */
    public d71.e f154531u;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154525o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f154526p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f154527q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f154528r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f154529s = true;

    /* renamed from: v, reason: collision with root package name */
    public int f154532v = 0;

    public final void Z6(java.lang.String countryISOCode) {
        this.f154526p = countryISOCode;
        d71.e eVar = this.f154531u;
        if (eVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(countryISOCode, "countryISOCode");
            eVar.f308413f = countryISOCode;
            eVar.f308415h = "";
            eVar.f308414g = false;
            android.widget.EditText editText = this.f154518e;
            if (editText != null) {
                this.f154531u.a(editText.getText());
            }
        }
    }

    public final void a7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactUI", "sendSmsToSelf %s", str);
        if (this.f154524n == null) {
            s61.l1 l1Var = s61.l1.BINDMOBILE;
            if (this.f154532v == 3) {
                l1Var = s61.l1.CHANGEMOBILE;
            }
            this.f154524n = new s61.m1(l1Var, this, new p61.t1(this, str));
        }
        this.f154524n.d(str);
    }

    public final void b7() {
        int i17 = this.f154532v;
        if (i17 == 0 || i17 == 3) {
            db5.e1.n(this, i17 == 3 ? com.p314xaae8f345.mm.R.C30867xcad56011.aga : com.p314xaae8f345.mm.R.C30867xcad56011.ag_, i17 == 3 ? com.p314xaae8f345.mm.R.C30867xcad56011.agc : com.p314xaae8f345.mm.R.C30867xcad56011.agb, new p61.n1(this), null);
        } else {
            ((java.util.HashMap) com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.f278452d).clear();
            W6(1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569734kb;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154528r = getIntent().getBooleanExtra("KEnterFromBanner", false);
        int intExtra = getIntent().getIntExtra("bind_scene", 0);
        this.f154532v = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactUI", "bindScene:%d", java.lang.Integer.valueOf(intExtra));
        this.f154529s = getIntent().getBooleanExtra("back_to_status", true);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.ai6);
        this.f154518e = editText;
        d71.e eVar = new d71.e(editText, this.f154530t, this.f154526p);
        this.f154531u = eVar;
        this.f154518e.addTextChangedListener(eVar);
        this.f154519f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.cjz);
        this.f154521h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f565488ck1);
        this.f154522i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cjw);
        this.f154520g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568396mo5);
        if (this.f154532v == 3) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (str.startsWith("+")) {
                    java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(str);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                        str.substring(c17.length() + 1);
                    }
                }
                this.f154520g.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.afz));
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("bind_hint_text");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f154520g.setText(stringExtra);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x9.b()) {
            Z6("1");
            this.f154525o = u11.b.c(this.f154526p);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154525o)) {
            this.f154521h.setText(this.f154525o);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154526p)) {
            Z6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.blj));
            if (this.f154526p.startsWith("+")) {
                Z6(this.f154526p.substring(1));
            }
        }
        this.f154522i.setText("+" + this.f154526p);
        java.lang.String str2 = this.f154527q;
        if (str2 == null || str2.equals("")) {
            gm0.j1.e().g(new p61.o1(this));
        } else {
            this.f154518e.setText(this.f154527q);
            this.f154518e.setSelection(this.f154527q.length());
        }
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572035ww), new p61.p1(this));
        this.f154518e.requestFocus();
        mo54448x9c8c0d33(new p61.q1(this));
        this.f154519f.setOnClickListener(new p61.r1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        android.os.Bundle bundleExtra2;
        android.os.Bundle bundleExtra3;
        super.onActivityResult(i17, i18, intent);
        if (i18 == 100) {
            java.lang.String stringExtra = intent.getStringExtra("country_name");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f154525o = stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            Z6(stringExtra2);
            if (!this.f154525o.equals("")) {
                this.f154521h.setText(this.f154525o);
            }
            if (!this.f154526p.equals("")) {
                this.f154522i.setText("+" + this.f154526p);
            }
        }
        switch (i17) {
            case 30765:
                if (intent == null || (bundleExtra = intent.getBundleExtra("result_data")) == null || !bundleExtra.getString("go_next", "").equals("birthdayComfirmOK")) {
                    return;
                }
                a7(this.f154523m);
                return;
            case 30766:
                if (intent == null || (bundleExtra2 = intent.getBundleExtra("result_data")) == null || !bundleExtra2.getString("go_next", "").equals("agree_privacy")) {
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new p61.s1(this), 100L);
                return;
            case 30767:
                if (intent == null || (bundleExtra3 = intent.getBundleExtra("result_data")) == null || !bundleExtra3.getString("go_next", "").equals("agree_privacy")) {
                    return;
                }
                a7(this.f154523m);
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572249ah1);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154525o = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        Z6(stringExtra2);
        java.lang.String stringExtra3 = getIntent().getStringExtra("bindmcontact_shortmobile");
        this.f154527q = stringExtra3 != null ? stringExtra3 : "";
        d71.d dVar = new d71.d();
        this.f154530t = dVar;
        dVar.c(mo55332x76847179());
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((java.util.LinkedHashMap) this.f154530t.f308410a).clear();
        s61.m1 m1Var = this.f154524n;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        b7();
        return true;
    }
}
