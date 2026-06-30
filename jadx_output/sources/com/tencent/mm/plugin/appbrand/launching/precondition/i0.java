package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f84997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.k0 f84998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f84999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.launching.precondition.k0 k0Var, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        super(1);
        this.f84997d = appBrandInitConfigWC;
        this.f84998e = k0Var;
        this.f84999f = appBrandStatObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.task.k process = (com.tencent.mm.plugin.appbrand.task.k) obj;
        kotlin.jvm.internal.o.g(process, "process");
        boolean l17 = process.l();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = this.f84997d;
        appBrandInitConfigWC.f77296i2 = l17;
        appBrandInitConfigWC.X = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().k().indexOf(process);
        yz5.q qVar = this.f84998e.f85008c;
        if (qVar != null) {
            qVar.invoke(appBrandInitConfigWC, this.f84999f, process);
        }
        return jz5.f0.f302826a;
    }
}
