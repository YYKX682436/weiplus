package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public abstract class z {
    public static void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 i0Var, boolean z17, java.lang.String str5) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "fetchBusinessAppInfoFromService businessType:%s, cacheKey:%s", str, str5);
        r45.p54 p54Var = new r45.p54();
        p54Var.f382769h = i17;
        p54Var.f382765d = str;
        p54Var.f382767f = str3;
        p54Var.f382768g = str4;
        p54Var.f382766e = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1268;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/launchbizwxaapp";
        lVar.f70664a = p54Var;
        lVar.f70665b = new r45.q54();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.appbrand.jsapi.fakenative.d0(i0Var, z17, str2, str5));
    }

    public static void b(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        c(o6Var, str, str2, str3, i17, null);
    }

    public static void c(final com.tencent.mm.plugin.appbrand.o6 o6Var, final java.lang.String str, java.lang.String str2, final java.lang.String str3, final int i17, final java.lang.Runnable runnable) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackApplication, refererAppId:%s, businessType:%s, errCode:%d", str, str3, java.lang.Integer.valueOf(i17));
        final java.lang.String str4 = o6Var == null ? null : o6Var.u0().f47276v;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "{}";
        }
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication$NavigateBackAppArgs(str, str2, str3, i17), com.tencent.mm.plugin.appbrand.jsapi.d8.class, new com.tencent.mm.ipcinvoker.r() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.z$$a
            @Override // com.tencent.mm.ipcinvoker.r
            public final void a(java.lang.Object obj) {
                com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
                final boolean z18 = iPCBoolean != null && iPCBoolean.f68400d;
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackApplication, refererAppId:%s, businessType:%s, errCode:%d, ok:%b", str, str3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18));
                final java.lang.String str5 = str4;
                if (u46.l.e(str5)) {
                    return;
                }
                final com.tencent.mm.plugin.appbrand.o6 o6Var2 = o6Var;
                java.util.Objects.requireNonNull(o6Var2);
                final java.lang.Runnable runnable2 = runnable;
                o6Var2.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.z$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String str6 = str5;
                        com.tencent.mm.plugin.appbrand.o6 o6Var3 = o6Var2;
                        boolean z19 = z18;
                        java.lang.Runnable runnable3 = runnable2;
                        if (u46.l.c(str6, o6Var3.u0().f47276v)) {
                            com.tencent.mm.plugin.appbrand.m6.a(o6Var3.f74803n).f85720m = z19;
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        }
                    }
                });
            }
        });
    }

    public static void d(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.jsapi.fakenative.h0 h0Var) {
        com.tencent.mm.plugin.appbrand.o6 o6Var2;
        com.tencent.mm.plugin.appbrand.wd wdVar;
        if (o6Var == null) {
            return;
        }
        int i17 = com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85717j;
        java.lang.String str = com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85716i;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, appId:%s, businessType:%s, launchScene:%s, reason:%s", o6Var.f74803n, str, java.lang.Integer.valueOf(i17), h0Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        if (i17 == 2) {
            if (com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85718k) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to H5, businessType:%s", str);
            e(str, null, -3);
            return;
        }
        if (i17 == 4) {
            if (com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85720m) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to Application, businessType:%s", str);
            if (o6Var.u0().D == null || com.tencent.mm.sdk.platformtools.t8.K0(o6Var.u0().D.f77323e)) {
                return;
            }
            b(o6Var, o6Var.u0().D.f77323e, null, str, -2);
            com.tencent.mm.plugin.appbrand.m6.a(o6Var.f74803n).f85720m = true;
            return;
        }
        if (i17 != 1 || com.tencent.mm.plugin.appbrand.m6.b(o6Var.f74803n).f85719l) {
            return;
        }
        if (com.tencent.mm.plugin.appbrand.jsapi.fakenative.h0.DetachFromStack == h0Var) {
            try {
                o6Var2 = (com.tencent.mm.plugin.appbrand.o6) o6Var.B0();
            } catch (java.lang.Error unused) {
                o6Var2 = (com.tencent.mm.plugin.appbrand.o6) o6Var.f74804o;
            }
            com.tencent.mm.plugin.appbrand.td tdVar = (o6Var2 == null || (wdVar = o6Var2.E1) == null) ? null : wdVar.f90960d;
            if (tdVar instanceof com.tencent.mm.plugin.appbrand.jsapi.fakenative.c) {
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.c cVar = (com.tencent.mm.plugin.appbrand.jsapi.fakenative.c) tdVar;
                if (cVar.f80942d == o6Var && cVar.f80943e && cVar.f80945g != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, ignore for sticky, host:%s, this:%s", o6Var2.f74803n, o6Var.f74803n);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to MiniProgram, businessType:%s", str);
        f(o6Var, str, -3, null);
    }

    public static void e(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackH5, businessType:%s, errCode:%d", str, java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            new com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$NavigateBackH5Task(str, str2, i17).d();
            return;
        }
        com.tencent.mm.autogen.events.NavigateBackH5Event navigateBackH5Event = new com.tencent.mm.autogen.events.NavigateBackH5Event();
        am.mk mkVar = navigateBackH5Event.f54515g;
        mkVar.getClass();
        mkVar.f7352a = i17;
        mkVar.f7353b = str2;
        navigateBackH5Event.e();
    }

    public static void f(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "navigateBackMiniProgram, businessType:%s, errCode:%d", str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent navigateBackMiniProgramEvent = new com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent();
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
        if (o6Var.g2() == 1038) {
            try {
                appBrandRuntime2 = appBrandRuntime.B0();
            } catch (java.lang.Error unused) {
                appBrandRuntime2 = appBrandRuntime.f74804o;
            }
            if (appBrandRuntime2 != null) {
                navigateBackMiniProgramEvent.f54516g.f7432d = appBrandRuntime2.f74803n;
            }
        } else {
            navigateBackMiniProgramEvent.f54516g.f7432d = o6Var.u0().D.f77323e;
        }
        am.nk nkVar = navigateBackMiniProgramEvent.f54516g;
        nkVar.f7429a = i17;
        nkVar.f7430b = str;
        nkVar.f7431c = str2;
        navigateBackMiniProgramEvent.e();
    }

    public static void g(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        if (o6Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = o6Var.u0().D;
        if (appBrandLaunchReferrer == null || com.tencent.mm.sdk.platformtools.t8.K0(appBrandLaunchReferrer.f77330o)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "recordOpenBusinessViewInfo, referrer businessType is null");
            return;
        }
        java.lang.String str = o6Var.f74803n;
        com.tencent.mm.plugin.appbrand.m6.a(str).f85717j = appBrandLaunchReferrer.f77322d;
        com.tencent.mm.plugin.appbrand.m6.a(str).f85716i = appBrandLaunchReferrer.f77330o;
        com.tencent.mm.plugin.appbrand.m6.a(str).f85718k = false;
        com.tencent.mm.plugin.appbrand.m6.a(str).f85720m = false;
        com.tencent.mm.plugin.appbrand.m6.a(str).f85719l = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "recordOpenBusinessViewInfo, app:%s, businessType:%s, launchScene:%s", str, appBrandLaunchReferrer.f77330o, java.lang.Integer.valueOf(appBrandLaunchReferrer.f77322d));
    }

    public static void h(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.appbrand.jsapi.fakenative.i0 i0Var) {
        java.lang.String str5 = str + "_" + i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo cacheKey:%s", str5);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(str5), com.tencent.mm.plugin.appbrand.jsapi.fakenative.f0.class, new com.tencent.mm.plugin.appbrand.jsapi.fakenative.a0(i17, str, str2, str3, str4, i0Var, str5));
    }
}
