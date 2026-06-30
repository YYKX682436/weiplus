package ke2;

/* loaded from: classes.dex */
public final class p extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388512t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String anchorFinderUserName, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, long j18, java.lang.String str, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUserName, "anchorFinderUserName");
        this.f388512t = "CgiFinderLiveFanClubGetIntimacy";
        r45.cq1 cq1Var = new r45.cq1();
        cq1Var.set(1, db2.t4.f309704a.a(5985));
        cq1Var.set(2, anchorFinderUserName);
        cq1Var.set(3, gVar);
        cq1Var.set(5, java.lang.Long.valueOf(j17));
        cq1Var.set(4, java.lang.Long.valueOf(j18));
        cq1Var.set(6, str);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = cq1Var;
        r45.dq1 dq1Var = new r45.dq1();
        dq1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dq1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = dq1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivefanclubgetintimacy";
        lVar.f152200d = 5985;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveFanClubGetIntimacy", "init " + cq1Var.m75945x2fec8307(2) + ',' + cq1Var.m75934xbce7f2f(3) + ',' + cq1Var.m75942xfb822ef2(5) + ',' + cq1Var.m75942xfb822ef2(4));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.dq1 resp = (r45.dq1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388512t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ' + pm0.b0.g(resp));
    }
}
