package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.report.quality.n {
    public final void f(com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct weAppQualityLibInjectStruct, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        int i17;
        if (tVar != null) {
            com.tencent.mm.plugin.appbrand.report.j0 a17 = com.tencent.mm.plugin.appbrand.report.j0.a(tVar);
            switch (a17) {
                case X5:
                    i17 = 1;
                    break;
                case MMV8:
                    i17 = 2;
                    break;
                case WebViewBased:
                    i17 = 3;
                    break;
                case NativeScript:
                    i17 = 4;
                    break;
                case NodeJS:
                    i17 = 6;
                    break;
                case J2V8:
                    i17 = 5;
                    break;
                case WebViewX5:
                    i17 = 102;
                    break;
                case WebViewXW:
                    i17 = 103;
                    break;
                case WebViewSystem:
                    i17 = 104;
                    break;
                default:
                    i17 = 0;
                    break;
            }
            weAppQualityLibInjectStruct.f62569q = i17;
            if (!(tVar instanceof com.tencent.mm.plugin.appbrand.page.fb)) {
                if (u46.a.b(com.tencent.mm.plugin.appbrand.report.j0.f87883m, a17)) {
                    weAppQualityLibInjectStruct.f62573u = weAppQualityLibInjectStruct.b("engineVersion", com.eclipsesource.mmv8.V8.getV8Version(), true);
                }
            } else {
                weAppQualityLibInjectStruct.f62573u = weAppQualityLibInjectStruct.b("engineVersion", d() + "", true);
            }
        }
    }

    public com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct g(com.tencent.mm.plugin.appbrand.y yVar) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct h17 = h(yVar.H0(), yVar.t3(), yVar.getF147808e());
        if (h17 == null) {
            return null;
        }
        h17.f62567o = h17.b("libVersion", yVar.x().W0(), true);
        if (yVar.x() instanceof com.tencent.mm.plugin.appbrand.appcache.AbsReader) {
            h17.f62575w = h17.b("expt", ((com.tencent.mm.plugin.appbrand.appcache.AbsReader) yVar.x()).K1().a(), true);
        }
        return h17;
    }

    public final com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct h(boolean z17, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct weAppQualityLibInjectStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct();
        if (z17) {
            weAppQualityLibInjectStruct.f62565m = 1L;
        } else {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a17 = com.tencent.mm.plugin.appbrand.report.quality.e.a(appBrandRuntime);
            if (a17 == null) {
                return null;
            }
            weAppQualityLibInjectStruct.f62557e = weAppQualityLibInjectStruct.b("AppId", a17.f88135e, true);
            weAppQualityLibInjectStruct.f62556d = weAppQualityLibInjectStruct.b("InstanceId", a17.f88134d, true);
            weAppQualityLibInjectStruct.f62559g = a17.f88136f;
            weAppQualityLibInjectStruct.f62560h = a17.f88137g;
            weAppQualityLibInjectStruct.f62558f = a17.f88139i;
            weAppQualityLibInjectStruct.f62562j = a17.f88138h;
            weAppQualityLibInjectStruct.f62565m = a17.a();
        }
        f(weAppQualityLibInjectStruct, tVar);
        return weAppQualityLibInjectStruct;
    }

    public void i(boolean z17, java.lang.String str, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMagicBrushCreateCostStruct weAppQualityAndroidMagicBrushCreateCostStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAndroidMagicBrushCreateCostStruct();
        if (!z17) {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(str, true);
            if (b17 == null) {
                return;
            }
            weAppQualityAndroidMagicBrushCreateCostStruct.f62368e = weAppQualityAndroidMagicBrushCreateCostStruct.b("AppId", b17.f88135e, true);
            weAppQualityAndroidMagicBrushCreateCostStruct.f62367d = weAppQualityAndroidMagicBrushCreateCostStruct.b("InstanceId", b17.f88134d, true);
            int i17 = b17.f88136f;
            weAppQualityAndroidMagicBrushCreateCostStruct.f62369f = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.o.demo : cm.o.debug : cm.o.release;
            weAppQualityAndroidMagicBrushCreateCostStruct.f62370g = b17.f88137g;
            weAppQualityAndroidMagicBrushCreateCostStruct.f62372i = b17.f88138h;
        }
        weAppQualityAndroidMagicBrushCreateCostStruct.f62373j = j17;
        long i18 = weAppQualityAndroidMagicBrushCreateCostStruct.i();
        weAppQualityAndroidMagicBrushCreateCostStruct.f62374k = i18;
        weAppQualityAndroidMagicBrushCreateCostStruct.f62371h = i18 - weAppQualityAndroidMagicBrushCreateCostStruct.f62373j;
        weAppQualityAndroidMagicBrushCreateCostStruct.f62375l = z17 ? 1L : 0L;
        weAppQualityAndroidMagicBrushCreateCostStruct.k();
    }

    public void j(java.lang.String str, com.tencent.mm.plugin.appbrand.report.quality.t1 t1Var) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(str, true);
        if (b17 == null) {
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStruct weAppQualityRuntimeStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStruct();
        weAppQualityRuntimeStruct.f62658e = weAppQualityRuntimeStruct.b("AppId", b17.f88135e, true);
        weAppQualityRuntimeStruct.f62657d = weAppQualityRuntimeStruct.b("InstanceId", b17.f88134d, true);
        int i17 = b17.f88136f;
        weAppQualityRuntimeStruct.f62660g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.d0.demo : cm.d0.debug : cm.d0.release;
        weAppQualityRuntimeStruct.f62661h = b17.f88137g;
        weAppQualityRuntimeStruct.f62659f = b17.f88139i;
        weAppQualityRuntimeStruct.f62663j = b17.f88138h;
        weAppQualityRuntimeStruct.A = b17.B.get();
        weAppQualityRuntimeStruct.f62664k = 0L;
        weAppQualityRuntimeStruct.f62665l = 0L;
        weAppQualityRuntimeStruct.f62662i = 0L;
        weAppQualityRuntimeStruct.f62666m = t1Var.f88326a;
        weAppQualityRuntimeStruct.f62667n = java.lang.Math.round(t1Var.f88327b);
        if (t1Var.f88328c != null) {
            weAppQualityRuntimeStruct.f62675v = r4.ordinal();
        } else {
            weAppQualityRuntimeStruct.f62675v = 0L;
        }
        weAppQualityRuntimeStruct.f62676w = t1Var.f88329d;
        weAppQualityRuntimeStruct.f62677x = t1Var.f88330e;
        weAppQualityRuntimeStruct.f62678y = t1Var.f88331f;
        weAppQualityRuntimeStruct.f62671r = t1Var.f88332g;
        weAppQualityRuntimeStruct.f62672s = t1Var.f88333h;
        weAppQualityRuntimeStruct.f62669p = t1Var.f88334i;
        weAppQualityRuntimeStruct.f62670q = t1Var.f88335j;
        weAppQualityRuntimeStruct.f62673t = t1Var.f88336k / 1000;
        weAppQualityRuntimeStruct.f62674u = t1Var.f88337l;
        weAppQualityRuntimeStruct.f62668o = t1Var.f88338m;
        weAppQualityRuntimeStruct.f62679z = t1Var.f88339n;
        weAppQualityRuntimeStruct.B = t1Var.f88340o;
        weAppQualityRuntimeStruct.C = t1Var.f88341p;
        weAppQualityRuntimeStruct.D = t1Var.f88342q;
        weAppQualityRuntimeStruct.E = t1Var.f88343r;
        weAppQualityRuntimeStruct.F = t1Var.f88344s;
        weAppQualityRuntimeStruct.G = t1Var.f88345t;
        weAppQualityRuntimeStruct.H = t1Var.f88346u;
        weAppQualityRuntimeStruct.I = t1Var.f88347v;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader S2 = b17.f88144p.S2(false);
        weAppQualityRuntimeStruct.f62656J = weAppQualityRuntimeStruct.b("libVersion", S2 == null ? "" : S2.W0(), true);
        weAppQualityRuntimeStruct.k();
    }

    public void k(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, long j17, long j18, boolean z17, long j19) {
        if (yVar.isRunning()) {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct weAppQualityLibInjectStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLibInjectStruct();
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(yVar.getAppId(), true);
            if (b17 == null) {
                return;
            }
            weAppQualityLibInjectStruct.f62557e = weAppQualityLibInjectStruct.b("AppId", b17.f88135e, true);
            weAppQualityLibInjectStruct.f62556d = weAppQualityLibInjectStruct.b("InstanceId", b17.f88134d, true);
            weAppQualityLibInjectStruct.f62559g = b17.f88136f;
            weAppQualityLibInjectStruct.f62560h = b17.f88137g;
            weAppQualityLibInjectStruct.f62558f = b17.f88139i;
            weAppQualityLibInjectStruct.f62562j = b17.f88138h;
            f(weAppQualityLibInjectStruct, yVar.getF147808e());
            java.lang.String str2 = yVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? "WebView-wxConfigReady" : ((com.tencent.mm.plugin.appbrand.o6) yVar.t3()).q2() ? "GameMainContext-wxConfigReady" : "MainContext-wxConfigReady";
            weAppQualityLibInjectStruct.p(str2);
            weAppQualityLibInjectStruct.f62568p = (str == null ? "" : str).length();
            weAppQualityLibInjectStruct.f62567o = weAppQualityLibInjectStruct.b("libVersion", yVar.x().W0(), true);
            weAppQualityLibInjectStruct.f62571s = z17 ? 1L : 0L;
            weAppQualityLibInjectStruct.f62563k = j17;
            weAppQualityLibInjectStruct.f62564l = j18;
            weAppQualityLibInjectStruct.f62561i = j18 - j17;
            weAppQualityLibInjectStruct.f62572t = j19;
            if (yVar.x() instanceof com.tencent.mm.plugin.appbrand.appcache.AbsReader) {
                weAppQualityLibInjectStruct.f62575w = weAppQualityLibInjectStruct.b("expt", ((com.tencent.mm.plugin.appbrand.appcache.AbsReader) yVar.x()).K1().a(), true);
            }
            weAppQualityLibInjectStruct.k();
            com.tencent.mm.plugin.appbrand.performance.m.f(b17.f88135e, "JsInject", j17, j18, java.lang.String.format("{ \"fileName\": \"%s\", \"fileSize\": %d }", str2, java.lang.Long.valueOf(weAppQualityLibInjectStruct.f62568p)));
        }
    }

    public void l(com.tencent.mm.plugin.appbrand.task.x0 x0Var, java.lang.String str, long j17, com.tencent.mm.plugin.appbrand.report.j0 j0Var) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceInitStruct weAppQualityAppServiceInitStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityAppServiceInitStruct();
        if (x0Var != null) {
            weAppQualityAppServiceInitStruct.f62415m = 1L;
            weAppQualityAppServiceInitStruct.f62417o = x0Var == com.tencent.mm.plugin.appbrand.task.x0.WAGAME ? 1L : 0L;
        } else {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(str, true);
            if (b17 == null) {
                return;
            }
            weAppQualityAppServiceInitStruct.f62407e = weAppQualityAppServiceInitStruct.b("AppId", b17.f88135e, true);
            weAppQualityAppServiceInitStruct.f62406d = weAppQualityAppServiceInitStruct.b("InstanceId", b17.f88134d, true);
            int i17 = b17.f88136f;
            weAppQualityAppServiceInitStruct.f62409g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.s.demo : cm.s.debug : cm.s.release;
            weAppQualityAppServiceInitStruct.f62410h = b17.f88137g;
            weAppQualityAppServiceInitStruct.f62408f = b17.f88139i;
            weAppQualityAppServiceInitStruct.f62412j = b17.f88138h;
            weAppQualityAppServiceInitStruct.f62415m = b17.a();
            weAppQualityAppServiceInitStruct.f62417o = b17.A ? 1L : 0L;
        }
        weAppQualityAppServiceInitStruct.f62413k = j17;
        long i18 = weAppQualityAppServiceInitStruct.i();
        weAppQualityAppServiceInitStruct.f62414l = i18;
        weAppQualityAppServiceInitStruct.f62411i = i18 - j17;
        int ordinal = j0Var.ordinal();
        if (ordinal == 0) {
            weAppQualityAppServiceInitStruct.f62416n = 1L;
        } else if (ordinal == 1) {
            weAppQualityAppServiceInitStruct.f62416n = 2L;
        } else if (ordinal == 2) {
            weAppQualityAppServiceInitStruct.f62416n = 3L;
        } else if (ordinal == 3) {
            weAppQualityAppServiceInitStruct.f62416n = 4L;
        } else if (ordinal == 4) {
            weAppQualityAppServiceInitStruct.f62416n = 6L;
        } else if (ordinal != 5) {
            weAppQualityAppServiceInitStruct.f62416n = 2147483647L;
        } else {
            weAppQualityAppServiceInitStruct.f62416n = 5L;
        }
        weAppQualityAppServiceInitStruct.f62418p = weAppQualityAppServiceInitStruct.b("engineVersion", com.eclipsesource.mmv8.V8.getV8Version(), true);
        weAppQualityAppServiceInitStruct.k();
        va1.b.f434229a.a(weAppQualityAppServiceInitStruct.f62406d, weAppQualityAppServiceInitStruct.f62407e, "JSVMInit", weAppQualityAppServiceInitStruct.f62413k, weAppQualityAppServiceInitStruct.f62414l, null);
    }

    public void m(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle appStartupPerformanceReportBundle) {
        if (appStartupPerformanceReportBundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "reportAppStartupPerformanceReportBundle, but bundle == null");
            return;
        }
        if (qualitySessionRuntime == null) {
            return;
        }
        if (appStartupPerformanceReportBundle.f84420u) {
            qualitySessionRuntime.K = true;
        }
        if (appStartupPerformanceReportBundle.f84421v) {
            qualitySessionRuntime.M = true;
        }
        if (appStartupPerformanceReportBundle.f84422w) {
            qualitySessionRuntime.N = true;
        }
        for (com.tencent.mm.plugin.appbrand.report.model.kv_14609 kv_14609Var : appStartupPerformanceReportBundle.f84408f) {
            kv_14609Var.getClass();
            java.lang.String str = qualitySessionRuntime.f88134d;
            kv_14609Var.B = qualitySessionRuntime.f88137g;
            kv_14609Var.C = qualitySessionRuntime.f88138h;
            kv_14609Var.f88027e = qualitySessionRuntime;
            kv_14609Var.A = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "reportKv14609 %s", kv_14609Var.toString());
            kv_14609Var.c();
        }
        for (com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemGetDownloadCGIStruct weAppQualitySystemGetDownloadCGIStruct : appStartupPerformanceReportBundle.f84407e) {
            weAppQualitySystemGetDownloadCGIStruct.f62738e = weAppQualitySystemGetDownloadCGIStruct.b("AppId", qualitySessionRuntime.f88135e, true);
            weAppQualitySystemGetDownloadCGIStruct.f62737d = weAppQualitySystemGetDownloadCGIStruct.b("InstanceId", qualitySessionRuntime.f88134d, true);
            weAppQualitySystemGetDownloadCGIStruct.f62740g = cm.j0.a(qualitySessionRuntime.f88136f);
            weAppQualitySystemGetDownloadCGIStruct.f62741h = qualitySessionRuntime.f88137g;
            weAppQualitySystemGetDownloadCGIStruct.f62743j = qualitySessionRuntime.f88138h;
            weAppQualitySystemGetDownloadCGIStruct.f62739f = qualitySessionRuntime.f88139i;
            weAppQualitySystemGetDownloadCGIStruct.k();
        }
        o6Var.I1(new com.tencent.mm.plugin.appbrand.report.quality.i(this, o6Var, appStartupPerformanceReportBundle));
    }

    public final void n(boolean z17, java.lang.String str, long j17, com.tencent.mm.plugin.appbrand.report.l1 l1Var) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewInitStruct weAppQualityWebviewInitStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWebviewInitStruct();
        if (z17) {
            weAppQualityWebviewInitStruct.f62837m = 1L;
        } else {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(str, true);
            if (b17 == null) {
                return;
            }
            weAppQualityWebviewInitStruct.f62829e = weAppQualityWebviewInitStruct.b("AppId", b17.f88135e, true);
            weAppQualityWebviewInitStruct.f62828d = weAppQualityWebviewInitStruct.b("InstanceId", b17.f88134d, true);
            int i17 = b17.f88136f;
            weAppQualityWebviewInitStruct.f62831g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.w0.demo : cm.w0.debug : cm.w0.release;
            weAppQualityWebviewInitStruct.f62832h = b17.f88137g;
            weAppQualityWebviewInitStruct.f62830f = b17.f88139i;
            weAppQualityWebviewInitStruct.f62834j = b17.f88138h;
            weAppQualityWebviewInitStruct.f62837m = b17.a();
        }
        weAppQualityWebviewInitStruct.f62835k = j17;
        long i18 = weAppQualityWebviewInitStruct.i();
        weAppQualityWebviewInitStruct.f62836l = i18;
        weAppQualityWebviewInitStruct.f62833i = i18 - j17;
        int ordinal = l1Var.ordinal();
        if (ordinal == 0) {
            weAppQualityWebviewInitStruct.f62838n = 2L;
        } else if (ordinal == 1) {
            weAppQualityWebviewInitStruct.f62838n = 4L;
        } else if (ordinal == 2) {
            weAppQualityWebviewInitStruct.f62838n = 3L;
        } else if (ordinal != 3) {
            weAppQualityWebviewInitStruct.f62838n = 2147483647L;
        } else {
            weAppQualityWebviewInitStruct.f62838n = 5L;
        }
        weAppQualityWebviewInitStruct.f62839o = d();
        weAppQualityWebviewInitStruct.f62840p = weAppQualityWebviewInitStruct.b("engineVersionStr", d() + "", true);
        weAppQualityWebviewInitStruct.k();
    }
}
