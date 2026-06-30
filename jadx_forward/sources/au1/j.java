package au1;

/* loaded from: classes2.dex */
public final class j extends au1.s {
    public j(java.lang.String cardId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        r45.gd0 gd0Var = new r45.gd0();
        r45.js5 hd0Var = new r45.hd0();
        gd0Var.f456663d = cardId;
        s(gd0Var, hd0Var, 1739, "/cgi-bin/mmpay-bin/mktdeletecardinticketlist");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiDeleteCardInTicketList", "cardid: %s", cardId);
    }
}
