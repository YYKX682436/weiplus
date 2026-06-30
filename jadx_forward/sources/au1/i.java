package au1;

/* loaded from: classes2.dex */
public final class i extends au1.s {
    public i(java.lang.String cardId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        r45.ed0 ed0Var = new r45.ed0();
        r45.js5 fd0Var = new r45.fd0();
        ed0Var.f454831d = cardId;
        s(ed0Var, fd0Var, 2707, "/cgi-bin/mmpay-bin/mktdeletecardininvalidlist");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiDeleteCardInInvalidList", "cardid: %s", cardId);
    }
}
