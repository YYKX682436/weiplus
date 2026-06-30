package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes8.dex */
public final class v6 implements o72.h3 {
    public final java.util.List a() {
        o72.i3 tj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj();
        tj6.getClass();
        boolean z17 = tj6.f424896d;
        java.util.List list = tj6.f424897e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagSetMgr", "want get tag list, it is dirty, reload data");
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            linkedList.clear();
            java.util.Iterator it = tj6.f424893a.f465734d.iterator();
            while (it.hasNext()) {
                linkedList.addAll(((r45.pq0) it.next()).f464834e);
            }
            tj6.f424896d = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagSetMgr", "want get tag list, tag list size is %d", java.lang.Integer.valueOf(((java.util.LinkedList) list).size()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getTagInfoListByIndex(...)");
        return list;
    }
}
