package db2;

/* loaded from: classes.dex */
public final class y extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r45.qt2 qt2Var, java.lang.String posterFinderUsername, long j17, java.lang.String sourceFeedId, int i17) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posterFinderUsername, "posterFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceFeedId, "sourceFeedId");
        r45.vz0 vz0Var = new r45.vz0();
        vz0Var.set(1, db2.t4.f309704a.b(7421, qt2Var));
        vz0Var.set(2, posterFinderUsername);
        vz0Var.set(3, java.lang.Long.valueOf(j17));
        vz0Var.set(4, sourceFeedId);
        vz0Var.set(5, java.lang.Integer.valueOf(i17));
        r45.wz0 wz0Var = new r45.wz0();
        wz0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) wz0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = vz0Var;
        lVar.f152198b = wz0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercoursepurchase";
        lVar.f152200d = 7421;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.wz0 resp = (r45.wz0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderCoursePurchase", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
