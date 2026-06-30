package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public enum b1 implements vg3.q4 {
    INSTANCE;

    public static void b(com.tencent.mm.plugin.appbrand.appcache.predownload.b1 b1Var, java.lang.String str) {
        b1Var.getClass();
        r45.gd7 gd7Var = new r45.gd7();
        gd7Var.parseFrom(android.util.Base64.decode(str, 0));
        java.util.LinkedList linkedList = gd7Var.f375151d;
        if (linkedList == null || linkedList.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.PredownloadXmlProcessor", "process, empty RespInfoList, time %d", java.lang.Long.valueOf(ik1.c0.b(gd7Var.f375152e)));
        } else {
            r81.f.INSTANCE.b(0, 3);
            com.tencent.mm.plugin.appbrand.appcache.predownload.z0.a(linkedList, null);
        }
    }

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.WeAppSyncCommand.Base64JsonContent");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        pq5.h.b(str2).H(new com.tencent.mm.plugin.appbrand.appcache.predownload.a1(this));
        return null;
    }
}
