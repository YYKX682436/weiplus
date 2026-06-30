package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes4.dex */
public final class v9 implements com.tencent.mm.plugin.appbrand.appcache.y9 {
    public v9(com.tencent.mm.plugin.appbrand.appcache.t9 t9Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        if (map.get(".sysmsg.mmbizwxaconfig") == null) {
            return true;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.mmbizwxaconfig.command"), -1);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.mmbizwxaconfig.type"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.mmbizwxaconfig.appid");
        int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.mmbizwxaconfig.configversion"), 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle common config, command = %d, type = %d, appid = %s, configversion = %d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), str2, java.lang.Integer.valueOf(P3));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.yy6 yy6Var = new r45.yy6();
        yy6Var.f391514e = P3;
        yy6Var.f391513d = P2;
        linkedList.add(yy6Var);
        k91.r1.b(str2, linkedList, false);
        k91.r1.a(str2, P2, P, new com.tencent.mm.plugin.appbrand.appcache.u9(this, str2, P2), true);
        return true;
    }
}
