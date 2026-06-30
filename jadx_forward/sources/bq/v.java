package bq;

/* loaded from: classes2.dex */
public final class v extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105067o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderMemberTicket, "finderMemberTicket");
        this.f105067o = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.mr0 mr0Var = new r45.mr0();
        mr0Var.f462298d = db2.t4.f309704a.b(8905, qt2Var);
        mr0Var.f462299e = finderUsername;
        mr0Var.f462302h = finderMemberTicket;
        mr0Var.f462301g = gVar;
        mr0Var.f462300f = j17;
        lVar.f152197a = mr0Var;
        r45.nr0 nr0Var = new r45.nr0();
        lVar.f152197a = mr0Var;
        lVar.f152198b = nr0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermembercollectionshortinfo";
        lVar.f152200d = 10269;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.nr0 resp = (r45.nr0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFetchMemberCollectionShortInfoCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
