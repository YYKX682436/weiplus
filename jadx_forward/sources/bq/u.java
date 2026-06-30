package bq;

/* loaded from: classes.dex */
public final class u extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String query, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.eu2 eu2Var = new r45.eu2();
        eu2Var.set(3, query);
        eu2Var.set(2, gVar);
        eu2Var.set(1, db2.t4.f309704a.b(6665, qt2Var));
        eu2Var.set(4, xy2.c.f(qt2Var));
        lVar.f152197a = eu2Var;
        r45.fu2 fu2Var = new r45.fu2();
        fu2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fu2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = fu2Var;
        lVar.f152200d = 6665;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersearchfans";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFansSearchCGI", "FinderFansSearchCGI init query ".concat(query));
    }
}
