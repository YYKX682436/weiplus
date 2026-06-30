package ly2;

/* loaded from: classes.dex */
public final class c extends az2.j {
    public c(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17) {
        super(null, null, 3, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.iv1 iv1Var = new r45.iv1();
        iv1Var.set(1, db2.t4.f309704a.a(7485));
        iv1Var.set(3, str);
        iv1Var.set(2, gVar);
        iv1Var.set(4, java.lang.Long.valueOf(j17));
        lVar.f152197a = iv1Var;
        r45.jv1 jv1Var = new r45.jv1();
        jv1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) jv1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = jv1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetvotinghistory";
        lVar.f152200d = 7485;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CgiFinderLiveGetVotingHistory] init username=");
        sb6.append(str);
        sb6.append(", objectId=");
        sb6.append(j17);
        sb6.append(", hasLastBuffer=");
        sb6.append(gVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveGetVotingHistory", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.jv1 resp = (r45.jv1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveGetVotingHistory", "[CgiFinderLiveGetVotingHistory] CgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
