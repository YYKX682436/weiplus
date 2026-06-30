package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final /* synthetic */ class u$$a implements com.tencent.mm.plugin.appbrand.appcache.w {
    public final pq5.g a(com.tencent.mm.plugin.appbrand.appcache.u cgi) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.launching.x5 x5Var = com.tencent.mm.plugin.appbrand.launching.x5.f85410a;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        int i17 = com.tencent.mm.plugin.appbrand.launching.s5.f85140a;
        com.tencent.mm.plugin.appbrand.launching.r5 r5Var = com.tencent.mm.plugin.appbrand.launching.r5.f85103b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
        r45.os3 D = cgi.D();
        kotlin.jvm.internal.o.f(D, "getRequest(...)");
        sb6.append(com.tencent.mm.plugin.appbrand.launching.x5.f(D));
        sb6.append(" intercepted");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb6.toString());
        r45.jf jfVar = new r45.jf();
        java.util.LinkedList linkedList = jfVar.f377775d;
        linkedList.add(com.tencent.mm.plugin.appbrand.launching.x5.g(cgi));
        r45.le3 g17 = com.tencent.mm.plugin.appbrand.launching.x5.g(cgi);
        g17.f379372i = true;
        linkedList.add(g17);
        int i18 = cgi.D().f382494u;
        jfVar.f377776e = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", "CgiBatchGetPkgDownloadInfo scene:%d", java.lang.Integer.valueOf(i18));
        if (cgi.D().f382485i > 0) {
            com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
            java.lang.String str3 = cgi.D().f382481e;
            java.lang.String str4 = cgi.D().f382486m;
            int i19 = cgi.D().f382484h;
            java.lang.String str5 = "";
            if (i19 == 0) {
                str = "";
            } else if (i19 == 6) {
                str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.PLUGIN_CODE;
            } else if (i19 == 12) {
                str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_PLUGIN_CODE;
            } else if (i19 == 13) {
                str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str4) + "$__WITHOUT_PLUGINCODE__";
            } else if (i19 == 22) {
                str = com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MODULE_WITHOUT_MULTI_PLUGIN_CODE;
            } else if (i19 != 23) {
                str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str4);
            } else {
                str = com.tencent.mm.plugin.appbrand.appcache.a6.a(str4) + "$__WITHOUT_MULTI_PLUGINCODE__";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str3);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str5 = "$" + str;
                }
                sb7.append(str5);
                str2 = sb7.toString();
            } else {
                str2 = null;
            }
            com.tencent.mm.plugin.appbrand.appcache.n9 L = Di.L(str2, cgi.D().f382485i, 0, "pkgPath");
            java.lang.String str6 = L != null ? L.field_pkgPath : null;
            int f17 = com.tencent.mm.vfs.w6.j(str6) ? com.tencent.mm.plugin.appbrand.appcache.y8.f(str6) : -1;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
            r45.os3 D2 = cgi.D();
            kotlin.jvm.internal.o.f(D2, "getRequest(...)");
            sb8.append(com.tencent.mm.plugin.appbrand.launching.x5.f(D2));
            sb8.append(", intercepted, oldPkg.innerVersion=");
            sb8.append(f17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb8.toString());
            if (f17 == 0) {
                r45.le3 g18 = com.tencent.mm.plugin.appbrand.launching.x5.g(cgi);
                r45.jc4 jc4Var = new r45.jc4();
                g18.f379368e = jc4Var;
                jc4Var.f377698d = cgi.D().f382485i;
                linkedList.add(g18);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(697, 20);
            }
        }
        r45.y50 y50Var = new r45.y50();
        y50Var.f390799f = 1;
        jfVar.f377777f = y50Var;
        return new com.tencent.mm.plugin.appbrand.appcache.t(jfVar, null).l().h(new com.tencent.mm.plugin.appbrand.launching.w5(cgi));
    }
}
