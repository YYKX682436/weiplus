package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public abstract class l0 {
    public static void a(android.content.Context context, com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate, final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PreconditionUtil", "startAppOnInitConfigGot, %s", appBrandInitConfigWC);
        com.tencent.mm.plugin.appbrand.launching.g0.a(appBrandInitConfigWC, stat);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        appBrandInitConfigWC.f77293f2 = java.lang.System.currentTimeMillis();
        kotlin.jvm.internal.o.g(stat, "stat");
        if (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h.a(appBrandInitConfigWC, stat)) {
            com.tencent.mm.plugin.appbrand.task.u0 a17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a();
            java.lang.String str = appBrandInitConfigWC.f47277w;
            kotlin.jvm.internal.o.f(str, "getWxaLaunchInstanceId(...)");
            java.lang.String appId = appBrandInitConfigWC.f77278d;
            kotlin.jvm.internal.o.f(appId, "appId");
            a17.b(str, appId);
            if (!android.text.TextUtils.isEmpty(appBrandInitConfigWC.S)) {
                try {
                    jSONObject = new org.json.JSONObject(!android.text.TextUtils.isEmpty(appBrandInitConfigWC.S) ? appBrandInitConfigWC.S : appBrandInitConfigWC.D.f77332q);
                } catch (java.lang.Exception unused) {
                    jSONObject = new org.json.JSONObject();
                }
                java.lang.String optString = jSONObject.optString("instanceId", "");
                if (!(optString == null || optString.length() == 0)) {
                    appBrandInitConfigWC.i(optString);
                    appBrandInitConfigWC.f77298k2 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession(appBrandInitConfigWC.f47277w, appBrandInitConfigWC, stat, com.tencent.mm.plugin.appbrand.report.quality.u.d());
                }
                java.lang.String optString2 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
                if (!(optString2 == null || optString2.length() == 0)) {
                    com.tencent.mars.xlog.Log.i("Luggage.AppBrandInitConfigLU", "resetSession(%s) %s", optString2, android.util.Log.getStackTraceString(new java.lang.Throwable()));
                    appBrandInitConfigWC.f47276v = optString2;
                }
            }
            android.content.Context a18 = q75.a.a(context);
            if (a18 == null) {
                a18 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            ym5.a1.f(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.g(a18, appBrandInitConfigWC, stat));
            r1 = true;
        }
        if (r1) {
            if (context instanceof android.app.Activity) {
                appBrandInitConfigWC.f47269b2 = stat;
                com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.u.a((android.app.Activity) context, appBrandInitConfigWC, stat);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchLogic", "startAppImpl [applaunch] start functional runtime, config[%s]", appBrandInitConfigWC);
            return;
        }
        ik1.b0 b0Var = new ik1.b0();
        try {
            com.tencent.luggage.sdk.processes.x x17 = com.tencent.mm.plugin.appbrand.task.u0.C().x(context, new com.tencent.mm.plugin.appbrand.task.a1(appBrandInitConfigWC, stat, activityStarterIpcDelegate), b0Var, new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.launching.w2$$a
                @Override // yz5.l
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.String processName = (java.lang.String) obj;
                    java.lang.String appId2 = com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.this.f77278d;
                    kotlin.jvm.internal.o.g(processName, "processName");
                    kotlin.jvm.internal.o.g(appId2, "appId");
                    com.tencent.mm.ipcinvoker.d0.d(processName, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.app.h0.class, new com.tencent.mm.plugin.appbrand.app.j0(appId2, processName));
                    return null;
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] startAppOnInitConfigGot %s", appBrandInitConfigWC);
            if (x17 == com.tencent.luggage.sdk.processes.x.f47699d && com.tencent.mm.plugin.appbrand.launching.x2.j(appBrandInitConfigWC.f47277w) == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchLogic", "[applaunch] init AppLaunchPrepareProcess boost instance, appId:%s, versionType:%d, instanceId:%s", appBrandInitConfigWC.f77278d, java.lang.Integer.valueOf(appBrandInitConfigWC.f77281g), appBrandInitConfigWC.f47277w);
                new com.tencent.mm.plugin.appbrand.launching.x2(((com.tencent.mm.plugin.appbrand.task.k) b0Var.f291824a).i(), appBrandInitConfigWC, stat).m();
                com.tencent.mm.plugin.appbrand.c6.b(21, appBrandInitConfigWC.f77278d, appBrandInitConfigWC.L, appBrandInitConfigWC.f77281g, appBrandInitConfigWC.f47284z);
            }
        } catch (android.util.AndroidRuntimeException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppLaunchLogic", "startAppImpl re = %s", e17);
        }
    }
}
