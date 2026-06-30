package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.k0 f85002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.appbrand.launching.precondition.k0 k0Var) {
        super(2);
        this.f85002d = k0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) obj;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) obj2;
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(stat, "stat");
        com.tencent.mm.plugin.appbrand.task.a1 a1Var = new com.tencent.mm.plugin.appbrand.task.a1(config, stat, null);
        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().H(a1Var.f47696a, a1Var, new com.tencent.mm.plugin.appbrand.launching.precondition.i0(config, this.f85002d, stat));
        return jz5.f0.f302826a;
    }
}
