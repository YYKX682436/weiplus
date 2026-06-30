package com.p314xaae8f345.mm.p780x208df1fe.app;

@db5.a(m123858x6ac9171 = 1159)
@com.p314xaae8f345.mm.ui.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.framework.app.UIPageFragmentActivity */
/* loaded from: classes9.dex */
public class ActivityC10720x85cbbee2 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41, com.p314xaae8f345.mm.ui.p2740x696c9db.c5, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f149683v = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f149685e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 f149686f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f149690m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f149691n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f149692o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f149684d = true;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3622x83841d6f f149687g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f149688h = null;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 f149689i = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0();

    /* renamed from: p, reason: collision with root package name */
    public int f149693p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f149694q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f149695r = false;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f149696s = new java.util.concurrent.atomic.AtomicInteger(5);

    /* renamed from: t, reason: collision with root package name */
    public final java.util.HashMap f149697t = new java.util.HashMap();

    /* renamed from: u, reason: collision with root package name */
    public boolean f149698u = false;

    public void T6(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 m27176x25eb1c5c = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3362x9532a82b.m27176x25eb1c5c(bundle);
        if (m27176x25eb1c5c instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) {
            this.f149684d = false;
        }
        if (m27176x25eb1c5c == null) {
            super.onBackPressed();
            return;
        }
        boolean z17 = bundle.getBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13317xd1443d36, false);
        boolean z18 = bundle.getBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13310x3a0f485e, false);
        if (bundle.getBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13297x9328e3f0, false) && (m27176x25eb1c5c instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749)) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24894xafeb3684(m27176x25eb1c5c.m7479x8cdac1b());
            this.f149686f.m26147x502c8254(bundle, (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) m27176x25eb1c5c);
        } else if (z17 && (m27176x25eb1c5c instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749)) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24894xafeb3684(m27176x25eb1c5c.m7479x8cdac1b());
            this.f149686f.m26149xcef50b5a(bundle, (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) m27176x25eb1c5c);
        } else {
            if (!z18 || !(m27176x25eb1c5c instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749)) {
                this.f149686f.m26136x63908e11(m27176x25eb1c5c);
                return;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p350xccec32e1.C3104x31cc1bfb.m24894xafeb3684(m27176x25eb1c5c.m7479x8cdac1b());
            this.f149686f.m26148x5ca55c42(bundle, (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) m27176x25eb1c5c);
        }
    }

    public boolean U6() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc4 = this.f149686f;
        if (c3286xff002bc4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "shouldFinish, controller is null!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "shouldFinish, fragment size: %s, hasOpenH5OrTinyApp: %s", java.lang.Integer.valueOf(c3286xff002bc4.m26140x96eae3a5()), java.lang.Boolean.valueOf(this.f149686f.m26141x3fd59aad()));
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc42 = this.f149686f;
        return (c3286xff002bc42 == null || c3286xff002bc42.m26140x96eae3a5() != 0 || this.f149686f.m26141x3fd59aad()) ? false : true;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41
    /* renamed from: addFragment */
    public boolean mo26154x63908e11(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "addFragment: " + abstractViewOnTouchListenerC3283x43ef4061);
        if (abstractViewOnTouchListenerC3283x43ef4061 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) {
            this.f149684d = false;
        }
        return this.f149686f.m26136x63908e11(abstractViewOnTouchListenerC3283x43ef4061);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.UIPageFragmentActivity", "[finish] %s, onlyModal:%s ，stack: ", this, java.lang.Boolean.valueOf(this.f149684d));
        if (this.f149684d) {
            super.overridePendingTransition(0, 0);
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_open_uipage_fragement_exit_anim, false) && this.f149694q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "activity finish shouldAddExitAnimationForLiteApp: %s");
            overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
            this.f149694q = false;
        }
        int intExtra = getIntent().getIntExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13296xcbac186, -1);
        if (intExtra != -1) {
            overridePendingTransition(0, intExtra);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41
    /* renamed from: fixOnResume */
    public void mo26155x606faa21(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc4 = this.f149686f;
        if (c3286xff002bc4 != null) {
            c3286xff002bc4.m26137x606faa21(abstractViewOnTouchListenerC3283x43ef4061);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.R.C3089xbddafb2a.f11649x47051e31;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (this.f149698u && str != null && str.equals(ya.b.f77489x9ff58fb5)) {
            return null;
        }
        return super.getSystemService(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Boolean bool;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onActivityResult requestCode: " + i17 + ", resultCode: " + i18 + ", data: " + intent);
        boolean z17 = true;
        boolean z18 = false;
        if (i17 != 4 || intent == null) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc4 = this.f149686f;
            if (c3286xff002bc4 != null && c3286xff002bc4.m26144x58d1c3d4(i17) && U6()) {
                if (i17 == 11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "liteapp exit and shouldFinish, shouldAddExitAnimationForLiteApp = true");
                    this.f149694q = true;
                }
                finish();
                return;
            }
            z17 = false;
        } else {
            int intExtra = intent.getIntExtra("err_code", 0);
            int intExtra2 = intent.getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            int intExtra3 = intent.getIntExtra("countFace", 0);
            long longExtra = intent.getLongExtra("totalTime", 0L);
            int intExtra4 = intent.getIntExtra("err_type", 6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "errCode： " + intExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "scene： " + intExtra2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "countFace： " + intExtra3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "totalTime： " + longExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "errorType： " + intExtra4);
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_check_cross_switch, false);
            boolean z19 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_FaceCheckCross_Int, 0) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "isOpenFaceCrossSwitch: %s, %s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z19));
            if (z19) {
                fj6 = true;
            }
            if (fj6) {
                m26046xa70c0dc0();
            }
            if (i18 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "resultCode：RESULT_OK");
                if (this.f149687g != null && intent.getExtras() != null) {
                    this.f149687g.mo28451x2e7a5e(false, intent.getExtras().getString("token"), intExtra, "");
                    this.f149687g = null;
                }
            } else {
                if (this.f149687g != null && intent.getExtras() != null) {
                    java.lang.String string = intent.getExtras().getString("click_other_verify_btn");
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) && string.equalsIgnoreCase("yes")) {
                        z18 = true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "isClickOtherVerify: %s", string);
                    if (z18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "check face failed, click other verify");
                        this.f149687g.mo28451x2e7a5e(true, "", intExtra, "");
                        this.f149687g = null;
                    }
                }
                if (i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "resultCode：RESULT_CANCELED");
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619 = this.f149688h;
                    if (abstractC3623x3b485619 != null) {
                        abstractC3623x3b485619.mo25801x2e7a5e();
                        this.f149688h = null;
                    }
                }
            }
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc42 = this.f149686f;
        if (c3286xff002bc42 != null && c3286xff002bc42.m26140x96eae3a5() <= 0) {
            finish();
            return;
        }
        if (z17) {
            return;
        }
        ej0.f fVar = (ej0.f) this.f149697t.get(java.lang.Integer.valueOf(i17));
        if (fVar != null) {
            fVar.mo24862xb7026e28(i18, intent);
            bool = java.lang.Boolean.TRUE;
        } else {
            bool = java.lang.Boolean.FALSE;
        }
        bool.booleanValue();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onBackPressed");
        if (this.f149686f.m26138x80f8f943().mo25461xbdc3c5dc()) {
            return;
        }
        mo26156x8f5417c1(null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_foldscreent_event_backup_context_switch, false);
        boolean z17 = com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixKindaContext", "[onConfigurationChanged] isallow: " + fj6 + "isPadOrFoldableDevice: " + z17);
        if (fj6 && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixKindaContext", "backup context.");
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27307x4214a5e6();
            java.util.Iterator<com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3368x7c09b87a> it = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27309x8d156af1().iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference<android.content.Context> m27302x76847179 = it.next().m27302x76847179();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FixKindaContext", "backup context" + (m27302x76847179.get() instanceof android.app.Activity ? ((android.app.Activity) m27302x76847179.get()).getComponentName().getClassName() : ""));
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17 = false;
        this.f149690m = getIntent().getBooleanExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13290xb4020418, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(782, 37);
        this.f149691n = com.p314xaae8f345.mm.ui.bk.C();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "[onCreate] fragment：%s，isDarkMode:%s", this, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C()));
        this.f149686f = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4(this);
        this.f149685e = getIntent().getBooleanExtra("key_support_swipe_back", true);
        o25.n1.f(this);
        super.onCreate(bundle);
        if (bundle != null) {
            boolean z18 = bundle.getBoolean("pageHasRestored", false);
            java.lang.String string = bundle.getString("pageRestoredPage", "default");
            boolean mj6 = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).mj(z18, "1", "kinda/" + string);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "[onCreate] is restore status？: %s，needFinish？：%s, restorePage: %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(mj6), string);
            if (mj6) {
                java.util.Map map = h45.i0.f360483a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                if (mo55332x76847179 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPayUtil", "[jumpToLaunchUI] context is null");
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.addFlags(67108864);
                    intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                    intent.putExtra("preferred_tab", 0);
                    j45.l.u(mo55332x76847179, "com.tencent.mm.ui.LauncherUI", intent, null);
                }
                finish();
                return;
            }
        }
        getWindow().getDecorView().setSystemUiVisibility(com.p314xaae8f345.mm.ui.b4.c(this) ? 1792 : 1280);
        m78531x8f8cf1fb();
        mo78514x143f1b92().G0(0);
        if (getWindow() != null && android.os.Build.VERSION.SDK_INT >= 28) {
            getWindow().setNavigationBarDividerColor(0);
        }
        if (this.f149689i != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "force kindaShowingDialog is false");
            this.f149689i.mo25859x76486a6c("kindaShowingDialog", false, 0L);
        }
        if (this.f149690m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "need check lock");
            z17 = ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().k(this, null);
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "not show lock");
            T6(getIntent().getBundleExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13294x67f20f85));
        }
        m26060x61b540c6(new ej0.c(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(mo55332x76847179());
        this.f149692o = f5Var;
        f5Var.f291933e = this;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "[onDestroy] %s", this);
        this.f149686f.m26142x2711d60c();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(782, 44);
        fo3.s.INSTANCE.sb(false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onNewIntent");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onPause");
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(782, 42);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5661x26d8a0c0().e();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f149692o;
        if (f5Var != null) {
            f5Var.d();
        }
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        boolean z17 = bundle.getBoolean("key_dark_mode_state");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_kinda_darkmode_change_adaptation, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onRestoreInstanceState，lastDarkMode:%s  nowDarkMode:%s,svgconfig:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.ui.bk.C()), java.lang.Boolean.valueOf(fj6));
        if (fj6 && (z17 ^ com.p314xaae8f345.mm.ui.bk.C())) {
            finish();
        }
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onResume");
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(782, 40);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc4 = this.f149686f;
        if (c3286xff002bc4 != null && c3286xff002bc4.m26144x58d1c3d4(3) && U6()) {
            finish();
        } else {
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.m121588x764fefd8(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.B());
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f149692o;
        if (f5Var != null) {
            f5Var.f();
        }
        this.f149686f.m26146x68ba6533(true);
        ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(mo55332x76847179(), this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putBoolean("key_dark_mode_state", this.f149691n);
        bundle.putBoolean("pageHasRestored", true);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc4 = this.f149686f;
        java.lang.String mo25456xea5dece5 = (c3286xff002bc4 == null || c3286xff002bc4.m26138x80f8f943() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f149686f.m26138x80f8f943().mo25456xea5dece5())) ? "default" : this.f149686f.m26138x80f8f943().mo25456xea5dece5();
        bundle.putString("pageRestoredPage", mo25456xea5dece5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "[onSaveInstanceState] isDarkMode:%s，restorePage：%s", java.lang.Boolean.valueOf(this.f149691n), mo25456xea5dece5);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onStop");
        super.onStop();
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5662xdcfef1bc().e();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.z2
    /* renamed from: onSwipe */
    public void mo2326xb052149b(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onSwipe %s", java.lang.Float.valueOf(f17));
        super.mo2326xb052149b(f17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, al5.f3
    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        if (this.f149685e) {
            super.mo2295x59cfc822();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f149692o;
        if (f5Var == null || !z17) {
            return;
        }
        f5Var.f();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41
    /* renamed from: popFragment */
    public boolean mo26156x8f5417c1(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        if (this.f149686f.m26143x8f5417c1(abstractViewOnTouchListenerC3283x43ef4061)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "popFragment, There is still Fragment, and UIPageFragmentActivity hold.");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "popFragment, finish the UIPageFragmentActivity.");
        finish();
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3288xc3ba2d41
    /* renamed from: removeModal */
    public boolean mo26157xed80c489(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061) {
        if (this.f149686f.m26145xed80c489(abstractViewOnTouchListenerC3283x43ef4061)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "removeModal, There is still Fragment, and UIPageFragmentActivity hold.");
            return true;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f149686f.m26141x3fd59aad());
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3229xb79a5ee0 c3229xb79a5ee0 = this.f149689i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "removeModal, hasOpenH5OrTinyApp: %b, kindaShowingDialog: %b", valueOf, java.lang.Boolean.valueOf(c3229xb79a5ee0.mo25856xfb7da360("kindaShowingDialog")));
        if (this.f149686f.m26141x3fd59aad() || c3229xb79a5ee0.mo25856xfb7da360("kindaShowingDialog")) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "removeModal, finish the UIPageFragmentActivity.");
        finish();
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc
    /* renamed from: topShowFragment */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 mo26064x748f9262() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3286xff002bc4 c3286xff002bc4 = this.f149686f;
        if (c3286xff002bc4 == null) {
            return null;
        }
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractActivityC3282x418ff5cc.m26044x8ef48bd9(c3286xff002bc4.m26139xd2dff184());
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        boolean z18;
        boolean z19;
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m26139xd2dff184 = this.f149686f.m26139xd2dff184();
        java.util.ListIterator<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> listIterator = m26139xd2dff184.listIterator(m26139xd2dff184.size());
        if (i17 > 0 && this.f149693p <= 0) {
            this.f149693p = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "show keyboard %s", java.lang.Integer.valueOf(i17));
            z18 = true;
            z19 = true;
        } else if (i17 > 0 || this.f149693p <= 0) {
            z18 = false;
            z19 = true;
        } else {
            this.f149693p = i17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "hide keyboard %s", java.lang.Integer.valueOf(i17));
            z19 = false;
            z18 = true;
        }
        if (z18) {
            while (listIterator.hasPrevious()) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) listIterator.previous();
                if (abstractViewOnTouchListenerC3283x43ef4061 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) {
                    if (z19) {
                        abstractViewOnTouchListenerC3283x43ef4061.mo25466x81b60303(true, i65.a.c(mo55332x76847179(), i17));
                    } else {
                        abstractViewOnTouchListenerC3283x43ef4061.mo25466x81b60303(false, i65.a.c(mo55332x76847179(), i17));
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIPageFragmentActivity", "onScreenShot");
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27498xb9ed94d();
    }
}
