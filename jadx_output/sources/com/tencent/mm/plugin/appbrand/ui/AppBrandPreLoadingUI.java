package com.tencent.mm.plugin.appbrand.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataFragmentActivity;", "", "<init>", "()V", "AppBrandUIEnterAnimationCompleteEventListener", "AppBrandUIFinishEventListener", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class AppBrandPreLoadingUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataFragmentActivity {
    public static final /* synthetic */ f06.v[] A = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.class, "isForeground", "isForeground()Z", 0))};

    /* renamed from: i, reason: collision with root package name */
    public xg1.j f89382i;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Intent f89385o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f89386p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f89388r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIEnterAnimationCompleteEventListener f89389s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIFinishEventListener f89390t;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f89393w;

    /* renamed from: x, reason: collision with root package name */
    public xg1.e f89394x;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f89396z;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f89381h = "";

    /* renamed from: m, reason: collision with root package name */
    public final b06.d f89383m = new com.tencent.mm.plugin.appbrand.ui.l6(java.lang.Boolean.TRUE, this);

    /* renamed from: n, reason: collision with root package name */
    public int f89384n = -1;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f89387q = "";

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.l0 f89391u = new com.tencent.mm.plugin.appbrand.report.model.l0();

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f89392v = "";

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f89395y = jz5.h.b(new com.tencent.mm.plugin.appbrand.ui.n6(this));

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$AppBrandUIEnterAnimationCompleteEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/service/AppBrandUIEnterAnimationCompleteEvent;", "<init>", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public final class AppBrandUIEnterAnimationCompleteEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent> {
        public AppBrandUIEnterAnimationCompleteEventListener() {
            super(com.tencent.mm.app.a0.f53288d);
            this.__eventId = 551436157;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent) {
            com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent event = appBrandUIEnterAnimationCompleteEvent;
            kotlin.jvm.internal.o.g(event, "event");
            com.tencent.mm.plugin.appbrand.service.j0 j0Var = event.f88602g;
            java.lang.String str = j0Var.f88692a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandUIEnterAnimationCompleteEvent.callback: eventHash=");
            sb6.append(event.hashCode());
            sb6.append(", targetUiName = ");
            com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI = com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.this;
            sb6.append(appBrandPreLoadingUI.f89392v);
            sb6.append(", received = ");
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", sb6.toString());
            if (!kotlin.jvm.internal.o.b(appBrandPreLoadingUI.f89392v, j0Var.f88692a)) {
                return false;
            }
            appBrandPreLoadingUI.finish();
            return false;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI$AppBrandUIFinishEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/service/AppBrandUIFinishEvent;", "<init>", "(Lcom/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes7.dex */
    public final class AppBrandUIFinishEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIFinishEvent> {
        public AppBrandUIFinishEventListener() {
            super(com.tencent.mm.app.a0.f53288d);
            this.__eventId = 1492455567;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIFinishEvent appBrandUIFinishEvent) {
            com.tencent.mm.plugin.appbrand.service.AppBrandUIFinishEvent event = appBrandUIFinishEvent;
            kotlin.jvm.internal.o.g(event, "event");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AppBrandUIFinishEvent.callback: eventHash=");
            sb6.append(event.hashCode());
            sb6.append(", targetUiName=");
            com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI appBrandPreLoadingUI = com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.this;
            sb6.append(appBrandPreLoadingUI.f89392v);
            sb6.append(", received=");
            com.tencent.mm.plugin.appbrand.service.k0 k0Var = event.f88603g;
            sb6.append(k0Var != null ? k0Var.f88706a : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", sb6.toString());
            if (!u46.l.c(appBrandPreLoadingUI.f89392v, k0Var != null ? k0Var.f88706a : null)) {
                return false;
            }
            appBrandPreLoadingUI.finish();
            return false;
        }
    }

    public AppBrandPreLoadingUI() {
        jz5.h.b(new com.tencent.mm.plugin.appbrand.ui.k6(this));
        this.f89396z = jz5.h.a(jz5.i.f302830e, new com.tencent.mm.plugin.appbrand.ui.m6(this));
    }

    public final void c7(android.content.Intent intent, java.lang.String str) {
        android.util.SparseArray sparseArray;
        xg1.j jVar;
        java.lang.String stringExtra = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.icon");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.name");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.String stringExtra3 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.appId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f89381h = stringExtra3;
        this.f89393w = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo) intent.getParcelableExtra("MicroMsg.AppBrandPreLoadingLogic.versionInfo");
        java.lang.String stringExtra4 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.targetActivityName");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f89392v = stringExtra4;
        int intExtra = intent.getIntExtra("MicroMsg.AppBrandPreLoadingLogic.intentKey", -1);
        this.f89384n = intExtra;
        xg1.h hVar = xg1.h.f454370a;
        synchronized (hVar) {
            sparseArray = xg1.h.f454371b;
            xg1.j jVar2 = (xg1.j) sparseArray.get(intExtra);
            if (jVar2 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PendingIntentPoster", "updateCtx: get a null task by intentKey = " + intExtra);
            } else {
                jVar2.f454375a = this;
            }
        }
        int i17 = this.f89384n;
        synchronized (hVar) {
            jVar = (xg1.j) sparseArray.get(i17);
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = jVar != null ? jVar.f454377c : null;
        if (appBrandInitConfigWC != null) {
            ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).k(this, appBrandInitConfigWC);
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = appBrandInitConfigWC.f47269b2;
            if (appBrandStatObject != null && 1225 == appBrandStatObject.f87790f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "add, activity: " + this);
                android.view.Window window = getWindow();
                if (window != null) {
                    window.addFlags(6815744);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WmpfVoipWindowFlags", "clear, activity: " + this);
                android.view.Window window2 = getWindow();
                if (window2 != null) {
                    window2.clearFlags(6815744);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIEnterAnimationCompleteEventListener appBrandUIEnterAnimationCompleteEventListener = this.f89389s;
        if (appBrandUIEnterAnimationCompleteEventListener != null) {
            appBrandUIEnterAnimationCompleteEventListener.dead();
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIEnterAnimationCompleteEventListener appBrandUIEnterAnimationCompleteEventListener2 = new com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIEnterAnimationCompleteEventListener();
        appBrandUIEnterAnimationCompleteEventListener2.alive();
        this.f89389s = appBrandUIEnterAnimationCompleteEventListener2;
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIFinishEventListener appBrandUIFinishEventListener = this.f89390t;
        if (appBrandUIFinishEventListener != null) {
            appBrandUIFinishEventListener.dead();
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIFinishEventListener appBrandUIFinishEventListener2 = new com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIFinishEventListener();
        appBrandUIFinishEventListener2.alive();
        this.f89390t = appBrandUIFinishEventListener2;
        java.lang.String stringExtra5 = intent.getStringExtra("MicroMsg.AppBrandPreLoadingLogic.serviceName");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.f89387q = stringExtra5;
        d7().j(stringExtra, stringExtra2);
        d7().setAppServiceType(com.tencent.mm.sdk.platformtools.c2.g(intent, "MicroMsg.AppBrandPreLoadingLogic.appServiceType", 0));
        com.tencent.mm.plugin.appbrand.ui.vc d76 = d7();
        com.tencent.mm.plugin.appbrand.ui.c9 c9Var = d76 instanceof com.tencent.mm.plugin.appbrand.ui.c9 ? (com.tencent.mm.plugin.appbrand.ui.c9) d76 : null;
        if (c9Var != null) {
            k91.b1 b1Var = appBrandInitConfigWC != null ? appBrandInitConfigWC.E2 : null;
            if (b1Var == null) {
                b1Var = k91.b1.f305540d;
            }
            c9Var.setTheme(b1Var);
        }
        if (d7() instanceof com.tencent.mm.plugin.appbrand.ui.xc) {
            com.tencent.mm.plugin.appbrand.ui.vc d77 = d7();
            kotlin.jvm.internal.o.e(d77, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.ui.IAppBrandLoadingSplashCloseable");
            ((com.tencent.mm.plugin.appbrand.ui.xc) d77).l(new com.tencent.mm.plugin.appbrand.ui.i6(this));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + str + "]: uiFlavor = " + e7() + ", iconUrl = " + stringExtra + ", name = " + stringExtra2);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(this, this.f89387q);
        xg1.e eVar = new xg1.e(this.f89384n, "MicroMsg.AppBrand.AppBrandPreLoadingUI", new com.tencent.mm.plugin.appbrand.ui.j6(this, str));
        this.f89394x = eVar;
        try {
            this.f89388r = bindService(intent2, eVar, 65);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + str + "]: bind " + this.f89387q + " ret = " + this.f89388r);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppBrandPreLoadingUI", "attach[" + str + "]: bindService fail", e17);
        }
        com.tencent.mm.plugin.appbrand.report.model.l0 l0Var = new com.tencent.mm.plugin.appbrand.report.model.l0();
        this.f89391u = l0Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        l0Var.f88047a = android.os.SystemClock.elapsedRealtime();
    }

    public final com.tencent.mm.plugin.appbrand.ui.vc d7() {
        return (com.tencent.mm.plugin.appbrand.ui.vc) this.f89396z.getValue();
    }

    public final int e7() {
        return ((java.lang.Number) ((jz5.n) this.f89395y).getValue()).intValue();
    }

    public final void f7() {
        this.f89382i = xg1.h.f454370a.b(this.f89384n);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "tryToInterruptPost: interrupt #" + this.f89384n + " successful");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        super.finish();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "finish: isCloseByUser:" + this.f89386p + ", appId:" + this.f89381h);
        if (!this.f89386p) {
            android.view.View findViewById = findViewById(android.R.id.content);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "finish", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            super.overridePendingTransition(0, 0);
            return;
        }
        xg1.j jVar = this.f89382i;
        if (jVar != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = jVar.f454377c;
            com.tencent.mm.plugin.appbrand.report.model.l0 l0Var = this.f89391u;
            kotlin.jvm.internal.o.d(jVar);
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = jVar.f454378d;
            l0Var.getClass();
            l0Var.f88054h = appBrandInitConfigWC.f47276v;
            l0Var.f88049c = com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            l0Var.f88050d = appBrandInitConfigWC.f77278d;
            l0Var.f88051e = appBrandInitConfigWC.L;
            l0Var.f88052f = appBrandInitConfigWC.f77281g;
            l0Var.f88053g = appBrandStatObject.f87790f;
            l0Var.f88055i = l0Var.f88048b ? 1 : 0;
            long j17 = l0Var.f88047a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            l0Var.f88056j = android.os.SystemClock.elapsedRealtime() - j17;
            l0Var.f88057k = java.lang.System.currentTimeMillis();
            l0Var.f88058l = appBrandInitConfigWC.f47278x;
            l0Var.f88059m = appBrandInitConfigWC.f77298k2.f88137g;
            l0Var.f88060n = appBrandInitConfigWC.f77298k2.f88134d;
            this.f89391u.a();
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = appBrandInitConfigWC.f77298k2;
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct weAppQualityCloseBeforeReadyStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCloseBeforeReadyStruct();
            weAppQualityCloseBeforeReadyStruct.f62443d = weAppQualityCloseBeforeReadyStruct.b("InstanceId", qualitySession.f88134d, true);
            weAppQualityCloseBeforeReadyStruct.f62444e = weAppQualityCloseBeforeReadyStruct.b("AppId", qualitySession.f88135e, true);
            weAppQualityCloseBeforeReadyStruct.f62445f = qualitySession.f88139i;
            int i17 = qualitySession.f88136f;
            weAppQualityCloseBeforeReadyStruct.f62446g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.u.demo : cm.u.debug : cm.u.release;
            weAppQualityCloseBeforeReadyStruct.f62447h = qualitySession.f88137g;
            weAppQualityCloseBeforeReadyStruct.f62449j = qualitySession.f88138h;
            weAppQualityCloseBeforeReadyStruct.f62452m = weAppQualityCloseBeforeReadyStruct.b(dm.i4.COL_USERNAME, appBrandInitConfigWC.f47278x, true);
            weAppQualityCloseBeforeReadyStruct.f62453n = 2L;
            weAppQualityCloseBeforeReadyStruct.f62454o = 0L;
            weAppQualityCloseBeforeReadyStruct.f62455p = weAppQualityCloseBeforeReadyStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
            weAppQualityCloseBeforeReadyStruct.f62456q = appBrandInitConfigWC.S1 ? 1L : 0L;
            weAppQualityCloseBeforeReadyStruct.f62457r = 2L;
            weAppQualityCloseBeforeReadyStruct.f62450k = appBrandInitConfigWC.I;
            long i18 = weAppQualityCloseBeforeReadyStruct.i();
            weAppQualityCloseBeforeReadyStruct.f62451l = i18;
            weAppQualityCloseBeforeReadyStruct.f62448i = i18 - weAppQualityCloseBeforeReadyStruct.f62450k;
            weAppQualityCloseBeforeReadyStruct.f62458s = 0L;
            weAppQualityCloseBeforeReadyStruct.k();
            this.f89382i = null;
        }
        if (e7() == 5) {
            ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).j(this, null);
        } else if (e7() == 4) {
            super.overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF65848t() {
        return false;
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f89386p = true;
        f7();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout;
        android.content.Intent intent;
        setTheme(com.tencent.mm.plugin.appbrand.ui.ja.a(isTaskRoot()));
        super.onCreate(bundle);
        com.tencent.mm.plugin.appbrand.app.g2 g2Var = com.tencent.mm.plugin.appbrand.app.g2.f75089d;
        int taskId = getTaskId();
        g2Var.getClass();
        x.d dVar = com.tencent.mm.plugin.appbrand.app.g2.f75100r;
        synchronized (dVar) {
            dVar.add(java.lang.Integer.valueOf(taskId));
        }
        if (bundle != null && (intent = (android.content.Intent) bundle.getParcelable("MicroMsg.AppBrandPreLoadingUI.intent")) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "onCreate: saved intent != null");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandPreLoadingUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (com.tencent.mm.ui.b4.c(this)) {
            com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout edgeToEdgeWrapperLayout = new com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout(this, null, 0, 6, null);
            edgeToEdgeWrapperLayout.setId(com.tencent.mm.R.id.twm);
            edgeToEdgeWrapperLayout.setDisableNavigationBarContrastEnforced(true);
            edgeToEdgeWrapperLayout.setNavigationBarStrategy(al5.q.f5989e);
            edgeToEdgeWrapperLayout.setStatusBarStrategy(al5.r.f6004d);
            frameLayout = edgeToEdgeWrapperLayout;
        } else {
            frameLayout = new android.widget.FrameLayout(this);
        }
        setContentView(frameLayout);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
            if (a17 != null && a17.getBoolean("enable_pre_loading_rainbow", false)) {
                d7().k(android.graphics.Color.rgb(java.lang.Integer.valueOf(c06.f.a(java.lang.System.currentTimeMillis()).e(0, 255)).intValue(), java.lang.Integer.valueOf(c06.f.a(java.lang.System.currentTimeMillis()).e(0, 255)).intValue(), java.lang.Integer.valueOf(c06.f.a(java.lang.System.currentTimeMillis()).e(0, 255)).intValue()));
            }
        }
        android.content.Intent intent2 = getIntent();
        kotlin.jvm.internal.o.f(intent2, "getIntent(...)");
        c7(intent2, "onCreate");
        frameLayout.addView(d7().getView(), layoutParams);
        com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity.d7(this, b3.l.getColor(this, com.tencent.mm.R.color.f478490b));
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.app.g2 g2Var = com.tencent.mm.plugin.appbrand.app.g2.f75089d;
        int taskId = getTaskId();
        g2Var.getClass();
        x.d dVar = com.tencent.mm.plugin.appbrand.app.g2.f75100r;
        synchronized (dVar) {
            dVar.remove(java.lang.Integer.valueOf(taskId));
        }
        super.onDestroy();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, this.f89387q);
        if (this.f89388r) {
            try {
                xg1.e eVar = this.f89394x;
                if (eVar != null) {
                    kotlin.jvm.internal.o.d(eVar);
                    unbindService(eVar);
                }
                stopService(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "onDestroy: ", e17);
            }
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIEnterAnimationCompleteEventListener appBrandUIEnterAnimationCompleteEventListener = this.f89389s;
        if (appBrandUIEnterAnimationCompleteEventListener != null) {
            appBrandUIEnterAnimationCompleteEventListener.dead();
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingUI.AppBrandUIFinishEventListener appBrandUIFinishEventListener = this.f89390t;
        if (appBrandUIFinishEventListener != null) {
            appBrandUIFinishEventListener.dead();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        db5.f.c(this, null);
        com.tencent.mm.plugin.appbrand.ui.vc d76 = d7();
        com.tencent.mm.plugin.appbrand.ui.f6 f6Var = d76 instanceof com.tencent.mm.plugin.appbrand.ui.f6 ? (com.tencent.mm.plugin.appbrand.ui.f6) d76 : null;
        if (f6Var != null) {
            f6Var.setLoadingIconVisibility(true);
        }
    }

    @Override // com.tencent.mm.ui.vas.launcher.VASLauncher, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        this.f89385o = null;
        this.f89386p = false;
        c7(intent, "onNewIntent");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (!this.f89386p) {
            overridePendingTransition(0, 0);
        }
        ((b06.b) this.f89383m).a(this, A[0], java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.o.g(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingUI", "onRestoreInstanceState: pendingIntent = " + this.f89385o);
        android.content.Intent intent = this.f89385o;
        if (intent != null) {
            savedInstanceState.putParcelable("MicroMsg.AppBrandPreLoadingUI.intent", intent);
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((b06.b) this.f89383m).a(this, A[0], java.lang.Boolean.TRUE);
    }
}
