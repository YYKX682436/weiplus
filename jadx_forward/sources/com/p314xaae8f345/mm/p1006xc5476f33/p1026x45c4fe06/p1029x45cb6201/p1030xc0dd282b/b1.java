package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes4.dex */
public enum b1 implements vg3.q4 {
    INSTANCE;

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.b1 b1Var, java.lang.String str) {
        b1Var.getClass();
        r45.gd7 gd7Var = new r45.gd7();
        gd7Var.mo11468x92b714fd(android.util.Base64.decode(str, 0));
        java.util.LinkedList linkedList = gd7Var.f456684d;
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.PredownloadXmlProcessor", "process, empty RespInfoList, time %d", java.lang.Long.valueOf(ik1.c0.b(gd7Var.f456685e)));
        } else {
            r81.f.INSTANCE.b(0, 3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.z0.a(linkedList, null);
        }
    }

    @Override // vg3.q4
    public com.p314xaae8f345.mm.p944x882e457a.q0 k7(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.WeAppSyncCommand.Base64JsonContent");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        pq5.h.b(str2).H(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.a1(this));
        return null;
    }
}
