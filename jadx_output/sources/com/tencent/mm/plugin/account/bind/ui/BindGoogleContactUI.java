package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes8.dex */
public class BindGoogleContactUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f72928s = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f72930e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f72931f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f72932g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f72933h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f72934i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f72935m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f72936n;

    /* renamed from: o, reason: collision with root package name */
    public r61.c1 f72937o;

    /* renamed from: q, reason: collision with root package name */
    public int f72939q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f72929d = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f72938p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f72940r = false;

    public final void T6(int i17) {
        this.f72937o = new r61.c1(r61.b1.MM_BIND_GCONTACT_OPCODE_BIND, this.f72932g, i17);
        gm0.j1.d().g(this.f72937o);
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "doScene mAppToken:%s, mWebToke:%s", this.f72933h, this.f72934i);
    }

    public final void U6() {
        android.app.ProgressDialog progressDialog = this.f72936n;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f72936n.dismiss();
    }

    public final void V6() {
        X6();
        this.f72930e.getSettings().E(true);
        this.f72930e.setWebViewClient(new p61.i(this));
        this.f72930e.setWebChromeClient(new p61.j(this));
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f72930e;
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContactLogic", "getRequestCodeUrl:%s", "https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
        mMWebView.loadUrl("https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds&redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=code&client_id=369820936870.apps.googleusercontent.com");
    }

    public final void W6() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f72930e;
        if (mMWebView != null) {
            mMWebView.setVisibility(4);
        }
        android.widget.TextView textView = this.f72931f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        this.f72931f.setText(!com.tencent.mars.comm.NetStatusUtil.isConnected(this) ? getString(com.tencent.mm.R.string.fqw) : getString(com.tencent.mm.R.string.fqo));
    }

    public final void X6() {
        android.app.ProgressDialog progressDialog = this.f72936n;
        if (progressDialog == null || !progressDialog.isShowing()) {
            this.f72936n = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new p61.o(this));
        }
    }

    public void Y6() {
        if (this.f72929d) {
            this.f72930e.setVisibility(8);
            X6();
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.ACTION_CHOOSE_ACCOUNT"), 1003);
        } else {
            this.f72931f.setVisibility(4);
            this.f72930e.setVisibility(0);
            V6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488199k9;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.fqn);
        setBackBtn(new p61.h(this));
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) findViewById(com.tencent.mm.R.id.gqc);
        mMWebView.getClass();
        this.f72930e = mMWebView;
        this.f72931f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dez);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 1005) {
                this.f72929d = intent.getBooleanExtra("gpservices", false);
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
                int intExtra = intent.getIntExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d ", java.lang.Integer.valueOf(intExtra));
                if (intExtra != 0) {
                    U6();
                    W6();
                    return;
                }
                this.f72932g = intent.getStringExtra("account");
                if (this.f72938p) {
                    U6();
                    return;
                }
                android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.gms.ACTION_GET_TOKEN");
                intent2.putExtra("gmail", this.f72932g);
                intent2.putExtra("scope", "oauth2:https://www.googleapis.com/auth/userinfo.email https://www.google.com/m8/feeds");
                startActivityForResult(intent2, 1004);
                return;
            case 1004:
                int intExtra2 = intent.getIntExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, -1);
                com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "errorCode:%d errorMsg:%s", java.lang.Integer.valueOf(intExtra2), intent.getStringExtra("error_msg"));
                if (intExtra2 == 0) {
                    this.f72933h = intent.getStringExtra("token");
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
                this.f72929d = intent.getBooleanExtra("gpservices", false);
                Y6();
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f72939q = getIntent().getIntExtra("enter_scene", 0);
        this.f72940r = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f72929d = r61.r0.b(this);
        this.f72932g = (java.lang.String) gm0.j1.u().c().l(208903, null);
        initView();
        if (this.f72929d) {
            startActivityForResult(new android.content.Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 1005);
        } else {
            Y6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(487, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(487, this);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) c17.l(208905, bool)).booleanValue()) {
            try {
                com.tencent.xweb.d.g().e();
            } catch (java.lang.Exception unused) {
            }
            gm0.j1.u().c().w(208905, bool);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.BindGoogleContactUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        U6();
        if (i17 != 0 || i18 != 0) {
            if (i18 == -85) {
                db5.e1.u(this, getString(com.tencent.mm.R.string.fqu), "", new p61.m(this), new p61.n(this));
                return;
            } else {
                W6();
                return;
            }
        }
        if (this.f72929d) {
            gm0.j1.u().c().w(208903, this.f72932g);
            gm0.j1.u().c().w(208901, this.f72933h);
        } else {
            gm0.j1.u().c().w(208903, this.f72932g);
            gm0.j1.u().c().w(208902, this.f72934i);
            gm0.j1.u().c().w(208904, this.f72935m);
        }
        gm0.j1.u().c().i(true);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.class);
        intent.putExtra("enter_scene", this.f72939q);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        if (this.f72940r) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 6, 6);
        }
    }
}
