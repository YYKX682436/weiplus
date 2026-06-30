package bq;

/* loaded from: classes2.dex */
public final class x extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String finderUsername, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ur0 ur0Var = new r45.ur0();
        ur0Var.f469119e = finderUsername;
        ur0Var.f469118d = db2.t4.f309704a.b(10526, qt2Var);
        lVar.f152197a = ur0Var;
        r45.vr0 vr0Var = new r45.vr0();
        vr0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = vr0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = vr0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermembershiphomeinfo";
        lVar.f152200d = 10526;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.vr0 resp = (r45.vr0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFetchMemberShipHomeInfoCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
