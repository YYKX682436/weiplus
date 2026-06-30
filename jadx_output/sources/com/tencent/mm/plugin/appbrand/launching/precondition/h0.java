package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.k0 f84992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f84993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.launching.precondition.k0 k0Var, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        super(1);
        this.f84991d = appBrandInitConfigWC;
        this.f84992e = k0Var;
        this.f84993f = launchParcel;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.task.k process = (com.tencent.mm.plugin.appbrand.task.k) obj;
        kotlin.jvm.internal.o.g(process, "process");
        boolean l17 = process.l();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f84991d;
        appBrandInitConfigWC.f77296i2 = l17;
        appBrandInitConfigWC.X = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().k().indexOf(process);
        yz5.q qVar = this.f84992e.f85008c;
        if (qVar != null) {
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject statObj = this.f84993f.f84910o;
            kotlin.jvm.internal.o.f(statObj, "statObj");
            qVar.invoke(appBrandInitConfigWC, statObj, process);
        }
        return jz5.f0.f302826a;
    }
}
