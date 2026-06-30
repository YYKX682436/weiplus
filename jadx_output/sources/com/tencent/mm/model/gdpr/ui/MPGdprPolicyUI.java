package com.tencent.mm.model.gdpr.ui;

@db5.a(1)
/* loaded from: classes8.dex */
public class MPGdprPolicyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f70381i = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt) + "/cgi-bin/newreadtemplate?t=gdpr/confirm&business=%s&lang=%s&cc=%s";

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFalseProgressBar f70382d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f70383e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.model.gdpr.a f70384f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f70385g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.ResultReceiver f70386h;

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        super.dealContentView(view);
        ((yg0.z2) com.tencent.mm.plugin.webview.ui.tools.widget.a2.f187099a).getClass();
        com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi a17 = com.tencent.mm.plugin.webview.ui.tools.widget.p4.a(this);
        this.f70383e = a17;
        a17.getSettings().z(true);
        this.f70383e.getSettings().E(true);
        this.f70383e.getSettings().I(false);
        this.f70383e.getSettings().J(0);
        this.f70383e.getSettings().Q(ik1.l0.a(getContext(), this.f70383e.getSettings().g(), (ik1.k0) nd.f.a(ik1.k0.class)));
        this.f70383e.getView().setHorizontalScrollBarEnabled(false);
        this.f70383e.getView().setVerticalScrollBarEnabled(false);
        this.f70383e.getSettings().r(true);
        this.f70383e.getSettings().P(true);
        this.f70383e.getSettings().G(true);
        this.f70383e.getSettings().M(false);
        this.f70383e.getSettings().L(false);
        this.f70383e.getSettings().C(true);
        this.f70383e.getSettings().D(true);
        this.f70383e.getSettings().l(10485760L);
        this.f70383e.getSettings().m(getContext().getDir("webviewcache", 0).getAbsolutePath());
        this.f70383e.getSettings().k(true);
        this.f70383e.getSettings().t(true);
        this.f70383e.getSettings().u(lp0.b.X() + "databases/");
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putBoolean("KInitialParam_Force_wcPrivacyPolicyResult_DoInService", true);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f70383e;
        com.tencent.mm.plugin.webview.ui.tools.widget.w1 w1Var = com.tencent.mm.plugin.webview.ui.tools.widget.v1.f187579a;
        g01.d dVar = new g01.d(this);
        ((yg0.w2) w1Var).getClass();
        mMWebView.setWebViewClient(new com.tencent.mm.plugin.webview.ui.tools.widget.w3(mMWebView, false, dVar, bundle));
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = this.f70383e;
        com.tencent.mm.plugin.webview.ui.tools.widget.t1 t1Var = com.tencent.mm.plugin.webview.ui.tools.widget.s1.f187530a;
        g01.f fVar = new g01.f(this);
        ((yg0.w2) t1Var).getClass();
        mMWebView2.setWebChromeClient(new com.tencent.mm.plugin.webview.ui.tools.widget.q2(mMWebView2, fVar));
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        frameLayout.addView(this.f70383e, -1, -1);
        com.tencent.mm.ui.base.MMFalseProgressBar mMFalseProgressBar = new com.tencent.mm.ui.base.MMFalseProgressBar(this);
        this.f70382d = mMFalseProgressBar;
        mMFalseProgressBar.setProgressDrawable(i65.a.i(this, com.tencent.mm.R.drawable.f481982ap4));
        frameLayout.addView(this.f70382d, -1, i65.a.b(this, 3));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        android.os.ResultReceiver resultReceiver = this.f70386h;
        if (resultReceiver != null) {
            if (resultReceiver != null) {
                resultReceiver.send(-1, null);
            }
            this.f70386h = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (getIntent() != null) {
                android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) getIntent().getParcelableExtra("MPGdprPolicyUI_KEY_RECEIVER");
                this.f70386h = resultReceiver;
                if (resultReceiver != null) {
                    com.tencent.mm.model.gdpr.a a17 = com.tencent.mm.model.gdpr.a.a(getIntent().getStringExtra("MPGdprPolicyUI_KEY_BUSINESS"));
                    this.f70384f = a17;
                    if (a17 != null) {
                        this.f70385g = getIntent().getStringExtra("MPGdprPolicyUI_KEY_APPID");
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.MPGdprPolicyUI", "onCreate get empty business");
                    android.os.ResultReceiver resultReceiver2 = this.f70386h;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(-1, null);
                    }
                    finish();
                    return;
                }
            }
            finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MPGdprPolicyUI", "onCreate get receiver ex = %s", e17);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            try {
                this.f70383e.destroy();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MPGdprPolicyUI", "destroy WebView e = %s", e17);
            }
        } finally {
            this.f70383e = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || !this.f70383e.canGoBack()) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f70383e.goBack();
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        setBackBtn(new g01.g(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        setActionbarColor(-1);
        this.f70383e.loadUrl(java.lang.String.format(java.util.Locale.US, f70381i, this.f70384f.f70370d, com.tencent.mm.sdk.platformtools.m2.f(this), (java.lang.String) gm0.j1.u().c().l(274436, null)));
    }
}
