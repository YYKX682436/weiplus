package bq;

/* loaded from: classes.dex */
public final class a1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105008o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String finderUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, int i17, int i18, int i19) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f105008o = i19;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.c51 c51Var = new r45.c51();
        c51Var.set(2, finderUsername);
        c51Var.set(3, gVar);
        c51Var.set(1, db2.t4.f309704a.b(10149, qt2Var));
        c51Var.set(4, java.lang.Integer.valueOf(i17));
        c51Var.set(5, java.lang.Integer.valueOf(i18));
        lVar.f152197a = c51Var;
        r45.d51 d51Var = new r45.d51();
        d51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) d51Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = d51Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcollectionlist";
        lVar.f152200d = 10149;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.d51 resp = (r45.d51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFetchMemberFeedListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
