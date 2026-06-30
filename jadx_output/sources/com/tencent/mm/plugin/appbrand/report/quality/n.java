package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public abstract class n {
    public final void a(com.tencent.mm.plugin.appbrand.page.d5 pagecontainer) {
        kotlin.jvm.internal.o.g(pagecontainer, "pagecontainer");
        if (pagecontainer.getRuntime() instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidPageContainerCostStruct weAppQualityAndroidPageContainerCostStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidPageContainerCostStruct();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(pagecontainer.getAppId(), true);
        if (b17 == null) {
            b17 = null;
        } else if (b17.G > 0) {
            weAppQualityAndroidPageContainerCostStruct.f62376d = weAppQualityAndroidPageContainerCostStruct.b("InstanceId", b17.f88134d, true);
            weAppQualityAndroidPageContainerCostStruct.f62377e = weAppQualityAndroidPageContainerCostStruct.b("AppId", b17.f88135e, true);
            weAppQualityAndroidPageContainerCostStruct.f62378f = b17.f88139i;
            int i17 = b17.f88136f;
            weAppQualityAndroidPageContainerCostStruct.f62379g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.p.demo : cm.p.debug : cm.p.release;
            weAppQualityAndroidPageContainerCostStruct.f62380h = b17.f88137g;
            weAppQualityAndroidPageContainerCostStruct.f62382j = b17.f88138h;
            weAppQualityAndroidPageContainerCostStruct.f62383k = b17.G;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            weAppQualityAndroidPageContainerCostStruct.f62384l = currentTimeMillis;
            weAppQualityAndroidPageContainerCostStruct.f62381i = currentTimeMillis - weAppQualityAndroidPageContainerCostStruct.f62383k;
            com.tencent.mm.plugin.appbrand.page.w2 currentPage = pagecontainer.getCurrentPage();
            com.tencent.mm.plugin.appbrand.page.v5 currentPageView = currentPage != null ? currentPage.getCurrentPageView() : null;
            weAppQualityAndroidPageContainerCostStruct.f62385m = e(currentPageView instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) currentPageView : null);
            weAppQualityAndroidPageContainerCostStruct.k();
        }
        pagecontainer.getAppId();
        if (b17 == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
    }

    public final void b(com.tencent.mm.plugin.appbrand.service.c0 service, java.lang.String str, long j17, boolean z17, long j18, long j19, java.lang.Object obj) {
        java.lang.String str2;
        int i17;
        kotlin.jvm.internal.o.g(service, "service");
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = service.x();
        if (x17 == null || (str2 = x17.W0()) == null) {
            str2 = "invalid";
        }
        cl.k1 k1Var = obj instanceof cl.k1 ? (cl.k1) obj : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystemKVProtocol", "Inject MainContextLibScript[" + str + "] Succeed wx.version = " + str2 + ", appId = " + service.getAppId());
        if (service.H0() || service.isRunning()) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct g17 = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a.g(service);
            g17.p(str);
            g17.f62568p = j17;
            g17.f62570r = (k1Var == null || (i17 = k1Var.codeCacheStatus) < 0 || i17 >= 7) ? 4 : com.tencent.mm.plugin.appbrand.jsruntime.l0.f84003t0[i17];
            g17.f62571s = service.X1() ? 1L : 0L;
            g17.f62572t = k1Var != null ? k1Var.flatJSCompileCost : 0L;
            g17.f62574v = k1Var != null ? k1Var.f42677c : 0;
            if (k1Var != null) {
                j18 = k1Var.f42675a;
            }
            g17.f62563k = j18;
            if (k1Var != null) {
                j19 = k1Var.f42676b;
            }
            g17.f62564l = j19;
            g17.f62561i = j19 - j18;
            g17.f62573u = g17.b("engineVersion", com.eclipsesource.mmv8.V8.getV8Version(), true);
            g17.k();
        }
    }

    public final void c(java.lang.String str, java.lang.String str2, com.tencent.mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct weAppQualityCGISpeedStruct, java.lang.String instanceId) {
        kotlin.jvm.internal.o.g(weAppQualityCGISpeedStruct, "weAppQualityCGISpeedStruct");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        if (str == null) {
            str = "";
        }
        weAppQualityCGISpeedStruct.f62428e = weAppQualityCGISpeedStruct.b("appid", str, true);
        weAppQualityCGISpeedStruct.f62427d = weAppQualityCGISpeedStruct.b("instanceId", instanceId, true);
        if (str2 == null) {
            str2 = "";
        }
        weAppQualityCGISpeedStruct.f62429f = weAppQualityCGISpeedStruct.b(dm.i4.COL_USERNAME, str2, true);
        weAppQualityCGISpeedStruct.k();
    }

    public final long d() {
        try {
            com.tencent.xweb.f1 currentModuleWebCoreType = com.tencent.xweb.WebView.getCurrentModuleWebCoreType();
            int i17 = currentModuleWebCoreType == null ? -1 : com.tencent.mm.plugin.appbrand.report.quality.l.f88216a[currentModuleWebCoreType.ordinal()];
            int i18 = 0;
            if (i17 != -1 && i17 != 1) {
                if (i17 == 2) {
                    i18 = by5.e.d();
                } else if (i17 != 3) {
                    if (i17 == 4) {
                        i18 = org.xwalk.core.XWalkEnvironment.d();
                    } else {
                        if (i17 != 5) {
                            throw new jz5.j();
                        }
                        i18 = org.xwalk.core.XWalkEnvironment.d();
                    }
                }
            }
            return i18;
        } catch (java.lang.Throwable unused) {
            return -1L;
        }
    }

    public final long e(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        com.tencent.mm.plugin.appbrand.page.w9 S3 = n7Var != null ? n7Var.S3() : null;
        int i17 = -1;
        if (S3 != null) {
            if (S3.isSysKernel()) {
                i17 = 4;
            } else if (S3.isXWalkKernel()) {
                i17 = 3;
            }
        }
        return i17;
    }
}
