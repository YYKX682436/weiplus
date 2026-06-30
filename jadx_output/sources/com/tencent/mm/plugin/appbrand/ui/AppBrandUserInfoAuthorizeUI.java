package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandUserInfoAuthorizeUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f89447q = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f89449e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f89450f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f89451g;

    /* renamed from: h, reason: collision with root package name */
    public int f89452h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f89453i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f89454m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f89455n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f89456o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f89448d = new java.util.ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f89457p = "";

    public final void T6(boolean z17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ous);
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI", "showUserInfoPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandUserInfoAuthorizeUI", "showUserInfoPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17;
        android.content.Intent intent = new android.content.Intent();
        java.util.List list = this.f89449e;
        java.util.List list2 = this.f89448d;
        boolean z18 = true;
        if (list != null && list.size() == ((java.util.ArrayList) list2).size()) {
            java.util.Iterator it = ((java.util.ArrayList) list2).iterator();
            boolean z19 = false;
            while (it.hasNext()) {
                fl1.h1 h1Var = (fl1.h1) it.next();
                java.util.List list3 = this.f89449e;
                if (list3 != null) {
                    java.util.Iterator it6 = list3.iterator();
                    z17 = false;
                    while (it6.hasNext()) {
                        if (h1Var.f263786h == ((fl1.h1) it6.next()).f263786h) {
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
        intent.putExtra("key_result_is_open", this.f89450f);
        intent.putExtra("key_result_selected_user_id", this.f89452h);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488104h9;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f89455n;
        if (m0Var == null) {
            kotlin.jvm.internal.o.o("wxaUserInfoListOperationController");
            throw null;
        }
        rl5.r rVar = m0Var.f79527i;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.pa(this));
        setMMTitle(com.tencent.mm.R.string.a4r);
        android.os.Bundle extras = getIntent().getExtras();
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo mMUserAvatarInfo = extras != null ? (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo) extras.getParcelable("key_user_info") : null;
        android.os.Bundle extras2 = getIntent().getExtras();
        java.lang.String string = extras2 != null ? extras2.getString("key_app_id") : null;
        this.f89457p = string == null ? "" : string;
        android.os.Bundle extras3 = getIntent().getExtras();
        java.lang.Boolean valueOf = extras3 != null ? java.lang.Boolean.valueOf(extras3.getBoolean("key_is_state_open")) : null;
        boolean booleanValue = valueOf != null ? valueOf.booleanValue() : false;
        this.f89450f = booleanValue;
        T6(booleanValue);
        if (mMUserAvatarInfo == null || string == null) {
            com.tencent.mars.xlog.Log.i("AppBrandUserInfoAuthorizeUI", "WxaUserInfoData or appId is null, finish activity");
            finish();
            return;
        }
        this.f89452h = mMUserAvatarInfo.f79467g;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f485836j91);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById;
        mMSwitchBtn.setCheck(this.f89450f);
        mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.appbrand.ui.qa(this));
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.f89453i = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mag);
        java.lang.String str = mMUserAvatarInfo.f79473p;
        if (android.text.TextUtils.isEmpty(str)) {
            str = getString(com.tencent.mm.R.string.a4u);
        }
        textView.setText(str);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ou8);
        java.lang.String str2 = mMUserAvatarInfo.f79472o;
        if (android.text.TextUtils.isEmpty(str2)) {
            java.lang.String string2 = getString(com.tencent.mm.R.string.a4w);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            android.os.Bundle extras4 = getIntent().getExtras();
            java.lang.String string3 = extras4 != null ? extras4.getString("key_nickname") : null;
            if (string3 == null) {
                string3 = "";
            }
            objArr[0] = string3;
            str2 = java.lang.String.format(string2, java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.o.f(str2, "format(...)");
        }
        textView2.setText(str2);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i3o);
        java.lang.String str3 = mMUserAvatarInfo.f79474q;
        if (android.text.TextUtils.isEmpty(str3)) {
            str3 = getString(com.tencent.mm.R.string.a4t);
        }
        textView3.setText(str3);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ouq);
        ((androidx.recyclerview.widget.RecyclerView) findViewById2).setNestedScrollingEnabled(false);
        kotlin.jvm.internal.o.f(findViewById2, "also(...)");
        this.f89456o = (androidx.recyclerview.widget.RecyclerView) findViewById2;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0(this, mMUserAvatarInfo, "", new com.tencent.mm.plugin.appbrand.ui.sa(this, string));
        this.f89455n = m0Var;
        m0Var.f79526h = new com.tencent.mm.plugin.appbrand.ui.ua(this);
        fl1.r1 r1Var = new fl1.r1(this.f89448d);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f89456o;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("userInfoList");
            throw null;
        }
        recyclerView.setAdapter(r1Var);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f89456o;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("userInfoList");
            throw null;
        }
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f89456o;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("userInfoList");
            throw null;
        }
        recyclerView3.setItemAnimator(null);
        r1Var.f263853f = new com.tencent.mm.plugin.appbrand.ui.va(this);
        r1Var.f263852e = new com.tencent.mm.plugin.appbrand.ui.wa(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f89454m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }
}
