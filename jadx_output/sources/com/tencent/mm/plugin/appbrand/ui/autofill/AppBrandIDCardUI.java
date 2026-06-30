package com.tencent.mm.plugin.appbrand.ui.autofill;

@db5.a(3)
/* loaded from: classes14.dex */
public class AppBrandIDCardUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int C = 0;
    public com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem A;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragment f89531d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f89532e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f89533f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f89534g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f89535h;

    /* renamed from: i, reason: collision with root package name */
    public int f89536i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f89537m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f89538n;

    /* renamed from: o, reason: collision with root package name */
    public r45.o56 f89539o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kc f89540p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f89541q;

    /* renamed from: r, reason: collision with root package name */
    public int f89542r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f89543s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f89544t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f89545u;

    /* renamed from: v, reason: collision with root package name */
    public int f89546v;

    /* renamed from: x, reason: collision with root package name */
    public fl1.c0 f89548x;

    /* renamed from: y, reason: collision with root package name */
    public db1.p f89549y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f89550z;

    /* renamed from: w, reason: collision with root package name */
    public boolean f89547w = false;
    public final wj1.m0 B = new wj1.c0(this);

    public static void T6(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI, java.lang.String str) {
        appBrandIDCardUI.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        j45.l.j(appBrandIDCardUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void U6() {
        fl1.c0 c0Var;
        if ((this.f89531d instanceof com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag) && this.f89546v == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "switchToShowFragment");
            ((ku5.t0) ku5.t0.f312615d).B(new wj1.g0(this));
            return;
        }
        int i17 = this.f89546v;
        if ((i17 == 1 || i17 == 2) && (c0Var = this.f89548x) != null && c0Var.e()) {
            return;
        }
        finish();
    }

    public final void V6(int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(this.f89536i), this.f89537m, java.lang.Integer.valueOf(i17), this.f89538n);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        db1.p pVar;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f89550z;
        if (u3Var != null && u3Var.isShowing()) {
            this.f89550z.dismiss();
        }
        fl1.c0 c0Var = this.f89548x;
        if (c0Var != null && (pVar = this.f89549y) != null) {
            c0Var.a(pVar);
        }
        super.finish();
        int i17 = this.f89546v;
        if (i17 == 1 || i17 == 2) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "onActivityResult, requestcode: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 10000 || i17 == 10001) {
            db1.p pVar = this.f89549y;
            if (pVar != null) {
                pVar.e((java.util.ArrayList) vi1.o0.f437416a.b());
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "onActivityResult, AuthDialog is null");
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int identifier;
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f89546v = extras.getInt("id_ui_theme", 0);
        }
        int i17 = this.f89546v;
        if (i17 == 1 || i17 == 2) {
            setTheme(com.tencent.mm.R.style.f494400m2);
        }
        super.onCreate(bundle);
        if (extras == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "bundle is null, return");
            finish();
            return;
        }
        this.f89532e = extras.getString("intent_appid", "");
        this.f89533f = extras.getString("wecoin_protocol_url", "");
        this.f89534g = extras.getString("wecoin_apply_info", "");
        this.f89535h = extras.getString("wecoin_apply_wording", "");
        this.f89536i = extras.getInt("wecoin_kv_scene_id", 1);
        this.f89537m = extras.getString("wecoin_kv_session_id", "");
        this.f89538n = extras.getString("wecoin_kv_cgi_session_id", "");
        this.f89545u = extras.getString("intent_app_name", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f89532e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "appId is null, return");
            finish();
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            java.lang.String string = extras.getString("intent_category_id");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "[processCategoryId] categoryIdStr:%s", string);
            org.json.JSONArray jSONArray = new org.json.JSONArray(string);
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                linkedList.add(java.lang.Integer.valueOf(jSONArray.optInt(i18)));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandIDCardUI", e17, "", new java.lang.Object[0]);
            linkedList = null;
        }
        this.f89541q = linkedList;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList) || this.f89541q.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "categoryId is null, return");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_err_code", 40003);
            intent.putExtra("intent_err_msg", "category_id is null");
            setResult(1, intent);
            finish();
            return;
        }
        this.f89542r = extras.getInt("intent_auth_type", 1);
        getContentView().setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a07));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.setId(com.tencent.mm.R.id.f483136xj);
        ((android.view.ViewGroup) getContentView()).addView(frameLayout, layoutParams);
        setBackBtn(new wj1.e0(this));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.ggc), true, true, new wj1.f0(this));
        this.f89550z = Q;
        Q.show();
        int i19 = this.f89546v;
        if (i19 == 1 || i19 == 2) {
            com.tencent.mm.ui.bk.k0(getWindow());
            getContentView().setBackgroundColor(0);
            getContentView().findViewById(com.tencent.mm.R.id.f483136xj).setBackgroundColor(0);
            this.f89548x = new fl1.c0(getContext(), null);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getWindow().getDecorView();
            android.view.View childAt = viewGroup.getChildAt(0);
            if ((childAt instanceof android.view.ViewGroup) && this.f89547w) {
                if (!(childAt instanceof android.widget.FrameLayout)) {
                    android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(childAt.getContext());
                    android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    androidx.appcompat.app.AppCompatActivity context = getContext();
                    int l17 = com.tencent.mm.ui.bk.l(context);
                    layoutParams2.bottomMargin = (!(l17 > 0 && l17 != com.tencent.mm.ui.bk.p(context)) || (identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID)) <= 0) ? 0 : android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
                    viewGroup.addView(frameLayout2, layoutParams2);
                    childAt = frameLayout2;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "find sub viewgroup in decorview");
                childAt.setFitsSystemWindows(false);
                try {
                    ((android.view.ViewGroup) childAt).addView(this.f89548x);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandIDCardUI", "add view to decorSubView error", e18);
                    ((android.view.ViewGroup) getContentView()).addView(this.f89548x);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "can't find sub viewgroup in decorview, request overlay: %b", java.lang.Boolean.valueOf(this.f89547w));
                ((android.view.ViewGroup) getContentView()).addView(this.f89548x);
            }
        }
        wj1.c0 c0Var = (wj1.c0) this.B;
        c0Var.getClass();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.n56();
        lVar.f70665b = new r45.o56();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/userdata/showauthorizeuserid";
        lVar.f70667d = 1774;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.n56 n56Var = (r45.n56) a17.f70710a.f70684a;
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
        n56Var.f381092d = appBrandIDCardUI.f89532e;
        n56Var.f381093e = appBrandIDCardUI.f89541q;
        n56Var.f381094f = appBrandIDCardUI.f89542r;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).Ai(a17, new wj1.j(c0Var), appBrandIDCardUI.theCreate());
        if (getF65848t()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        int i17 = this.f89546v;
        if (i17 == 1 || i17 == 2) {
            setTheme(com.tencent.mm.R.style.f494400m2);
        }
        try {
            getWindow().requestFeature(10);
            this.f89547w = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandIDCardUI", "request overlay failed", th6);
            this.f89547w = false;
        }
        getWindow().getDecorView().setFitsSystemWindows(true);
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        U6();
    }
}
