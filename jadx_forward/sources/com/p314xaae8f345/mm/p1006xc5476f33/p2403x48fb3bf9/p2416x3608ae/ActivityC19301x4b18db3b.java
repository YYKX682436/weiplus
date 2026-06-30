package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

@db5.a(m123858x6ac9171 = 7)
@com.p314xaae8f345.mm.ui.a2
/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI */
/* loaded from: classes.dex */
public class ActivityC19301x4b18db3b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f265001s = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f265005g;

    /* renamed from: d, reason: collision with root package name */
    public boolean f265002d = false;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 f265003e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f265004f = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f265006h = "";

    /* renamed from: i, reason: collision with root package name */
    public boolean f265007i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265008m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 f265009n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.o(this);

    /* renamed from: o, reason: collision with root package name */
    public final android.content.DialogInterface.OnDismissListener f265010o = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.p(this);

    /* renamed from: p, reason: collision with root package name */
    public int f265011p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f265012q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.q(this), true);

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f265013r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.r(this), true);

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return getIntent().getIntExtra("screen_orientation", -1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (fp.h.c(21)) {
            getWindow().setStatusBarColor(0);
        }
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        if (getIntent().getIntExtra("proxyui_darkmode_key", 0) == 1) {
            m78607xef685e15(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) getIntent().getParcelableExtra("webview_stub_callbacker_key");
        if (c19336x1603547 != null) {
            this.f265003e = c19336x1603547.f265328d;
        }
        android.content.Intent intent = getIntent();
        int intExtra = intent.getIntExtra("proxyui_action_code_key", 0);
        this.f265005g = intent.getIntExtra("webview_binder_id", 0);
        this.f265006h = intent.getStringExtra("proxyui_function_key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubProxyUI", "onCreate, actionCode = %d, binderID = %d, functionName=%s", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(this.f265005g), this.f265006h);
        if ("startMonitoringBeacons".equals(this.f265006h)) {
            this.f265002d = true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f265012q;
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f265010o;
        switch (intExtra) {
            case 1:
                if (com.p314xaae8f345.mm.ui.bk.w0()) {
                    this.f265008m = true;
                    com.p314xaae8f345.mm.ui.fj.e("com.tencent.mm.ui.transmit.SelectConversationUI", 0);
                    com.p314xaae8f345.mm.ui.fj.e("com.tencent.mm.ui.chatting.ChattingUI", 0);
                }
                if (!this.f265004f) {
                    b4Var.c(100L, 100L);
                }
                if (this.f265002d) {
                    this.f265013r.c(5000L, 5000L);
                    return;
                }
                return;
            case 2:
                runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.i(this));
                return;
            case 3:
                com.p314xaae8f345.mm.p2621x8fb0427b.ja m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
                if (!c01.z1.s()) {
                    j0Var = db5.e1.n(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572505bf0, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.j(this), null);
                } else if (m07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m07.f276591b)) {
                    j0Var = db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.j09, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                } else {
                    java.lang.String stringExtra = getIntent().getStringExtra("shortUrl");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    int intExtra2 = getIntent().getIntExtra("type", 0);
                    ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.e1(intExtra2, stringExtra, ""));
                    try {
                        this.f265003e.v3(0);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubProxyUI", "setTitlePbVisibility, ex = " + e17.getMessage());
                    }
                }
                if (j0Var == null) {
                    finish();
                    return;
                } else {
                    j0Var.setOnDismissListener(onDismissListener);
                    return;
                }
            case 4:
                b4Var.c(100L, 100L);
                return;
            case 5:
                o25.x1 x1Var = (o25.x1) i95.n0.c(o25.x1.class);
                java.lang.String stringExtra2 = intent.getStringExtra("proxyui_handle_event_url");
                ((com.p314xaae8f345.mm.app.p622xc5476f33.n) x1Var).getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    return;
                }
                if (stringExtra2.endsWith("@mailto@")) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.c(this, stringExtra2.substring(0, stringExtra2.length() - 8), onDismissListener);
                    return;
                } else {
                    if (stringExtra2.endsWith("@tel@")) {
                        java.lang.String substring = stringExtra2.substring(0, stringExtra2.length() - 5);
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putInt("fromScene", 3);
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.u0.d(this, substring, onDismissListener, bundle2);
                        return;
                    }
                    return;
                }
            case 6:
                int intExtra3 = getIntent().getIntExtra("proxyui_expired_errtype", 0);
                int intExtra4 = getIntent().getIntExtra("proxyui_expired_errcode", 0);
                if (intExtra3 == 0 && intExtra4 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "PROXY_AC_VALUE_ACCOUNT_EXPIRED, errType & errCode should not both be 0");
                    return;
                }
                return;
            case 7:
            default:
                return;
            case 8:
                java.lang.String stringExtra3 = getIntent().getStringExtra("proxyui_phone");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "show phone span dialog, phone is empty");
                    finish();
                    return;
                }
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putInt("fromScene", 3);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6025x5a5ef32a c6025x5a5ef32a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6025x5a5ef32a();
                am.ru ruVar = c6025x5a5ef32a.f136316g;
                ruVar.f89376a = this;
                ruVar.f89377b = stringExtra3;
                ruVar.f89378c = onDismissListener;
                ruVar.f89379d = bundle3;
                c6025x5a5ef32a.e();
                return;
            case 9:
                android.content.Intent intent2 = (android.content.Intent) getIntent().getExtras().getParcelable("proxyui_next_intent_key");
                intent2.setFlags(603979776);
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClassName(this, "com.tencent.mm.plugin.account.ui.SimpleLoginUI");
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, intent3, intent2);
                finish();
                return;
            case 10:
                java.lang.String stringExtra4 = getIntent().getStringExtra("KAppId");
                java.lang.String stringExtra5 = getIntent().getStringExtra("shortcut_user_name");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5)) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.k(this));
                Q.show();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, stringExtra5, stringExtra4, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.m(this, Q));
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (com.p314xaae8f345.mm.ui.bk.w0() && this.f265008m) {
            com.p314xaae8f345.mm.ui.fj.k("com.tencent.mm.ui.transmit.SelectConversationUI", 0);
            com.p314xaae8f345.mm.ui.fj.k("com.tencent.mm.ui.chatting.ChattingUI", 0);
        }
        if (!this.f265007i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265005g);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = this.f265003e;
            a17.W6(context, z0Var, z0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265005g).f6();
        if (!this.f265002d) {
            this.f265003e = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265005g);
        android.app.ProgressDialog progressDialog = a18.f266512h;
        if (progressDialog != null) {
            progressDialog.dismiss();
            a18.f266512h = null;
        }
        if (!this.f265007i && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265005g).f266527w, this.f265006h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265005g).X6(false, this.f265006h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubProxyUI", "onDestroy setIsBusy false");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubProxyUI", "onDestroy proxyui");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 72 && i17 != 113) {
            switch (i17) {
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                    break;
                default:
                    switch (i17) {
                        case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de /* 149 */:
                        case 150:
                        case 151:
                        case 152:
                            break;
                        default:
                            return;
                    }
            }
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265005g).mo9729x757c998b(i17, 0, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(this.f265005g).mo9729x757c998b(i17, -1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubProxyUI", "onRestoreInstanceState binderID = %d", java.lang.Integer.valueOf(this.f265005g));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubProxyUI", "onSaveInstanceState binderID = %d", java.lang.Integer.valueOf(this.f265005g));
    }
}
