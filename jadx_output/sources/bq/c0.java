package bq;

/* loaded from: classes.dex */
public final class c0 extends bq.e {
    public c0(com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.u41 u41Var = new r45.u41();
        u41Var.set(1, xy2.c.f(qt2Var));
        u41Var.set(2, gVar);
        u41Var.set(3, db2.t4.f228171a.b(3717, qt2Var));
        lVar.f70664a = u41Var;
        r45.v41 v41Var = new r45.v41();
        v41Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v41Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = v41Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetblacklist";
        lVar.f70667d = 3717;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderGetBlackListCGI", "FinderGetBlackListCGI init");
    }
}
