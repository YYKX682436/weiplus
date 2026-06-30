package bq;

/* loaded from: classes.dex */
public final class b0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f23476o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f23477p;

    public b0(int i17, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, int i18) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.w61 w61Var = new r45.w61();
        w61Var.set(1, db2.t4.f228171a.b(11934, qt2Var));
        w61Var.set(3, gVar);
        w61Var.set(2, java.lang.Integer.valueOf(i17));
        w61Var.set(6, java.lang.Integer.valueOf(i18));
        lVar.f70664a = w61Var;
        lVar.f70667d = 11934;
        lVar.f70665b = new r45.x61();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetinteractionedfeedlist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderGetAllListCgi", "FinderGetAllListCgi, tabFlag: " + i17 + ", itemFlag:" + i18 + ", lastBuffer: " + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.x61 resp = (r45.x61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetInteractionedFeedListRequest");
        r45.w61 w61Var = (r45.w61) fVar2;
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
        r45.kv0 kv0Var = (r45.kv0) w61Var.getCustom(1);
        cq.j1.a(kVar, oVar, arrayList, kv0Var != null ? kv0Var.getLong(5) : 0L, false, this.f23483m);
        com.tencent.mars.xlog.Log.i("Finder.FinderGetAllListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
