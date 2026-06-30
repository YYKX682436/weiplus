package ke2;

/* loaded from: classes.dex */
public final class h0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f388488u;

    public h0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, 1, null);
        this.f388488u = "CgiFinderLiveReservedNoticeList";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 16827;
        r45.su1 su1Var = new r45.su1();
        su1Var.set(2, gVar);
        su1Var.set(1, db2.t4.f309704a.a(16827));
        lVar.f152197a = su1Var;
        lVar.f152198b = new r45.tu1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetreservednoticelist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveReservedNoticeList", "last_buffer:" + su1Var.m75934xbce7f2f(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.tu1 resp = (r45.tu1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388488u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
