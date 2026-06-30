package bq;

/* loaded from: classes.dex */
public final class c0 extends bq.e {
    public c0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.u41 u41Var = new r45.u41();
        u41Var.set(1, xy2.c.f(qt2Var));
        u41Var.set(2, gVar);
        u41Var.set(3, db2.t4.f309704a.b(3717, qt2Var));
        lVar.f152197a = u41Var;
        r45.v41 v41Var = new r45.v41();
        v41Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v41Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = v41Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetblacklist";
        lVar.f152200d = 3717;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetBlackListCGI", "FinderGetBlackListCGI init");
    }
}
