package bq;

/* loaded from: classes.dex */
public final class e0 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(r45.qt2 contextObj, long j17, long j18, java.lang.String nonceId) {
        super(contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.a51 a51Var = new r45.a51();
        a51Var.set(2, java.lang.Long.valueOf(j17));
        a51Var.set(3, java.lang.Long.valueOf(j18));
        a51Var.set(4, nonceId);
        a51Var.set(1, db2.t4.f309704a.b(11137, contextObj));
        lVar.f152197a = a51Var;
        lVar.f152198b = new r45.b51();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetbulletcommentuserinfo";
        lVar.f152200d = 11137;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.b51 resp = (r45.b51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
