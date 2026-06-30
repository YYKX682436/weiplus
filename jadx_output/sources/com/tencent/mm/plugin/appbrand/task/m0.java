package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f89091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f89092e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xg1.c f89093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.x f89094g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.s f89095h;

    public m0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, xg1.c cVar, com.tencent.luggage.sdk.processes.x xVar, com.tencent.luggage.sdk.processes.s sVar) {
        this.f89091d = appBrandInitConfigWC;
        this.f89092e = appBrandStatObject;
        this.f89093f = cVar;
        this.f89094g = xVar;
        this.f89095h = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String str;
        this.f89091d.f47269b2 = this.f89092e;
        xg1.c cVar = this.f89093f;
        cVar.getClass();
        xg1.h hVar = xg1.h.f454370a;
        xg1.j jVar = new xg1.j(cVar.f454358a, cVar.f454359b, cVar.f454360c, cVar.f454362e);
        synchronized (hVar) {
            android.util.SparseArray sparseArray = xg1.h.f454371b;
            int i18 = xg1.h.f454372c + 1;
            xg1.h.f454372c = i18;
            sparseArray.append(i18, jVar);
            com.tencent.mm.sdk.platformtools.u3.i(new xg1.i(xg1.h.f454372c, "MicroMsg.AppBrand.PendingIntentPoster"), 12000L);
            i17 = xg1.h.f454372c;
        }
        cVar.f454363f = i17;
        java.lang.Class cls = cVar.f454361d.f89080k;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "onNeedPreLoadingUI: triggerService = " + cls.getCanonicalName());
        java.lang.String canonicalName = cls.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName);
        android.content.ComponentName component = cVar.f454359b.getComponent();
        if (component == null || (str = component.getClassName()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = cVar.f454360c;
        java.lang.Class<com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingForPluginUI> cls2 = appBrandInitConfigWC.Y ? com.tencent.mm.plugin.appbrand.ui.AppBrandPreLoadingForPluginUI.class : cVar.f454361d.f89081l;
        android.content.Context context = cVar.f454358a;
        android.content.Intent intent = new android.content.Intent(context, cls2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startPreLoadingActivity, ctx = " + context);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.name", appBrandInitConfigWC.f77279e);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.icon", appBrandInitConfigWC.f77280f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.serviceName", canonicalName);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.intentKey", cVar.f454363f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.targetActivityName", str);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.splashFlavor", 5);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.appId", appBrandInitConfigWC.f77278d);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.scene", cVar.f454362e.f87790f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.versionInfo", appBrandInitConfigWC.N);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.appServiceType", appBrandInitConfigWC.f47284z);
        intent.addFlags(268435456);
        android.content.Context context2 = cVar.f454358a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/loading/AppBrandPreLoadingLogic", "startPreLoadingActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/loading/AppBrandPreLoadingLogic", "startPreLoadingActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof android.app.Activity) {
            ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).k((android.app.Activity) context, appBrandInitConfigWC);
        }
        pm0.v.M("MicroMsg.AppBrand.AppBrandPreLoadingLogic:startService:".concat(canonicalName), false, new xg1.b(cVar, canonicalName), 2, null);
        cVar.f454360c.f77295h2 = cls.getCanonicalName();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- strategy:" + this.f89094g + ", app:" + this.f89095h);
    }
}
