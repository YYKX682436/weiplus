package bq;

/* loaded from: classes2.dex */
public final class b1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105011o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(r45.qt2 qt2Var, java.lang.String finderAuthorUsername, java.lang.String myUsername, java.lang.String str, int i17, long j17, int i18) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderAuthorUsername, "finderAuthorUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myUsername, "myUsername");
        this.f105011o = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.gg2 gg2Var = new r45.gg2();
        gg2Var.f456741d = db2.t4.f309704a.b(11327, qt2Var);
        gg2Var.f456743f = finderAuthorUsername;
        gg2Var.f456744g = str;
        gg2Var.f456742e = myUsername;
        gg2Var.f456745h = i17;
        gg2Var.f456746i = j17;
        lVar.f152197a = gg2Var;
        lVar.f152198b = new r45.hg2();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermemberqapagedgetqalist";
        lVar.f152200d = 11327;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.hg2 resp = (r45.hg2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMemberQAPagedGetQAListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
