package bq;

/* loaded from: classes.dex */
public final class n0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23497o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f23498p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23499q;

    /* renamed from: r, reason: collision with root package name */
    public final int f23500r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(long j17, com.tencent.mm.protobuf.g gVar, int i17, java.lang.String targetUsername, r45.qt2 qt2Var, int i18, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        i17 = (i19 & 4) != 0 ? 0 : i17;
        targetUsername = (i19 & 8) != 0 ? "" : targetUsername;
        i18 = (i19 & 32) != 0 ? 0 : i18;
        z17 = (i19 & 64) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(targetUsername, "targetUsername");
        this.f23498p = "";
        this.f23499q = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3965;
        this.f23497o = i17;
        this.f23498p = targetUsername;
        this.f23499q = z17;
        r45.c71 c71Var = new r45.c71();
        c71Var.set(1, java.lang.Long.valueOf(j17));
        c71Var.set(3, gVar);
        c71Var.set(2, xy2.c.f(qt2Var));
        if (!kotlin.jvm.internal.o.b(targetUsername, c01.z1.r())) {
            c71Var.set(5, targetUsername);
        }
        c71Var.set(6, java.lang.Integer.valueOf(i18));
        db2.t4 t4Var = db2.t4.f228171a;
        c71Var.set(7, t4Var.n());
        this.f23500r = i18;
        c71Var.set(4, t4Var.b(3965, qt2Var));
        lVar.f70664a = c71Var;
        lVar.f70665b = new r45.d71();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetLikedList", "NetSceneFinderGetLikedList init: " + j17 + ' ' + c71Var.getString(2) + "， targetUsername：" + targetUsername);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d71 resp = (r45.d71) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListRequest");
        r45.c71 c71Var = (r45.c71) fVar2;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        com.tencent.mm.modelbase.o oVar = this.f70646f;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getLiked_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        r45.kv0 kv0Var = (r45.kv0) c71Var.getCustom(4);
        cq.j1.a(kVar, oVar, arrayList, kv0Var != null ? kv0Var.getLong(5) : 0L, false, this.f23483m);
    }
}
