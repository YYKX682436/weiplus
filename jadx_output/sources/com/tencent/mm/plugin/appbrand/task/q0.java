package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.x f89152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.s f89153f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.u0 f89154g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f89155h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.k f89156i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f89157m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f89158n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f89159o;

    public q0(java.lang.String str, com.tencent.luggage.sdk.processes.x xVar, com.tencent.luggage.sdk.processes.s sVar, com.tencent.mm.plugin.appbrand.task.u0 u0Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.task.k kVar, android.content.Intent intent, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        this.f89151d = str;
        this.f89152e = xVar;
        this.f89153f = sVar;
        this.f89154g = u0Var;
        this.f89155h = appBrandInitConfigWC;
        this.f89156i = kVar;
        this.f89157m = intent;
        this.f89158n = appCompatActivity;
        this.f89159o = appBrandStatObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartWxaApp try with LauncherUI.startActivity ");
        java.lang.String str = this.f89151d;
        sb6.append(str);
        sb6.append(" strategy:");
        com.tencent.luggage.sdk.processes.x xVar = this.f89152e;
        sb6.append(xVar);
        sb6.append(", app:");
        com.tencent.luggage.sdk.processes.s sVar = this.f89153f;
        sb6.append(sVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", sb6.toString());
        com.tencent.mm.plugin.appbrand.task.u0 u0Var = this.f89154g;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f89155h;
        com.tencent.mm.plugin.appbrand.task.k kVar = this.f89156i;
        android.content.Intent intent = this.f89157m;
        com.tencent.mm.plugin.appbrand.task.u0.D(u0Var, appBrandInitConfigWC, kVar, intent);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f89158n;
        appCompatActivity.startActivityForResult(intent, -1, null);
        appBrandInitConfigWC.f47269b2 = this.f89159o;
        com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE.k(appCompatActivity, appBrandInitConfigWC);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- try with LauncherUI.startActivity " + str + " strategy:" + xVar + ", app:" + sVar);
    }
}
