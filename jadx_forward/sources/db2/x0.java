package db2;

/* loaded from: classes.dex */
public final class x0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309760t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String finderUsername) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f309760t = "MicroMsg.CgiFinderGetLiveIncomePage";
        r45.i71 i71Var = new r45.i71();
        i71Var.set(1, db2.t4.f309704a.a(6477));
        i71Var.set(2, finderUsername);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = i71Var;
        r45.j71 j71Var = new r45.j71();
        j71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j71Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = j71Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetliveincomepage";
        lVar.f152200d = 6477;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiFinderGetLiveIncomePage", "init " + i71Var.m75945x2fec8307(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.j71 resp = (r45.j71) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309760t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
