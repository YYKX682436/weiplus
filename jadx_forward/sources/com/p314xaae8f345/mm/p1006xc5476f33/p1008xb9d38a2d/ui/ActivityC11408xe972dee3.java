package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI */
/* loaded from: classes14.dex */
public class ActivityC11408xe972dee3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int D = 0;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A;

    /* renamed from: h, reason: collision with root package name */
    public boolean f154832h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f154833i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154834m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f154835n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154836o;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f154839r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f154840s;

    /* renamed from: u, reason: collision with root package name */
    public android.app.ProgressDialog f154842u;

    /* renamed from: v, reason: collision with root package name */
    public int f154843v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f154844w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f154845x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f154846y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f154847z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f154828d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154829e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f154830f = "";

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f154831g = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f154837p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f154838q = "";

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f154841t = "";
    public boolean B = false;
    public int C = 15;

    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 T6(java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(str);
        int indexOf = str.indexOf(32) + 1;
        f0Var.c(new android.text.style.AbsoluteSizeSpan(getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561388h4)), indexOf, str.length(), 33);
        f0Var.c(new android.text.style.ForegroundColorSpan(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su)), indexOf, str.length(), 33);
        return f0Var;
    }

    public final void U6() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.A;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f154845x.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hwk);
        this.f154845x.setEnabled(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c2b;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568381mm3)).setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwq, this.f154828d));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568378mm0);
        this.f154846y = textView;
        textView.setText(T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwp, this.f154829e)));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568382mm4);
        this.f154847z = textView2;
        textView2.setText(T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hws, this.f154830f)));
        this.f154844w = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.mlz);
        this.f154845x = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hwr);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v3(this));
        this.f154831g.f155819b = this.f154828d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 31685) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            java.util.Map map = bundleExtra != null ? (java.util.Map) bundleExtra.getSerializable("next_params") : null;
            if (map == null || (str = (java.lang.String) map.get("next_step")) == null || !str.equals("continue_with_password")) {
                return;
            }
            java.lang.String str2 = (java.lang.String) map.get("spam_ctx");
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11452x4130082f.class);
            intent2.putExtra("binded_mobile", this.f154828d);
            intent2.putExtra("extspam_ctx_string", str2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("from_mobile");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f154828d = stringExtra;
        this.f154833i = getIntent().getBooleanExtra("from_switch_account", false);
        this.f154834m = c01.b9.f118602c.a("login_weixin_username", "");
        this.f154835n = getIntent().getStringExtra("last_login_auth_target_username");
        this.f154836o = getIntent().getStringExtra("last_login_user_showname");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_login_sms_up_verify_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f154829e = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_login_sms_up_to_mobile");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        this.f154830f = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginByMobileSendSmsUI", "onCreate verifyCode=%s, toMobile=%s", this.f154829e, str);
        mo43517x10010bd5();
        this.f154846y.setText(T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwp, this.f154829e)));
        this.f154847z.setText(T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hws, this.f154830f)));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(this.f154828d, this.f154830f, this.f154829e)) {
            this.f154844w.setEnabled(false);
            this.f154845x.setEnabled(false);
        } else {
            this.f154845x.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w3(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wo.w0.o())) {
            this.f154844w.setVisibility(8);
        } else {
            this.f154844w.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x3(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hwm), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u3(this), null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f6  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r18, int r19, java.lang.String r20, com.p314xaae8f345.mm.p944x882e457a.m1 r21) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11408xe972dee3.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        U6();
        gm0.j1.d().q(145, this);
    }
}
