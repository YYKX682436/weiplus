package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v0 implements com.tencent.mm.plugin.appbrand.launching.a1, com.tencent.mm.plugin.appbrand.launching.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f85243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.a1 f85244b;

    public v0(kotlinx.coroutines.q qVar, com.tencent.mm.plugin.appbrand.launching.a1 a1Var) {
        this.f85243a = qVar;
        this.f85244b = a1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.a1
    public boolean a(java.lang.String[] instanceIdHolder) {
        kotlin.jvm.internal.o.g(instanceIdHolder, "instanceIdHolder");
        com.tencent.mm.plugin.appbrand.launching.a1 a1Var = this.f85244b;
        if (a1Var != null) {
            return a1Var.a(instanceIdHolder);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.p0
    /* renamed from: c */
    public void b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, int i17) {
        kotlinx.coroutines.q qVar = this.f85243a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(appBrandInitConfigWC));
        }
    }
}
