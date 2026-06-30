package bq;

/* loaded from: classes.dex */
public final class g0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f23486o;

    public g0(java.lang.String str, com.tencent.mm.protobuf.g gVar, int i17, r45.qt2 qt2Var) {
        super(null, 1, null);
        r45.q51 q51Var = new r45.q51();
        q51Var.set(2, str);
        q51Var.set(3, 0);
        q51Var.set(4, gVar);
        q51Var.set(1, db2.t4.f228171a.b(5801, qt2Var));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5801;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetdraft";
        lVar.f70664a = q51Var;
        lVar.f70665b = new r45.r51();
        p(lVar.a());
        this.f23486o = i17;
        com.tencent.mars.xlog.Log.i("FinderGetDraftCGI", "NetSceneFinderGetDraft init finderUserName " + str + " lastBuffer:" + gVar);
    }
}
