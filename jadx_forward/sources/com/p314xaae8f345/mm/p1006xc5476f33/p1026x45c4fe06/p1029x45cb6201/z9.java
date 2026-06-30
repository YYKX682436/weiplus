package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class z9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9 {
    public z9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t9 t9Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        if (map.get(".sysmsg.AppPublicLibraryNotify") == null) {
            return true;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.Version"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.MD5");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.URL");
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.AppPublicLibraryNotify.ForceUpdate"), 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || P <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, invalid params: url = %s, md5 = %s, version = %d", str3, str2, java.lang.Integer.valueOf(P));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle library notify, version = %d, md5 = %s, url = %s, forceUpdate = %d", java.lang.Integer.valueOf(P), str2, str3, java.lang.Integer.valueOf(P2));
        r45.fc7 fc7Var = new r45.fc7();
        fc7Var.f455745f = P;
        fc7Var.f455744e = str2;
        fc7Var.f455743d = str3;
        fc7Var.f455748i = 1;
        fc7Var.f455747h = P2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5.Bi().wi(-1, fc7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.h8.NewXml, null);
        return true;
    }
}
