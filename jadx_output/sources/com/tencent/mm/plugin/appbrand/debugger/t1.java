package com.tencent.mm.plugin.appbrand.debugger;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class t1 extends com.tencent.mm.plugin.appbrand.service.c0 implements com.tencent.mm.plugin.appbrand.debugger.v0 {

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.a1 f77834p0;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.g1 f77835x0;

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public void B(java.lang.String str) {
        r45.n47 n47Var = new r45.n47();
        n47Var.f381078e = t3().x0().getCurrentPage().getCurrentPageView().getComponentId();
        n47Var.f381077d = str;
        this.f77835x0.a0(n47Var, "domEvent");
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public java.lang.String L() {
        org.json.JSONObject U0 = U0();
        return java.lang.String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", U0.toString(), t3().m0().f305736J);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "{}";
        }
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f77835x0.f77754h;
        n1Var.getClass();
        r45.e47 e47Var = new r45.e47();
        e47Var.f373018e = i17;
        e47Var.f373017d = str;
        n1Var.g(com.tencent.mm.plugin.appbrand.debugger.y1.e(e47Var, n1Var.f77806b, "callInterfaceResult"));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsapi.m
    public com.tencent.mm.plugin.appbrand.jsruntime.t i0() {
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = new com.tencent.mm.plugin.appbrand.debugger.g1();
        this.f77835x0 = g1Var;
        return g1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public void i1() {
        O0();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9
    public void l1(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.l1(appBrandRuntime);
        n0();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = new com.tencent.mm.plugin.appbrand.debugger.a1();
        this.f77834p0 = a1Var;
        a1Var.b(this, t3().u0().F);
        this.f77835x0.S(this.f77834p0, false, false);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    @Override // com.tencent.mm.plugin.appbrand.service.c0, com.tencent.luggage.sdk.jsapi.component.service.y, com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.y, ph1.s
    public boolean y(java.lang.String str) {
        return false;
    }
}
