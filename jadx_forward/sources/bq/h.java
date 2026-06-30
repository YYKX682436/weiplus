package bq;

/* loaded from: classes.dex */
public final class h extends bq.e {
    public h(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.w41 w41Var = new r45.w41();
        w41Var.set(1, gVar);
        w41Var.set(2, db2.t4.f309704a.b(5905, qt2Var));
        lVar.f152197a = w41Var;
        r45.x41 x41Var = new r45.x41();
        x41Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x41Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = x41Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetblockposterlist";
        lVar.f152200d = 5905;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBlockPosterListCGI", "FinderBlockPosterListCGI init");
    }
}
