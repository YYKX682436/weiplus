package au1;

/* loaded from: classes2.dex */
public final class j extends au1.s {
    public j(java.lang.String cardId) {
        kotlin.jvm.internal.o.g(cardId, "cardId");
        r45.gd0 gd0Var = new r45.gd0();
        r45.js5 hd0Var = new r45.hd0();
        gd0Var.f375130d = cardId;
        s(gd0Var, hd0Var, 1739, "/cgi-bin/mmpay-bin/mktdeletecardinticketlist");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiDeleteCardInTicketList", "cardid: %s", cardId);
    }
}
