package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class da implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.ea f107812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f107813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f107814f;

    public da(com.tencent.mm.plugin.finder.feed.model.ea eaVar, long j17, yz5.l lVar) {
        this.f107812d = eaVar;
        this.f107813e = j17;
        this.f107814f = lVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar;
        java.util.LinkedList list;
        if (i17 != 0 || i18 != 0 || (fVar = oVar.f70711b.f70700a) == null) {
            ot5.g.d("MicroMsg.MegaVideoAutoPlayLoader", "try fetchAutoPlayFeed fail, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
            return 0;
        }
        java.lang.String str2 = null;
        r45.aa1 aa1Var = fVar instanceof r45.aa1 ? (r45.aa1) fVar : null;
        com.tencent.mm.protobuf.g byteString = aa1Var != null ? aa1Var.getByteString(2) : null;
        com.tencent.mm.plugin.finder.feed.model.ea eaVar = this.f107812d;
        eaVar.f107836a = byteString;
        eaVar.f107838c.put(java.lang.Long.valueOf(this.f107813e), aa1Var);
        yz5.l lVar = this.f107814f;
        if (lVar != null && aa1Var != null) {
            lVar.invoke(aa1Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("try fetchAutoPlayFeed ok, ");
        if (aa1Var != null && (list = aa1Var.getList(1)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
            }
            str2 = kz5.n0.g0(arrayList, ";", null, null, 0, null, null, 62, null);
        }
        sb6.append(str2);
        ot5.g.c("MicroMsg.MegaVideoAutoPlayLoader", sb6.toString());
        return 0;
    }
}
