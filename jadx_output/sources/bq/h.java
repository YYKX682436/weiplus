package bq;

/* loaded from: classes.dex */
public final class h extends bq.e {
    public h(com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.w41 w41Var = new r45.w41();
        w41Var.set(1, gVar);
        w41Var.set(2, db2.t4.f228171a.b(5905, qt2Var));
        lVar.f70664a = w41Var;
        r45.x41 x41Var = new r45.x41();
        x41Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x41Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = x41Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetblockposterlist";
        lVar.f70667d = 5905;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderBlockPosterListCGI", "FinderBlockPosterListCGI init");
    }
}
