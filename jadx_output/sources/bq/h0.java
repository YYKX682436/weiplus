package bq;

/* loaded from: classes.dex */
public final class h0 extends bq.e {
    public h0(com.tencent.mm.protobuf.g gVar, long j17, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3531;
        r45.u51 u51Var = new r45.u51();
        u51Var.set(1, xy2.c.f(qt2Var));
        u51Var.set(3, gVar);
        u51Var.set(4, db2.t4.f228171a.a(3531));
        u51Var.set(5, java.lang.Long.valueOf(j17));
        u51Var.set(6, java.lang.Integer.valueOf(i17));
        lVar.f70664a = u51Var;
        lVar.f70665b = new r45.v51();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfanslist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.FinderGetFansListCgi", "NetSceneFinderGetFansList,liveId:" + j17 + ",scene:" + i17);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.v51 resp = (r45.v51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderGetFansListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 9L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 10L, 1L, false);
        }
    }
}
