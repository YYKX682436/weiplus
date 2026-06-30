package ly2;

/* loaded from: classes.dex */
public final class b extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, long j18, java.lang.String objectNonceId, r45.le2 le2Var, int i17) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.jo1 jo1Var = new r45.jo1();
        jo1Var.set(1, db2.t4.f309704a.a(9620));
        jo1Var.set(2, java.lang.Long.valueOf(j17));
        jo1Var.set(3, java.lang.Long.valueOf(j18));
        jo1Var.set(4, objectNonceId);
        jo1Var.set(5, le2Var);
        jo1Var.set(6, java.lang.Integer.valueOf(i17));
        lVar.f152197a = jo1Var;
        r45.ko1 ko1Var = new r45.ko1();
        ko1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ko1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ko1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivecreatevoting";
        lVar.f152200d = 9620;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveCreateVoting", "[CgiFinderLiveCreateVoting] feedId=" + j18 + " liveId=" + j17 + ' ');
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ko1 resp = (r45.ko1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveCreateVoting", "[CgiFinderLiveCreateVoting] CgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
