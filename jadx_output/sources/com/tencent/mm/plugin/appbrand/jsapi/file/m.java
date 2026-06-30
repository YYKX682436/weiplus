package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public abstract class m extends com.tencent.mm.plugin.appbrand.jsapi.a1 {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.file.n f81092g;

    public m(com.tencent.mm.plugin.appbrand.jsapi.file.n nVar) {
        this.f81092g = nVar;
        nVar.f81099a = this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        com.tencent.mm.plugin.appbrand.jsapi.file.b0 a17 = this.f81092g.a(lVar, c0Var, jSONObject);
        return c0Var.p() ? v(lVar, (com.tencent.mm.plugin.appbrand.jsruntime.t) c0Var, a17.f81320b, a17.f81319a) : w(lVar, a17.f81320b, a17.f81319a);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public final java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        return A(lVar, jSONObject, lVar.getJsRuntime());
    }
}
