package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI */
/* loaded from: classes14.dex */
public class ActivityC12702xc32382a5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int C = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 A;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 f171064d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f171065e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f171066f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171067g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f171068h;

    /* renamed from: i, reason: collision with root package name */
    public int f171069i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f171070m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f171071n;

    /* renamed from: o, reason: collision with root package name */
    public r45.o56 f171072o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kc f171073p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f171074q;

    /* renamed from: r, reason: collision with root package name */
    public int f171075r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f171076s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f171077t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f171078u;

    /* renamed from: v, reason: collision with root package name */
    public int f171079v;

    /* renamed from: x, reason: collision with root package name */
    public fl1.c0 f171081x;

    /* renamed from: y, reason: collision with root package name */
    public db1.p f171082y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f171083z;

    /* renamed from: w, reason: collision with root package name */
    public boolean f171080w = false;
    public final wj1.m0 B = new wj1.c0(this);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5, java.lang.String str) {
        activityC12702xc32382a5.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "url is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        j45.l.j(activityC12702xc32382a5, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    public final void U6() {
        fl1.c0 c0Var;
        if ((this.f171064d instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12703xefb74f45) && this.f171079v == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "switchToShowFragment");
            ((ku5.t0) ku5.t0.f394148d).B(new wj1.g0(this));
            return;
        }
        int i17 = this.f171079v;
        if ((i17 == 1 || i17 == 2) && (c0Var = this.f171081x) != null && c0Var.e()) {
            return;
        }
        finish();
    }

    public final void V6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(this.f171069i), this.f171070m, java.lang.Integer.valueOf(i17), this.f171071n);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        db1.p pVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f171083z;
        if (u3Var != null && u3Var.isShowing()) {
            this.f171083z.dismiss();
        }
        fl1.c0 c0Var = this.f171081x;
        if (c0Var != null && (pVar = this.f171082y) != null) {
            c0Var.a(pVar);
        }
        super.finish();
        int i17 = this.f171079v;
        if (i17 == 1 || i17 == 2) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "onActivityResult, requestcode: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 10000 || i17 == 10001) {
            db1.p pVar = this.f171082y;
            if (pVar != null) {
                pVar.e((java.util.ArrayList) vi1.o0.f518949a.b());
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "onActivityResult, AuthDialog is null");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int identifier;
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f171079v = extras.getInt("id_ui_theme", 0);
        }
        int i17 = this.f171079v;
        if (i17 == 1 || i17 == 2) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        }
        super.onCreate(bundle);
        if (extras == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "bundle is null, return");
            finish();
            return;
        }
        this.f171065e = extras.getString("intent_appid", "");
        this.f171066f = extras.getString("wecoin_protocol_url", "");
        this.f171067g = extras.getString("wecoin_apply_info", "");
        this.f171068h = extras.getString("wecoin_apply_wording", "");
        this.f171069i = extras.getInt("wecoin_kv_scene_id", 1);
        this.f171070m = extras.getString("wecoin_kv_session_id", "");
        this.f171071n = extras.getString("wecoin_kv_cgi_session_id", "");
        this.f171078u = extras.getString("intent_app_name", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f171065e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "appId is null, return");
            finish();
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            java.lang.String string = extras.getString("intent_category_id");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "[processCategoryId] categoryIdStr:%s", string);
            org.json.JSONArray jSONArray = new org.json.JSONArray(string);
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                linkedList.add(java.lang.Integer.valueOf(jSONArray.optInt(i18)));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandIDCardUI", e17, "", new java.lang.Object[0]);
            linkedList = null;
        }
        this.f171074q = linkedList;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) || this.f171074q.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "categoryId is null, return");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("intent_err_code", 40003);
            intent.putExtra("intent_err_msg", "category_id is null");
            setResult(1, intent);
            finish();
            return;
        }
        this.f171075r = extras.getInt("intent_auth_type", 1);
        m78513xc2a54588().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.setId(com.p314xaae8f345.mm.R.id.f564669xj);
        ((android.view.ViewGroup) m78513xc2a54588()).addView(frameLayout, layoutParams);
        mo54448x9c8c0d33(new wj1.e0(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new wj1.f0(this));
        this.f171083z = Q;
        Q.show();
        int i19 = this.f171079v;
        if (i19 == 1 || i19 == 2) {
            com.p314xaae8f345.mm.ui.bk.k0(getWindow());
            m78513xc2a54588().setBackgroundColor(0);
            m78513xc2a54588().findViewById(com.p314xaae8f345.mm.R.id.f564669xj).setBackgroundColor(0);
            this.f171081x = new fl1.c0(mo55332x76847179(), null);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getWindow().getDecorView();
            android.view.View childAt = viewGroup.getChildAt(0);
            if ((childAt instanceof android.view.ViewGroup) && this.f171080w) {
                if (!(childAt instanceof android.widget.FrameLayout)) {
                    android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(childAt.getContext());
                    android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                    int l17 = com.p314xaae8f345.mm.ui.bk.l(mo55332x76847179);
                    layoutParams2.bottomMargin = (!(l17 > 0 && l17 != com.p314xaae8f345.mm.ui.bk.p(mo55332x76847179)) || (identifier = android.content.res.Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f)) <= 0) ? 0 : android.content.res.Resources.getSystem().getDimensionPixelSize(identifier);
                    viewGroup.addView(frameLayout2, layoutParams2);
                    childAt = frameLayout2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "find sub viewgroup in decorview");
                childAt.setFitsSystemWindows(false);
                try {
                    ((android.view.ViewGroup) childAt).addView(this.f171081x);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandIDCardUI", "add view to decorSubView error", e18);
                    ((android.view.ViewGroup) m78513xc2a54588()).addView(this.f171081x);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "can't find sub viewgroup in decorview, request overlay: %b", java.lang.Boolean.valueOf(this.f171080w));
                ((android.view.ViewGroup) m78513xc2a54588()).addView(this.f171081x);
            }
        }
        wj1.c0 c0Var = (wj1.c0) this.B;
        c0Var.getClass();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.n56();
        lVar.f152198b = new r45.o56();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/userdata/showauthorizeuserid";
        lVar.f152200d = 1774;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        r45.n56 n56Var = (r45.n56) a17.f152243a.f152217a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
        n56Var.f462625d = activityC12702xc32382a5.f171065e;
        n56Var.f462626e = activityC12702xc32382a5.f171074q;
        n56Var.f462627f = activityC12702xc32382a5.f171075r;
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).Ai(a17, new wj1.j(c0Var), activityC12702xc32382a5.m78765xba1c74cd());
        if (getF147381t()) {
            m78735x28280f95().m81450x8e764904(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        int i17 = this.f171079v;
        if (i17 == 1 || i17 == 2) {
            setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        }
        try {
            getWindow().requestFeature(10);
            this.f171080w = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandIDCardUI", "request overlay failed", th6);
            this.f171080w = false;
        }
        getWindow().getDecorView().setFitsSystemWindows(true);
        mo2550x7c2abd06(10);
        mo2550x7c2abd06(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        U6();
    }
}
