package bq;

/* loaded from: classes.dex */
public final class w0 extends bq.e {
    public w0(int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ja1 ja1Var = new r45.ja1();
        ja1Var.set(2, java.lang.Integer.valueOf(i17));
        ja1Var.set(1, db2.t4.f228171a.b(3528, qt2Var));
        lVar.f70664a = ja1Var;
        r45.ka1 ka1Var = new r45.ka1();
        ka1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ka1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ka1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergettagcontact";
        lVar.f70667d = 3528;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderGetTagContactCGI", "FinderGetTagContactCGI init");
    }
}
