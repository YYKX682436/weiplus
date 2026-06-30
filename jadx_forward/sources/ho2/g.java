package ho2;

/* loaded from: classes2.dex */
public final class g extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.qt2 qt2Var, java.lang.String finderUsername, int i17, int i18, long j17, long j18) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        r45.ei4 ei4Var = new r45.ei4();
        ei4Var.f455067d = db2.t4.f309704a.b(22720, qt2Var);
        ei4Var.f455068e = finderUsername;
        ei4Var.f455069f = i17;
        ei4Var.f455070g = i18;
        ei4Var.f455071h = j17;
        ei4Var.f455072i = j18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ei4Var;
        r45.fi4 fi4Var = new r45.fi4();
        fi4Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = fi4Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = fi4Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/managefindermemberuser";
        lVar.f152200d = 22720;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.fi4 resp = (r45.fi4) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderManagerMemberUserCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
