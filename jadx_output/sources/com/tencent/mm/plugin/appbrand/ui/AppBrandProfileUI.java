package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class AppBrandProfileUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f89401d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaExposedParams f89402e;

    /* renamed from: f, reason: collision with root package name */
    public int f89403f;

    /* renamed from: g, reason: collision with root package name */
    public int f89404g;

    public static void U6(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams, android.os.Bundle bundle, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate, int i19) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Context context2 = context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        android.content.Intent putExtra = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.class).putExtra("key_username", str).putExtra("key_from_scene", i17).putExtra("key_scene_note", str2).putExtra("key_can_swipe_back", z17).putExtra("key_scene_exposed_params", wxaExposedParams).putExtra("key_extra_bundle", bundle).putExtra("key_wxapp_scene", i18);
        if (wxaExposedParams != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("stat_scene", 6);
            bundle2.putString("stat_app_id", wxaExposedParams.f77478d);
            bundle2.putString("stat_url", wxaExposedParams.f77488q);
            putExtra.putExtra("_stat_obj", bundle2);
        }
        putExtra.putExtra("KEY_DELEGATED_ACTIVITY_STARTER", activityStarterIpcDelegate);
        boolean z18 = context2 instanceof android.app.Activity;
        if (!z18) {
            putExtra.addFlags(268435456);
        }
        if (!z18 || i19 < 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "show", "(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/config/WxaExposedParams;Landroid/os/Bundle;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "show", "(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/config/WxaExposedParams;Landroid/os/Bundle;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.app.Activity activity = (android.app.Activity) context2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        arrayList2.add(putExtra);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "show", "(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/config/WxaExposedParams;Landroid/os/Bundle;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public static void V6(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, boolean z17, com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams, android.os.Bundle bundle, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate) {
        U6(context, str, i17, 1236, str2, z17, wxaExposedParams, bundle, activityStarterIpcDelegate, -1);
    }

    public final void T6(java.lang.String str) {
        android.os.Bundle extras;
        android.content.Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        if (extras.containsKey("key_from_scene")) {
            this.f89403f = extras.getInt("key_from_scene");
        }
        this.f89404g = extras.getInt("key_wxapp_scene", 1236);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "%s, fromScene: %d", str, java.lang.Integer.valueOf(this.f89403f));
    }

    public final void W6() {
        jf.q.f299342a.b("wx27a2b9eea2cf1a62", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_fake_native_profile_render, 0));
        java.lang.String str = this.f89401d;
        int i17 = this.f89403f;
        java.lang.String stringExtra = getIntent().getStringExtra("key_scene_note");
        int i18 = this.f89404g;
        com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams = this.f89402e;
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("key_extra_bundle");
        com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate = (com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate) getIntent().getParcelableExtra("KEY_DELEGATED_ACTIVITY_STARTER");
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
        launchParcel.f84902e = "wx27a2b9eea2cf1a62";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("userName", str);
        hashMap.put("enterScene", java.lang.Integer.valueOf(i17));
        hashMap.put("sceneNote", stringExtra);
        hashMap.put("needShowBottomFeedback", java.lang.Boolean.valueOf(bundleExtra != null && bundleExtra.getBoolean("key_is_embed_wxa", false)));
        if (wxaExposedParams != null) {
            hashMap.put("hostAppid", wxaExposedParams.f77480f);
            hashMap.put("snapShotLocalId", wxaExposedParams.f77490s);
        }
        java.lang.String format = java.lang.String.format("pages/index/index.html?enterQuery=%s", java.net.URLEncoder.encode(new org.json.JSONObject(hashMap).toString()), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        launchParcel.f84906i = format;
        launchParcel.f84904g = 0;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = i18;
        launchParcel.f84910o = appBrandStatObject;
        launchParcel.f84921x = activityStarterIpcDelegate;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "launchFakeNativeProfile, appId=%s, username=%s, enterPath=%s", "wx27a2b9eea2cf1a62", str, format);
        ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(this, launchParcel);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return getIntent().getBooleanExtra("key_can_swipe_back", true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.finishAfterTransition();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        T6("onCreate");
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        this.f89401d = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            finish();
            return;
        }
        if (getIntent().getExtras() != null && !getIntent().getExtras().containsKey("key_extra_bundle")) {
            getIntent().getExtras().putBundle("key_extra_bundle", android.os.Bundle.EMPTY);
        }
        getIntent().setExtrasClassLoader(getClassLoader());
        this.f89402e = (com.tencent.mm.plugin.appbrand.config.WxaExposedParams) getIntent().getParcelableExtra("key_scene_exposed_params");
        W6();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        this.f89401d = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            finish();
            return;
        }
        T6("onNewIntent");
        W6();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        android.view.View targetContentView = swipeBackLayout != null ? swipeBackLayout.getTargetContentView() : null;
        vj5.h hVar = targetContentView instanceof vj5.h ? (vj5.h) targetContentView : null;
        if (hVar != null) {
            hVar.setLayoutFrozen(true);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(getIntent().getBooleanExtra("key_can_swipe_back", true));
        }
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
        android.view.View targetContentView = swipeBackLayout != null ? swipeBackLayout.getTargetContentView() : null;
        vj5.h hVar = targetContentView instanceof vj5.h ? (vj5.h) targetContentView : null;
        if (hVar != null) {
            hVar.setLayoutFrozen(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean onSwipeBackFinish() {
        return true;
    }
}
