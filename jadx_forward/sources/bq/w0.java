package bq;

/* loaded from: classes.dex */
public final class w0 extends bq.e {
    public w0(int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ja1 ja1Var = new r45.ja1();
        ja1Var.set(2, java.lang.Integer.valueOf(i17));
        ja1Var.set(1, db2.t4.f309704a.b(3528, qt2Var));
        lVar.f152197a = ja1Var;
        r45.ka1 ka1Var = new r45.ka1();
        ka1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ka1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ka1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettagcontact";
        lVar.f152200d = 3528;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetTagContactCGI", "FinderGetTagContactCGI init");
    }
}
