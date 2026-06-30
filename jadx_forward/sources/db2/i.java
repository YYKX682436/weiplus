package db2;

/* loaded from: classes2.dex */
public final class i extends az2.j {
    public i(r45.qt2 qt2Var, long j17, long j18, long j19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(qt2Var, null, 2, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.fa1 fa1Var = new r45.fa1();
        fa1Var.set(1, db2.t4.f309704a.b(15018, qt2Var));
        fa1Var.set(4, java.lang.Long.valueOf(j17));
        fa1Var.set(2, java.lang.Long.valueOf(j18));
        fa1Var.set(3, java.lang.Long.valueOf(j19));
        if (gVar != null) {
            fa1Var.set(5, gVar);
        }
        lVar.f152197a = fa1Var;
        r45.ga1 ga1Var = new r45.ga1();
        ga1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ga1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ga1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetsubtitle";
        lVar.f152200d = 15018;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFInderGetSubtitle", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ga1 resp = (r45.ga1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFInderGetSubtitle", "onCgiEnd " + resp);
    }
}
