package bq;

/* loaded from: classes.dex */
public final class i0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public int f23490o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String finderUserName, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, long j17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        j17 = (i18 & 8) != 0 ? 0L : j17;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        r45.w51 w51Var = new r45.w51();
        w51Var.set(3, gVar);
        db2.t4 t4Var = db2.t4.f228171a;
        w51Var.set(1, t4Var.b(3966, qt2Var));
        w51Var.set(2, finderUserName);
        w51Var.set(4, java.lang.Integer.valueOf(i17));
        w51Var.set(6, java.lang.Long.valueOf(j17));
        w51Var.set(5, t4Var.n());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = w51Var;
        lVar.f70667d = 3966;
        lVar.f70665b = new r45.x51();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfavlist";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.x51 resp = (r45.x51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest");
        r45.w51 w51Var = (r45.w51) fVar2;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        r45.kv0 kv0Var = (r45.kv0) w51Var.getCustom(1);
        cq.j1.a(kVar, oVar, arrayList, kv0Var != null ? kv0Var.getLong(5) : 0L, false, this.f23483m);
        com.tencent.mars.xlog.Log.i("Finder.FinderGetFavFeedCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("server increatment size:");
        com.tencent.mm.protobuf.f fVar3 = this.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
        sb6.append(((r45.x51) fVar3).getList(1).size());
        com.tencent.mars.xlog.Log.i("Finder.FinderGetFavFeedCgi", sb6.toString());
    }
}
