package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b {
    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b
    public java.lang.String b() {
        return "sdk_openFeedback";
    }

    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b
    public void c(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage invokeArgs, l81.b1 appOpenBundle) {
        kotlin.jvm.internal.o.g(invokeArgs, "invokeArgs");
        kotlin.jvm.internal.o.g(appOpenBundle, "appOpenBundle");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(invokeArgs.f85560f);
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
            java.lang.String optString = jSONObject.optString("appId", null);
            if (optString == null) {
                com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b.a(this, invokeArgs, null, null, 6, null);
                return;
            }
            java.lang.String optString2 = jSONObject.optString("pageId");
            int optInt = jSONObject.optInt("appVersion", 0);
            int optInt2 = jSONObject.optInt("versionType", 0);
            k91.z5 z5Var = new k91.z5();
            z5Var.f305863a = optString;
            z5Var.f305873k = optString2;
            z5Var.f305869g = optInt;
            z5Var.f305870h = optInt2;
            z5Var.f305872j = 16;
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.d.a(null, new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.i(this, invokeArgs, z5Var.a()));
        } catch (org.json.JSONException unused) {
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b.a(this, invokeArgs, null, null, 6, null);
        }
    }
}
