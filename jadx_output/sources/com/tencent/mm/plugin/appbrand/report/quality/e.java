package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.j f88172a = new com.tencent.mm.plugin.appbrand.report.quality.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f88173b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.quality.d f88174c = new com.tencent.mm.plugin.appbrand.report.quality.d();

    public static com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime a(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime;
        if (appBrandRuntime == null) {
            return null;
        }
        java.util.HashMap hashMap = f88173b;
        synchronized (hashMap) {
            qualitySessionRuntime = (com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime) hashMap.get(appBrandRuntime.f74803n);
        }
        if (qualitySessionRuntime == null || appBrandRuntime != qualitySessionRuntime.f88144p) {
            return null;
        }
        return qualitySessionRuntime;
    }

    public static com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime;
        java.util.HashMap hashMap = f88173b;
        synchronized (hashMap) {
            qualitySessionRuntime = (com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime) hashMap.get(str);
        }
        if (qualitySessionRuntime == null) {
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "QualitySession not open. appId=%s", str);
            if (z17) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            }
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandQualitySystem", new java.lang.Throwable(), format, new java.lang.Object[0]);
        }
        return qualitySessionRuntime;
    }

    public static void c(final com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC, final com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime, com.tencent.mm.plugin.appbrand.launching.AppStartupPerformanceReportBundle appStartupPerformanceReportBundle, final com.tencent.mm.plugin.appbrand.o6 o6Var, long j17) {
        long k17;
        if (qualitySessionRuntime == null) {
            return;
        }
        qualitySessionRuntime.f88147s = j17;
        qualitySessionRuntime.f88151w = appStartupPerformanceReportBundle;
        if (appStartupPerformanceReportBundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandQualitySystem", "ReportBundle == null in resourceReady");
        } else {
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct weAppQualitySystemResourceReadyStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemResourceReadyStruct();
            weAppQualitySystemResourceReadyStruct.f62788e = weAppQualitySystemResourceReadyStruct.b("AppId", qualitySessionRuntime.f88135e, true);
            weAppQualitySystemResourceReadyStruct.f62787d = weAppQualitySystemResourceReadyStruct.b("InstanceId", qualitySessionRuntime.f88134d, true);
            int i17 = qualitySessionRuntime.f88136f;
            int i18 = 3;
            weAppQualitySystemResourceReadyStruct.f62790g = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : cm.r0.demo : cm.r0.debug : cm.r0.release;
            weAppQualitySystemResourceReadyStruct.f62791h = qualitySessionRuntime.f88137g;
            weAppQualitySystemResourceReadyStruct.f62793j = qualitySessionRuntime.f88138h;
            weAppQualitySystemResourceReadyStruct.f62789f = qualitySessionRuntime.f88139i;
            long j18 = qualitySessionRuntime.f88145q;
            weAppQualitySystemResourceReadyStruct.f62794k = j18;
            weAppQualitySystemResourceReadyStruct.f62795l = j17;
            weAppQualitySystemResourceReadyStruct.f62792i = j17 - j18;
            weAppQualitySystemResourceReadyStruct.f62804u = appStartupPerformanceReportBundle.f84412m;
            weAppQualitySystemResourceReadyStruct.f62805v = appStartupPerformanceReportBundle.f84414o;
            weAppQualitySystemResourceReadyStruct.f62806w = qualitySessionRuntime.f88140m;
            weAppQualitySystemResourceReadyStruct.f62807x = appStartupPerformanceReportBundle.f84419t;
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
            weAppQualitySystemResourceReadyStruct.f62797n = appStartupPerformanceReportBundle.f84420u ? cm.t0.sync : cm.t0.unsync;
            weAppQualitySystemResourceReadyStruct.f62798o = u07.S1 ? cm.s0.sync : cm.s0.unsync;
            weAppQualitySystemResourceReadyStruct.f62800q = o6Var.f86180m2 ? 1L : 0L;
            if (!com.tencent.mm.vfs.w6.j(appBrandSysConfigWC.f305852r.pkgPath)) {
                java.util.Iterator it = appBrandSysConfigWC.f305852r.f75402g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        k17 = 0;
                        break;
                    }
                    com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = (com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo) it.next();
                    if (com.tencent.mm.vfs.w6.j(modulePkgInfo.pkgPath)) {
                        k17 = com.tencent.mm.vfs.w6.k(modulePkgInfo.pkgPath);
                        break;
                    }
                }
            } else {
                k17 = com.tencent.mm.vfs.w6.k(appBrandSysConfigWC.f305852r.pkgPath);
            }
            if (!o6Var.f86180m2) {
                k17 = 0;
            }
            weAppQualitySystemResourceReadyStruct.f62796m = k17;
            weAppQualitySystemResourceReadyStruct.f62799p = com.tencent.mm.plugin.appbrand.report.quality.u.c();
            weAppQualitySystemResourceReadyStruct.f62803t = qualitySessionRuntime.H;
            weAppQualitySystemResourceReadyStruct.f62801r = qualitySessionRuntime.a();
            weAppQualitySystemResourceReadyStruct.f62802s = qualitySessionRuntime.f88151w.f84410h - qualitySessionRuntime.f88151w.f84409g;
            weAppQualitySystemResourceReadyStruct.f62808y = appStartupPerformanceReportBundle.f84421v ? cm.v0.sync : cm.v0.unsync;
            weAppQualitySystemResourceReadyStruct.f62809z = appStartupPerformanceReportBundle.f84416q - appStartupPerformanceReportBundle.f84415p;
            weAppQualitySystemResourceReadyStruct.C = appStartupPerformanceReportBundle.f84422w ? cm.u0.sync : cm.u0.unsync;
            weAppQualitySystemResourceReadyStruct.D = appStartupPerformanceReportBundle.f84418s - appStartupPerformanceReportBundle.f84417r;
            weAppQualitySystemResourceReadyStruct.A = qualitySessionRuntime.b();
            weAppQualitySystemResourceReadyStruct.B = weAppQualitySystemResourceReadyStruct.b("NetworkTypeStr", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
            if (gf.y0.b(o6Var, o6Var.t0(), false)) {
                i18 = 5;
            } else if (!com.tencent.xweb.WebView.y0()) {
                i18 = 4;
            }
            weAppQualitySystemResourceReadyStruct.E = i18;
            weAppQualitySystemResourceReadyStruct.G = (qualitySessionRuntime.f88151w == null || !qualitySessionRuntime.f88151w.a()) ? 0L : 1L;
            try {
                java.lang.String str = o6Var.u0().f77283i;
                if (str == null) {
                    str = "";
                }
                weAppQualitySystemResourceReadyStruct.H = weAppQualitySystemResourceReadyStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, fp.s0.a(str), true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandQualitySystem", "resourceReady appId %s, encode enterPath failed %s", o6Var.f74803n, e17);
            }
            weAppQualitySystemResourceReadyStruct.k();
            com.tencent.mm.plugin.appbrand.performance.m.f(weAppQualitySystemResourceReadyStruct.f62788e, "ResourcePrepare", weAppQualitySystemResourceReadyStruct.f62794k, weAppQualitySystemResourceReadyStruct.f62795l, null);
        }
        ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.quality.e$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime2 = com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime.this;
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = o6Var;
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC2 = appBrandSysConfigWC;
                if (qualitySessionRuntime2 != com.tencent.mm.plugin.appbrand.report.quality.e.a(o6Var2) || qualitySessionRuntime2.f88144p.L0() || qualitySessionRuntime2.A) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.report.quality.t tVar = qualitySessionRuntime2.f88154z;
                tVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "AppBrandRuntimeEventReporter.mayStartDependOnClientSampleRate");
                int i19 = qualitySessionRuntime2.f88144p.u0().f47279x0;
                double d17 = appBrandSysConfigWC2.Y.G;
                double nextDouble = new java.util.Random(i19 ^ java.lang.System.nanoTime()).nextDouble();
                boolean z17 = com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d;
                boolean z18 = nextDouble <= d17 || z17;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "shouldEnableReport() returned: [%b], localRandom = [%f] serverPercent = [%f] monkeyMode[%b]", java.lang.Boolean.valueOf(z18), java.lang.Double.valueOf(nextDouble), java.lang.Double.valueOf(d17), java.lang.Boolean.valueOf(z17));
                if (z18) {
                    synchronized (tVar) {
                        tVar.c(qualitySessionRuntime2, appBrandSysConfigWC2.Y.H, com.tencent.mm.plugin.appbrand.report.quality.p.Full, false);
                    }
                }
            }
        });
    }

    public static void d(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, long j17, java.lang.String str2, int i17, long j18, int i18, cl.k1 k1Var) {
        e(yVar, str, j17, str2, i17, j18, i18, k1Var, str.endsWith("app-service.js") || "game.js".equals(str));
    }

    public static void e(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, long j17, java.lang.String str2, int i17, long j18, int i18, cl.k1 k1Var, boolean z17) {
        int i19;
        int i27;
        java.lang.String appId = yVar.getAppId();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = b(appId, true);
        if (b17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] onUserScriptInject appId = [%s] session.runtime.hashCode = [%d] runtimeHashCode = [%d] name = [%s].", appId, java.lang.Integer.valueOf(b17.f88144p.hashCode()), java.lang.Integer.valueOf(i18), str);
        if (i18 != b17.f88144p.hashCode()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandQualitySystem", "[QualitySystem] onUserScriptInject runtime hashCode mismatch");
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityJSInjectStruct weAppQualityJSInjectStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityJSInjectStruct();
        weAppQualityJSInjectStruct.f62498e = weAppQualityJSInjectStruct.b("AppId", b17.f88135e, true);
        weAppQualityJSInjectStruct.f62497d = weAppQualityJSInjectStruct.b("InstanceId", b17.f88134d, true);
        weAppQualityJSInjectStruct.f62500g = b17.f88136f;
        weAppQualityJSInjectStruct.f62501h = b17.f88137g;
        weAppQualityJSInjectStruct.f62499f = b17.f88139i;
        weAppQualityJSInjectStruct.f62503j = b17.f88138h;
        weAppQualityJSInjectStruct.f62504k = j18;
        long i28 = weAppQualityJSInjectStruct.i();
        weAppQualityJSInjectStruct.f62505l = i28;
        weAppQualityJSInjectStruct.f62502i = i28 - weAppQualityJSInjectStruct.f62504k;
        weAppQualityJSInjectStruct.f62506m = j17;
        weAppQualityJSInjectStruct.f62507n = weAppQualityJSInjectStruct.b(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str, true);
        com.tencent.mm.plugin.appbrand.report.j0 a17 = com.tencent.mm.plugin.appbrand.report.j0.a(yVar.getF147808e());
        boolean z18 = false;
        switch (a17) {
            case X5:
                i19 = 1;
                break;
            case MMV8:
                i19 = 2;
                break;
            case WebViewBased:
                i19 = 3;
                break;
            case NativeScript:
                i19 = 4;
                break;
            case NodeJS:
                i19 = 6;
                break;
            case J2V8:
                i19 = 5;
                break;
            case WebViewX5:
                i19 = 102;
                break;
            case WebViewXW:
                i19 = 103;
                break;
            case WebViewSystem:
                i19 = 104;
                break;
            default:
                i19 = 0;
                break;
        }
        weAppQualityJSInjectStruct.f62508o = i19;
        weAppQualityJSInjectStruct.f62509p = (k1Var == null || (i27 = k1Var.codeCacheStatus) < 0 || i27 >= 7) ? 4L : com.tencent.mm.plugin.appbrand.jsruntime.l0.f84003t0[i27];
        if (yVar instanceof com.tencent.mm.plugin.appbrand.service.c0) {
            z18 = ((com.tencent.mm.plugin.appbrand.service.c0) yVar).X1();
        } else if (yVar instanceof com.tencent.mm.plugin.appbrand.page.n7) {
            z18 = ((com.tencent.mm.plugin.appbrand.page.n7) yVar).U1().X1();
        }
        weAppQualityJSInjectStruct.f62510q = z18 ? 1L : 0L;
        weAppQualityJSInjectStruct.f62511r = k1Var != null ? k1Var.flatJSCompileCost : 0L;
        if (u46.a.b(com.tencent.mm.plugin.appbrand.report.j0.f87883m, a17)) {
            weAppQualityJSInjectStruct.f62512s = weAppQualityJSInjectStruct.b("engineVersion", com.eclipsesource.mmv8.V8.getV8Version(), true);
        } else if (yVar.getF147808e() instanceof com.tencent.mm.plugin.appbrand.page.fb) {
            weAppQualityJSInjectStruct.f62512s = weAppQualityJSInjectStruct.b("engineVersion", f88172a.d() + "", true);
        }
        weAppQualityJSInjectStruct.f62513t = weAppQualityJSInjectStruct.b("pluginAppid", str2, true);
        weAppQualityJSInjectStruct.f62514u = weAppQualityJSInjectStruct.b("pluginVersion", java.lang.String.valueOf(i17), true);
        weAppQualityJSInjectStruct.k();
        if (yVar instanceof com.tencent.mm.plugin.appbrand.e9) {
            od1.c cVar = new od1.c();
            cVar.f344602a = "evaluateJavaScript";
            cVar.f344603b = weAppQualityJSInjectStruct.f62504k;
            cVar.f344604c = weAppQualityJSInjectStruct.f62505l;
            cVar.b(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, weAppQualityJSInjectStruct.f62507n);
            cVar.b("size", java.lang.Long.valueOf(weAppQualityJSInjectStruct.f62506m));
            cVar.a((com.tencent.mm.plugin.appbrand.e9) yVar);
        }
        com.tencent.mm.plugin.appbrand.report.quality.h hVar = b17.f88153y;
        if (hVar.f88198a || !z17) {
            return;
        }
        hVar.f88198a = true;
        b17.f88148t = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.o6 o6Var = b17.f88144p;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct weAppQualityLaunchJSStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityLaunchJSStruct();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b18 = b(appId, true);
        if (b18 == null) {
            return;
        }
        weAppQualityLaunchJSStruct.f62516e = weAppQualityLaunchJSStruct.b("AppId", b18.f88135e, true);
        weAppQualityLaunchJSStruct.f62515d = weAppQualityLaunchJSStruct.b("InstanceId", b18.f88134d, true);
        int i29 = b18.f88136f;
        weAppQualityLaunchJSStruct.f62518g = i29 != 1 ? i29 != 2 ? i29 != 3 ? null : cm.x.demo : cm.x.debug : cm.x.release;
        weAppQualityLaunchJSStruct.f62519h = b18.f88137g;
        weAppQualityLaunchJSStruct.f62517f = b18.f88139i;
        weAppQualityLaunchJSStruct.f62521j = b18.f88138h;
        weAppQualityLaunchJSStruct.f62522k = b18.f88145q;
        long i37 = weAppQualityLaunchJSStruct.i();
        weAppQualityLaunchJSStruct.f62523l = i37;
        weAppQualityLaunchJSStruct.f62520i = i37 - b18.f88145q;
        weAppQualityLaunchJSStruct.f62524m = weAppQualityLaunchJSStruct.b(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, fp.s0.a(o6Var.t0()), true);
        weAppQualityLaunchJSStruct.f62525n = o6Var.f86180m2 ? 1L : 0L;
        if (b18.f88151w != null) {
            weAppQualityLaunchJSStruct.f62526o = b18.f88151w.a() ? 1L : 0L;
        } else {
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        weAppQualityLaunchJSStruct.f62527p = b18.a();
        weAppQualityLaunchJSStruct.f62528q = weAppQualityLaunchJSStruct.b("networkType", com.tencent.mm.plugin.appbrand.report.q2.b(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
        weAppQualityLaunchJSStruct.f62529r = b18.H;
        weAppQualityLaunchJSStruct.f62530s = b18.b();
        weAppQualityLaunchJSStruct.f62531t = ((com.tencent.mm.plugin.appbrand.page.u5) o6Var.b(com.tencent.mm.plugin.appbrand.page.u5.class)).a() ? 1L : 2L;
        weAppQualityLaunchJSStruct.k();
        com.tencent.mm.plugin.appbrand.performance.m.f(appId, "StartupToJsInject", weAppQualityLaunchJSStruct.f62522k, weAppQualityLaunchJSStruct.f62523l, null);
    }

    public static void f(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        g(o6Var, false, 0L);
    }

    public static void g(com.tencent.mm.plugin.appbrand.o6 o6Var, boolean z17, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashShowAdStateStruct weAppQualitySplashShowAdStateStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySplashShowAdStateStruct();
        weAppQualitySplashShowAdStateStruct.f62704d = weAppQualitySplashShowAdStateStruct.b("AppId", o6Var.f74803n, true);
        weAppQualitySplashShowAdStateStruct.f62705e = weAppQualitySplashShowAdStateStruct.b("InstanceId", o6Var.u0().f47277w, true);
        weAppQualitySplashShowAdStateStruct.f62706f = o6Var.u0().f47284z + 1000;
        weAppQualitySplashShowAdStateStruct.f62708h = java.lang.System.currentTimeMillis();
        weAppQualitySplashShowAdStateStruct.f62709i = o6Var.A2 != null ? r1.f289528e : 9;
        weAppQualitySplashShowAdStateStruct.f62710j = z17 ? 1L : 0L;
        weAppQualitySplashShowAdStateStruct.f62711k = j17;
        if (i81.a0.a(o6Var) != null) {
            weAppQualitySplashShowAdStateStruct.f62707g = r4.f289582z;
            weAppQualitySplashShowAdStateStruct.f62712l = r4.f289576t;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "reportSplashAdShowAdState, instanceId: %s, showAdState: %d, appOpenMode: %d, preloadStatus: %d, isExitMidway: %b", weAppQualitySplashShowAdStateStruct.f62705e, java.lang.Long.valueOf(weAppQualitySplashShowAdStateStruct.f62709i), java.lang.Long.valueOf(weAppQualitySplashShowAdStateStruct.f62707g), java.lang.Long.valueOf(weAppQualitySplashShowAdStateStruct.f62712l), java.lang.Boolean.valueOf(z17));
        weAppQualitySplashShowAdStateStruct.k();
    }

    public static void h(long j17, long j18, long j19) {
        if (j19 < j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 1L, 1L);
            return;
        }
        if (j19 < 2 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 2L, 1L);
            return;
        }
        if (j19 < 3 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 3L, 1L);
            return;
        }
        if (j19 < 4 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 4L, 1L);
            return;
        }
        if (j19 < 5 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 5L, 1L);
            return;
        }
        if (j19 < 6 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 6L, 1L);
            return;
        }
        if (j19 < 7 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 7L, 1L);
            return;
        }
        if (j19 < 8 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 8L, 1L);
            return;
        }
        if (j19 < 9 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 9L, 1L);
        } else if (j19 < 10 * j18) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 10L, 1L);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, 11L, 1L);
        }
    }

    public static void i(final com.tencent.mm.plugin.appbrand.o6 o6Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] startSession appId = [%s] runtime.hashCode = [%d]", o6Var.f74803n, java.lang.Integer.valueOf(o6Var.hashCode()));
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = o6Var.u0().f77298k2;
        if (qualitySession == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandQualitySystem", "startSession with NULL qualityReportSession in InitConfig");
            qualitySession = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession(com.tencent.mm.plugin.appbrand.utils.t.a(o6Var.u0().f47279x0), o6Var.u0(), o6Var.l2(), 0L);
            o6Var.u0().f77298k2 = qualitySession;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        obtain.setDataPosition(0);
        qualitySession.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime = new com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime(obtain);
        obtain.recycle();
        qualitySessionRuntime.f88144p = o6Var;
        qualitySessionRuntime.A = o6Var.q2();
        qualitySessionRuntime.f88146r = java.lang.System.currentTimeMillis();
        qualitySessionRuntime.f88145q = o6Var.u0().I;
        double d17 = o6Var.u0().K;
        qualitySessionRuntime.F = o6Var.u0().Y1;
        com.tencent.mm.plugin.appbrand.report.quality.d dVar = f88174c;
        java.lang.String instanceId = qualitySessionRuntime.f88134d;
        dVar.getClass();
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFlagsStruct weAppQualityFlagsStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityFlagsStruct();
        weAppQualityFlagsStruct.f62494e = weAppQualityFlagsStruct.b("flags", com.tencent.mm.plugin.appbrand.report.quality.d.f88159a.a(), true);
        weAppQualityFlagsStruct.f62493d = weAppQualityFlagsStruct.b("instanceId", instanceId, true);
        weAppQualityFlagsStruct.k();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.report.quality.f(qualitySessionRuntime));
        if (1 == o6Var.u0().f47275u) {
            qualitySessionRuntime.H = 2L;
        } else {
            qualitySessionRuntime.H = o6Var.u0().f77296i2 ? 0L : 1L;
        }
        java.util.HashMap hashMap = f88173b;
        synchronized (hashMap) {
            hashMap.put(qualitySessionRuntime.f88135e, qualitySessionRuntime);
        }
        o6Var.f74794J.add(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.quality.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17;
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = com.tencent.mm.plugin.appbrand.o6.this;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandQualitySystem", "[QualitySystem] closeSession appId = [%s] runtime.hashCode = [%d]", o6Var2.f74803n, java.lang.Integer.valueOf(o6Var2.hashCode()));
                java.lang.String str = o6Var2.f74803n;
                if (android.text.TextUtils.isEmpty(str) || (b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(str, false)) == null || b17.f88144p != o6Var2) {
                    return;
                }
                com.tencent.mm.plugin.appbrand.report.quality.t tVar = b17.f88154z;
                synchronized (tVar) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "dl: destroyed");
                    tVar.f88308h = null;
                    android.os.Handler handler = tVar.f88301a;
                    if (handler != null) {
                        handler.removeCallbacks(tVar.f88302b);
                        tVar.f88301a = null;
                    }
                    com.tencent.mm.plugin.appbrand.performance.t tVar2 = tVar.f88311k;
                    if (tVar2 != null) {
                        tVar2.b();
                        tVar.f88311k = null;
                    }
                    if (tVar.f88310j) {
                        tVar.f88310j = false;
                    }
                }
                java.util.HashMap hashMap2 = com.tencent.mm.plugin.appbrand.report.quality.e.f88173b;
                synchronized (hashMap2) {
                    hashMap2.put(str, null);
                }
            }
        });
    }
}
