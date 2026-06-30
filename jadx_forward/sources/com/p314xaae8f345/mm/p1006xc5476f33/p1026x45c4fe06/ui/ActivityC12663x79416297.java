package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI */
/* loaded from: classes7.dex */
public final class ActivityC12663x79416297 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f170934d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 f170935e;

    /* renamed from: f, reason: collision with root package name */
    public int f170936f;

    /* renamed from: g, reason: collision with root package name */
    public int f170937g;

    public static void U6(android.content.Context context, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26, android.os.Bundle bundle, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41, int i19) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        android.content.Context context2 = context == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : context;
        android.content.Intent putExtra = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12663x79416297.class).putExtra("key_username", str).putExtra("key_from_scene", i17).putExtra("key_scene_note", str2).putExtra("key_can_swipe_back", z17).putExtra("key_scene_exposed_params", c11832x1f85bd26).putExtra("key_extra_bundle", bundle).putExtra("key_wxapp_scene", i18);
        if (c11832x1f85bd26 != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("stat_scene", 6);
            bundle2.putString("stat_app_id", c11832x1f85bd26.f159011d);
            bundle2.putString("stat_url", c11832x1f85bd26.f159021q);
            putExtra.putExtra("_stat_obj", bundle2);
        }
        putExtra.putExtra("KEY_DELEGATED_ACTIVITY_STARTER", c3933x11320b41);
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
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i19));
        arrayList2.add(putExtra);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "show", "(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/config/WxaExposedParams;Landroid/os/Bundle;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public static void V6(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26, android.os.Bundle bundle, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41) {
        U6(context, str, i17, 1236, str2, z17, c11832x1f85bd26, bundle, c3933x11320b41, -1);
    }

    public final void T6(java.lang.String str) {
        android.os.Bundle extras;
        android.content.Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        if (extras.containsKey("key_from_scene")) {
            this.f170936f = extras.getInt("key_from_scene");
        }
        this.f170937g = extras.getInt("key_wxapp_scene", 1236);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "%s, fromScene: %d", str, java.lang.Integer.valueOf(this.f170936f));
    }

    public final void W6() {
        jf.q.f380875a.b("wx27a2b9eea2cf1a62", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_fake_native_profile_render, 0));
        java.lang.String str = this.f170934d;
        int i17 = this.f170936f;
        java.lang.String stringExtra = getIntent().getStringExtra("key_scene_note");
        int i18 = this.f170937g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26 c11832x1f85bd26 = this.f170935e;
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("key_extra_bundle");
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41 = (com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41) getIntent().getParcelableExtra("KEY_DELEGATED_ACTIVITY_STARTER");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc();
        c12362x460991bc.f166435e = "wx27a2b9eea2cf1a62";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("userName", str);
        hashMap.put("enterScene", java.lang.Integer.valueOf(i17));
        hashMap.put("sceneNote", stringExtra);
        hashMap.put("needShowBottomFeedback", java.lang.Boolean.valueOf(bundleExtra != null && bundleExtra.getBoolean("key_is_embed_wxa", false)));
        if (c11832x1f85bd26 != null) {
            hashMap.put("hostAppid", c11832x1f85bd26.f159013f);
            hashMap.put("snapShotLocalId", c11832x1f85bd26.f159023s);
        }
        java.lang.String format = java.lang.String.format("pages/index/index.html?enterQuery=%s", java.net.URLEncoder.encode(new org.json.JSONObject(hashMap).toString()), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        c12362x460991bc.f166439i = format;
        c12362x460991bc.f166437g = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = i18;
        c12362x460991bc.f166443o = c12559xbdae8559;
        c12362x460991bc.f166454x = c3933x11320b41;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "launchFakeNativeProfile, appId=%s, username=%s, enterPath=%s", "wx27a2b9eea2cf1a62", str, format);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a).a(this, c12362x460991bc);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return getIntent().getBooleanExtra("key_can_swipe_back", true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.finishAfterTransition();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        T6("onCreate");
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        this.f170934d = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            finish();
            return;
        }
        if (getIntent().getExtras() != null && !getIntent().getExtras().containsKey("key_extra_bundle")) {
            getIntent().getExtras().putBundle("key_extra_bundle", android.os.Bundle.EMPTY);
        }
        getIntent().setExtrasClassLoader(getClassLoader());
        this.f170935e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11832x1f85bd26) getIntent().getParcelableExtra("key_scene_exposed_params");
        W6();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        this.f170934d = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            finish();
            return;
        }
        T6("onNewIntent");
        W6();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = m78735x28280f95();
        android.view.View m81444x1eccc7b7 = m78735x28280f95 != null ? m78735x28280f95.m81444x1eccc7b7() : null;
        vj5.h hVar = m81444x1eccc7b7 instanceof vj5.h ? (vj5.h) m81444x1eccc7b7 : null;
        if (hVar != null) {
            hVar.m172250xf161ffec(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m78735x28280f95() != null) {
            m78735x28280f95().m81450x8e764904(getIntent().getBooleanExtra("key_can_swipe_back", true));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = m78735x28280f95();
        android.view.View m81444x1eccc7b7 = m78735x28280f95 != null ? m78735x28280f95.m81444x1eccc7b7() : null;
        vj5.h hVar = m81444x1eccc7b7 instanceof vj5.h ? (vj5.h) m81444x1eccc7b7 : null;
        if (hVar != null) {
            hVar.m172250xf161ffec(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onSwipeBackFinish */
    public boolean mo48654xe4dc1f55() {
        return true;
    }
}
