package ek2;

/* loaded from: classes.dex */
public final class h0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(long j17, long j18, int i17, java.lang.String reportData) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ce1 ce1Var = new r45.ce1();
        ce1Var.set(1, db2.t4.f309704a.a(8488));
        ce1Var.set(3, java.lang.Long.valueOf(j18));
        ce1Var.set(4, java.lang.Integer.valueOf(i17));
        ce1Var.set(2, java.lang.Long.valueOf(j17));
        ce1Var.set(5, reportData);
        lVar.f152197a = ce1Var;
        r45.de1 de1Var = new r45.de1();
        de1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) de1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = de1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveadreport";
        lVar.f152200d = 8488;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveAdReport", "[CgiFinderLiveAdReport] feedId=" + j17 + " liveId=" + j18 + " scene=" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.de1 resp = (r45.de1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveAdReport", "[CgiFinderLiveAdReport] failed errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
