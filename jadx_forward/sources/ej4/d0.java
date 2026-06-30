package ej4;

/* loaded from: classes11.dex */
public final class d0 {
    public d0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String statusId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicSelfItemHelper", "deleteHistoryCardWithStatusId >> ".concat(statusId));
        int size = ej4.e0.f334880f.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.LinkedList linkedList = ej4.e0.f334880f;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((pj4.n1) linkedList.get(i17)).f436732d, statusId)) {
                linkedList.remove(i17);
                return;
            }
        }
    }
}
