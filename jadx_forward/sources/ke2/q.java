package ke2;

/* loaded from: classes.dex */
public final class q extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388513t;

    public q(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2, int i17, r45.qt2 qt2Var, int i18, int i19) {
        super(qt2Var, null, 2, null);
        this.f388513t = "CgiFinderLiveFanClubMember";
        r45.is1 is1Var = new r45.is1();
        is1Var.set(1, db2.t4.f309704a.a(6282));
        is1Var.set(2, xy2.c.f(qt2Var));
        is1Var.set(3, gVar);
        is1Var.set(4, java.lang.Long.valueOf(j17));
        is1Var.set(5, java.lang.Long.valueOf(j18));
        is1Var.set(6, gVar2);
        is1Var.set(7, java.lang.Integer.valueOf(i17));
        is1Var.set(8, java.lang.Integer.valueOf(i18));
        is1Var.set(9, java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = is1Var;
        r45.js1 js1Var = new r45.js1();
        js1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) js1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = js1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetfanclubmembers";
        lVar.f152200d = 6282;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveFanClubMember", "init " + is1Var.m75945x2fec8307(2) + ',' + is1Var.m75934xbce7f2f(3) + ',' + is1Var.m75942xfb822ef2(4) + ',' + is1Var.m75942xfb822ef2(5) + ',' + is1Var.m75934xbce7f2f(6) + ',' + is1Var.m75939xb282bd08(7));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.js1 resp = (r45.js1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388513t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " size=" + resp.m75941xfb821914(4).size() + " thread=" + java.lang.Thread.currentThread());
    }
}
