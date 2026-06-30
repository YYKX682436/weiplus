package com.tencent.mm.plugin.appbrand.ui;

@gm0.a2
/* loaded from: classes7.dex */
public final class AppBrandLauncherUI extends com.tencent.mm.ui.MMActivity implements zj1.a {

    /* renamed from: i, reason: collision with root package name */
    public static int f89358i = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a07);

    /* renamed from: e, reason: collision with root package name */
    public boolean f89360e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext f89361f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.o2 f89363h;

    /* renamed from: d, reason: collision with root package name */
    public int f89359d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f89362g = false;

    /* loaded from: classes7.dex */
    public static abstract class Fragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

        /* renamed from: d, reason: collision with root package name */
        public final com.tencent.mm.sdk.platformtools.n3 f89366d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

        /* renamed from: e, reason: collision with root package name */
        public int f89367e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f89368f;

        /* renamed from: g, reason: collision with root package name */
        public android.view.View f89369g;

        public abstract int getLayoutId();

        public abstract void initView();

        public void j0(android.content.Intent intent, int i17) {
        }

        public void l0() {
        }

        public final void m0(java.lang.Runnable runnable) {
            if (runnable != null) {
                this.f89366d.post(runnable);
            }
        }

        public final void n0(java.lang.Runnable runnable) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            if (activity == null || activity.isDestroyed()) {
                return;
            }
            activity.runOnUiThread(runnable);
        }

        public void o0(int i17) {
            this.f89367e = i17;
        }

        @Override // androidx.fragment.app.Fragment
        public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            if (getLayoutId() < 0) {
                this.f89369g = new android.widget.FrameLayout(viewGroup.getContext());
            } else {
                this.f89369g = layoutInflater.inflate(getLayoutId(), (android.view.ViewGroup) null);
            }
            initView();
            return this.f89369g;
        }

        @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            this.f89366d.removeCallbacksAndMessages(null);
        }
    }

    static {
        int i17 = com.tencent.mm.plugin.appbrand.ka.f84074a;
    }

    @Override // zj1.a
    public void H3(boolean z17) {
        com.tencent.mm.plugin.appbrand.appusage.o2 o2Var;
        com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext recentsFolderActivityContext = this.f89361f;
        if (recentsFolderActivityContext != null) {
            recentsFolderActivityContext.H3(z17);
        }
        if (!z17 || (o2Var = this.f89363h) == null) {
            return;
        }
        o2Var.f76534a[4] = "1";
    }

    public final com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment T6() {
        androidx.fragment.app.Fragment findFragmentById = super.getSupportFragmentManager().findFragmentById(android.R.id.content);
        if (findFragmentById == null || !(findFragmentById instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment)) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment) findFragmentById;
    }

    public final void U6() {
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        appBrandStatObject.f87790f = 1112;
        try {
            android.view.ViewGroup viewGroup = this.mWrappingFrame;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
                db5.f.c(this, null);
            }
        } catch (java.lang.NullPointerException unused) {
        }
        overridePendingTransition(0, 0);
        l81.b1 b1Var = new l81.b1();
        ek1.e eVar = new ek1.e(1, null);
        b1Var.f317028i = eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherUI", "openFakeNativeRecommendUI, wechatNativeExtraData=%s", eVar.a());
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("AppBrandLauncherUIForceEntryConfig");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        java.lang.String string = R.getString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", null);
        if (string == null) {
            string = "wxb6d22f922f37b35a";
        }
        b1Var.f317012a = "wxb6d22f922f37b35a".equals(string) ? "gh_b489f391e008@app" : "gh_9bd4ec2ab601@app";
        b1Var.f317014b = string;
        com.tencent.mm.sdk.platformtools.o4 R2 = com.tencent.mm.sdk.platformtools.o4.R("AppBrandLauncherUIForceEntryConfig");
        kotlin.jvm.internal.o.f(R2, "getSingleMMKV(...)");
        b1Var.f317016c = R2.getBoolean("KEY_FORCE_FAKE_NATIVE_DEBUG", false) ? 1 : 0;
        b1Var.f317018d = 0;
        b1Var.f317032k = appBrandStatObject.f87790f;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent>(this) { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.5
            {
                this.__eventId = 551436157;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent) {
                com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI = com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.this;
                appBrandLauncherUI.finish();
                appBrandLauncherUI.overridePendingTransition(0, 0);
                return false;
            }
        }.alive();
        this.f89362g = true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f89359d = i17;
        if (i18 == -1 && i17 == 1) {
            java.lang.String stringExtra = intent.getStringExtra("key_session_id");
            int intExtra = intent.getIntExtra("ftsbizscene", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherUI", "onActivityResult oreh report weAppSearchClickStream(13929) statSessionId:%s, StatKeyWordId:%s", stringExtra, k01.n.f303048a);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13929, stringExtra, k01.n.f303048a, 2, java.lang.Integer.valueOf(intExtra));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        if (!com.tencent.mm.plugin.appbrand.appusage.r0.d()) {
            finish();
            return;
        }
        mo133getLifecycle().a(com.tencent.mm.plugin.appbrand.report.n0.f88122d.a(this));
        getIntent().getIntExtra("extra_enter_scene", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("extra_show_recents_from_task_bar", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherUI", "onCreate showRecentListTagOnTop:%b", java.lang.Boolean.valueOf(booleanExtra));
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("AppBrandLauncherUIForceEntryConfig");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        if (R.getBoolean("KEY_FORCE_WE_USE_FAKE_NATIVE", false) && !booleanExtra) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherUI", "onCreate isForceOpenWeUseFakeNative=TRUE");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
            com.tencent.mm.plugin.appbrand.appusage.s0.a(3, 1, true);
            U6();
            return;
        }
        com.tencent.mm.sdk.platformtools.o4 R2 = com.tencent.mm.sdk.platformtools.o4.R("AppBrandLauncherUIForceEntryConfig");
        kotlin.jvm.internal.o.f(R2, "getSingleMMKV(...)");
        boolean z18 = R2.getBoolean("KEY_FORCE_NATIVE_LAUNCHER", false);
        this.f89360e = getIntent().getBooleanExtra("extra_show_recommend", false);
        boolean z19 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_RECOMMEND_DATA_STATE_INT_SYNC, 0)).intValue() == 1;
        boolean isAccessibilityEnabled = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled();
        setTitleBarDoubleClickListener(new com.tencent.mm.plugin.appbrand.ui.f5(this));
        setMMTitle(getResources().getString(com.tencent.mm.R.string.f490115lc));
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.g5(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            addIconOptionMenu(0, com.tencent.mm.R.string.jzr, com.tencent.mm.R.raw.actionbar_icon_dark_search, new com.tencent.mm.plugin.appbrand.ui.i5(this), new com.tencent.mm.plugin.appbrand.ui.k5(this));
        }
        addIconOptionMenu(1, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.actionbar_icon_dark_more, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.f89358i;
                com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI appBrandLauncherUI = com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.this;
                appBrandLauncherUI.getClass();
                int i18 = com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI.f89930d;
                lk5.q0.d(appBrandLauncherUI, new android.content.Intent(appBrandLauncherUI, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI.class), null);
                return true;
            }
        });
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.a07);
        f89358i = color;
        setActionbarColor(color);
        findViewById(android.R.id.content).setBackgroundColor(f89358i);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherUI", "mShowRecommend:%b, recommendDataState:%b, isForceOpenNativeLauncherUI:%b, isAccessibilityEnabled:%b", java.lang.Boolean.valueOf(this.f89360e), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(isAccessibilityEnabled));
        boolean z27 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a().getInt(".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake", 0) == 1;
        if (!com.tencent.mm.plugin.appbrand.ui.e4.g()) {
            if (!"1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_wxa_appbrand_launcher_ui_all_user_fake_native, "0", true))) {
                z17 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherUI", "allUserFakeNativeSwitch:%b", java.lang.Boolean.valueOf(z17));
                boolean z28 = ((this.f89360e && !z27) || z18 || booleanExtra || isAccessibilityEnabled) ? false : true;
                if (!z17 || z28) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
                    com.tencent.mm.plugin.appbrand.appusage.s0.a(3, 1, true);
                    U6();
                }
                androidx.lifecycle.o mo133getLifecycle = mo133getLifecycle();
                com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext recentsFolderActivityContext = new com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext(this);
                this.f89361f = recentsFolderActivityContext;
                mo133getLifecycle.a(recentsFolderActivityContext);
                com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct appBrandLegacyBizStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct();
                appBrandLegacyBizStruct.p(java.lang.String.format("AppBrandLauncherUI|showRecommend:%b|enableFakeNative:%b|isForceOpenNativeLauncherUI:%b|showRecentListTagOnTop:%b|isAccessibilityEnabled:%b|allUserFakeNativeSwitch:%b", java.lang.Boolean.valueOf(this.f89360e), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(isAccessibilityEnabled), java.lang.Boolean.valueOf(z17)));
                appBrandLegacyBizStruct.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
                com.tencent.mm.plugin.appbrand.appusage.s0.a(3, 2, true);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(465L, 0L, 1L, false);
                if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_INPUT_HINT_UPDATE_TIME_LONG_SYNC, null);
                    long longValue = (m17 == null || !(m17 instanceof java.lang.Long)) ? 0L : ((java.lang.Long) m17).longValue();
                    java.lang.String language = java.util.Locale.getDefault().getLanguage();
                    java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_INPUT_HINT_LANG_STRING_SYNC, null);
                    if (currentTimeMillis - longValue >= 3600000 || m18 == null || !m18.equals(language)) {
                        gm0.j1.n().f273288b.g(new th1.e());
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSearchLogic", "do not need to update search input hint, shouldShowSearchEntrance is false");
                }
                ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
                if (com.tencent.mm.plugin.appbrand.appusage.q2.a()) {
                    this.f89363h = new com.tencent.mm.plugin.appbrand.appusage.o2();
                }
                if (gm0.j1.a() && com.tencent.mm.plugin.appbrand.appusage.q2.a()) {
                    com.tencent.mm.plugin.appbrand.appusage.q2.c(false, 0L);
                    com.tencent.mm.plugin.appbrand.appusage.q2.b(false, 0L, 0L);
                    com.tencent.mm.plugin.appbrand.appusage.p2 p2Var = com.tencent.mm.plugin.appbrand.appusage.p2.f76539a;
                    p2Var.b((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 2, p2Var.a());
                }
                if (gm0.j1.a()) {
                    if (com.tencent.mm.plugin.appbrand.appusage.r0.e()) {
                        boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        g0Var.d(14112, 1, "", 0L, 2, 1);
                    }
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, java.lang.Boolean.FALSE);
                }
                ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandLauncherUI)).Rj(this, iy1.a.MiniProgramList);
                return;
            }
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherUI", "allUserFakeNativeSwitch:%b", java.lang.Boolean.valueOf(z17));
        if (this.f89360e) {
        }
        if (z17) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
        com.tencent.mm.plugin.appbrand.appusage.s0.a(3, 1, true);
        U6();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        getWindow().setSoftInputMode(3);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
        com.tencent.mm.plugin.appbrand.appusage.o2 o2Var = this.f89363h;
        if (o2Var != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14113, o2Var.f76534a);
            this.f89363h = null;
        }
        try {
            ((android.view.ViewGroup) getContentView()).removeAllViews();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        int i17 = this.f89359d;
        if (i17 > 0) {
            int i18 = i17 == 1 ? 7 : i17 == 2 ? 6 : i17 == 3 ? 9 : i17 == 4 ? 12 : 4;
            this.f89359d = 0;
            com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment fragment = (com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment) super.getSupportFragmentManager().findFragmentById(android.R.id.content);
            if (fragment != null) {
                fragment.o0(i18);
            }
        }
        super.onResume();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.o();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f89362g) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // android.app.Activity
    public void setTitle(java.lang.CharSequence charSequence) {
        setMMTitle(charSequence);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
        com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment T6 = T6();
        if (T6 != null) {
            T6.j0(intent, i17);
        }
    }

    @Override // android.app.Activity
    public void setTitle(int i17) {
        setMMTitle(i17);
    }
}
