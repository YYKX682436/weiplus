package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.x0 f88426a = new com.tencent.mm.plugin.appbrand.report.x0();

    public static final void b(com.tencent.mm.plugin.appbrand.service.c0 service, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(service, "service");
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(service.getAppId(), true);
        if (b17 != null) {
            com.tencent.mm.autogen.mmdata.rpt.WechatAppJsErrorStruct wechatAppJsErrorStruct = new com.tencent.mm.autogen.mmdata.rpt.WechatAppJsErrorStruct();
            wechatAppJsErrorStruct.f62950d = wechatAppJsErrorStruct.b("appid", b17.f88135e, true);
            wechatAppJsErrorStruct.f62951e = b17.f88139i;
            wechatAppJsErrorStruct.f62952f = b17.f88136f;
            wechatAppJsErrorStruct.f62953g = 9;
            wechatAppJsErrorStruct.f62955i = wechatAppJsErrorStruct.b("errorMessage", str, true);
            wechatAppJsErrorStruct.f62956j = wechatAppJsErrorStruct.b("errorStack", str2, true);
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = service.x();
            kotlin.jvm.internal.o.d(x17);
            wechatAppJsErrorStruct.f62957k = wechatAppJsErrorStruct.b("sdkversion", x17.W0(), true);
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x18 = service.x();
            kotlin.jvm.internal.o.d(x18);
            wechatAppJsErrorStruct.f62961o = wechatAppJsErrorStruct.b("sdkupdatetime", x18.B7(), true);
            wechatAppJsErrorStruct.f62958l = b17.f88137g;
            wechatAppJsErrorStruct.f62962p = b17.B.get();
            com.tencent.mm.plugin.appbrand.page.n7 V0 = service.V0();
            java.lang.String X1 = V0.X1();
            java.lang.String s17 = u46.l.s(V0.Y1(), X1.length());
            if (s17 == null) {
                s17 = "";
            }
            wechatAppJsErrorStruct.f62959m = wechatAppJsErrorStruct.b(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, fp.s0.a(X1), true);
            wechatAppJsErrorStruct.f62960n = wechatAppJsErrorStruct.b("query", fp.s0.a(s17), true);
            wechatAppJsErrorStruct.f62964r = wechatAppJsErrorStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.c(null, 1, null), true);
            wechatAppJsErrorStruct.k();
        }
    }

    public final void a(com.tencent.mm.plugin.appbrand.service.c0 service, com.tencent.luggage.sdk.jsapi.component.n scriptInfo, boolean z17, long j17, long j18, java.lang.Object obj) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(scriptInfo, "scriptInfo");
        java.lang.String str = scriptInfo.f47352i;
        if (str == null || str.length() == 0) {
            return;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceWCScriptReporter", "reportEvaluateResult, !succeed name[" + str + "], appId[" + service.getAppId() + ']');
            if (scriptInfo.f47354k <= 0) {
                kotlin.jvm.internal.o.d(str);
                if (kotlin.jvm.internal.o.b(str, "WAServiceMainContext.js")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(370, 73);
                }
            }
        }
        kotlin.jvm.internal.o.d(str);
        int hashCode = str.hashCode();
        if (hashCode != -979125780) {
            if (hashCode != 293174862) {
                if (hashCode == 452806299 && str.equals("WAGame.js")) {
                    if (z17) {
                        com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.b(service, str, scriptInfo.f47354k, z17, j17, j18, obj);
                    } else {
                        com.tencent.mm.plugin.appbrand.report.v0.m(service.getAppId(), 24, 0);
                        com.tencent.mm.plugin.appbrand.report.v0.i(service.getAppId(), service.t3().d2(), service.t3().f74805p.f77281g, 778, 14, 1);
                    }
                    if (service.t3() != null) {
                        if (z17) {
                            com.tencent.mm.plugin.appbrand.keylogger.w.f(service.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAGameContext, "WAGame.js", j17, j18);
                            return;
                        } else {
                            com.tencent.mm.plugin.appbrand.keylogger.w.d(service.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectWAGameContext, "", "WAGame.js", j17, j18);
                            return;
                        }
                    }
                    return;
                }
            } else if (str.equals("app-service.js")) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(370, 9);
                if (!z17) {
                    try {
                        g0Var.A(370, 10);
                        com.tencent.mm.plugin.appbrand.report.v0.m(service.getAppId(), 24, 0);
                        com.tencent.mm.plugin.appbrand.report.v0.i(service.getAppId(), service.t3().E0().f305852r.pkgVersion, service.t3().E0().f305852r.f75399d, 370, 10, 1);
                        return;
                    } catch (java.lang.NullPointerException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceWCScriptReporter", "Inject External Service Script Failed, report npe = %s", e17);
                        return;
                    }
                }
                if (service.H0() || service.isRunning()) {
                    com.tencent.mm.plugin.appbrand.o6 t37 = service.t3();
                    cl.k1 k1Var = obj instanceof cl.k1 ? (cl.k1) obj : null;
                    long j19 = k1Var != null ? k1Var.f42675a : j17;
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = t37 != null ? t37.f74803n : null;
                    objArr[1] = java.lang.Integer.valueOf(t37 != null ? t37.hashCode() : -1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWCScriptReporter", "[QualitySystem] app-service.js runtime.appId=[%s], runtime.hashCode = [%d]", objArr);
                    i18 = 370;
                    com.tencent.mm.plugin.appbrand.report.quality.e.d(service, "app-service.js", scriptInfo.f47354k, "", 0, j19, t37 != null ? t37.hashCode() : -1, k1Var);
                } else {
                    i18 = 370;
                }
                g0Var.A(i18, 11);
                return;
            }
            i17 = 370;
        } else {
            if (str.equals("WAServiceMainContext.js")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceWCScriptReporter", "reportEvaluateResult, service_lib_script[" + str + "], succeed[" + z17 + ']');
                if (service.t3() != null) {
                    if (z17) {
                        com.tencent.mm.plugin.appbrand.keylogger.w.f(service.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAMainContext, "", j17, j18);
                    } else {
                        com.tencent.mm.plugin.appbrand.keylogger.w.d(service.getAppId(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepInjectJSWAMainContext, "", "", j17, j18);
                    }
                }
                com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.b(service, str, scriptInfo.f47354k, z17, j17, j18, obj);
                jz5.o oVar = kotlin.jvm.internal.o.b(str, "WAServiceMainContext.js") ? new jz5.o(61, 62, 63) : new jz5.o(0, 0, 0);
                int intValue = ((java.lang.Number) oVar.f302841d).intValue();
                int intValue2 = ((java.lang.Number) oVar.f302842e).intValue();
                int intValue3 = ((java.lang.Number) oVar.f302843f).intValue();
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.A(370, intValue);
                if (z17) {
                    g0Var2.A(370, intValue3);
                    return;
                }
                g0Var2.A(370, intValue2);
                com.tencent.mm.plugin.appbrand.report.v0.m(service.getAppId(), 24, 0);
                com.tencent.mm.plugin.appbrand.report.v0.i(service.getAppId(), service.t3() != null ? service.t3().E0().f305852r.pkgVersion : 0, service.t3() != null ? service.t3().E0().f305852r.f75399d : -1, 370, intValue2, 1);
                return;
            }
            i17 = 370;
        }
        if (r26.i0.n(str, "/app-service.js", false)) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.A(i17, 30);
            if (z17) {
                g0Var3.A(i17, 31);
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceWCScriptReporter", "inject module(" + str + ") script failed");
            g0Var3.A(i17, 32);
        }
    }
}
