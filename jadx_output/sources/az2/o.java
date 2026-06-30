package az2;

/* loaded from: classes2.dex */
public abstract class o extends az2.j {
    public o(r45.qt2 qt2Var, im5.b bVar, int i17, kotlin.jvm.internal.i iVar) {
        super((i17 & 1) != 0 ? null : qt2Var, (i17 & 2) != 0 ? null : bVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f resp, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.List C = C(resp);
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            bu2.j.f24534a.n((com.tencent.mm.plugin.finder.storage.FinderItem) it.next(), new bu2.h(this.f70646f.f70713d, D()));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("request: ");
        sb6.append(D());
        sb6.append(", allowSimpleResult: ");
        sb6.append(B());
        sb6.append(", switch: ");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        sb6.append(((java.lang.Boolean) t70Var.j1().r()).booleanValue());
        com.tencent.mars.xlog.Log.i("FinderFeedCgi", sb6.toString());
        t70Var.j1().l();
        java.util.ArrayList<com.tencent.mm.plugin.finder.storage.FinderItem> arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = C.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            r45.dm2 object_extend = ((com.tencent.mm.plugin.finder.storage.FinderItem) next).getFeedObject().getObject_extend();
            if (object_extend != null && object_extend.getInteger(40) == 1) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (com.tencent.mm.plugin.finder.storage.FinderItem finderItem : arrayList) {
            r45.rv0 rv0Var = new r45.rv0();
            com.tencent.mars.xlog.Log.i("FinderFeedCgi", "getBatchFeed: ".concat(pm0.v.u(finderItem.getId())));
            rv0Var.set(0, java.lang.Long.valueOf(finderItem.getId()));
            arrayList2.add(rv0Var);
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.j1().r()).booleanValue() && B() && (!arrayList2.isEmpty())) {
            com.tencent.mars.xlog.Log.i("FinderFeedCgi", "listSize: " + arrayList2.size());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(arrayList2);
            new az2.a(linkedList, this.f16135n, 5).l().K(new az2.n(this));
        }
    }

    public boolean B() {
        return this instanceof bq.z1;
    }

    public abstract java.util.List C(com.tencent.mm.protobuf.f fVar);

    public abstract long D();
}
