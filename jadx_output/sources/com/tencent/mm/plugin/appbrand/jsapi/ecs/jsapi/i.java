package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class i implements c00.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f80803a;

    public i(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var) {
        this.f80803a = k0Var;
    }

    public java.lang.String a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f80803a;
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        java.lang.String u17 = k0Var.u(str, jSONObject);
        kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
        return u17;
    }

    public java.lang.String b(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f80803a;
        k0Var.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        java.lang.String u17 = k0Var.u(str, jSONObject);
        kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
        return u17;
    }
}
