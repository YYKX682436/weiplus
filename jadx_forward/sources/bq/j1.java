package bq;

/* loaded from: classes.dex */
public final class j1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(java.lang.String username, int i17, long j17, long j18, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.as2 as2Var = new r45.as2();
        as2Var.set(1, username);
        as2Var.set(3, java.lang.Integer.valueOf(i17));
        as2Var.set(4, java.lang.Long.valueOf(j17));
        as2Var.set(5, java.lang.Long.valueOf(j18));
        as2Var.set(2, db2.t4.f309704a.a(258));
        lVar.f152197a = as2Var;
        r45.bs2 bs2Var = new r45.bs2();
        bs2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bs2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = bs2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderqrcode";
        lVar.f152200d = 258;
        p(lVar.a());
    }
}
