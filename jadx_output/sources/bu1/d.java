package bu1;

/* loaded from: classes2.dex */
public final class d extends au1.s {
    public d(java.lang.String cardId, java.lang.String userCardId) {
        kotlin.jvm.internal.o.g(cardId, "cardId");
        kotlin.jvm.internal.o.g(userCardId, "userCardId");
        r45.ro5 ro5Var = new r45.ro5();
        r45.js5 so5Var = new r45.so5();
        ro5Var.f385063d = cardId;
        ro5Var.f385064e = userCardId;
        s(ro5Var, so5Var, 2986, "/cgi-bin/mmpay-bin/mktremovecardinrecentlyusedlist");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRemoveCardInRecentlyUsedList", "card_id: " + cardId + ", code: " + userCardId);
    }
}
