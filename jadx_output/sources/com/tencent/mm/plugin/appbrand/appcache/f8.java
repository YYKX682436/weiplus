package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public enum f8 {
    ;

    public static void a(final boolean z17, final java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.f8$$a
            @Override // java.lang.Runnable
            public final void run() {
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibVersionChecker", "cgiCheckUpdate, force true");
                    com.tencent.mm.plugin.appbrand.appcache.f8.d(false);
                }
                boolean a17 = gm0.j1.a();
                final java.lang.Runnable runnable2 = runnable;
                if (!a17 || gm0.m.r()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibVersionChecker", "check MMCore null, skip");
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                java.lang.Long l17 = (java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, 0L);
                long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
                com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibVersionChecker", "check, nextSec = %d, nowSec = %d", l17, java.lang.Long.valueOf(i17));
                if (i17 < l17.longValue()) {
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                final r45.ec7 ec7Var = new r45.ec7();
                com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord e17 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.e(true);
                ec7Var.f373278d = e17 != null ? e17.f75377d : com.tencent.mm.plugin.appbrand.appcache.w8.f76026a;
                lVar.f70664a = ec7Var;
                lVar.f70665b = new r45.fc7();
                lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getpubliclibinfo";
                lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.file.e2.CTRL_INDEX;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 0);
                pq5.g l18 = new com.tencent.mm.plugin.appbrand.appcache.g8(lVar).l();
                l18.I(gm0.j1.b().f273245h);
                l18.i(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.f8$$b
                    @Override // gm5.a
                    public final java.lang.Object call(java.lang.Object obj) {
                        r45.ec7 ec7Var2 = ec7Var;
                        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
                        if (fVar == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibVersionChecker", "respWrap is null");
                            return -1;
                        }
                        int i18 = fVar.f70615a;
                        int i19 = fVar.f70616b;
                        java.lang.String str = fVar.f70617c;
                        r45.fc7 fc7Var = (r45.fc7) fVar.f70618d;
                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                        g0Var.idkeyStat(368L, 40L, 1L, false);
                        if (gm0.j1.a()) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1() + 86400));
                        }
                        java.lang.Runnable runnable3 = runnable2;
                        if (i18 != 0 || i19 != 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibVersionChecker", "onResp, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                            g0Var.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 2);
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                            return 0;
                        }
                        g0Var.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 1);
                        try {
                            com.tencent.mm.plugin.appbrand.appcache.e5.Bi().wi(ec7Var2.f373278d, fc7Var, com.tencent.mm.plugin.appbrand.appcache.h8.CGI, runnable3);
                        } catch (java.lang.RuntimeException e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.WxaCommLibVersionChecker", "onResp, e %s", e18);
                        }
                        if (fc7Var != null) {
                            com.tencent.mm.plugin.appbrand.appcache.o8.f75709a.d(fc7Var.f374217n, "CommLibVersionChecker");
                        }
                        return 0;
                    }
                }).B();
            }
        }, "WxaCommLibVersionChecker");
    }

    public static void d(boolean z17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_PUBLIC_LIB_UPDATE_NEXT_TIME_SEC_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1() - 1));
        if (z17) {
            gm0.j1.u().c().i(true);
        }
    }

    public static com.tencent.mm.plugin.appbrand.appcache.f8 valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.appcache.f8.class, str));
        return null;
    }
}
