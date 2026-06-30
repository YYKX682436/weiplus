package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class x9 implements com.tencent.mm.plugin.appbrand.appcache.y9 {
    static {
        com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fya);
    }

    public x9(com.tencent.mm.plugin.appbrand.appcache.t9 t9Var) {
    }

    public final boolean a(java.lang.String str, java.util.Map map) {
        k91.v5 k17;
        if (map.get(str) == null) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".AppID");
        java.lang.String str3 = (java.lang.String) map.get(str + ".UserName");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".WithoutToast"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".Type"), 1);
        java.lang.String str4 = (java.lang.String) map.get(str + ".URL");
        long V = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(str + ".StartTime"), com.tencent.mm.sdk.platformtools.t8.i1());
        long V2 = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(str + ".EndTime"), V + 7200);
        java.lang.String str5 = (java.lang.String) map.get(str + ".MD5");
        if (999 == P2) {
            com.tencent.mm.plugin.appbrand.appcache.e5.Bi().Di("xml", str4, str5, V, V2, P);
            return true;
        }
        boolean k18 = com.tencent.mm.plugin.appbrand.app.r9.Di().k(str2, P2, str4, str5, V, V2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaPkgPushingXmlHandler", "handle debug notify, appId = %s, username = %s, debugType = %d, url = %s, start = %d, end = %d, md5 = %s, updated = %b", str2, str3, java.lang.Integer.valueOf(P2), str4, java.lang.Long.valueOf(V), java.lang.Long.valueOf(V2), str5, java.lang.Boolean.valueOf(k18));
        if (k18) {
            com.tencent.mm.plugin.appbrand.config.q.o(str3);
            java.lang.String str6 = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (k17 = com.tencent.mm.plugin.appbrand.app.r9.ij().k1(str2, "nickname")) != null) {
                str6 = k17.field_nickname;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.appcache.w9(this, str2, P2, str6));
            com.tencent.mm.plugin.appbrand.app.r9.hj().n0(str3, P2, 2, false, false, 0, 0, null);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        a(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo", map);
        int i17 = 0;
        do {
            i17++;
        } while (a(".sysmsg.AppBrandNotify.DebugInfoList.DebugInfo" + i17, map));
        return true;
    }
}
