package bq;

/* loaded from: classes.dex */
public final class k1 extends bq.e {
    public k1(r45.qt2 qt2Var) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ht2 ht2Var = new r45.ht2();
        db2.t4 t4Var = db2.t4.f228171a;
        ht2Var.set(1, t4Var.b(nd1.p1.CTRL_INDEX, qt2Var));
        ht2Var.set(2, t4Var.n());
        lVar.f70664a = ht2Var;
        r45.it2 it2Var = new r45.it2();
        it2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) it2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = it2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderrefreshpreloadinfo";
        lVar.f70667d = nd1.p1.CTRL_INDEX;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderRefreshPreloadInfoCGI", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }
}
