package bq;

/* loaded from: classes.dex */
public final class p1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(r45.qt2 qt2Var, java.lang.String finderNickName, java.lang.String eventName) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderNickName, "finderNickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.cu2 cu2Var = new r45.cu2();
        cu2Var.set(1, db2.t4.f309704a.b(6241, qt2Var));
        cu2Var.set(5, finderNickName);
        cu2Var.set(6, eventName);
        lVar.f152197a = cu2Var;
        lVar.f152198b = new r45.du2();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersearchevent";
        lVar.f152200d = 6241;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.du2 resp = (r45.du2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSearchEventCGI", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
