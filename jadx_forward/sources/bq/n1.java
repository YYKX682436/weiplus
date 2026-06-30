package bq;

/* loaded from: classes.dex */
public final class n1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String qrCodeUrl) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrCodeUrl, "qrCodeUrl");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.zt2 zt2Var = new r45.zt2();
        zt2Var.set(1, db2.t4.f309704a.a(19558));
        zt2Var.set(2, qrCodeUrl);
        lVar.f152197a = zt2Var;
        r45.au2 au2Var = new r45.au2();
        au2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) au2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = au2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderscanqrcode";
        lVar.f152200d = 19558;
        p(lVar.a());
    }
}
