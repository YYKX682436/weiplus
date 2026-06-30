package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI */
/* loaded from: classes7.dex */
public final class ActivityC12691x888e5f7e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f170980q = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f170982e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f170983f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f170984g;

    /* renamed from: h, reason: collision with root package name */
    public int f170985h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f170986i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f170987m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 f170988n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f170989o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f170981d = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f170990p = "";

    public final void T6(boolean z17) {
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ous);
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI", "showUserInfoPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI", "showUserInfoPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        boolean z17;
        android.content.Intent intent = new android.content.Intent();
        java.util.List list = this.f170982e;
        java.util.List list2 = this.f170981d;
        boolean z18 = true;
        if (list != null && list.size() == ((java.util.ArrayList) list2).size()) {
            java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
            boolean z19 = false;
            while (it.hasNext()) {
                fl1.h1 h1Var = (fl1.h1) it.next();
                java.util.List list3 = this.f170982e;
                if (list3 != null) {
                    java.util.Iterator it6 = list3.iterator();
                    z17 = false;
                    while (it6.hasNext()) {
                        if (h1Var.f345319h == ((fl1.h1) it6.next()).f345319h) {
                            z17 = true;
                        }
                    }
                } else {
                    z17 = false;
                }
                if (!z17) {
                    z19 = true;
                }
            }
            z18 = z19;
        }
        intent.putExtra("key_result_user_info_list_been_modified", z18);
        intent.putExtra("key_result_is_open", this.f170983f);
        intent.putExtra("key_result_selected_user_id", this.f170985h);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569637h9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var = this.f170988n;
        if (m0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("wxaUserInfoListOperationController");
            throw null;
        }
        rl5.r rVar = m0Var.f161060i;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.pa(this));
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a4r);
        android.os.Bundle extras = getIntent().getExtras();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992 c12007xb9118992 = extras != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.C12007xb9118992) extras.getParcelable("key_user_info") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.String string = extras2 != null ? extras2.getString("key_app_id") : null;
        this.f170990p = string == null ? "" : string;
        android.os.Bundle extras3 = getIntent().getExtras();
        java.lang.Boolean valueOf = extras3 != null ? java.lang.Boolean.valueOf(extras3.getBoolean("key_is_state_open")) : null;
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
        this.f170983f = booleanValue;
        T6(booleanValue);
        if (c12007xb9118992 == null || string == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandUserInfoAuthorizeUI", "WxaUserInfoData or appId is null, finish activity");
            finish();
            return;
        }
        this.f170985h = c12007xb9118992.f161000g;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567369j91);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById;
        viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(this.f170983f);
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.qa(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.f170986i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mag);
        java.lang.String str = c12007xb9118992.f161006p;
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4u);
        }
        textView.setText(str);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ou8);
        java.lang.String str2 = c12007xb9118992.f161005o;
        if (android.text.TextUtils.isEmpty(str2)) {
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            android.os.Bundle extras4 = getIntent().getExtras();
            java.lang.String string3 = extras4 != null ? extras4.getString("key_nickname") : null;
            if (string3 == null) {
                string3 = "";
            }
            objArr[0] = string3;
            str2 = java.lang.String.format(string2, java.util.Arrays.copyOf(objArr, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "format(...)");
        }
        textView2.setText(str2);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.i3o);
        java.lang.String str3 = c12007xb9118992.f161007q;
        if (android.text.TextUtils.isEmpty(str3)) {
            str3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4t);
        }
        textView3.setText(str3);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ouq);
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2).setNestedScrollingEnabled(false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "also(...)");
        this.f170989o = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0(this, c12007xb9118992, "", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.sa(this, string));
        this.f170988n = m0Var;
        m0Var.f161059h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ua(this);
        fl1.r1 r1Var = new fl1.r1(this.f170981d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f170989o;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userInfoList");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(r1Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f170989o;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userInfoList");
            throw null;
        }
        c1163xf1deaba42.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f170989o;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("userInfoList");
            throw null;
        }
        c1163xf1deaba43.m7964x8d4ad49c(null);
        r1Var.f345386f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.va(this);
        r1Var.f345385e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.wa(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f170987m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
