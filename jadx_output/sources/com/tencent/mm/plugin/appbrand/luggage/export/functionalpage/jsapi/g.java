package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b {
    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b
    public java.lang.String b() {
        return "sdk_openAppProfile";
    }

    @Override // com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b
    public void c(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage invokeArgs, l81.b1 appOpenBundle) {
        kotlin.jvm.internal.o.g(invokeArgs, "invokeArgs");
        kotlin.jvm.internal.o.g(appOpenBundle, "appOpenBundle");
        try {
            java.lang.String optString = new org.json.JSONObject(invokeArgs.f85560f).optString(dm.i4.COL_USERNAME, null);
            if (optString == null) {
                com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b.a(this, invokeArgs, null, null, 6, null);
            } else {
                com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.d.a(null, new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.f(optString, appOpenBundle, this, invokeArgs));
            }
        } catch (org.json.JSONException unused) {
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.b.a(this, invokeArgs, null, null, 6, null);
        }
    }
}
