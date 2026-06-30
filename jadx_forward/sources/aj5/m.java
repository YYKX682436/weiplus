package aj5;

/* loaded from: classes.dex */
public final class m implements yz5.l {
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList snapshotList = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotList, "snapshotList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "removeRecommendChatRoomUpdater");
        java.util.Iterator it = snapshotList.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            int i17 = ri5.j.L;
            int i18 = ((ri5.j) next).f477643e;
            if (i18 == i17 || i18 == ri5.j.M) {
                it.remove();
            }
        }
        return jz5.f0.f384359a;
    }
}
