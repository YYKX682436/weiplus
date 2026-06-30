package cu1;

/* loaded from: classes2.dex */
public final class e extends au1.s {
    public e(java.lang.String cardId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        r45.to5 to5Var = new r45.to5();
        r45.js5 uo5Var = new r45.uo5();
        to5Var.f468168d = cardId;
        s(to5Var, uo5Var, 5170, "/cgi-bin/mmpay-bin/mktremovecoupon");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiRemoveCouponRequest", "cardid: %s", cardId);
    }
}
