package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.jsapi.component.service.u0 f47555b = new com.tencent.luggage.sdk.jsapi.component.service.u0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f47556a;

    public v0(java.lang.String moduleName) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        this.f47556a = moduleName;
    }

    public final void a(com.tencent.mm.plugin.appbrand.e9 service) {
        java.lang.String str = this.f47556a;
        kotlin.jvm.internal.o.g(service, "service");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = service.getRuntime();
            if (runtime != null) {
                if (((com.tencent.mm.plugin.appbrand.page.u5) runtime.b(com.tencent.mm.plugin.appbrand.page.u5.class)).a()) {
                    jSONObject.put("isLazyLoad", true);
                }
                if ((runtime instanceof ze.n) && ((ze.n) runtime).x2()) {
                    jSONObject.put("exportBaseMethods", true);
                }
            }
            jSONObject.put("moduleName", str);
            f47555b.a(service, str, jSONObject);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.d(jSONObject2);
            com.tencent.mars.xlog.Log.i("Luggage.FULL.EventOnSubPackageReady", "dispatch appId(" + service.getAppId() + ") onSubPackageReady(" + jSONObject2 + ')');
            service.g("onSubPackageReady", jSONObject2);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("Luggage.FULL.EventOnSubPackageReady", "dispatch with service(" + service.getAppId() + "), create data failed");
        }
    }
}
