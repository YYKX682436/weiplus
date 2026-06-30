package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class z9 implements com.tencent.mm.plugin.appbrand.appcache.y9 {
    public z9(com.tencent.mm.plugin.appbrand.appcache.t9 t9Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        if (map.get(".sysmsg.AppPublicLibraryNotify") == null) {
            return true;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.Version"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.MD5");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.URL");
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.ForceUpdate"), 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || P <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, invalid params: url = %s, md5 = %s, version = %d", str3, str2, java.lang.Integer.valueOf(P));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, version = %d, md5 = %s, url = %s, forceUpdate = %d", java.lang.Integer.valueOf(P), str2, str3, java.lang.Integer.valueOf(P2));
        r45.fc7 fc7Var = new r45.fc7();
        fc7Var.f374212f = P;
        fc7Var.f374211e = str2;
        fc7Var.f374210d = str3;
        fc7Var.f374215i = 1;
        fc7Var.f374214h = P2;
        com.tencent.mm.plugin.appbrand.appcache.e5.Bi().wi(-1, fc7Var, com.tencent.mm.plugin.appbrand.appcache.h8.NewXml, null);
        return true;
    }
}
