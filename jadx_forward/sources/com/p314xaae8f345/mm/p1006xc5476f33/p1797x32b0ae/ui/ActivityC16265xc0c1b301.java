package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppTransparentLiteUI */
/* loaded from: classes15.dex */
public class ActivityC16265xc0c1b301 extends com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 implements q80.z, com.p314xaae8f345.mm.sdk.p2603x2137b148.f7, nf.m {
    public org.json.JSONObject A1;
    public final aa3.f0 B1 = new aa3.f0();
    public boolean C1 = false;
    public q80.x D1 = null;

    @Override // q80.z
    public void R1(q80.x xVar) {
        this.D1 = xVar;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: closeWindow */
    public void mo28560x10864c08(android.content.Intent intent) {
        if (intent.hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099)) {
            try {
                this.A1 = new org.json.JSONObject(intent.getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099));
            } catch (java.lang.Exception unused) {
            }
        }
        if (intent.getBooleanExtra("onlySetData", false)) {
            return;
        }
        super.mo28560x10864c08(intent);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        return "layout_inflater".equals(str) ? com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService) : systemService;
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: hideKeyboard */
    public void mo28574x3f895349() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.b();
        super.mo28574x3f895349();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: isDarkMode */
    public boolean mo28575x387a9983() {
        return com.p314xaae8f345.mm.ui.bk.C();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: keyboardEnable */
    public void mo28576xa5ddbc4a(boolean z17) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        aa3.h0.f84059a.c(z17);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        q80.x xVar = this.D1;
        if (xVar != null) {
            xVar.mo55562x9d4787cb(i17, i18, intent);
            this.D1 = null;
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckBaseLibSumFail */
    public void mo28578x2635de3e(java.lang.String str, java.util.List list) {
        super.mo28578x2635de3e(str, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().B(this.R.I);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckLiteAppVersionError */
    public void mo65530xac5a411a(int i17) {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.r2(this));
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: onCheckSumFail */
    public void mo28579x2d9f160(java.lang.String str, java.util.List list) {
        super.mo28579x2d9f160(str, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().C(str, this.R.I);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            if (getIntent().hasExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0)) {
                this.f127609f = (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441) getIntent().getParcelableExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14346xd56cf4f0);
            }
            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 = this.f127609f;
            if (c3712x3ed8a441 != null) {
                boolean contains = ra3.h0.f475046f.contains(c3712x3ed8a441.f14359x58b7f1c);
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_liteapp_recreated_jump_to_launchui, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppUtils", "needBackToLaunchUI switch check %s %s", java.lang.Boolean.valueOf(contains), java.lang.Boolean.valueOf(fj6));
                boolean z17 = contains && fj6;
                this.f127615o = z17;
                if (z17) {
                    super.onCreate(bundle);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppUtils", "jumpToLaunchUI");
                    android.content.Intent intent = new android.content.Intent();
                    intent.addFlags(67108864);
                    intent.addFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                    intent.putExtra("preferred_tab", 0);
                    j45.l.u(this, "com.tencent.mm.ui.LauncherUI", intent, null);
                    finish();
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225683b.get()) {
            kd.c.b("MicroMsg.WxaLiteAppTransparentLiteUI", "LiteAppProcessProfileInit has no init.", new java.lang.Object[0]);
            this.f127614n = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.o2 o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.o2(this, new java.lang.ref.WeakReference(this));
        aa3.f0 f0Var = this.B1;
        f0Var.getClass();
        f0Var.f84054b = o2Var;
        f0Var.f84053a = true;
        aa3.h0.f84059a.a(f0Var);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        if (!kx5.n.h().l()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 112L, 1L);
        }
        super.onCreate(bundle);
        this.f127608e.f431328d.m137283xa83bcec0(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.p2(this));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf.m78472x26f04c88(this);
        long longExtra = getIntent().getLongExtra("callbackUuid", -1L);
        if (longExtra > 0) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226051u;
            q80.f0 f0Var2 = (q80.f0) hashMap.get(java.lang.Long.valueOf(longExtra));
            if (f0Var2 != null) {
                f0Var2.mo25804x3e5a77bb(this.f127622q, this.f127635z);
                hashMap.remove(java.lang.Long.valueOf(longExtra));
            }
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 0;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.os.Bundle bundleExtra = getIntent().getBundleExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099);
        if (bundleExtra != null && bundleExtra.containsKey("key_multi_task_common_info")) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Vi(0, "MultiTaskForSnapshotMinusScreen", 1048576, "");
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 3;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
        aa3.h0.f84059a.d(this.B1);
        nf.g.b(this);
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 2;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3720xaf400c64, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3 c5675xda3892c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5675xda3892c3();
        am.ri riVar = c5675xda3892c3.f136001g;
        riVar.f89350a = 1;
        riVar.f89352c = this.f127628w;
        riVar.f89353d = java.lang.Long.valueOf(this.f127622q);
        riVar.f89354e = this.f127635z;
        riVar.f89351b = this.A1;
        c5675xda3892c3.e();
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17 && j45.l.f()) {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        } else {
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this);
        }
    }

    @Override // com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.ILiteAppUICallback
    /* renamed from: showPage */
    public void mo28593xebcbeb2c(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo) {
        super.mo28593xebcbeb2c(pageInfo);
        boolean z17 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_do_check_accessibility_safety_switch_liteapp, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSafetyHelper", "[getAccessibilitySafetySwitch] " + fj6);
        if (fj6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaLiteAppTransparentLiteUI", "start [checkCashierAccessibilitySecure]");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageInfo pageInfo2 = this.f127612i;
            if (pageInfo2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppSafetyHelper", "current pageInfo is null or transparentLiteUI is null do not CheckAcccessibilitySecurityServiceList");
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p353xff11797b.C3192xff8cc88a.WX_PAY_CASHIER_LITE_APP_ID, pageInfo2.f37283x58b7f1c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("pages/cashier/entry", pageInfo2.f37292xd01aac60)) {
                java.lang.String format = java.lang.String.format("current LiteApp is CashierLiteApp, current Page is %s", java.util.Arrays.copyOf(new java.lang.Object[]{pageInfo2.f37292xd01aac60}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSafetyHelper", format);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(android.R.id.content);
                if (this.C1) {
                    return;
                }
                this.C1 = true;
                java.util.ArrayList Di = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Di(true);
                if (Di.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppSafetyHelper", "[doCheckAccessibilitySecure] localServiceList isNullOrEmpty doNot BlockAccessibility");
                } else {
                    int Ni = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ni(Di, true);
                    if (Ni == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppSafetyHelper", "[doCheckAccessibilitySecure] action is 0, return ");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSafetyHelper", "accessibility secure action is " + Ni);
                        if (Ni != 0 && Ni != 1) {
                            if (Ni != 2) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSafetyHelper", "UnKnown action type: " + Ni);
                            } else {
                                z17 = true;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSafetyHelper", "[doCheckAccessibilitySecure] status: " + z17);
                    }
                }
                if (viewGroup == null || isFinishing() || isDestroyed()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSafetyHelper", "contentView is null no need action");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSafetyHelper", "get contentView success");
                viewGroup.setAccessibilityDelegate(new ra3.r(z17));
                if (z17) {
                    viewGroup.setImportantForAccessibility(4);
                } else {
                    viewGroup.setImportantForAccessibility(1);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65436xa68b2341(this.f127622q, "app.screenshot", (org.json.JSONObject) null);
    }
}
