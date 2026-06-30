package ho2;

/* loaded from: classes2.dex */
public final class d extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f364399t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.qt2 qt2Var, java.lang.String finderUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, null, 3, null);
        qt2Var = (i17 & 1) != 0 ? null : qt2Var;
        gVar = (i17 & 4) != 0 ? null : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        r45.as0 as0Var = new r45.as0();
        this.f364399t = gVar;
        as0Var.f451770d = db2.t4.f309704a.b(8718, qt2Var);
        as0Var.f451771e = finderUsername;
        as0Var.f451772f = gVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = as0Var;
        r45.bs0 bs0Var = new r45.bs0();
        bs0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = bs0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = bs0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermymembershipsubscriber";
        lVar.f152200d = 8718;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.bs0 resp = (r45.bs0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderFetchMyMembershipSubscriberCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
