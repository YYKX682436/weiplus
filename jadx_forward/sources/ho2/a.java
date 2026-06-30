package ho2;

/* loaded from: classes2.dex */
public final class a extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f364395o;

    /* renamed from: p, reason: collision with root package name */
    public final int f364396p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderMemberTicket, "finderMemberTicket");
        this.f364395o = i17;
        this.f364396p = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.qr0 qr0Var = new r45.qr0();
        qr0Var.f465751d = db2.t4.f309704a.b(7439, qt2Var);
        qr0Var.f465752e = finderUsername;
        qr0Var.f465753f = finderMemberTicket;
        qr0Var.f465754g = gVar;
        qr0Var.f465755h = i17;
        lVar.f152197a = qr0Var;
        r45.rr0 rr0Var = new r45.rr0();
        rr0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = rr0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = rr0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermemberfeedpreview";
        lVar.f152200d = 7439;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.rr0 resp = (r45.rr0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFetchMemberFeedPreviewCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
