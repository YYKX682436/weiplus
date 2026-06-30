package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f84289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f84290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m f84291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84292g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kotlinx.coroutines.f1 f1Var, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84290e = f1Var;
        this.f84291f = mVar;
        this.f84292g = wAMagicBrushFrameLaunchParams;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.i(this.f84290e, this.f84291f, this.f84292g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.util.List c17;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f84289d;
        kotlinx.coroutines.f1 f1Var = this.f84290e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((kotlinx.coroutines.c3) f1Var).start();
            this.f84289d = 1;
            if (f1Var.k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.c cVar = (com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.c) this.f84291f.a();
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.i0 version = (com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.i0) f1Var.f();
        java.lang.String str3 = this.f84292g.f84246h;
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = (com.tencent.mm.plugin.appbrand.report.quality.QualitySession) cVar.f336915a.b(cVar, ng1.c.f336914c[0]);
        r45.y50 getUrlCgiCommRequestSource = (r45.y50) ((jz5.n) cVar.f84264g).getValue();
        kotlin.jvm.internal.o.g(version, "version");
        kotlin.jvm.internal.o.g(getUrlCgiCommRequestSource, "getUrlCgiCommRequestSource");
        this.f84289d = 2;
        boolean z17 = str3 == null || str3.length() == 0;
        java.lang.String str4 = version.f253286a;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo = version.f253288c;
        if (z17) {
            c17 = kz5.b0.c(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME);
            str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME;
            str2 = "moduleList";
        } else {
            java.util.List moduleList = wxaAttributes$WxaVersionInfo.f77452o;
            kotlin.jvm.internal.o.f(moduleList, "moduleList");
            str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME;
            str2 = "moduleList";
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) ph1.i0.b(moduleList, str3, "WAMagicBrushFrameLaunchPkgFetcher for appId:" + str4, false, 4, null);
            java.lang.String str5 = wxaAttributes$WxaVersionModuleInfo != null ? wxaAttributes$WxaVersionModuleInfo.f77464d : null;
            if (str5 == null) {
                str5 = str;
            }
            c17 = kz5.b0.c(str5);
        }
        java.util.Map b17 = com.tencent.mm.plugin.appbrand.launching.g8.f84628a.b(wxaAttributes$WxaVersionInfo, str4, true);
        ng1.t tVar = new ng1.t(version, version.f253287b, wxaAttributes$WxaVersionInfo);
        java.util.Iterator it = ((android.util.ArrayMap) b17).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            wxaPkgWrappingInfo = tVar.f336949a;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String moduleName = (java.lang.String) entry.getKey();
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo wxaAttributes$WxaWidgetInfo = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaWidgetInfo) entry.getValue();
            boolean b18 = kotlin.jvm.internal.o.b(str, moduleName);
            com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo wxaAttributes$WxaVersionInfo2 = tVar.f336950b;
            if (b18) {
                wxaPkgWrappingInfo.f75372md5 = wxaAttributes$WxaWidgetInfo.f77475e;
                wxaPkgWrappingInfo.independent = true;
                wxaPkgWrappingInfo.pkgVersion = wxaAttributes$WxaVersionInfo2.f77444d;
            } else {
                java.util.LinkedList linkedList = wxaPkgWrappingInfo.f75402g;
                com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo modulePkgInfo = new com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo();
                java.util.List list = wxaAttributes$WxaVersionInfo2.f77452o;
                kotlin.jvm.internal.o.f(list, str2);
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (kotlin.jvm.internal.o.b(moduleName, ((com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) obj2).f77464d)) {
                        break;
                    }
                }
                kotlin.jvm.internal.o.d(obj2);
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo wxaAttributes$WxaVersionModuleInfo2 = (com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionModuleInfo) obj2;
                modulePkgInfo.name = moduleName;
                modulePkgInfo.f75372md5 = wxaAttributes$WxaWidgetInfo.f77475e;
                modulePkgInfo.independent = wxaAttributes$WxaVersionModuleInfo2.f77466f;
                modulePkgInfo.aliases = wxaAttributes$WxaVersionModuleInfo2.f77468h;
                modulePkgInfo.pkgVersion = wxaAttributes$WxaVersionInfo2.f77444d;
                linkedList.add(modulePkgInfo);
            }
            java.util.List list2 = wxaAttributes$WxaWidgetInfo.f77477g;
            if (!(list2 == null || list2.isEmpty())) {
                com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap = wxaPkgWrappingInfo.f75404i;
                kotlin.jvm.internal.o.d(wxaRuntimeModulePluginListMap);
                java.util.List b19 = com.tencent.mm.plugin.appbrand.launching.r4.b(wxaAttributes$WxaWidgetInfo.f77477g);
                kotlin.jvm.internal.o.g(moduleName, "moduleName");
                if (b19 != null && !b19.isEmpty()) {
                    wxaRuntimeModulePluginListMap.f75406d.put(new com.tencent.mm.plugin.appbrand.appcache.kb(moduleName), b19);
                }
            }
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap wxaRuntimeModulePluginListMap2 = wxaPkgWrappingInfo.f75404i;
        if (wxaRuntimeModulePluginListMap2 != null) {
            wxaRuntimeModulePluginListMap2.e();
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        com.tencent.mm.plugin.appbrand.launching.u3.f85212a.a(version.f253286a, version.f253288c, version.f253287b, c17, b17, qualitySession, new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.a0(tVar, rVar), com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.b0.f84260d, (r34 & 256) != 0 ? com.tencent.mm.plugin.appbrand.launching.p3.f84887d : new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.c0(rVar), false, getUrlCgiCommRequestSource, (r34 & 2048) != 0 ? null : null, (r34 & 4096) != 0 ? null : null, (r34 & 8192) != 0 ? null : null, (r34 & 16384) != 0 ? null : null);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar2 = pz5.a.f359186d;
        return j17 == aVar ? aVar : j17;
    }
}
