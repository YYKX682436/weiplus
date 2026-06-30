package bq;

/* loaded from: classes.dex */
public final class d1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105015o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(r45.qt2 qt2Var, java.lang.String finderUsername, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.zj2 zj2Var = new r45.zj2();
        this.f105015o = i17;
        zj2Var.set(1, db2.t4.f309704a.b(23915, qt2Var));
        zj2Var.set(2, finderUsername);
        zj2Var.set(3, gVar);
        lVar.f152197a = zj2Var;
        r45.ak2 ak2Var = new r45.ak2();
        ak2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ak2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ak2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findernativedramauserpage";
        lVar.f152200d = 23915;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }
}
