package bu1;

/* loaded from: classes2.dex */
public final class d extends au1.s {
    public d(java.lang.String cardId, java.lang.String userCardId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userCardId, "userCardId");
        r45.ro5 ro5Var = new r45.ro5();
        r45.js5 so5Var = new r45.so5();
        ro5Var.f466596d = cardId;
        ro5Var.f466597e = userCardId;
        s(ro5Var, so5Var, 2986, "/cgi-bin/mmpay-bin/mktremovecardinrecentlyusedlist");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiRemoveCardInRecentlyUsedList", "card_id: " + cardId + ", code: " + userCardId);
    }
}
