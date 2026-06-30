package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3 f158025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l f158026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f158027c;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3 l3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar, java.util.LinkedList linkedList) {
        this.f158025a = l3Var;
        this.f158026b = lVar;
        this.f158027c = linkedList;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWxaStarRecord, onResponse reason=[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l3 l3Var = this.f158025a;
        sb6.append(l3Var.f158044d);
        sb6.append("], cgi=[");
        sb6.append(fVar == null ? "null" : java.lang.String.format(java.util.Locale.US, "%d %d %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c));
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", sb6.toString());
        boolean b17 = th1.a.b(fVar);
        java.util.LinkedList linkedList = this.f158027c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l lVar = this.f158026b;
        if (b17) {
            r45.bc7 bc7Var = ((r45.ht6) fVar.f152151d).f457978d;
            int i17 = l3Var.f158044d;
            if (bc7Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "updateWxaStarRecord, onResponse reason=[" + i17 + "] NULL wxa_resp");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "updateWxaStarRecord, onResponse reason=[" + i17 + "], ErrCode=" + ((r45.ht6) fVar.f152151d).f457978d.f452202d);
                if (((r45.ht6) fVar.f152151d).f457978d.f452202d != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "jacob updateWxaStarRecord fail due to errcode = " + ((r45.ht6) fVar.f152151d).f457978d.f452202d + ", errMsg = " + ((r45.ht6) fVar.f152151d).f457978d.f452203e);
                    if (((r45.ht6) fVar.f152151d).f457978d.f452202d == -2) {
                        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    }
                }
                int i18 = ((r45.ht6) fVar.f152151d).f457978d.f452202d;
                if (i18 != 0) {
                    if (i18 != 10001) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t5.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v5.f158133a, 0, 0, null, 7, null);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.Ai(lVar, linkedList);
                    }
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l.Ai(lVar, linkedList);
        }
        return jz5.f0.f384359a;
    }
}
