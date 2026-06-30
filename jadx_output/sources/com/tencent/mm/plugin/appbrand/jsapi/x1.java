package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class x1 {
    public static final void a(com.tencent.mm.plugin.appbrand.y component, java.lang.Object jsRuntime, java.lang.String str) {
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportCoverage(appId:");
        sb7.append(component.getAppId());
        sb7.append(", ");
        if (jsRuntime instanceof cl.q0) {
            sb6 = "Worker";
        } else if (jsRuntime instanceof com.tencent.mm.plugin.appbrand.jsruntime.r) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Context(");
            com.tencent.mm.plugin.appbrand.jsruntime.r rVar = (com.tencent.mm.plugin.appbrand.jsruntime.r) jsRuntime;
            sb8.append(rVar.l() ? "Main" : java.lang.String.valueOf(rVar.o()));
            sb8.append(')');
            sb6 = sb8.toString();
        } else {
            if (!(jsRuntime instanceof com.tencent.mm.plugin.appbrand.page.ed)) {
                throw new java.lang.IllegalStateException("Invalid jsRuntime".toString());
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Page(");
            com.tencent.mm.plugin.appbrand.page.v5 v5Var = ((com.tencent.mm.plugin.appbrand.page.ed) jsRuntime).f86579e;
            sb9.append(v5Var != null ? v5Var.X1() : null);
            sb9.append(')');
            sb6 = sb9.toString();
        }
        sb7.append(sb6);
        sb7.append(", data:");
        sb7.append(str);
        sb7.append(')');
        com.tencent.mars.xlog.Log.i("Luggage.JSCoverageUtils", sb7.toString());
        if ((str == null || str.length() == 0) || kotlin.jvm.internal.o.b("null", str) || kotlin.jvm.internal.o.b("undefined", str)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = component.x();
        kotlin.jvm.internal.o.d(x17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = component.getRuntime().u0();
        kotlin.jvm.internal.o.e(u07, "null cannot be cast to non-null type com.tencent.luggage.sdk.config.AppBrandInitConfigLU");
        jSONObject.put("userUin", kk.v.a(((com.tencent.luggage.sdk.config.AppBrandInitConfigLU) u07).f47279x0));
        jSONObject.put("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        jSONObject.put("CoverageData", str);
        jSONObject.put("weapplibVersion", x17.W0());
        jSONObject.put("weapplibTime", x17.B7());
        java.lang.String appId = component.getAppId();
        if (appId == null) {
            appId = "";
        }
        jSONObject.put("appId", appId);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.jsapi.w1(component, jSONObject2));
    }
}
