package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.u0 f89097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f89098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.k f89099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f89100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f89101h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f89102i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.x f89103m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.processes.s f89104n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.appbrand.task.u0 u0Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.task.k kVar, android.content.Intent intent, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, android.app.Activity activity, com.tencent.luggage.sdk.processes.x xVar, com.tencent.luggage.sdk.processes.s sVar) {
        super(1);
        this.f89097d = u0Var;
        this.f89098e = appBrandInitConfigWC;
        this.f89099f = kVar;
        this.f89100g = intent;
        this.f89101h = appBrandStatObject;
        this.f89102i = activity;
        this.f89103m = xVar;
        this.f89104n = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity it = (android.app.Activity) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.appbrand.task.u0 u0Var = this.f89097d;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f89098e;
        com.tencent.mm.plugin.appbrand.task.k kVar = this.f89099f;
        android.content.Intent intent = this.f89100g;
        com.tencent.mm.plugin.appbrand.task.u0.D(u0Var, appBrandInitConfigWC, kVar, intent);
        it.startActivityForResult(intent, -1, null);
        appBrandInitConfigWC.f47269b2 = this.f89101h;
        com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE.k(this.f89102i, appBrandInitConfigWC);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- by LaunchInBackgroundGuard strategy:" + this.f89103m + ", app:" + this.f89104n);
        return jz5.f0.f302826a;
    }
}
