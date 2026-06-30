package aj5;

/* loaded from: classes.dex */
public final class m implements yz5.l {
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList snapshotList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(snapshotList, "snapshotList");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactAddressBookRecommendStrictDupUIC", "removeRecommendChatRoomUpdater");
        java.util.Iterator it = snapshotList.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            int i17 = ri5.j.L;
            int i18 = ((ri5.j) next).f396110e;
            if (i18 == i17 || i18 == ri5.j.M) {
                it.remove();
            }
        }
        return jz5.f0.f302826a;
    }
}
