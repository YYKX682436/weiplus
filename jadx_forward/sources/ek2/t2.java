package ek2;

/* loaded from: classes.dex */
public final class t2 extends ek2.g0 {
    public t2(ek2.s2 s2Var) {
        super(null, 1, null);
        r45.ae2 ae2Var = new r45.ae2();
        ae2Var.set(1, db2.t4.f309704a.a(5231));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ae2Var;
        r45.be2 be2Var = new r45.be2();
        be2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) be2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = be2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderliveverify";
        lVar.f152200d = 5231;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveVerify", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.be2 resp = (r45.be2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveVerify", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_VERIFY_BOOLEAN_SYNC, java.lang.Boolean.valueOf(resp.m75933x41a8a7f2(1)));
    }
}
