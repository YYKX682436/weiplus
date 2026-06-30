package bq;

/* loaded from: classes.dex */
public final class h0 extends bq.e {
    public h0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, int i17, r45.qt2 qt2Var) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3531;
        r45.u51 u51Var = new r45.u51();
        u51Var.set(1, xy2.c.f(qt2Var));
        u51Var.set(3, gVar);
        u51Var.set(4, db2.t4.f309704a.a(3531));
        u51Var.set(5, java.lang.Long.valueOf(j17));
        u51Var.set(6, java.lang.Integer.valueOf(i17));
        lVar.f152197a = u51Var;
        lVar.f152198b = new r45.v51();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfanslist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetFansListCgi", "NetSceneFinderGetFansList,liveId:" + j17 + ",scene:" + i17);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v51 resp = (r45.v51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetFansListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 9L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 10L, 1L, false);
        }
    }
}
