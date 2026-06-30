package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public class l0 extends com.tencent.mm.weapp_core.JsThreadMonitor {
    @Override // com.tencent.mm.weapp_core.JsThreadMonitor
    public void onHangDetected(final java.lang.String str, final java.lang.String str2, final long j17) {
        ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.k0$$c
            @Override // java.lang.Runnable
            public final void run() {
                boolean z17;
                java.lang.String str3;
                java.lang.String str4;
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject;
                java.lang.String str5 = str;
                long j18 = j17;
                java.lang.String str6 = str2;
                com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(str5);
                int i17 = com.tencent.mm.plugin.appbrand.report.m0.f87916b;
                synchronized (com.tencent.mm.plugin.appbrand.report.m0.class) {
                    com.tencent.mm.sdk.platformtools.o4 b18 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.b("AppBrandJsThreadHangReporter");
                    if (b18 != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j19 = b18.getLong("window_start_ms", 0L);
                        int i18 = b18.getInt("window_report_count", 0);
                        if (j19 <= 0 || currentTimeMillis - j19 >= com.tencent.mm.plugin.appbrand.report.m0.f87915a) {
                            i18 = 0;
                        } else {
                            currentTimeMillis = j19;
                        }
                        if (i18 < 10) {
                            b18.putLong("window_start_ms", currentTimeMillis);
                            b18.putInt("window_report_count", i18 + 1);
                            z17 = true;
                        }
                    }
                    z17 = false;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangReporter", "report skipped by freq limit, appId:%s", str5);
                    return;
                }
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = (b17 == null || !(b17.u0() instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU)) ? null : b17.u0();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str7 = str5;
                int i19 = u07 != null ? u07.L : 0;
                int i27 = (u07 == null || (appBrandStatObject = u07.f47269b2) == null) ? 0 : appBrandStatObject.f87790f;
                if (b17 == null || b17.x0() == null || (str3 = b17.x0().getCurrentUrl()) == null) {
                    str3 = "";
                }
                java.lang.String str8 = str3;
                com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = com.tencent.mm.plugin.appbrand.appcache.e8.f75515a;
                if (iCommLibReader == null || (str4 = iCommLibReader.W0()) == null) {
                    str4 = "";
                }
                java.lang.String str9 = str4;
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangReporter", "report type=%d appId=%s durationUs=%d page=%s", java.lang.Integer.valueOf(com.tencent.liteav.TXLiteAVCode.WARNING_VIDEO_DRIVER_VERSION_TOO_LOW), str7, java.lang.Long.valueOf(j18), str8);
                    java.lang.String str10 = "";
                    if (str6 != null) {
                        try {
                            str10 = fp.s0.b(str6, com.tencent.mapsdk.internal.rv.f51270c);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJsThreadHangReporter", e17, "encode stackJson failed, appId:%s", str7);
                        }
                    }
                    jx3.f.INSTANCE.d(38236, java.lang.Integer.valueOf(com.tencent.liteav.TXLiteAVCode.WARNING_VIDEO_DRIVER_VERSION_TOO_LOW), str7, java.lang.Long.valueOf(j18), str10, java.lang.Integer.valueOf(i19), str9, java.lang.Integer.valueOf(i27), str8);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandJsThreadHangReporter", e18, "report failed, appId:%s", str7);
                }
            }
        });
    }
}
