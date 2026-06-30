package bq;

/* loaded from: classes.dex */
public final class n extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105029o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String finderUsername, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, int i17) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f105029o = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.xz0 xz0Var = new r45.xz0();
        xz0Var.set(2, finderUsername);
        xz0Var.set(3, gVar);
        xz0Var.set(1, db2.t4.f309704a.b(7032, qt2Var));
        lVar.f152197a = xz0Var;
        lVar.f152198b = new r45.yz0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercourseuserpage";
        lVar.f152200d = 7032;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCourseUserPageCGI", "init userName = " + finderUsername + ", lastBuffer:" + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.yz0 resp = (r45.yz0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCourseUserPageCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
