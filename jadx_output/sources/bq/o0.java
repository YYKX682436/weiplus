package bq;

/* loaded from: classes2.dex */
public final class o0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23501o;

    public o0(java.lang.String str, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f23501o = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.k81 k81Var = new r45.k81();
        db2.t4 t4Var = db2.t4.f228171a;
        k81Var.f378482d = t4Var.b(7198, qt2Var);
        k81Var.f378483e = str;
        k81Var.f378484f = 0;
        k81Var.f378485g = gVar;
        k81Var.f378482d = t4Var.b(7198, qt2Var);
        lVar.f70664a = k81Var;
        r45.l81 l81Var = new r45.l81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmemberdraft";
        lVar.f70667d = 7198;
        lVar.f70665b = l81Var;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderGetMemberDraftCgi", "FinderGetMemberDraftCgi init finderUserName " + str + " lastBuffer:" + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.l81 resp = (r45.l81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderGetMemberDraftCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
