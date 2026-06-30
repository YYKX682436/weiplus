package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class r8 implements com.tencent.mm.plugin.appbrand.launching.z5, com.tencent.mm.plugin.appbrand.launching.y5, com.tencent.mm.plugin.appbrand.launching.b7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85106d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85107e;

    /* renamed from: f, reason: collision with root package name */
    public final int f85108f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f85109g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f85110h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo f85111i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f85112m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.y50 f85113n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f85114o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f85115p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f85116q;

    public r8(java.lang.String appId, int i17, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo versionInfo, com.tencent.mm.plugin.appbrand.report.quality.QualitySession reportQualitySession, r45.y50 cgiCommRequestSource) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(versionInfo, "versionInfo");
        kotlin.jvm.internal.o.g(reportQualitySession, "reportQualitySession");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f85106d = appId;
        this.f85107e = i17;
        this.f85108f = i18;
        this.f85109g = str;
        this.f85110h = str2;
        this.f85111i = versionInfo;
        this.f85112m = reportQualitySession;
        this.f85113n = cgiCommRequestSource;
        this.f85114o = true;
    }

    public final void a() {
        int i17 = this.f85107e;
        b(i17 == 1 ? com.tencent.mm.plugin.appbrand.utils.s0.b(com.tencent.mm.R.string.f490189ne, new java.lang.Object[0]) : com.tencent.mm.plugin.appbrand.utils.s0.b(com.tencent.mm.R.string.f490251pb, com.tencent.mm.plugin.appbrand.appcache.p.a(i17)));
    }

    public void b(java.lang.String str) {
        if (this.f85114o) {
            com.tencent.mm.plugin.appbrand.launching.ib.b(str, this);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "silent toast:error=" + str + ", stack=" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.LinkedList] */
    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        ?? d17;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo;
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo a17;
        int i17 = this.f85107e;
        boolean a18 = com.tencent.mm.plugin.appbrand.appcache.g0.a(i17);
        java.lang.String str = this.f85106d;
        if (a18 && this.f85111i.f77444d != 0) {
            java.lang.String y07 = ((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).y0(str, i17);
            if (y07 == null || (a17 = k91.x5.a(y07)) == null) {
                a();
                com.tencent.mars.xlog.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "call() parse extInfoJson failed with appId[" + str + "] versionType[" + i17 + ']');
                return null;
            }
            this.f85111i = a17;
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo();
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = this.f85111i;
        wxaPkgWrappingInfo.pkgVersion = wxaAttributes$WxaVersionInfo.f77444d;
        wxaPkgWrappingInfo.f75399d = i17;
        wxaPkgWrappingInfo.f75372md5 = wxaAttributes$WxaVersionInfo.f77447g;
        wxaPkgWrappingInfo.f75404i = new com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap();
        com.tencent.mm.plugin.appbrand.launching.g8 g8Var = com.tencent.mm.plugin.appbrand.launching.g8.f84628a;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo2 = this.f85111i;
        java.util.Map b17 = g8Var.b(wxaAttributes$WxaVersionInfo2, str, g8Var.a(str, i17, wxaAttributes$WxaVersionInfo2.f77444d));
        for (java.util.Map.Entry entry : ((android.util.ArrayMap) b17).entrySet()) {
            kotlin.jvm.internal.o.g(entry, "<this>");
            java.lang.String moduleName = (java.lang.String) entry.getKey();
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo) entry.getValue();
            if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME, moduleName)) {
                java.util.LinkedList linkedList = wxaPkgWrappingInfo.f75402g;
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo();
                java.util.List moduleList = this.f85111i.f77452o;
                kotlin.jvm.internal.o.f(moduleList, "moduleList");
                java.util.Iterator it = moduleList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(moduleName, ((com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) obj).f77464d)) {
                        break;
                    }
                }
                kotlin.jvm.internal.o.d(obj);
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo2 = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) obj;
                modulePkgInfo.name = moduleName;
                modulePkgInfo.f75372md5 = wxaAttributes$WxaWidgetInfo.f77475e;
                modulePkgInfo.independent = wxaAttributes$WxaVersionModuleInfo2.f77466f;
                modulePkgInfo.aliases = wxaAttributes$WxaVersionModuleInfo2.f77468h;
                modulePkgInfo.pkgVersion = this.f85111i.f77444d;
                linkedList.add(modulePkgInfo);
            }
            java.util.List list = wxaAttributes$WxaWidgetInfo.f77477g;
            if (!(list == null || list.isEmpty())) {
                com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f75404i;
                kotlin.jvm.internal.o.d(wxaRuntimeModulePluginListMap);
                java.util.List b18 = com.tencent.mm.plugin.appbrand.launching.r4.b(wxaAttributes$WxaWidgetInfo.f77477g);
                kotlin.jvm.internal.o.g(moduleName, "moduleName");
                if (b18 != null && !b18.isEmpty()) {
                    wxaRuntimeModulePluginListMap.f75406d.put(new com.tencent.mm.plugin.appbrand.appcache.kb(moduleName), b18);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap2 = wxaPkgWrappingInfo.f75404i;
        if (wxaRuntimeModulePluginListMap2 != null) {
            wxaRuntimeModulePluginListMap2.e();
        }
        boolean a19 = k91.l3.a(this.f85108f);
        java.lang.String str2 = this.f85109g;
        if (a19) {
            if (str2 != null && str2.startsWith("__wx__")) {
                return wxaPkgWrappingInfo;
            }
        }
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo3 = this.f85111i;
        if (!wxaAttributes$WxaVersionInfo3.f77453p || com.tencent.mm.sdk.platformtools.t8.L0(wxaAttributes$WxaVersionInfo3.f77452o)) {
            d17 = kz5.c0.d(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME);
        } else {
            d17 = new java.util.LinkedList();
            java.lang.String a27 = nf.z.a(com.tencent.mm.plugin.appbrand.appstorage.l1.i(str2));
            if (a27 == null || a27.length() == 0) {
                java.lang.String str3 = this.f85110h;
                if (str3 == null || str3.length() == 0) {
                    str3 = this.f85111i.f77454q;
                }
                java.lang.String str4 = str3;
                if (str4 == null || str4.length() == 0) {
                    wxaAttributes$WxaVersionModuleInfo = null;
                } else {
                    java.util.List moduleList2 = this.f85111i.f77452o;
                    kotlin.jvm.internal.o.f(moduleList2, "moduleList");
                    wxaAttributes$WxaVersionModuleInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) ph1.i0.b(moduleList2, str4, "LaunchCheckPkgHandlerSeparatedPluginsCompatible for module appId:" + str + " versionType:" + i17, false, 4, null);
                }
            } else {
                java.util.List moduleList3 = this.f85111i.f77452o;
                kotlin.jvm.internal.o.f(moduleList3, "moduleList");
                wxaAttributes$WxaVersionModuleInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) ph1.i0.b(moduleList3, a27, "LaunchCheckPkgHandlerSeparatedPluginsCompatible for path appId:" + str + " versionType:" + i17, false, 4, null);
            }
            if (wxaAttributes$WxaVersionModuleInfo != null) {
                d17.add(wxaAttributes$WxaVersionModuleInfo.f77464d);
            }
            if (!kotlin.jvm.internal.o.b(wxaAttributes$WxaVersionModuleInfo != null ? wxaAttributes$WxaVersionModuleInfo.f77464d : null, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME)) {
                if (!(wxaAttributes$WxaVersionModuleInfo != null && wxaAttributes$WxaVersionModuleInfo.f77466f)) {
                    d17.add(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME);
                }
            }
        }
        java.util.List list2 = d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "call() appId:" + str + ", versionType:" + i17 + ", will request (" + u46.l.h(list2, ",") + ") for path:" + str2);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible[");
        sb6.append(str);
        sb6.append('|');
        sb6.append(i17);
        sb6.append(']');
        pm0.v.M(sb6.toString(), false, new com.tencent.mm.plugin.appbrand.launching.l8(this, list2, b17, wxaPkgWrappingInfo, atomicReference, countDownLatch), 2, null);
        try {
            countDownLatch.await();
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchCheckPkgHandlerSeparatedPluginsCompatible", "await semaphore failed with appId(" + str + ") versionType(" + i17 + ')');
        }
        return (com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo) atomicReference.get();
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.b7
    public boolean d() {
        return this.f85114o;
    }
}
