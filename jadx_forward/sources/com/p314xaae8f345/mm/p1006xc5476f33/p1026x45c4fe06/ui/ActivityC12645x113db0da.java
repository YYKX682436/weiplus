package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@gm0.a2
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI */
/* loaded from: classes7.dex */
public final class ActivityC12645x113db0da extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements zj1.a {

    /* renamed from: i, reason: collision with root package name */
    public static int f170891i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);

    /* renamed from: e, reason: collision with root package name */
    public boolean f170893e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12724xc3b806da f170894f;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o2 f170896h;

    /* renamed from: d, reason: collision with root package name */
    public int f170892d = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f170895g = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI$Fragment */
    /* loaded from: classes7.dex */
    public static abstract class Fragment extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f170899d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

        /* renamed from: e, reason: collision with root package name */
        public int f170900e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f170901f;

        /* renamed from: g, reason: collision with root package name */
        public android.view.View f170902g;

        /* renamed from: getLayoutId */
        public abstract int mo52909x2ee31f5b();

        /* renamed from: initView */
        public abstract void mo52910x10010bd5();

        public void j0(android.content.Intent intent, int i17) {
        }

        public void l0() {
        }

        public final void m0(java.lang.Runnable runnable) {
            if (runnable != null) {
                this.f170899d.mo50293x3498a0(runnable);
            }
        }

        public final void n0(java.lang.Runnable runnable) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            if (mo7430x19263085 == null || mo7430x19263085.isDestroyed()) {
                return;
            }
            mo7430x19263085.runOnUiThread(runnable);
        }

        public void o0(int i17) {
            this.f170900e = i17;
        }

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onCreateView */
        public final android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
            if (mo52909x2ee31f5b() < 0) {
                this.f170902g = new android.widget.FrameLayout(viewGroup.getContext());
            } else {
                this.f170902g = layoutInflater.inflate(mo52909x2ee31f5b(), (android.view.ViewGroup) null);
            }
            mo52910x10010bd5();
            return this.f170902g;
        }

        @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            super.mo7504xac79a11b();
            this.f170899d.mo50302x6b17ad39(null);
        }
    }

    static {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ka.f165607a;
    }

    @Override // zj1.a
    public void H3(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o2 o2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12724xc3b806da c12724xc3b806da = this.f170894f;
        if (c12724xc3b806da != null) {
            c12724xc3b806da.H3(z17);
        }
        if (!z17 || (o2Var = this.f170896h) == null) {
            return;
        }
        o2Var.f158067a[4] = "1";
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment T6() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7664x6f4c869b = super.mo7595x9cdc264().m7664x6f4c869b(android.R.id.content);
        if (m7664x6f4c869b == null || !(m7664x6f4c869b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment)) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment) m7664x6f4c869b;
    }

    public final void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = 1112;
        try {
            android.view.ViewGroup viewGroup = this.f39331xd9e73aa4;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
                db5.f.c(this, null);
            }
        } catch (java.lang.NullPointerException unused) {
        }
        overridePendingTransition(0, 0);
        l81.b1 b1Var = new l81.b1();
        ek1.e eVar = new ek1.e(1, null);
        b1Var.f398561i = eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLauncherUI", "openFakeNativeRecommendUI, wechatNativeExtraData=%s", eVar.a());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandLauncherUIForceEntryConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        java.lang.String string = R.getString("KEY_FORCE_WE_USE_FAKE_NATIVE_APPID", null);
        if (string == null) {
            string = "wxb6d22f922f37b35a";
        }
        b1Var.f398545a = "wxb6d22f922f37b35a".equals(string) ? "gh_b489f391e008@app" : "gh_9bd4ec2ab601@app";
        b1Var.f398547b = string;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandLauncherUIForceEntryConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R2, "getSingleMMKV(...)");
        b1Var.f398549c = R2.getBoolean("KEY_FORCE_FAKE_NATIVE_DEBUG", false) ? 1 : 0;
        b1Var.f398551d = 0;
        b1Var.f398565k = c12559xbdae8559.f169323f;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b>(this) { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.5
            {
                this.f39173x3fe91575 = 551436157;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b c12573x6a664d3b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da activityC12645x113db0da = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.this;
                activityC12645x113db0da.finish();
                activityC12645x113db0da.overridePendingTransition(0, 0);
                return false;
            }
        }.mo48813x58998cd();
        this.f170895g = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (isFinishing()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f170892d = i17;
        if (i18 == -1 && i17 == 1) {
            java.lang.String stringExtra = intent.getStringExtra("key_session_id");
            int intExtra = intent.getIntExtra("ftsbizscene", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLauncherUI", "onActivityResult oreh report weAppSearchClickStream(13929) statSessionId:%s, StatKeyWordId:%s", stringExtra, k01.n.f384581a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13929, stringExtra, k01.n.f384581a, 2, java.lang.Integer.valueOf(intExtra));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.d()) {
            finish();
            return;
        }
        mo273xed6858b4().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n0.f169655d.a(this));
        getIntent().getIntExtra("extra_enter_scene", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("extra_show_recents_from_task_bar", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLauncherUI", "onCreate showRecentListTagOnTop:%b", java.lang.Boolean.valueOf(booleanExtra));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandLauncherUIForceEntryConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSingleMMKV(...)");
        if (R.getBoolean("KEY_FORCE_WE_USE_FAKE_NATIVE", false) && !booleanExtra) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLauncherUI", "onCreate isForceOpenWeUseFakeNative=TRUE");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.a(3, 1, true);
            U6();
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("AppBrandLauncherUIForceEntryConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R2, "getSingleMMKV(...)");
        boolean z18 = R2.getBoolean("KEY_FORCE_NATIVE_LAUNCHER", false);
        this.f170893e = getIntent().getBooleanExtra("extra_show_recommend", false);
        boolean z19 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_RECOMMEND_DATA_STATE_INT_SYNC, 0)).intValue() == 1;
        boolean m42840x2061f65d = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d();
        m78588xfb5745ae(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f5(this));
        mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571648lc));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.g5(this), com.p314xaae8f345.mm.R.raw.f78352x20d6422c);
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            m78479x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzr, com.p314xaae8f345.mm.R.raw.f78356x618865ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.i5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.k5(this));
        }
        m78478x84f07bce(1, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f78355x20db789a, new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.f170891i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da activityC12645x113db0da = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.this;
                activityC12645x113db0da.getClass();
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.ActivityC12719x9d00d36b.f171463d;
                lk5.q0.d(activityC12645x113db0da, new android.content.Intent(activityC12645x113db0da, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.ActivityC12719x9d00d36b.class), null);
                return true;
            }
        });
        int color = mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
        f170891i = color;
        mo64405x4dab7448(color);
        findViewById(android.R.id.content).setBackgroundColor(f170891i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLauncherUI", "mShowRecommend:%b, recommendDataState:%b, isForceOpenNativeLauncherUI:%b, isAccessibilityEnabled:%b", java.lang.Boolean.valueOf(this.f170893e), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(m42840x2061f65d));
        boolean z27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a().getInt(".sysmsg.UpdateWxaUserSwitchNotify.DiscoveryEntranceUseFake", 0) == 1;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g()) {
            if (!"1".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_wxa_appbrand_launcher_ui_all_user_fake_native, "0", true))) {
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLauncherUI", "allUserFakeNativeSwitch:%b", java.lang.Boolean.valueOf(z17));
                boolean z28 = ((this.f170893e && !z27) || z18 || booleanExtra || m42840x2061f65d) ? false : true;
                if (!z17 || z28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.a(3, 1, true);
                    U6();
                }
                p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = mo273xed6858b4();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12724xc3b806da c12724xc3b806da = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.C12724xc3b806da(this);
                this.f170894f = c12724xc3b806da;
                mo273xed6858b4.a(c12724xc3b806da);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6313x17a23219 c6313x17a23219 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6313x17a23219();
                c6313x17a23219.p(java.lang.String.format("AppBrandLauncherUI|showRecommend:%b|enableFakeNative:%b|isForceOpenNativeLauncherUI:%b|showRecentListTagOnTop:%b|isAccessibilityEnabled:%b|allUserFakeNativeSwitch:%b", java.lang.Boolean.valueOf(this.f170893e), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(m42840x2061f65d), java.lang.Boolean.valueOf(z17)));
                c6313x17a23219.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.a(3, 2, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(465L, 0L, 1L, false);
                if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_INPUT_HINT_UPDATE_TIME_LONG_SYNC, null);
                    long longValue = (m17 == null || !(m17 instanceof java.lang.Long)) ? 0L : ((java.lang.Long) m17).longValue();
                    java.lang.String language = java.util.Locale.getDefault().getLanguage();
                    java.lang.Object m18 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_SEARCH_INPUT_HINT_LANG_STRING_SYNC, null);
                    if (currentTimeMillis - longValue >= 3600000 || m18 == null || !m18.equals(language)) {
                        gm0.j1.n().f354821b.g(new th1.e());
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSearchLogic", "do not need to update search input hint, shouldShowSearchEntrance is false");
                }
                ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.a()) {
                    this.f170896h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o2();
                }
                if (gm0.j1.a() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.a()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.c(false, 0L);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.q2.b(false, 0L, 0L);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.p2.f158072a;
                    p2Var.b((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_MSG_ID_STRING, ""), ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_PUSH_TIME_LONG, 0L)).longValue(), 2, p2Var.a());
                }
                if (gm0.j1.a()) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.r0.e()) {
                        boolean z29 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        g0Var.d(14112, 1, "", 0L, 2, 1);
                    }
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, java.lang.Boolean.FALSE);
                }
                ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandLauncherUI)).Rj(this, iy1.a.MiniProgramList);
                return;
            }
        }
        z17 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLauncherUI", "allUserFakeNativeSwitch:%b", java.lang.Boolean.valueOf(z17));
        if (this.f170893e) {
        }
        if (z17) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandEntranceReportLogic", "reportEntranceClick");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.s0.a(3, 1, true);
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        getWindow().setSoftInputMode(3);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2[] f2VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.f2.f157964d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.o2 o2Var = this.f170896h;
        if (o2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14113, o2Var.f158067a);
            this.f170896h = null;
        }
        try {
            ((android.view.ViewGroup) m78513xc2a54588()).removeAllViews();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        int i17 = this.f170892d;
        if (i17 > 0) {
            int i18 = i17 == 1 ? 7 : i17 == 2 ? 6 : i17 == 3 ? 9 : i17 == 4 ? 12 : 4;
            this.f170892d = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment fragment = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment) super.mo7595x9cdc264().m7664x6f4c869b(android.R.id.content);
            if (fragment != null) {
                fragment.o0(i18);
            }
        }
        super.onResume();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.o();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f170895g) {
            finish();
            overridePendingTransition(0, 0);
        }
    }

    @Override // android.app.Activity
    public void setTitle(java.lang.CharSequence charSequence) {
        mo56583xbf7c1df6(charSequence);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment T6 = T6();
        if (T6 != null) {
            T6.j0(intent, i17);
        }
    }

    @Override // android.app.Activity
    public void setTitle(int i17) {
        mo56582xbf7c1df6(i17);
    }
}
