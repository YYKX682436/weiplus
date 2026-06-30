package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* renamed from: com.tencent.mm.plugin.game.luggage.MMLuggageGameWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC15878x593061c5 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements nf.m {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f f221037d;

    /* renamed from: e, reason: collision with root package name */
    public int f221038e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f221039f = true;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l f221040g;

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 U6(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString("float_ball_key");
        boolean z17 = bundle.getBoolean("float_layer_page", false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0(this.f221037d.f488202j, sd.q0.a(mo55332x76847179(), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z2.b(string))), bundle);
        }
        if (z17) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.a(this.f221037d.f488202j, null, bundle);
        }
        if (!bundle.containsKey("game_tab_data")) {
            sd.o0 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.g(mo55332x76847179(), str);
            return g17 != null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.c1(this.f221037d.f488202j, g17, bundle) : new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0(this.f221037d.f488202j, null, bundle);
        }
        this.f221040g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l(this.f221037d.f488202j, null, bundle);
        W6();
        return this.f221040g;
    }

    public void V6() {
    }

    public void W6() {
    }

    public void X6(android.view.View view) {
        setContentView(this.f221037d.f488195c);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return this.f221038e;
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
        this.f221037d.f488198f.g(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f221037d.e()) {
            return;
        }
        V6();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755 c15871x7b988755;
        super.onCreate(bundle);
        this.f221038e = getIntent().getIntExtra("screen_orientation", -1);
        boolean booleanExtra = getIntent().getBooleanExtra("from_shortcut", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("from_game_tab", false);
        if (!booleanExtra && !(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("float_ball_key"))) && !booleanExtra2) {
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292615e, com.p314xaae8f345.mm.ui.uc.f292616f);
        }
        if (getIntent().getBooleanExtra("game_from_detail_back", false)) {
            overridePendingTransition(com.p314xaae8f345.mm.ui.uc.f292613c, com.p314xaae8f345.mm.ui.uc.f292614d);
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19267xf1e5d915().d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onCreate, startTime: %d, now: %d", java.lang.Long.valueOf(getIntent().getLongExtra("start_activity_time", java.lang.System.currentTimeMillis())), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.lang.String stringExtra = getIntent().getStringExtra("rawUrl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMLuggageGameWebViewUI", "url is null");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "url: %s, __Time__， startTime: %d, gamecenterCreate: %d,startWebUI: %d, webUICreate: %d", stringExtra, java.lang.Long.valueOf(b17.f149718r), java.lang.Long.valueOf(b17.f149719s), java.lang.Long.valueOf(b17.f149720t), java.lang.Long.valueOf(b17.f149725y));
        sx4.d0.a(stringExtra);
        sx4.d0.i(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.j(stringExtra, java.lang.System.currentTimeMillis());
        sx4.d0.e(stringExtra, b17.f149718r);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        getWindow().setFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        getWindow().setFormat(-3);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f(this);
        this.f221037d = fVar;
        X6(fVar.f488195c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar2 = this.f221037d;
        fVar2.f221419l = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.b1(this);
        fVar2.f488199g = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.c1(this);
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
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("rawUrl", c15871x7b988755.f221007d);
            bundle2.putBoolean("show_full_screen", c15871x7b988755.f221008e);
            bundle2.putInt("screen_orientation", c15871x7b988755.f221009f);
            bundle2.putBoolean("float_layer_page", true);
            bundle2.putBoolean("needAnimation", false);
            bundle2.putInt("customize_status_bar_color", getIntent().getIntExtra("customize_status_bar_color", 0));
            bundle2.putString("customize_status_bar_color", getIntent().getStringExtra("status_bar_style"));
            this.f221037d.h(c15871x7b988755.f221007d, bundle2, false);
            z17 = true;
        }
        if (z17) {
            b17.f149716p = 1;
            new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.d1(this, stringExtra), 300L);
        } else {
            this.f221037d.g(stringExtra, getIntent().getExtras());
        }
        if (getIntent().getBooleanExtra("from_download_floagt_ball_shutdown_entrance", false)) {
            new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.e1(this), 300L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.i0.f221095a.getAndIncrement();
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
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.h0.f221092a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.h0.f221093b = 0L;
        this.f221037d.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.h.f269865a.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "fixInputMethodManagerLeak");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "fixInputMethodManagerLeak, imm");
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
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMLuggageGameWebViewUI", th6, "", new java.lang.Object[0]);
                }
            }
        }
        java.lang.System.gc();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.i0.a();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onPause");
        mo48674x36654fab();
        sd.k b17 = this.f221037d.b();
        if (b17 != null) {
            b17.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l lVar = this.f221040g;
        if (lVar != null) {
            lVar.Y();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onResume, time: " + java.lang.System.currentTimeMillis());
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.f fVar = this.f221037d;
        sd.k b17 = fVar.b();
        if (b17 != null) {
            b17.h();
        }
        fVar.k();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLuggageGameWebViewUI", "onWindowFocusChanged, hasFocus: %b, time: %d", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        super.onWindowFocusChanged(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        int i17 = this.f221038e;
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
}
