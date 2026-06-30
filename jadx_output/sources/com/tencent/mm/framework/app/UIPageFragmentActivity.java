package com.tencent.mm.framework.app;

@db5.a(1159)
@com.tencent.mm.ui.a2
@ul5.d(0)
/* loaded from: classes9.dex */
public class UIPageFragmentActivity extends com.tencent.kinda.framework.widget.base.BaseFrActivity implements com.tencent.kinda.framework.widget.base.IEventFragment, com.tencent.mm.ui.tools.c5, com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f68150v = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f68152e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.kinda.framework.widget.base.FrLifeController f68153f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f68157m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f68158n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f68159o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f68151d = true;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.kinda.gen.VoidBoolStringI32StringCallback f68154g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.kinda.gen.VoidCallback f68155h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl f68156i = new com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl();

    /* renamed from: p, reason: collision with root package name */
    public int f68160p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f68161q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f68162r = false;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f68163s = new java.util.concurrent.atomic.AtomicInteger(5);

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f68164t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public boolean f68165u = false;

    public void T6(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        com.tencent.kinda.framework.widget.base.BaseFragment resolveFragment = com.tencent.kinda.framework.widget.tools.ActivityController.resolveFragment(bundle);
        if (resolveFragment instanceof com.tencent.kinda.framework.app.MainFragment) {
            this.f68151d = false;
        }
        if (resolveFragment == null) {
            super.onBackPressed();
            return;
        }
        boolean z17 = bundle.getBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_WEBVIEW, false);
        boolean z18 = bundle.getBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP, false);
        if (bundle.getBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP, false) && (resolveFragment instanceof com.tencent.kinda.framework.app.MainFragment)) {
            com.tencent.kinda.framework.animate.KindaAnimatorWatch.didViewCreated(resolveFragment.hashCode());
            this.f68153f.startLiteAppUIPage(bundle, (com.tencent.kinda.framework.app.MainFragment) resolveFragment);
        } else if (z17 && (resolveFragment instanceof com.tencent.kinda.framework.app.MainFragment)) {
            com.tencent.kinda.framework.animate.KindaAnimatorWatch.didViewCreated(resolveFragment.hashCode());
            this.f68153f.startWebViewUIPage(bundle, (com.tencent.kinda.framework.app.MainFragment) resolveFragment);
        } else {
            if (!z18 || !(resolveFragment instanceof com.tencent.kinda.framework.app.MainFragment)) {
                this.f68153f.addFragment(resolveFragment);
                return;
            }
            com.tencent.kinda.framework.animate.KindaAnimatorWatch.didViewCreated(resolveFragment.hashCode());
            this.f68153f.startTinyAppUIPage(bundle, (com.tencent.kinda.framework.app.MainFragment) resolveFragment);
        }
    }

    public boolean U6() {
        com.tencent.kinda.framework.widget.base.FrLifeController frLifeController = this.f68153f;
        if (frLifeController == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "shouldFinish, controller is null!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "shouldFinish, fragment size: %s, hasOpenH5OrTinyApp: %s", java.lang.Integer.valueOf(frLifeController.getFragmentListSize()), java.lang.Boolean.valueOf(this.f68153f.hasOpenH5OrTinyApp()));
        }
        com.tencent.kinda.framework.widget.base.FrLifeController frLifeController2 = this.f68153f;
        return (frLifeController2 == null || frLifeController2.getFragmentListSize() != 0 || this.f68153f.hasOpenH5OrTinyApp()) ? false : true;
    }

    @Override // com.tencent.kinda.framework.widget.base.IEventFragment
    public boolean addFragment(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "addFragment: " + baseFragment);
        if (baseFragment instanceof com.tencent.kinda.framework.app.MainFragment) {
            this.f68151d = false;
        }
        return this.f68153f.addFragment(baseFragment);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFrActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.UIPageFragmentActivity", "[finish] %s, onlyModal:%s ，stack: ", this, java.lang.Boolean.valueOf(this.f68151d));
        if (this.f68151d) {
            super.overridePendingTransition(0, 0);
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_open_uipage_fragement_exit_anim, false) && this.f68161q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "activity finish shouldAddExitAnimationForLiteApp: %s");
            overridePendingTransition(0, com.tencent.mm.R.anim.f477889ed);
            this.f68161q = false;
        }
        int intExtra = getIntent().getIntExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_EXIT_ANIMATION, -1);
        if (intExtra != -1) {
            overridePendingTransition(0, intExtra);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.IEventFragment
    public void fixOnResume(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        com.tencent.kinda.framework.widget.base.FrLifeController frLifeController = this.f68153f;
        if (frLifeController != null) {
            frLifeController.fixOnResume(baseFragment);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.kinda.framework.R.layout.main_fragment_activity_layout;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (this.f68165u && str != null && str.equals(ya.b.LOCATION)) {
            return null;
        }
        return super.getSystemService(str);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Boolean bool;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onActivityResult requestCode: " + i17 + ", resultCode: " + i18 + ", data: " + intent);
        boolean z17 = true;
        boolean z18 = false;
        if (i17 != 4 || intent == null) {
            com.tencent.kinda.framework.widget.base.FrLifeController frLifeController = this.f68153f;
            if (frLifeController != null && frLifeController.processCallback(i17) && U6()) {
                if (i17 == 11) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "liteapp exit and shouldFinish, shouldAddExitAnimationForLiteApp = true");
                    this.f68161q = true;
                }
                finish();
                return;
            }
            z17 = false;
        } else {
            int intExtra = intent.getIntExtra("err_code", 0);
            int intExtra2 = intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int intExtra3 = intent.getIntExtra("countFace", 0);
            long longExtra = intent.getLongExtra("totalTime", 0L);
            int intExtra4 = intent.getIntExtra("err_type", 6);
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "errCode： " + intExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "scene： " + intExtra2);
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "countFace： " + intExtra3);
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "totalTime： " + longExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "errorType： " + intExtra4);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_check_cross_switch, false);
            boolean z19 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_FaceCheckCross_Int, 0) == 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "isOpenFaceCrossSwitch: %s, %s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z19));
            if (z19) {
                fj6 = true;
            }
            if (fj6) {
                attachOnlyActivity();
            }
            if (i18 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "resultCode：RESULT_OK");
                if (this.f68154g != null && intent.getExtras() != null) {
                    this.f68154g.call(false, intent.getExtras().getString("token"), intExtra, "");
                    this.f68154g = null;
                }
            } else {
                if (this.f68154g != null && intent.getExtras() != null) {
                    java.lang.String string = intent.getExtras().getString("click_other_verify_btn");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && string.equalsIgnoreCase("yes")) {
                        z18 = true;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "isClickOtherVerify: %s", string);
                    if (z18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "check face failed, click other verify");
                        this.f68154g.call(true, "", intExtra, "");
                        this.f68154g = null;
                    }
                }
                if (i18 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "resultCode：RESULT_CANCELED");
                    com.tencent.kinda.gen.VoidCallback voidCallback = this.f68155h;
                    if (voidCallback != null) {
                        voidCallback.call();
                        this.f68155h = null;
                    }
                }
            }
        }
        com.tencent.kinda.framework.widget.base.FrLifeController frLifeController2 = this.f68153f;
        if (frLifeController2 != null && frLifeController2.getFragmentListSize() <= 0) {
            finish();
            return;
        }
        if (z17) {
            return;
        }
        ej0.f fVar = (ej0.f) this.f68164t.get(java.lang.Integer.valueOf(i17));
        if (fVar != null) {
            fVar.handle(i18, intent);
            bool = java.lang.Boolean.TRUE;
        } else {
            bool = java.lang.Boolean.FALSE;
        }
        bool.booleanValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onBackPressed");
        if (this.f68153f.getCurrent().onBackPressed()) {
            return;
        }
        popFragment(null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_foldscreent_event_backup_context_switch, false);
        boolean z17 = com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q();
        com.tencent.mars.xlog.Log.i("FixKindaContext", "[onConfigurationChanged] isallow: " + fj6 + "isPadOrFoldableDevice: " + z17);
        if (fj6 && z17) {
            com.tencent.mars.xlog.Log.i("FixKindaContext", "backup context.");
            com.tencent.kinda.framework.widget.tools.KindaContext.backupStack();
            java.util.Iterator<com.tencent.kinda.framework.widget.tools.KindaBackContextObject> it = com.tencent.kinda.framework.widget.tools.KindaContext.getBackupContextStack().iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference<android.content.Context> context = it.next().getContext();
                com.tencent.mars.xlog.Log.i("FixKindaContext", "backup context" + (context.get() instanceof android.app.Activity ? ((android.app.Activity) context.get()).getComponentName().getClassName() : ""));
            }
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFrActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17 = false;
        this.f68157m = getIntent().getBooleanExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.CHEEK_WALLET_LOCK, false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(782, 37);
        this.f68158n = com.tencent.mm.ui.bk.C();
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "[onCreate] fragment：%s，isDarkMode:%s", this, java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C()));
        this.f68153f = new com.tencent.kinda.framework.widget.base.FrLifeController(this);
        this.f68152e = getIntent().getBooleanExtra("key_support_swipe_back", true);
        o25.n1.f(this);
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z18 = bundle.getBoolean("pageHasRestored", false);
            java.lang.String string = bundle.getString("pageRestoredPage", "default");
            boolean mj6 = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).mj(z18, "1", "kinda/" + string);
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "[onCreate] is restore status？: %s，needFinish？：%s, restorePage: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(mj6), string);
            if (mj6) {
                java.util.Map map = h45.i0.f278950a;
                androidx.appcompat.app.AppCompatActivity context = getContext();
                if (context == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxPayUtil", "[jumpToLaunchUI] context is null");
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.addFlags(67108864);
                    intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
                    intent.putExtra("preferred_tab", 0);
                    j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent, null);
                }
                finish();
                return;
            }
        }
        getWindow().getDecorView().setSystemUiVisibility(com.tencent.mm.ui.b4.c(this) ? 1792 : 1280);
        hideTitleView();
        getController().G0(0);
        if (getWindow() != null && android.os.Build.VERSION.SDK_INT >= 28) {
            getWindow().setNavigationBarDividerColor(0);
        }
        if (this.f68156i != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "force kindaShowingDialog is false");
            this.f68156i.setBool("kindaShowingDialog", false, 0L);
        }
        if (this.f68157m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "need check lock");
            z17 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "not show lock");
            T6(getIntent().getBundleExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_BUNDLE));
        }
        setTenpayKBStateCallBackListener(new ej0.c(this));
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(getContext());
        this.f68159o = f5Var;
        f5Var.f210400e = this;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFrActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "[onDestroy] %s", this);
        this.f68153f.onActivityDestroy();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(782, 44);
        fo3.s.INSTANCE.sb(false);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onNewIntent");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onPause");
        super.onPause();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(782, 42);
        new com.tencent.mm.autogen.events.KindaActivityPauseEvent().e();
        com.tencent.mm.ui.tools.f5 f5Var = this.f68159o;
        if (f5Var != null) {
            f5Var.d();
        }
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(getContext(), this);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        boolean z17 = bundle.getBoolean("key_dark_mode_state");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_kinda_darkmode_change_adaptation, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onRestoreInstanceState，lastDarkMode:%s  nowDarkMode:%s,svgconfig:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C()), java.lang.Boolean.valueOf(fj6));
        if (fj6 && (z17 ^ com.tencent.mm.ui.bk.C())) {
            finish();
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFrActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onResume");
        super.onResume();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(782, 40);
        com.tencent.kinda.framework.widget.base.FrLifeController frLifeController = this.f68153f;
        if (frLifeController != null && frLifeController.processCallback(3) && U6()) {
            finish();
        } else {
            com.tenpay.android.wechat.TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.ui.r1.B());
        }
        com.tencent.mm.ui.tools.f5 f5Var = this.f68159o;
        if (f5Var != null) {
            f5Var.f();
        }
        this.f68153f.setTinyCallbackTag(true);
        ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(getContext(), this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putBoolean("key_dark_mode_state", this.f68158n);
        bundle.putBoolean("pageHasRestored", true);
        com.tencent.kinda.framework.widget.base.FrLifeController frLifeController = this.f68153f;
        java.lang.String reportUrl = (frLifeController == null || frLifeController.getCurrent() == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f68153f.getCurrent().getReportUrl())) ? "default" : this.f68153f.getCurrent().getReportUrl();
        bundle.putString("pageRestoredPage", reportUrl);
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "[onSaveInstanceState] isDarkMode:%s，restorePage：%s", java.lang.Boolean.valueOf(this.f68158n), reportUrl);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onStop");
        super.onStop();
        new com.tencent.mm.autogen.events.KindaActivityStopEvent().e();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.z2
    public void onSwipe(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onSwipe %s", java.lang.Float.valueOf(f17));
        super.onSwipe(f17);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        if (this.f68152e) {
            super.onSwipeBack();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.ui.tools.f5 f5Var = this.f68159o;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.tencent.kinda.framework.widget.base.IEventFragment
    public boolean popFragment(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        if (this.f68153f.popFragment(baseFragment)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "popFragment, There is still Fragment, and UIPageFragmentActivity hold.");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "popFragment, finish the UIPageFragmentActivity.");
        finish();
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.IEventFragment
    public boolean removeModal(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        if (this.f68153f.removeModal(baseFragment)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "removeModal, There is still Fragment, and UIPageFragmentActivity hold.");
            return true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f68153f.hasOpenH5OrTinyApp());
        com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl kindaCacheServiceImpl = this.f68156i;
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "removeModal, hasOpenH5OrTinyApp: %b, kindaShowingDialog: %b", valueOf, java.lang.Boolean.valueOf(kindaCacheServiceImpl.getBool("kindaShowingDialog")));
        if (this.f68153f.hasOpenH5OrTinyApp() || kindaCacheServiceImpl.getBool("kindaShowingDialog")) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "removeModal, finish the UIPageFragmentActivity.");
        finish();
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFrActivity
    public com.tencent.kinda.framework.widget.base.BaseFragment topShowFragment() {
        com.tencent.kinda.framework.widget.base.FrLifeController frLifeController = this.f68153f;
        if (frLifeController == null) {
            return null;
        }
        return com.tencent.kinda.framework.widget.base.BaseFrActivity.topShowFragmentOf(frLifeController.getFragmentList());
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        boolean z18;
        boolean z19;
        java.util.List<androidx.fragment.app.Fragment> fragmentList = this.f68153f.getFragmentList();
        java.util.ListIterator<androidx.fragment.app.Fragment> listIterator = fragmentList.listIterator(fragmentList.size());
        if (i17 > 0 && this.f68160p <= 0) {
            this.f68160p = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "show keyboard %s", java.lang.Integer.valueOf(i17));
            z18 = true;
            z19 = true;
        } else if (i17 > 0 || this.f68160p <= 0) {
            z18 = false;
            z19 = true;
        } else {
            this.f68160p = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "hide keyboard %s", java.lang.Integer.valueOf(i17));
            z19 = false;
            z18 = true;
        }
        if (z18) {
            while (listIterator.hasPrevious()) {
                com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = (com.tencent.kinda.framework.widget.base.BaseFragment) listIterator.previous();
                if (baseFragment instanceof com.tencent.kinda.framework.widget.base.BaseFragment) {
                    if (z19) {
                        baseFragment.onKeyboardShow(true, i65.a.c(getContext(), i17));
                    } else {
                        baseFragment.onKeyboardShow(false, i65.a.c(getContext(), i17));
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.UIPageFragmentActivity", "onScreenShot");
        com.tencent.kinda.framework.boot.KindaApp.appKinda().takeScreenshot();
    }
}
