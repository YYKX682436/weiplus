package bq;

/* loaded from: classes.dex */
public final class t1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(java.lang.String query, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.vu2 vu2Var = new r45.vu2();
        vu2Var.set(3, gVar);
        vu2Var.set(2, query);
        vu2Var.set(4, java.lang.Integer.valueOf(i17));
        vu2Var.set(1, db2.t4.f228171a.b(6200, qt2Var));
        lVar.f70664a = vu2Var;
        lVar.f70665b = new r45.wu2();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersearchsuggest";
        lVar.f70667d = 6200;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.wu2 resp = (r45.wu2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderSuggestionCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
