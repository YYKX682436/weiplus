package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class d1 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "loadLibFiles";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public java.lang.String A(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17;
        org.json.JSONArray optJSONArray;
        if (c0Var == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str2, jSONObject2);
            kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        if (yVar == null || (x17 = yVar.x()) == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str2, jSONObject3);
            kotlin.jvm.internal.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("paths")) == null) {
            java.lang.String o17 = o("fail:invalid data");
            kotlin.jvm.internal.o.f(o17, "makeReturnJson(...)");
            return o17;
        }
        cf.f.b(optJSONArray, new com.tencent.mm.plugin.appbrand.jsapi.file.c1(x17, c0Var));
        java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str5 != null ? str5 : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        java.lang.String u19 = u(str2, jSONObject4);
        kotlin.jvm.internal.o.f(u19, "makeReturnJson(...)");
        return u19;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.k0
    public boolean m() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        return A(yVar, jSONObject, yVar != null ? yVar.getF147808e() : null);
    }
}
