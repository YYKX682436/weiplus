package bq;

/* loaded from: classes2.dex */
public final class w extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f105069o;

    /* renamed from: p, reason: collision with root package name */
    public final int f105070p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, int i18) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderMemberTicket, "finderMemberTicket");
        this.f105069o = finderUsername;
        this.f105070p = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.or0 or0Var = new r45.or0();
        or0Var.f463990d = db2.t4.f309704a.b(10269, qt2Var);
        or0Var.f463991e = finderUsername;
        or0Var.f463992f = finderMemberTicket;
        or0Var.f463993g = gVar;
        or0Var.f463994h = i17;
        lVar.f152197a = or0Var;
        r45.pr0 pr0Var = new r45.pr0();
        pr0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = pr0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = pr0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermemberfeedlist";
        lVar.f152200d = 10269;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pr0 resp = (r45.pr0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFetchMemberFeedListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
