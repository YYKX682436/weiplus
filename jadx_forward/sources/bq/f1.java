package bq;

/* loaded from: classes.dex */
public final class f1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105018o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(java.lang.String finderUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, int i17) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f105018o = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.fo2 fo2Var = new r45.fo2();
        lVar.f152197a = fo2Var;
        fo2Var.set(2, finderUsername);
        fo2Var.set(3, gVar);
        fo2Var.set(1, db2.t4.f309704a.b(14792, qt2Var));
        lVar.f152197a = fo2Var;
        r45.go2 go2Var = new r45.go2();
        go2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) go2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = go2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderpaidcollectionuserpage";
        lVar.f152200d = 14792;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.go2 resp = (r45.go2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPaidCollectionUserPageCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
