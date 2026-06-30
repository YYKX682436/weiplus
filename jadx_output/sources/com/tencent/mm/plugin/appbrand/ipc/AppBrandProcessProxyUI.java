package com.tencent.mm.plugin.appbrand.ipc;

@db5.a(7)
@com.tencent.mm.ui.a2
/* loaded from: classes7.dex */
public class AppBrandProcessProxyUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.appbrand.ipc.e0, nf.m {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f78347p = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ipc.v f78349e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest f78350f;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f78355n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ipc.m f78356o;

    /* renamed from: d, reason: collision with root package name */
    public int f78348d = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f78351g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f78352h = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f78353i = false;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f78354m = false;

    public static void V6(android.content.Context context, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate, final com.tencent.mm.plugin.appbrand.ipc.n nVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = context;
        objArr[1] = java.lang.Boolean.valueOf(activityStarterIpcDelegate != null);
        objArr[2] = java.lang.Boolean.valueOf(nVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog(context:%s, activityDelegate?:%b, callback?:%b)", objArr);
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class).putExtra("key_running_mode", 3).putExtra("key_result_receiver", com.tencent.mm.plugin.appbrand.ipc.x0.a(new android.support.v4.os.ResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.4
            @Override // android.support.v4.os.ResultReceiver
            public void a(int i17, android.os.Bundle bundle) {
                com.tencent.mm.plugin.appbrand.ipc.n nVar2 = nVar;
                if (-1 == i17 && nVar2 != null) {
                    nVar2.a();
                }
                if (-2 != i17 || nVar2 == null) {
                    return;
                }
                nVar2.cancel();
            }
        }, context));
        if (activityStarterIpcDelegate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityStarterIpcDelegate, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityStarterIpcDelegate.b((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI", "showOverseaWechatServiceAuthorizeDialog", "(Landroid/content/Context;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProcessProxyUI$OverseaWechatServiceAuthorizeCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandProcessProxyUI", e17, "showOverseaWechatServiceAuthorizeDialog get BadParcelableException", new java.lang.Object[0]);
        }
    }

    public static void W6(android.content.Context context, java.lang.Class cls, com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest, final com.tencent.mm.plugin.appbrand.ipc.u uVar, android.content.Intent intent) {
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) (cls == null ? com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class : cls)).putExtra("key_model_class_name", appBrandProxyUIProcessTask$ProcessRequest.getTaskClass().getName()).putExtra("key_result_receiver", uVar == null ? null : com.tencent.mm.plugin.appbrand.ipc.x0.a(new android.support.v4.os.ResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper())) { // from class: com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.1
            @Override // android.support.v4.os.ResultReceiver
            public void a(int i17, android.os.Bundle bundle) {
                com.tencent.mm.plugin.appbrand.ipc.u uVar2 = uVar;
                if (bundle == null) {
                    uVar2.onReceiveResult(null);
                } else {
                    bundle.setClassLoader(com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class.getClassLoader());
                    uVar2.onReceiveResult((com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult) bundle.getParcelable("key_result_parcel"));
                }
            }
        }, context)).putExtra("appbrand_report_key_target_activity", appBrandProxyUIProcessTask$ProcessRequest.getUIAlias()).putExtra("key_running_mode", 1);
        boolean z17 = false;
        if (appBrandProxyUIProcessTask$ProcessRequest.needParams()) {
            putExtra.putExtra("key_request_parcel", appBrandProxyUIProcessTask$ProcessRequest);
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
        if (appBrandProxyUIProcessTask$ProcessRequest.forcePortrait()) {
            putExtra.putExtra("key_force_portrait", true);
        }
        if (intent != null) {
            putExtra.addFlags(intent.getFlags());
        }
        com.tencent.mm.plugin.appbrand.ipc.h hVar = new com.tencent.mm.plugin.appbrand.ipc.h(appBrandProxyUIProcessTask$ProcessRequest, cls, context, putExtra);
        if (appBrandProxyUIProcessTask$ProcessRequest.preferRunOnUiThreadForStartingProcessProxyUI() && com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            hVar.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(hVar);
        }
    }

    public void T6(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        this.f78353i = true;
        runOnUiThread(new com.tencent.mm.plugin.appbrand.ipc.l(this, appBrandProxyUIProcessTask$ProcessResult));
    }

    public final void U6(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        this.f78354m = true;
        android.support.v4.os.ResultReceiver resultReceiver = (android.support.v4.os.ResultReceiver) getIntent().getParcelableExtra("key_result_receiver");
        if (resultReceiver == null || appBrandProxyUIProcessTask$ProcessResult == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle(2);
        bundle.putParcelable("key_result_parcel", appBrandProxyUIProcessTask$ProcessResult);
        resultReceiver.b(0, bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        android.view.View decorView;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            try {
                android.view.Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    decorView.findViewById(android.R.id.content);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "ensureWindowContentViewReady failed", e17);
            }
        }
        try {
            super.dealContentView(view);
        } catch (java.lang.RuntimeException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "dealContentView failed, appcompat ContentFrameLayout NPE workaround", e18);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", "finish stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mm.plugin.appbrand.ipc.v vVar = this.f78349e;
        if (vVar == null || !vVar.shouldOverrideExitAnimation()) {
            overridePendingTransition(0, 0);
        }
        com.tencent.mm.plugin.appbrand.ipc.v vVar2 = this.f78349e;
        if (vVar2 != null) {
            vVar2.onProcessInterrupted();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        if (!getIntent().hasExtra("key_force_portrait")) {
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest = this.f78350f;
            return (appBrandProxyUIProcessTask$ProcessRequest == null || !appBrandProxyUIProcessTask$ProcessRequest.useLandscape()) ? 3 : 6;
        }
        if (!getIntent().getBooleanExtra("key_force_portrait", false)) {
            return 3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", "Force Orientation SCREEN_ORIENTATION_PORTRAIT");
        return 7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity
    public androidx.appcompat.app.b getSupportActionBar() {
        com.tencent.mm.sdk.platformtools.Log.g("MicroMsg.AppBrandProcessProxyUI", new java.lang.Throwable(), "getSupportActionBar", new java.lang.Object[0]);
        return super.getSupportActionBar();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public void initActivityCloseAnimation() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        nf.g.a(this).g(i17, i18, intent);
        if (this.f78350f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "onActivityResult, NULL mRequest");
            finish();
        } else {
            this.f78350f.getClass();
            this.f78351g = false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mm.plugin.appbrand.ipc.v vVar = this.f78349e;
        if (vVar == null || configuration == null) {
            return;
        }
        vVar.onConfigurationChanged(configuration);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.ipc.v vVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate savedInstanceState:");
        sb6.append(bundle == null ? "null" : java.lang.Integer.valueOf(bundle.hashCode()));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", sb6.toString());
        setTheme(com.tencent.mm.R.style.f494400m2);
        super.onCreate(bundle);
        boolean z17 = false;
        overridePendingTransition(0, 0);
        if (getIntent().hasExtra("key_force_portrait")) {
            setMMOrientation();
        }
        com.tencent.mm.ui.v9.e(getWindow());
        com.tencent.mm.ui.v9.c(getWindow(), getIntent().getBooleanExtra("key_need_light_status", false));
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("key_running_mode", 0);
        if (intExtra == 1) {
            getIntent().setExtrasClassLoader(com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class.getClassLoader());
            java.lang.String stringExtra = getIntent().getStringExtra("key_model_class_name");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", "onCreate, modelClass = %s", stringExtra);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                try {
                    java.lang.reflect.Constructor<?> declaredConstructor = java.lang.Class.forName(stringExtra).getDeclaredConstructor(new java.lang.Class[0]);
                    declaredConstructor.setAccessible(true);
                    vVar = (com.tencent.mm.plugin.appbrand.ipc.v) declaredConstructor.newInstance(new java.lang.Object[0]);
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.IpcProxyUIModelFactory", "create mode object using className(%s), exp = %s", stringExtra, com.tencent.mm.sdk.platformtools.z3.c(e17));
                    vVar = null;
                }
                this.f78349e = vVar;
                if (vVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown model class = %s", stringExtra);
                } else if (getIntent().getBooleanExtra("key_request_need_params", true)) {
                    com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest = (com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest) getIntent().getParcelableExtra("key_request_parcel");
                    this.f78350f = appBrandProxyUIProcessTask$ProcessRequest;
                    if (appBrandProxyUIProcessTask$ProcessRequest == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "onCreate unknown request class = %s", stringExtra);
                    } else {
                        if (appBrandProxyUIProcessTask$ProcessRequest.noActionBar() && getSupportActionBar() != null) {
                            getSupportActionBar().o();
                        }
                        this.f78349e.attach(this);
                        this.f78349e.handleRequest(this.f78350f);
                        z17 = true;
                    }
                } else {
                    this.f78350f = null;
                }
            }
            if (z17) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 2) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().o();
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_alert_title");
            java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) ? "" : stringExtra2;
            java.lang.String stringExtra3 = getIntent().getStringExtra("key_alert_message");
            java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra3) ? getString(com.tencent.mm.R.string.f490573yv) : stringExtra3;
            java.lang.String stringExtra4 = getIntent().getStringExtra("key_alert_confirm");
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4) ? "" : stringExtra4;
            java.lang.String stringExtra5 = getIntent().getStringExtra("key_alert_deny");
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra5) ? "" : stringExtra5;
            com.tencent.mm.plugin.appbrand.ipc.m mVar = new com.tencent.mm.plugin.appbrand.ipc.m(this, null);
            this.f78356o = mVar;
            com.tencent.mm.ui.widget.dialog.j0 C = db5.e1.C(this, string, str, str2, str3, false, mVar, mVar);
            this.f78355n = C;
            C.setOnDismissListener(this.f78356o);
            this.f78355n.setOnKeyListener(new com.tencent.mm.plugin.appbrand.ipc.k(this, str3));
            return;
        }
        if (intExtra == 3) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ipc.j(this));
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
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "proxyLaunch, Class.forName %s, e = %s", intent.getComponent().getClassName(), e18);
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
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessProxyUI", "start targetActivity, %s, e = %s", intent, e19);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f78354m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", "has result not be called when destory");
            android.support.v4.os.ResultReceiver resultReceiver = (android.support.v4.os.ResultReceiver) getIntent().getParcelableExtra("key_result_receiver");
            if (resultReceiver != null) {
                resultReceiver.b(0, null);
            }
        }
        nf.g.b(this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f78355n;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f78355n.dismiss();
        this.f78355n = null;
        this.f78356o = null;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        com.tencent.mm.plugin.appbrand.ipc.v vVar = this.f78349e;
        if (vVar != null) {
            vVar.onRequestPermissionsResult(i17, strArr, iArr);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        int intExtra = getIntent().getIntExtra("key_running_mode", 0);
        if (intExtra != 10000) {
            if (intExtra == 2 || intExtra == 3) {
                return;
            }
            boolean z17 = activityHasDestroyed() || isFinishing() || this.f78353i;
            this.f78350f.getClass();
            if (this.f78351g && this.f78350f.oneShotForeground() && !z17) {
                T6(null);
            }
            this.f78351g = true;
            return;
        }
        int i17 = this.f78348d + 1;
        this.f78348d = i17;
        if (i17 > 1) {
            if (this.f78351g) {
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
                    this.f78351g = true;
                    this.f78352h = true;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandProcessProxyUI", e17, "bringAppBrandUIToFront get exception", new java.lang.Object[0]);
                finish();
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessProxyUI", "onSaveInstanceState");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.f78352h) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        if (getIntent().hasExtra("key_force_portrait")) {
            super.setMMOrientation();
            return;
        }
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest = this.f78350f;
        if (appBrandProxyUIProcessTask$ProcessRequest == null || !appBrandProxyUIProcessTask$ProcessRequest.useLandscape()) {
            return;
        }
        super.setMMOrientation();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        com.tencent.mm.sdk.platformtools.Log.g("MicroMsg.AppBrandProcessProxyUI", new java.lang.Throwable(), "setTheme(%d)", java.lang.Integer.valueOf(i17));
        super.setTheme(com.tencent.mm.R.style.f494400m2);
    }
}
