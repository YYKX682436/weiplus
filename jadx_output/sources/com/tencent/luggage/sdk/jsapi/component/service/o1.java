package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class o1 extends com.tencent.luggage.sdk.jsapi.component.service.a0 implements com.tencent.mm.plugin.appbrand.debugger.v0 {

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.a1 f47511u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.g1 f47512v;

    public o1(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        super(yVar);
        G(com.tencent.mm.plugin.appbrand.debugger.v0.class, this);
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public void B(java.lang.String str) {
        r45.n47 n47Var = new r45.n47();
        n47Var.f381078e = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).V0().getComponentId();
        n47Var.f381077d = str;
        this.f47512v.a0(n47Var, "domEvent");
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public com.tencent.mm.plugin.appbrand.jsruntime.t K() {
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = new com.tencent.mm.plugin.appbrand.debugger.g1();
        this.f47512v = g1Var;
        return g1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.v0
    public java.lang.String L() {
        org.json.JSONObject U0 = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).U0();
        return java.lang.String.format("var __wxConfig = %s;\nvar __wxIndexPage = \"%s\"", U0.toString(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().m0().f305736J);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public final boolean X() {
        return false;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean a0() {
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean c0() {
        return false;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void g0() {
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).O0();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void i0() {
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void k0() {
        super.k0();
        this.f47512v.f77756m.bringToFront();
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public void q0(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super.q0(appBrandRuntime);
        ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).n0();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = new com.tencent.mm.plugin.appbrand.debugger.a1();
        this.f47511u = a1Var;
        a1Var.b((com.tencent.luggage.sdk.jsapi.component.service.y) F(), ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().u0().F);
        this.f47511u.f77622x = ((com.tencent.luggage.sdk.jsapi.component.service.y) F()).t3().u0().H;
        this.f47512v.S(this.f47511u, false, false);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean u0(int i17, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "{}";
        }
        com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = this.f47512v.f77754h;
        n1Var.getClass();
        r45.e47 e47Var = new r45.e47();
        e47Var.f373018e = i17;
        e47Var.f373017d = str;
        n1Var.g(com.tencent.mm.plugin.appbrand.debugger.y1.e(e47Var, n1Var.f77806b, "callInterfaceResult"));
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.a0
    public boolean v0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        str2.length();
        com.tencent.mm.plugin.appbrand.debugger.g1 g1Var = this.f47512v;
        g1Var.f77751e = str;
        java.lang.String str4 = android.text.TextUtils.isEmpty(str2) ? "{}" : str2;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = "WeixinJSBridge";
        objArr[1] = "WeixinJSBridge";
        objArr[2] = str;
        objArr[3] = str4;
        if (i17 == 0) {
            str3 = "undefined";
        } else {
            str3 = i17 + "";
        }
        objArr[4] = str3;
        objArr[5] = com.tencent.mm.plugin.appbrand.jsapi.jf.b(null);
        g1Var.evaluateJavascript(java.lang.String.format("typeof %s !== 'undefined' && %s.subscribeHandler(\"%s\", %s, %s, %s)", objArr), null);
        return true;
    }

    @Override // ph1.s
    public boolean y(java.lang.String str) {
        return false;
    }
}
