package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.plugin.appbrand.page.d5 {

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.s f85650x1;

    public k(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t tVar) {
        super(tVar.f74795d, tVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d5, com.tencent.mm.plugin.appbrand.page.r4
    public com.tencent.mm.plugin.appbrand.page.v5 a(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str) {
        return new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d5, com.tencent.mm.plugin.appbrand.page.i3
    public boolean e0(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d5, com.tencent.mm.plugin.appbrand.page.i3
    public boolean g0(com.tencent.mm.plugin.appbrand.page.w2 w2Var) {
        return false;
    }

    @Override // we.a
    public com.tencent.mm.plugin.appbrand.report.model.s getReporter() {
        com.tencent.mm.plugin.appbrand.report.model.s sVar = this.f85650x1;
        if (sVar != null) {
            return sVar;
        }
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j jVar = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j(this);
        this.f85650x1 = jVar;
        return jVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d5
    /* renamed from: r0 */
    public com.tencent.mm.plugin.appbrand.page.n7 a(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str) {
        return new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.d5, com.tencent.mm.plugin.appbrand.page.i3
    public final void u(java.lang.String str) {
        super.u(str);
    }
}
