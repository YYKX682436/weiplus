package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

@db5.a(m123858x6ac9171 = 128)
/* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC15876x18f56825 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements nf.m, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f221026i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f f221027d;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l f221030g;

    /* renamed from: e, reason: collision with root package name */
    public int f221028e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f221029f = true;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f221031h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI$a */
    /* loaded from: classes8.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (bundle == null) {
                return;
            }
            java.lang.String string = bundle.getString("key_open_business_type");
            java.lang.String string2 = bundle.getString("key_back_appid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "gamelog main process OpenBusinessViewUtil.launchBackApp businessType =%s ,appId = %s", string, string2);
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(string, "", string2, 0, "");
        }
    }

    public final void U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = this.f221027d;
        if (fVar == null || fVar.e()) {
            return;
        }
        X6();
        finish();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l V6(sd.x xVar, android.os.Bundle bundle) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l(xVar, null, bundle);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 W6(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString("float_ball_key");
        boolean z17 = bundle.getBoolean("float_layer_page", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "createPage ConstantsUI.WebViewUI.KextData = " + getIntent().getStringExtra("key_extData"));
        bundle.putString("key_extData", getIntent().getStringExtra("key_extData"));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0(this.f221027d.f488202j, sd.q0.a(mo55332x76847179(), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z2.b(string))), bundle);
        }
        if (z17) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.a(this.f221027d.f488202j, null, bundle);
        }
        if (!bundle.containsKey("game_tab_data")) {
            sd.o0 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.g(mo55332x76847179(), str);
            return g17 != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c1(this.f221027d.f488202j, g17, bundle) : new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0(this.f221027d.f488202j, null, bundle);
        }
        this.f221030g = V6(this.f221027d.f488202j, bundle);
        Y6();
        return this.f221030g;
    }

    public void X6() {
    }

    public void Y6() {
    }

    public final void Z6() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755 c15871x7b988755;
        this.f221028e = getIntent().getIntExtra("screen_orientation", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("from_shortcut", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("from_game_tab", false);
        if (!booleanExtra && !(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("float_ball_key"))) && !booleanExtra2) {
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292615e, com.p314xaae8f345.mm.ui.uc.f292616f);
        }
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19267xf1e5d915().d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "onCreate, startTime: %d, now: %d", java.lang.Long.valueOf(getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis())), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String stringExtra = getIntent().getStringExtra("rawUrl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGameWebViewUI", "url is null");
            return;
        }
        if (getIntent().getBooleanExtra("shouldCheckLimitedMode", true) && ((qk.s6) gm0.j1.s(qk.s6.class)).mo13794x74219ae7()) {
            stringExtra = ((qk.s6) gm0.j1.s(qk.s6.class)).Hg();
            getIntent().putExtra("rawUrl", stringExtra);
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(stringExtra);
        b17.f149707d = stringExtra;
        b17.f149719s = getIntent().getLongExtra("gamecenterui_createtime", 0L);
        b17.f149720t = getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis());
        b17.f149718r = getIntent().getLongExtra("start_time", b17.f149720t);
        b17.f149725y = java.lang.System.currentTimeMillis();
        b17.f149709f = 1;
        b17.f149712i = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "url: %s, __Time__， startTime: %d, gamecenterCreate: %d,startWebUI: %d, webUICreate: %d", stringExtra, java.lang.Long.valueOf(b17.f149718r), java.lang.Long.valueOf(b17.f149719s), java.lang.Long.valueOf(b17.f149720t), java.lang.Long.valueOf(b17.f149725y));
        sx4.d0.a(stringExtra);
        sx4.d0.i(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.j(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.e(stringExtra, b17.f149718r);
        getWindow().setFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        getWindow().setFormat(-3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f(this);
        this.f221027d = fVar;
        a7(fVar.f488195c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar2 = this.f221027d;
        fVar2.f221419l = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.j0(this);
        fVar2.f488199g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.k0(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860 c15873x8354f860 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860) getIntent().getParcelableExtra("launchParams");
        if (c15873x8354f860 == null || (c15871x7b988755 = c15873x8354f860.f221020d) == null) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b18 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(c15871x7b988755.f221007d);
            b18.f149707d = c15871x7b988755.f221007d;
            b18.f149719s = getIntent().getLongExtra("gamecenterui_createtime", 0L);
            b18.f149720t = getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis());
            b18.f149718r = getIntent().getLongExtra("start_time", b18.f149720t);
            b18.f149725y = java.lang.System.currentTimeMillis();
            b18.f149709f = 1;
            b18.f149712i = 1;
            sx4.d0.i(c15871x7b988755.f221007d, java.lang.System.currentTimeMillis());
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("rawUrl", c15871x7b988755.f221007d);
            bundle.putBoolean("show_full_screen", c15871x7b988755.f221008e);
            bundle.putInt("screen_orientation", c15871x7b988755.f221009f);
            bundle.putBoolean("float_layer_page", true);
            bundle.putBoolean("needAnimation", false);
            bundle.putInt("customize_status_bar_color", getIntent().getIntExtra("customize_status_bar_color", 0));
            bundle.putString("customize_status_bar_color", getIntent().getStringExtra("status_bar_style"));
            this.f221027d.h(c15871x7b988755.f221007d, bundle, false);
            z17 = true;
        }
        if (z17) {
            b17.f149716p = 1;
            new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.l0(this, stringExtra), 300L);
        } else {
            this.f221027d.g(stringExtra, getIntent().getExtras());
        }
        if (getIntent().getBooleanExtra("from_download_floagt_ball_shutdown_entrance", false)) {
            new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.m0(this), 300L);
        }
    }

    public void a7(android.view.View view) {
        setContentView(this.f221027d.f488195c);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return this.f221028e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initSwipeBack */
    public void mo64511xb83ef811() {
        m78503xa10faa4c(false);
        super.mo64511xb83ef811();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f221027d.f488198f.g(i17, i18, intent);
        if (i17 == 10011) {
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (!g53.j.b(this.f221027d.b())) {
            m33.i1 i1Var = g53.f.f350444a;
            if (i1Var != null) {
                i1Var.mo74225x3d6f0539();
            }
            g53.f.f350444a = null;
            U6();
            return;
        }
        if (g53.j.f350453d == 0) {
            return;
        }
        ((vz.x1) i95.n0.c(vz.x1.class)).getClass();
        java.lang.String appId = g53.j.f350451b;
        java.lang.String str = g53.j.f350452c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p0(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        c02.l lVar2 = new c02.l();
        lVar2.f119138d = appId;
        lVar.f152197a = lVar2;
        lVar.f152198b = new c02.m();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
        lVar.f152200d = 4786;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.a(lVar.a(), new k02.q(p0Var, this, str, appId, 1));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        Z6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.i0.f221095a.getAndIncrement();
        mo78514x143f1b92().E0(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(10);
        mo2550x7c2abd06(1);
        mo2550x7c2abd06(9);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        g53.j.f350450a = false;
        g53.j.f350451b = null;
        g53.j.f350452c = null;
        java.lang.ref.WeakReference weakReference = g53.j.f350454e;
        if (weakReference != null) {
            weakReference.clear();
        }
        g53.j.f350454e = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.h0.f221092a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.h0.f221093b = 0L;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f221031h;
        java.util.Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            this.f221027d.f488195c.removeView((android.view.View) it.next());
        }
        concurrentHashMap.clear();
        this.f221027d.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.f269865a.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "fixInputMethodManagerLeak, imm");
            java.lang.String[] strArr = {"mCurRootView", "mServedView", "mNextServedView"};
            for (int i17 = 0; i17 < 3; i17++) {
                try {
                    java.lang.reflect.Field declaredField = inputMethodManager.getClass().getDeclaredField(strArr[i17]);
                    if (!declaredField.isAccessible()) {
                        declaredField.setAccessible(true);
                    }
                    java.lang.Object obj = declaredField.get(inputMethodManager);
                    if (obj != null && (obj instanceof android.view.View)) {
                        android.view.View view = (android.view.View) obj;
                        if (!(view.getContext() instanceof android.content.ContextWrapper)) {
                            if (view.getContext() != this) {
                                break;
                            } else {
                                declaredField.set(inputMethodManager, null);
                            }
                        } else if (((android.content.ContextWrapper) view.getContext()).getBaseContext() == this) {
                            declaredField.set(inputMethodManager, null);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuggageGameWebViewUI", th6, "", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.i0.a();
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("key_bundle_ext_data");
        if (bundleExtra != null && bundleExtra.getBoolean("key_open_by_sdk", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "gamelog OpenBusinessViewUtil.launchBackApp businessType =%s ,appId = %s", bundleExtra.getString("key_open_business_type"), bundleExtra.getString("key_back_appid"));
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundleExtra, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ActivityC15876x18f56825.a.class, null);
        }
        super.onDestroy();
        java.lang.System.gc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "onNewIntent, time: " + java.lang.System.currentTimeMillis());
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuggageGameWebViewUI", "onNewIntent with null");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        Z6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "onPause");
        mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264160b = false;
        sd.k b17 = this.f221027d.b();
        if (b17 != null) {
            b17.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l lVar = this.f221030g;
        if (lVar != null) {
            lVar.Y();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "onResume, time: " + java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.f264160b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = this.f221027d;
        sd.k b17 = fVar.b();
        if (b17 != null) {
            b17.h();
        }
        fVar.k();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameWebViewUI", "onWindowFocusChanged, hasFocus: %b, time: %d", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (z17 && j45.l.f()) {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        } else {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        }
        super.onWindowFocusChanged(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        int i17 = this.f221028e;
        if (i17 != -1) {
            setRequestedOrientation(i17);
            return;
        }
        boolean z17 = getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 4).getBoolean("settings_landscape_mode", false);
        this.f39316x876ccafe = z17;
        if (z17) {
            setRequestedOrientation(-1);
        } else {
            setRequestedOrientation(1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        return !getIntent().getBooleanExtra("disable_game_page_swipe", false);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        try {
            sd.u0 u0Var = (sd.u0) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.b().getLast();
            if ((u0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) u0Var).v(1048576)) {
                u0Var.f488188i.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.q0(this));
            }
        } catch (java.util.NoSuchElementException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGameWebViewUI", "LuggagePageStackList size:%s", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.u1.b().size()));
        }
    }
}
