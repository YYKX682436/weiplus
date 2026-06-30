package ly2;

/* loaded from: classes.dex */
public final class a extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, long j18, java.lang.String objectNonceId, java.util.List choiceId, java.lang.String votingId, byte[] bArr) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choiceId, "choiceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(votingId, "votingId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.bl1 bl1Var = new r45.bl1();
        bl1Var.set(1, db2.t4.f309704a.a(7984));
        bl1Var.set(2, java.lang.Long.valueOf(j17));
        bl1Var.set(3, java.lang.Long.valueOf(j18));
        bl1Var.set(4, objectNonceId);
        if (bArr != null) {
            bl1Var.set(7, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        }
        bl1Var.m75941xfb821914(5).addAll(choiceId);
        bl1Var.set(6, votingId);
        lVar.f152197a = bl1Var;
        r45.cl1 cl1Var = new r45.cl1();
        cl1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) cl1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = cl1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveattendvoting";
        lVar.f152200d = 7984;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveAttendVoting", "[CgiFinderLiveAttendVoting] feedId=" + j18 + " liveId=" + j17 + ' ');
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.cl1 resp = (r45.cl1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveAttendVoting", "[CgiFinderLiveAttendVoting] CgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
