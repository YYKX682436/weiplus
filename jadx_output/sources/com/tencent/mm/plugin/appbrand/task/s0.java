package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f89181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.u0 f89182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f89183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.k f89184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f89185h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f89186i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.a1 f89187m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f89188n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.x f89189o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.s f89190p;

    public s0(android.app.Activity activity, com.tencent.mm.plugin.appbrand.task.u0 u0Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.task.k kVar, android.content.Intent intent, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.task.a1 a1Var, android.content.Context context, com.tencent.luggage.sdk.processes.x xVar, com.tencent.luggage.sdk.processes.s sVar) {
        this.f89181d = activity;
        this.f89182e = u0Var;
        this.f89183f = appBrandInitConfigWC;
        this.f89184g = kVar;
        this.f89185h = intent;
        this.f89186i = appBrandStatObject;
        this.f89187m = a1Var;
        this.f89188n = context;
        this.f89189o = xVar;
        this.f89190p = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.task.k kVar = this.f89184g;
        com.tencent.mm.plugin.appbrand.task.u0 u0Var = this.f89182e;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f89183f;
        android.content.Intent intent = this.f89185h;
        android.app.Activity activity = this.f89181d;
        if (activity != null) {
            com.tencent.mm.plugin.appbrand.task.u0.D(u0Var, appBrandInitConfigWC, kVar, intent);
            activity.startActivityForResult(intent, -1, null);
            appBrandInitConfigWC.f47269b2 = this.f89186i;
            com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE.k(activity, appBrandInitConfigWC);
            str = "Activity(" + activity + ')';
        } else {
            com.tencent.mm.plugin.appbrand.task.a1 a1Var = this.f89187m;
            if (a1Var.f88993f != null) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_open_by_h5_intent_forward, 1) == 1) {
                    com.tencent.mm.plugin.appbrand.task.u0.D(u0Var, appBrandInitConfigWC, kVar, intent);
                    com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate = a1Var.f88993f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityStarterIpcDelegate, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$onStartWxaApp$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityStarterIpcDelegate.b((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$onStartWxaApp$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    str = "ActivityStarterIpcDelegate";
                } else {
                    com.tencent.mm.plugin.appbrand.task.u0.D(u0Var, appBrandInitConfigWC, kVar, intent);
                    com.tencent.mm.plugin.appbrand.task.u0.E(this.f89182e, this.f89188n, this.f89185h, this.f89187m, this.f89189o, this.f89190p);
                }
            } else {
                com.tencent.mm.plugin.appbrand.task.u0.D(u0Var, appBrandInitConfigWC, kVar, intent);
                com.tencent.mm.plugin.appbrand.task.u0.E(this.f89182e, this.f89188n, this.f89185h, this.f89187m, this.f89189o, this.f89190p);
            }
            str = "super";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- method:" + str + ", strategy:" + this.f89189o + ", app:" + this.f89190p);
    }
}
