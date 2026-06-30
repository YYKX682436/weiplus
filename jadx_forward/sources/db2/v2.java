package db2;

/* loaded from: classes.dex */
public final class v2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309729t;

    public v2(int i17) {
        super(null, null, 2, null);
        this.f309729t = "Finder.CgiFinderRecommendNickname";
        r45.os2 os2Var = new r45.os2();
        os2Var.set(1, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = os2Var;
        r45.ps2 ps2Var = new r45.ps2();
        ps2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ps2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ps2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderrecommendnickname";
        lVar.f152200d = 4076;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderRecommendNickname", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ps2 resp = (r45.ps2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309729t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
