package au1;

/* loaded from: classes2.dex */
public final class i extends au1.s {
    public i(java.lang.String cardId) {
        kotlin.jvm.internal.o.g(cardId, "cardId");
        r45.ed0 ed0Var = new r45.ed0();
        r45.js5 fd0Var = new r45.fd0();
        ed0Var.f373298d = cardId;
        s(ed0Var, fd0Var, 2707, "/cgi-bin/mmpay-bin/mktdeletecardininvalidlist");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiDeleteCardInInvalidList", "cardid: %s", cardId);
    }
}
