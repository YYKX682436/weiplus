package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI */
/* loaded from: classes8.dex */
public class ActivityC11358x5a6f125e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f154461s = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f154463e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f154464f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154465g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f154466h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154467i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f154468m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f154469n;

    /* renamed from: o, reason: collision with root package name */
    public r61.c1 f154470o;

    /* renamed from: q, reason: collision with root package name */
    public int f154472q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f154462d = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f154471p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f154473r = false;

    public final void T6(int i17) {
        this.f154470o = new r61.c1(r61.b1.MM_BIND_GCONTACT_OPCODE_BIND, this.f154465g, i17);
        gm0.j1.d().g(this.f154470o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "doScene mAppToken:%s, mWebToke:%s", this.f154466h, this.f154467i);
    }

    public final void U6() {
        android.app.ProgressDialog progressDialog = this.f154469n;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f154469n.dismiss();
    }

    public final void V6() {
        X6();
        this.f154463e.mo120153xd15cf999().E(true);
        this.f154463e.mo74800x23d27c02(new p61.i(this));
        this.f154463e.mo81410x6fd49b97(new p61.j(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f154463e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContactLogic", "getRequestCodeUrl:%s", "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
        c22633x83752a59.mo32265x141096a9("https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
    }

    public final void W6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f154463e;
        if (c22633x83752a59 != null) {
            c22633x83752a59.setVisibility(4);
        }
        android.widget.TextView textView = this.f154464f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        this.f154464f.setText(!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqw) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqo));
    }

    public final void X6() {
        android.app.ProgressDialog progressDialog = this.f154469n;
        if (progressDialog == null || !progressDialog.isShowing()) {
            this.f154469n = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new p61.o(this));
        }
    }

    public void Y6() {
        if (this.f154462d) {
            this.f154463e.setVisibility(8);
            X6();
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 1003);
        } else {
            this.f154464f.setVisibility(4);
            this.f154463e.setVisibility(0);
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569732k9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.fqn);
        mo54448x9c8c0d33(new p61.h(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) findViewById(com.p314xaae8f345.mm.R.id.gqc);
        c22633x83752a59.getClass();
        this.f154463e = c22633x83752a59;
        this.f154464f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dez);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 1005) {
                this.f154462d = intent.getBooleanExtra("gpservices", false);
                Y6();
                return;
            } else {
                U6();
                W6();
                return;
            }
        }
        switch (i17) {
            case 1003:
                int intExtra = intent.getIntExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d ", java.lang.Integer.valueOf(intExtra));
                if (intExtra != 0) {
                    U6();
                    W6();
                    return;
                }
                this.f154465g = intent.getStringExtra("account");
                if (this.f154471p) {
                    U6();
                    return;
                }
                android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.gms.ACTION_GET_TOKEN");
                intent2.putExtra("gmail", this.f154465g);
                intent2.putExtra("scope", "oauth2:https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds");
                startActivityForResult(intent2, 1004);
                return;
            case 1004:
                int intExtra2 = intent.getIntExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d errorMsg:%s", java.lang.Integer.valueOf(intExtra2), intent.getStringExtra("error_msg"));
                if (intExtra2 == 0) {
                    this.f154466h = intent.getStringExtra("token");
                    T6(0);
                    return;
                } else if (intExtra2 == -3) {
                    U6();
                    W6();
                    return;
                } else {
                    U6();
                    W6();
                    return;
                }
            case 1005:
                this.f154462d = intent.getBooleanExtra("gpservices", false);
                Y6();
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154472q = getIntent().getIntExtra("enter_scene", 0);
        this.f154473r = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f154462d = r61.r0.b(this);
        this.f154465g = (java.lang.String) gm0.j1.u().c().l(208903, null);
        mo43517x10010bd5();
        if (this.f154462d) {
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 1005);
        } else {
            Y6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(487, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(487, this);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) c17.l(208905, bool)).booleanValue()) {
            try {
                com.p314xaae8f345.p3210x3857dc.d.g().e();
            } catch (java.lang.Exception unused) {
            }
            gm0.j1.u().c().w(208905, bool);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        U6();
        if (i17 != 0 || i18 != 0) {
            if (i18 == -85) {
                db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fqu), "", new p61.m(this), new p61.n(this));
                return;
            } else {
                W6();
                return;
            }
        }
        if (this.f154462d) {
            gm0.j1.u().c().w(208903, this.f154465g);
            gm0.j1.u().c().w(208901, this.f154466h);
        } else {
            gm0.j1.u().c().w(208903, this.f154465g);
            gm0.j1.u().c().w(208902, this.f154467i);
            gm0.j1.u().c().w(208904, this.f154468m);
        }
        gm0.j1.u().c().i(true);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11369x8a612b2b.class);
        intent.putExtra("enter_scene", this.f154472q);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        if (this.f154473r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 6, 6);
        }
    }
}
