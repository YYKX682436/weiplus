package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class u2 implements com.tencent.mm.plugin.appbrand.report.s2 {

    /* renamed from: a, reason: collision with root package name */
    public long f88414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.w2 f88415b;

    public u2(com.tencent.mm.plugin.appbrand.report.w2 w2Var, com.tencent.mm.plugin.appbrand.report.r2 r2Var) {
        this.f88415b = w2Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.s2
    public void d() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f88415b.f88424e = java.lang.System.currentTimeMillis() - this.f88414a;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.s2
    public long getStartTime() {
        return this.f88414a;
    }
}
