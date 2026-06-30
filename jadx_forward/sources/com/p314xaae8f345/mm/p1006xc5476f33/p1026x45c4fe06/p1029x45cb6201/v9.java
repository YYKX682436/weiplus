package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public final class v9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9 {
    public v9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t9 t9Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        if (map.get(".sysmsg.mmbizwxaconfig") == null) {
            return true;
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.mmbizwxaconfig.command"), -1);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.mmbizwxaconfig.type"), 0);
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.mmbizwxaconfig.appid");
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".sysmsg.mmbizwxaconfig.configversion"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle common config, command = %d, type = %d, appid = %s, configversion = %d", java.lang.Integer.valueOf(P), java.lang.Integer.valueOf(P2), str2, java.lang.Integer.valueOf(P3));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.yy6 yy6Var = new r45.yy6();
        yy6Var.f473047e = P3;
        yy6Var.f473046d = P2;
        linkedList.add(yy6Var);
        k91.r1.b(str2, linkedList, false);
        k91.r1.a(str2, P2, P, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u9(this, str2, P2), true);
        return true;
    }
}
