package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class w0 implements com.tencent.mm.plugin.appbrand.jsapi.file.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f81136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f81137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.x0 f81139g;

    public w0(com.tencent.mm.plugin.appbrand.page.v5 v5Var, org.json.JSONArray jSONArray, int i17, com.tencent.mm.plugin.appbrand.jsapi.file.x0 x0Var) {
        this.f81136d = v5Var;
        this.f81137e = jSONArray;
        this.f81138f = i17;
        this.f81139g = x0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.file.v0
    public void l(java.lang.String str, com.tencent.luggage.sdk.jsapi.component.n[] scripts, boolean[] results, java.lang.Object[] extras, long j17, long j18) {
        kotlin.jvm.internal.o.g(scripts, "scripts");
        kotlin.jvm.internal.o.g(results, "results");
        kotlin.jvm.internal.o.g(extras, "extras");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke with appId:");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f81136d;
        sb6.append(v5Var.getAppId());
        sb6.append(" paths:");
        sb6.append(this.f81137e);
        sb6.append(" key:");
        sb6.append(str);
        sb6.append(", results:");
        java.lang.String arrays = java.util.Arrays.toString(results);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        com.tencent.mars.xlog.Log.i("Luggage.WXA.JsApiLoadJsFiles", sb6.toString());
        com.tencent.mm.plugin.appbrand.jsapi.file.x0 x0Var = this.f81139g;
        x0Var.getClass();
        java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        v5Var.a(this.f81138f, x0Var.u(str3, jSONObject));
        com.tencent.mm.plugin.appbrand.jsapi.file.v0 v0Var = (com.tencent.mm.plugin.appbrand.jsapi.file.v0) v5Var.B1(com.tencent.mm.plugin.appbrand.jsapi.file.v0.class);
        if (v0Var != null) {
            v0Var.l(str, scripts, results, extras, j17, j18);
        }
    }
}
