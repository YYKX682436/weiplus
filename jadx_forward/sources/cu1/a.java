package cu1;

/* loaded from: classes2.dex */
public final class a extends au1.s {
    public a(java.lang.String cardId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        r45.gd0 gd0Var = new r45.gd0();
        r45.js5 id0Var = new r45.id0();
        gd0Var.f456663d = cardId;
        s(gd0Var, id0Var, 5027, "/cgi-bin/mmpay-bin/mktdeletecoupon");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiDeleteCouponRequest", "cardid: %s", cardId);
    }
}
