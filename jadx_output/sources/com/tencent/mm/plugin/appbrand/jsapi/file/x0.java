package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class x0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "loadJsFiles";

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.file.u0 f81140g = new com.tencent.mm.plugin.appbrand.jsapi.file.u0(null);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (v5Var == null || jSONObject == null) {
            return;
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("paths");
        java.lang.String optString = jSONObject.optString("key");
        com.tencent.mm.plugin.appbrand.jsapi.file.u0 u0Var = f81140g;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = v5Var.t3();
        kotlin.jvm.internal.o.f(t37, "getRuntime(...)");
        u0Var.a(t37, optJSONArray, v5Var.getF147808e(), v5Var.M0(), optString, new com.tencent.mm.plugin.appbrand.jsapi.file.w0(v5Var, optJSONArray, i17, this));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
