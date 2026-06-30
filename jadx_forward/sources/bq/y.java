package bq;

/* loaded from: classes2.dex */
public final class y extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105071o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r45.qt2 qt2Var, java.lang.String finderAuthorUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f105071o = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.yr0 yr0Var = new r45.yr0();
        yr0Var.f472848e = finderAuthorUsername;
        yr0Var.f472849f = gVar;
        yr0Var.f472847d = db2.t4.f309704a.b(10628, qt2Var);
        yr0Var.f472850g = i17;
        lVar.f152197a = yr0Var;
        r45.zr0 zr0Var = new r45.zr0();
        zr0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = zr0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = zr0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermemberzonehomeline";
        lVar.f152200d = 10628;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.zr0 resp = (r45.zr0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFetchMemberZoneHomeLineCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
