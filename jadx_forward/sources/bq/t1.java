package bq;

/* loaded from: classes.dex */
public final class t1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(java.lang.String query, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.vu2 vu2Var = new r45.vu2();
        vu2Var.set(3, gVar);
        vu2Var.set(2, query);
        vu2Var.set(4, java.lang.Integer.valueOf(i17));
        vu2Var.set(1, db2.t4.f309704a.b(6200, qt2Var));
        lVar.f152197a = vu2Var;
        lVar.f152198b = new r45.wu2();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersearchsuggest";
        lVar.f152200d = 6200;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.wu2 resp = (r45.wu2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSuggestionCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
