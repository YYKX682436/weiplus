package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes8.dex */
public final class v6 implements o72.h3 {
    public final java.util.List a() {
        o72.i3 tj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj();
        tj6.getClass();
        boolean z17 = tj6.f343363d;
        java.util.List list = tj6.f343364e;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTagSetMgr", "want get tag list, it is dirty, reload data");
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            linkedList.clear();
            java.util.Iterator it = tj6.f343360a.f384201d.iterator();
            while (it.hasNext()) {
                linkedList.addAll(((r45.pq0) it.next()).f383301e);
            }
            tj6.f343363d = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagSetMgr", "want get tag list, tag list size is %d", java.lang.Integer.valueOf(((java.util.LinkedList) list).size()));
        kotlin.jvm.internal.o.f(list, "getTagInfoListByIndex(...)");
        return list;
    }
}
