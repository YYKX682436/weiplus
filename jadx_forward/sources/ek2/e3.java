package ek2;

/* loaded from: classes.dex */
public final class e3 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f334977u;

    public e3(long j17) {
        super(null, 1, null);
        this.f334977u = "Finder.CgiGetProductReplayUrl";
        r45.qu1 qu1Var = new r45.qu1();
        qu1Var.set(1, db2.t4.f309704a.a(6613));
        qu1Var.set(2, java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = qu1Var;
        r45.ru1 ru1Var = new r45.ru1();
        ru1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ru1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ru1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetreplayurl";
        lVar.f152200d = 6613;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetProductReplayUrl", "init " + qu1Var.m75942xfb822ef2(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ru1 resp = (r45.ru1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334977u, "errcode " + i18 + " , errType:" + i17);
    }
}
