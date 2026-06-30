package ek2;

/* loaded from: classes.dex */
public final class i0 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String finderUserName) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        r45.xk1 xk1Var = new r45.xk1();
        xk1Var.set(1, java.lang.Integer.valueOf(i17));
        xk1Var.set(2, java.lang.Long.valueOf(j17));
        xk1Var.set(3, db2.t4.f309704a.a(4013));
        xk1Var.set(4, gVar);
        xk1Var.set(5, finderUserName);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = xk1Var;
        r45.yk1 yk1Var = new r45.yk1();
        yk1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) yk1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = yk1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveattendlottery";
        lVar.f152200d = 4013;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveAttendLottery", "init " + xk1Var.m75939xb282bd08(1) + ", " + xk1Var.m75942xfb822ef2(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.yk1 resp = (r45.yk1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveAttendLottery", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveAttendLottery", "coupon list result:" + pm0.b0.g(resp));
        }
    }
}
