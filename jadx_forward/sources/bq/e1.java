package bq;

/* loaded from: classes.dex */
public final class e1 extends bq.e {
    public e1(r45.qt2 qt2Var, long j17, long j18, long j19) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.on2 on2Var = new r45.on2();
        on2Var.set(2, java.lang.Long.valueOf(j17));
        on2Var.set(3, java.lang.Long.valueOf(j18));
        on2Var.set(4, java.lang.Long.valueOf(j19));
        on2Var.set(1, db2.t4.f309704a.b(11836, qt2Var));
        lVar.f152197a = on2Var;
        lVar.f152198b = new r45.pn2();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderopbulletcomment";
        lVar.f152200d = 11836;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.pn2 resp = (r45.pn2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpBulletCommentCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
