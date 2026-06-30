package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

@db5.a(m123858x6ac9171 = 7)
@com.p314xaae8f345.mm.ui.a2
/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI */
/* loaded from: classes7.dex */
public class ActivityC11883xd41f5bb9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.e0, nf.m {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f159880p = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v f159882e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c f159883f;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f159888n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m f159889o;

    /* renamed from: d, reason: collision with root package name */
    public int f159881d = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f159884g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f159885h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f159886i = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f159887m = false;

    public static void V6(android.content.Context context, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.n nVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = context;
        objArr[1] = java.lang.Boolean.valueOf(c3933x11320b41 != null);
        objArr[2] = java.lang.Boolean.valueOf(nVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog(context:%s, activityDelegate?:%b, callback?:%b)", objArr);
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class).putExtra("key_running_mode", 3).putExtra("key_result_receiver", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.x0.a(new p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.4
            @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
            public void a(int i17, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.n nVar2 = nVar;
                if (-1 == i17 && nVar2 != null) {
                    nVar2.a();
                }
                if (-2 != i17 || nVar2 == null) {
                    return;
                }
                nVar2.mo50417xae7a2e7a();
            }
        }, context));
        if (c3933x11320b41 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c3933x11320b41, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            c3933x11320b41.b((android.content.Intent) arrayList.get(0));
            yj0.a.f(c3933x11320b41, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            putExtra.addFlags(268435456);
        }
        try {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(putExtra);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (android.os.BadParcelableException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandProcessProxyUI", e17, "showOverseaWechatServiceAuthorizeDialog get BadParcelableException", new java.lang.Object[0]);
        }
    }

    public static void W6(android.content.Context context, java.lang.Class cls, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar, android.content.Intent intent) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) (cls == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class : cls)).putExtra("key_model_class_name", abstractC11887x3610e10c.mo50317x8a7a03d().getName()).putExtra("key_result_receiver", uVar == null ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.x0.a(new p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.1
            @Override // p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c
            public void a(int i17, android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar2 = uVar;
                if (bundle == null) {
                    uVar2.mo50331x8a4d1541(null);
                } else {
                    bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class.getClassLoader());
                    uVar2.mo50331x8a4d1541((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600) bundle.getParcelable("key_result_parcel"));
                }
            }
        }, context)).putExtra("appbrand_report_key_target_activity", abstractC11887x3610e10c.mo50398xeb5ebc06()).putExtra("key_running_mode", 1);
        boolean z17 = false;
        if (abstractC11887x3610e10c.m50399xaa6425bc()) {
            putExtra.putExtra("key_request_parcel", abstractC11887x3610e10c);
        } else {
            putExtra.putExtra("key_request_need_params", false);
        }
        android.app.Activity a17 = q75.a.a(context);
        if (a17 == null) {
            putExtra.addFlags(268435456);
        } else {
            android.view.Window window = a17.getWindow();
            if (window != null && window.getDecorView() != null && (window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                z17 = true;
            }
            putExtra.putExtra("key_need_light_status", z17);
        }
        if (abstractC11887x3610e10c.mo50396xd2cb8fa6()) {
            putExtra.putExtra("key_force_portrait", true);
        }
        if (intent != null) {
            putExtra.addFlags(intent.getFlags());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.h(abstractC11887x3610e10c, cls, context, putExtra);
        if (abstractC11887x3610e10c.mo50402xf764f604() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            hVar.run();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(hVar);
        }
    }

    public void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        this.f159886i = true;
        runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l(this, abstractC11888x1a859600));
    }

    public final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        this.f159887m = true;
        p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) getIntent().getParcelableExtra("key_result_receiver");
        if (c0050x5b3754c == null || abstractC11888x1a859600 == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle(2);
        bundle.putParcelable("key_result_parcel", abstractC11888x1a859600);
        c0050x5b3754c.b(0, bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: dealContentView */
    public void mo47898x2105eeb2(android.view.View view) {
        android.view.View decorView;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            try {
                android.view.Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.findViewById(android.R.id.content);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "ensureWindowContentViewReady failed", e17);
            }
        }
        try {
            super.mo47898x2105eeb2(view);
        } catch (java.lang.RuntimeException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "dealContentView failed, appcompat ContentFrameLayout NPE workaround", e18);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", "finish stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v vVar = this.f159882e;
        if (vVar == null || !vVar.mo50431x33f85ba7()) {
            overridePendingTransition(0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v vVar2 = this.f159882e;
        if (vVar2 != null) {
            vVar2.mo50427x5b335c92();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        if (!getIntent().hasExtra("key_force_portrait")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c = this.f159883f;
            return (abstractC11887x3610e10c == null || !abstractC11887x3610e10c.mo50403x949e94f4()) ? 3 : 6;
        }
        if (!getIntent().getBooleanExtra("key_force_portrait", false)) {
            return 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", "Force Orientation SCREEN_ORIENTATION_PORTRAIT");
        return 7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
    /* renamed from: getSupportActionBar */
    public p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.g("MicroMsg.AppBrandProcessProxyUI", new java.lang.Throwable(), "getSupportActionBar", new java.lang.Object[0]);
        return super.mo2533x106ab264();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initActivityCloseAnimation */
    public void mo50392x5138328b() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        if (this.f159883f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, NULL mRequest");
            finish();
        } else {
            this.f159883f.getClass();
            this.f159884g = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v vVar = this.f159882e;
        if (vVar == null || configuration == null) {
            return;
        }
        vVar.mo50425x50e1c15d(configuration);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v vVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate savedInstanceState:");
        sb6.append(bundle == null ? "null" : java.lang.Integer.valueOf(bundle.hashCode()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", sb6.toString());
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        super.onCreate(bundle);
        boolean z17 = false;
        overridePendingTransition(0, 0);
        if (getIntent().hasExtra("key_force_portrait")) {
            mo50393x3c0b42ee();
        }
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getWindow(), getIntent().getBooleanExtra("key_need_light_status", false));
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("key_running_mode", 0);
        if (intExtra == 1) {
            getIntent().setExtrasClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class.getClassLoader());
            java.lang.String stringExtra = getIntent().getStringExtra("key_model_class_name");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", "onCreate, modelClass = %s", stringExtra);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                try {
                    java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName(stringExtra).getDeclaredConstructor(new java.lang.Class[0]);
                    declaredConstructor.setAccessible(true);
                    vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v) declaredConstructor.newInstance(new java.lang.Object[0]);
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.IpcProxyUIModelFactory", "create mode object using className(%s), exp = %s", stringExtra, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                    vVar = null;
                }
                this.f159882e = vVar;
                if (vVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown model class = %s", stringExtra);
                } else if (getIntent().getBooleanExtra("key_request_need_params", true)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c) getIntent().getParcelableExtra("key_request_parcel");
                    this.f159883f = abstractC11887x3610e10c;
                    if (abstractC11887x3610e10c == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown request class = %s", stringExtra);
                    } else {
                        if (abstractC11887x3610e10c.mo50400x69604d3c() && mo2533x106ab264() != null) {
                            mo2533x106ab264().o();
                        }
                        this.f159882e.m50419xac1eee45(this);
                        this.f159882e.mo50332x63bc5f47(this.f159883f);
                        z17 = true;
                    }
                } else {
                    this.f159883f = null;
                }
            }
            if (z17) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 2) {
            if (mo2533x106ab264() != null) {
                mo2533x106ab264().o();
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_alert_title");
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) ? "" : stringExtra2;
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_alert_message");
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra3) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv) : stringExtra3;
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_alert_confirm");
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4) ? "" : stringExtra4;
            java.lang.String stringExtra5 = getIntent().getStringExtra("key_alert_deny");
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra5) ? "" : stringExtra5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.m(this, null);
            this.f159889o = mVar;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 C = db5.e1.C(this, string, str, str2, str3, false, mVar, mVar);
            this.f159888n = C;
            C.setOnDismissListener(this.f159889o);
            this.f159888n.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.k(this, str3));
            return;
        }
        if (intExtra == 3) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.j(this));
            return;
        }
        if (intExtra != 10000) {
            finish();
            return;
        }
        android.content.Intent intent = (android.content.Intent) getIntent().getParcelableExtra("key_proxy_launch_target_intent");
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getComponent() != null) {
            try {
                java.lang.Class.forName(intent.getComponent().getClassName());
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "proxyLaunch, Class.forName %s, e = %s", intent.getComponent().getClassName(), e18);
            }
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e19) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessProxyUI", "start targetActivity, %s, e = %s", intent, e19);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f159887m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", "has result not be called when destory");
            p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c c0050x5b3754c = (p001xcca8366f.p003x91727fcf.v4.os.C0050x5b3754c) getIntent().getParcelableExtra("key_result_receiver");
            if (c0050x5b3754c != null) {
                c0050x5b3754c.b(0, null);
            }
        }
        nf.g.b(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f159888n;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f159888n.dismiss();
        this.f159888n = null;
        this.f159889o = null;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v vVar = this.f159882e;
        if (vVar != null) {
            vVar.m50428x953457f1(i17, strArr, iArr);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        int intExtra = getIntent().getIntExtra("key_running_mode", 0);
        if (intExtra != 10000) {
            if (intExtra == 2 || intExtra == 3) {
                return;
            }
            boolean z17 = m78477x9d1e994e() || isFinishing() || this.f159886i;
            this.f159883f.getClass();
            if (this.f159884g && this.f159883f.mo50401x34ca7fe3() && !z17) {
                T6(null);
            }
            this.f159884g = true;
            return;
        }
        int i17 = this.f159881d + 1;
        this.f159881d = i17;
        if (i17 > 1) {
            if (this.f159884g) {
                finish();
                return;
            }
            try {
                java.lang.Class cls = (java.lang.Class) getIntent().getSerializableExtra("key_proxy_launch_appbrand_ui_class");
                if (cls == null) {
                    finish();
                } else {
                    android.content.Intent addFlags = new android.content.Intent(this, (java.lang.Class<?>) cls).putExtra("key_appbrand_bring_ui_to_front", true).addFlags(268435456);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(addFlags);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "onResume", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    this.f159884g = true;
                    this.f159885h = true;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandProcessProxyUI", e17, "bringAppBrandUIToFront get exception", new java.lang.Object[0]);
                finish();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProxyUI", "onSaveInstanceState");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f159885h) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        if (getIntent().hasExtra("key_force_portrait")) {
            super.mo50393x3c0b42ee();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c = this.f159883f;
        if (abstractC11887x3610e10c == null || !abstractC11887x3610e10c.mo50403x949e94f4()) {
            return;
        }
        super.mo50393x3c0b42ee();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.g("MicroMsg.AppBrandProcessProxyUI", new java.lang.Throwable(), "setTheme(%d)", java.lang.Integer.valueOf(i17));
        super.setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
    }
}
