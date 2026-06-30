package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.l3 f76492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.l f76493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f76494c;

    public k(com.tencent.mm.plugin.appbrand.appusage.l3 l3Var, com.tencent.mm.plugin.appbrand.appusage.l lVar, java.util.LinkedList linkedList) {
        this.f76492a = l3Var;
        this.f76493b = lVar;
        this.f76494c = linkedList;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWxaStarRecord, onResponse reason=[");
        com.tencent.mm.plugin.appbrand.appusage.l3 l3Var = this.f76492a;
        sb6.append(l3Var.f76511d);
        sb6.append("], cgi=[");
        sb6.append(fVar == null ? "null" : java.lang.String.format(java.util.Locale.US, "%d %d %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c));
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", sb6.toString());
        boolean b17 = th1.a.b(fVar);
        java.util.LinkedList linkedList = this.f76494c;
        com.tencent.mm.plugin.appbrand.appusage.l lVar = this.f76493b;
        if (b17) {
            r45.bc7 bc7Var = ((r45.ht6) fVar.f70618d).f376445d;
            int i17 = l3Var.f76511d;
            if (bc7Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCollectionModifyQueue[collection]", "updateWxaStarRecord, onResponse reason=[" + i17 + "] NULL wxa_resp");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "updateWxaStarRecord, onResponse reason=[" + i17 + "], ErrCode=" + ((r45.ht6) fVar.f70618d).f376445d.f370669d);
                if (((r45.ht6) fVar.f70618d).f376445d.f370669d != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCollectionModifyQueue[collection]", "jacob updateWxaStarRecord fail due to errcode = " + ((r45.ht6) fVar.f70618d).f376445d.f370669d + ", errMsg = " + ((r45.ht6) fVar.f70618d).f376445d.f370670e);
                    if (((r45.ht6) fVar.f70618d).f376445d.f370669d == -2) {
                        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                }
                int i18 = ((r45.ht6) fVar.f70618d).f376445d.f370669d;
                if (i18 != 0) {
                    if (i18 != 10001) {
                        com.tencent.mm.plugin.appbrand.appusage.t5.a(com.tencent.mm.plugin.appbrand.appusage.v5.f76600a, 0, 0, null, 7, null);
                    } else {
                        com.tencent.mm.plugin.appbrand.appusage.l.Ai(lVar, linkedList);
                    }
                }
            }
        } else {
            com.tencent.mm.plugin.appbrand.appusage.l.Ai(lVar, linkedList);
        }
        return jz5.f0.f302826a;
    }
}
