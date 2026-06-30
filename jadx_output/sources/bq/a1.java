package bq;

/* loaded from: classes.dex */
public final class a1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23475o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String finderUsername, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, int i17, int i18, int i19) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f23475o = i19;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.c51 c51Var = new r45.c51();
        c51Var.set(2, finderUsername);
        c51Var.set(3, gVar);
        c51Var.set(1, db2.t4.f228171a.b(10149, qt2Var));
        c51Var.set(4, java.lang.Integer.valueOf(i17));
        c51Var.set(5, java.lang.Integer.valueOf(i18));
        lVar.f70664a = c51Var;
        r45.d51 d51Var = new r45.d51();
        d51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d51Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = d51Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetcollectionlist";
        lVar.f70667d = 10149;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.d51 resp = (r45.d51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderFetchMemberFeedListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
