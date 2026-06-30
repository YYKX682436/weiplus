package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class x9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9 {
    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fya);
    }

    public x9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.t9 t9Var) {
    }

    public final boolean a(java.lang.String str, java.util.Map map) {
        k91.v5 k17;
        if (map.get(str) == null) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".AppID");
        java.lang.String str3 = (java.lang.String) map.get(str + ".UserName");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".WithoutToast"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(str + ".Type"), 1);
        java.lang.String str4 = (java.lang.String) map.get(str + ".URL");
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(str + ".StartTime"), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) map.get(str + ".EndTime"), V + 7200);
        java.lang.String str5 = (java.lang.String) map.get(str + ".MD5");
        if (999 == P2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e5.Bi().Di("xml", str4, str5, V, V2, P);
            return true;
        }
        boolean k18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di().k(str2, P2, str4, str5, V, V2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle debug notify, appId = %s, username = %s, debugType = %d, url = %s, start = %d, end = %d, md5 = %s, updated = %b", str2, str3, java.lang.Integer.valueOf(P2), str4, java.lang.Long.valueOf(V), java.lang.Long.valueOf(V2), str5, java.lang.Boolean.valueOf(k18));
        if (k18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.q.o(str3);
            java.lang.String str6 = null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().k1(str2, "nickname")) != null) {
                str6 = k17.f68913x21f9b213;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w9(this, str2, P2, str6));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.hj().n0(str3, P2, 2, false, false, 0, 0, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        a(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo", map);
        int i17 = 0;
        do {
            i17++;
        } while (a(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo" + i17, map));
        return true;
    }
}
