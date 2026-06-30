package ke2;

/* loaded from: classes3.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388460t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f388461u;

    /* renamed from: v, reason: collision with root package name */
    public final int f388462v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f388463w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String userName, java.lang.String noticeId, int i17, r45.qt2 qt2Var, java.lang.Integer num) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        this.f388460t = userName;
        this.f388461u = noticeId;
        this.f388462v = i17;
        this.f388463w = "Finder.CgiFinderAudienceReserveLive";
        r45.ru0 ru0Var = new r45.ru0();
        db2.r4.a(ru0Var, userName, noticeId, i17, 0L, null, null, num != null ? num.intValue() : -1, 0, null, null, 0, null, null, null, 16312, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ru0Var;
        r45.su0 su0Var = new r45.su0();
        su0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) su0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = su0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderaudiencereservelive";
        lVar.f152200d = 6276;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderAudienceReserveLive", "init userName:" + userName + ", noticeId:" + noticeId + " ,optype:" + i17 + ", scene:" + num);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.su0 resp = (r45.su0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388463w, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        if (i17 == 0 && i18 == 0) {
            ((vd2.j1) i95.n0.c(vd2.j1.class)).wi(this.f388460t, this.f388461u, this.f388462v == 1);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5485x35eb0bf3 c5485x35eb0bf3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5485x35eb0bf3();
            c5485x35eb0bf3.f135820g.getClass();
            c5485x35eb0bf3.e();
        }
    }
}
