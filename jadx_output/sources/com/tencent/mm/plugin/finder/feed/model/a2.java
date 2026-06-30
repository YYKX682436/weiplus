package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class a2 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public int f107696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f107697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        super(finderFeedShareRelativeListLoader, false, 1, null);
        this.f107697b = finderFeedShareRelativeListLoader;
        this.f107696a = 1000;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.u0 u0Var;
        int i18;
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f107697b;
        com.tencent.mars.xlog.Log.i(finderFeedShareRelativeListLoader.getF123427d(), "mergeDataAndNotify originPullType:" + this.f107696a);
        int i19 = this.f107696a;
        int i27 = 0;
        if (i19 == 0) {
            this.f107696a = 1000;
            java.util.List arrayList = list == null ? new java.util.ArrayList() : list;
            printList("newList", i17, arrayList);
            so2.j5 j5Var = (so2.j5) kz5.n0.Z(finderFeedShareRelativeListLoader.getDataList());
            if (j5Var != null) {
                java.util.Iterator<com.tencent.mm.plugin.finder.feed.model.internal.r0> it = arrayList.iterator();
                int i28 = 0;
                while (true) {
                    i18 = -1;
                    if (!it.hasNext()) {
                        i28 = -1;
                        break;
                    }
                    if (((so2.j5) it.next()).getItemId() == j5Var.getItemId()) {
                        break;
                    }
                    i28++;
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                int i29 = 0;
                for (java.lang.Object obj2 : arrayList) {
                    int i37 = i29 + 1;
                    if (i29 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var2 = (so2.j5) obj2;
                    if (i29 < i28) {
                        linkedList.add(j5Var2);
                    }
                    i29 = i37;
                }
                com.tencent.mars.xlog.Log.i(finderFeedShareRelativeListLoader.getF123427d(), "headSize %d ", java.lang.Integer.valueOf(linkedList.size()));
                if (linkedList.size() > 0) {
                    finderFeedShareRelativeListLoader.getDataList().addAll(0, linkedList);
                    finderFeedShareRelativeListLoader.getDispatcher().d(0, linkedList.size());
                }
                so2.j5 j5Var3 = finderFeedShareRelativeListLoader.B;
                if (j5Var3 != null) {
                    j5Var = j5Var3;
                }
                java.util.Iterator it6 = finderFeedShareRelativeListLoader.getDataList().iterator();
                int i38 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i38 = -1;
                        break;
                    }
                    if (((so2.j5) it6.next()).getItemId() == j5Var.getItemId()) {
                        break;
                    }
                    i38++;
                }
                if (i38 == -1) {
                    i38 = 0;
                }
                int size = finderFeedShareRelativeListLoader.getDataList().size();
                java.lang.String f123427d = finderFeedShareRelativeListLoader.getF123427d();
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(i38);
                objArr[1] = java.lang.Integer.valueOf(size);
                objArr[2] = java.lang.Boolean.valueOf(finderFeedShareRelativeListLoader.B != null);
                com.tencent.mars.xlog.Log.i(f123427d, "centerIndex %d oldSize %d useLast %b", objArr);
                int i39 = i38 + 1;
                if (i39 < size) {
                    finderFeedShareRelativeListLoader.getDataList().subList(i39, finderFeedShareRelativeListLoader.getDataList().size()).clear();
                }
                java.util.Iterator<com.tencent.mm.plugin.finder.feed.model.internal.r0> it7 = arrayList.iterator();
                int i47 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    if (((so2.j5) it7.next()).getItemId() == j5Var.getItemId()) {
                        i18 = i47;
                        break;
                    }
                    i47++;
                }
                if (i18 >= i28) {
                    i28 = i18;
                }
                for (java.lang.Object obj3 : arrayList) {
                    int i48 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var4 = (so2.j5) obj3;
                    if (i27 > i28) {
                        linkedList2.add(j5Var4);
                    }
                    i27 = i48;
                }
                com.tencent.mars.xlog.Log.i(finderFeedShareRelativeListLoader.getF123427d(), "tailSize %d dataSize %d", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(finderFeedShareRelativeListLoader.getDataList().size()));
                finderFeedShareRelativeListLoader.getDataList().addAll(linkedList2);
                if (finderFeedShareRelativeListLoader.getDataList().size() > size) {
                    finderFeedShareRelativeListLoader.getDispatcher().d(size, finderFeedShareRelativeListLoader.getDataList().size() - size);
                } else if (finderFeedShareRelativeListLoader.getDataList().size() < size) {
                    finderFeedShareRelativeListLoader.getDispatcher().e(finderFeedShareRelativeListLoader.getDataList().size(), size - finderFeedShareRelativeListLoader.getDataList().size());
                }
                if (i39 < size) {
                    finderFeedShareRelativeListLoader.getDispatcher().b(i39, linkedList2.size());
                }
                return new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
            }
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            linkedList3.addAll(arrayList);
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            linkedList4.add(0);
            u0Var = new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, 0, linkedList4, false, false, 24, null);
            finderFeedShareRelativeListLoader.getDataList().addAll(linkedList3);
            finderFeedShareRelativeListLoader.getDispatcher().a();
            printList("dataList", i17, finderFeedShareRelativeListLoader.getDataList());
        } else {
            if (i19 != 19 || !finderFeedShareRelativeListLoader.f107443q) {
                return super.mergeDataAndNotify(i17, list, z17, obj);
            }
            java.util.List arrayList2 = list == null ? new java.util.ArrayList() : list;
            u0Var = new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, arrayList2.size(), new java.util.LinkedList(), false, false, 24, null);
            finderFeedShareRelativeListLoader.getDataList().addAll(0, arrayList2);
            finderFeedShareRelativeListLoader.getDispatcher().d(0, arrayList2.size());
        }
        return u0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f107697b;
        if (finderFeedShareRelativeListLoader.f107442p) {
            com.tencent.mm.plugin.finder.feed.model.y1 y1Var = response instanceof com.tencent.mm.plugin.finder.feed.model.y1 ? (com.tencent.mm.plugin.finder.feed.model.y1) response : null;
            this.f107696a = y1Var != null ? y1Var.f108472b : 1000;
        }
        com.tencent.mars.xlog.Log.i(finderFeedShareRelativeListLoader.getF123427d(), "originPullType:" + this.f107696a);
        super.mergeLoadMore(response, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        if (this.f107697b.f107443q) {
            com.tencent.mm.plugin.finder.feed.model.y1 y1Var = response instanceof com.tencent.mm.plugin.finder.feed.model.y1 ? (com.tencent.mm.plugin.finder.feed.model.y1) response : null;
            this.f107696a = y1Var != null ? y1Var.f108472b : 1000;
        }
        super.mergeRefresh(response, lVar);
    }
}
