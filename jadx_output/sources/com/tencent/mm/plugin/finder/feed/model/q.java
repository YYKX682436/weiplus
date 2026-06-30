package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class q implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader f108260d;

    public q(com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader finderColumnFeedListLoader) {
        this.f108260d = finderColumnFeedListLoader;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) ((jz5.l) obj).f302833d;
        com.tencent.mm.plugin.finder.feed.model.FinderColumnFeedListLoader finderColumnFeedListLoader = this.f108260d;
        synchronized (finderColumnFeedListLoader.f107396e) {
            java.util.ArrayList dataList = finderColumnFeedListLoader.getDataList();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(dataList, 10));
            java.util.Iterator it = dataList.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((so2.j5) it.next()).getItemId()));
            }
            java.util.Set X0 = kz5.n0.X0(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = dataBuffer.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (!X0.contains(java.lang.Long.valueOf(((so2.j5) next).getItemId()))) {
                    arrayList2.add(next);
                }
            }
            com.tencent.mars.xlog.Log.i(finderColumnFeedListLoader.getF123427d(), "FinderGlobalVMStore getViewModel mergeExternalData:" + finderColumnFeedListLoader.f107395d);
            ey2.u uVar = (ey2.u) ey2.l0.f257422a.a(finderColumnFeedListLoader.f107395d, ey2.u.class, null);
            if (uVar != null) {
                if (uVar.f257531m) {
                    com.tencent.mm.plugin.finder.feed.model.s sVar = new com.tencent.mm.plugin.finder.feed.model.s(0, 0, "", false, 8, null);
                    sVar.setIncrementList(null);
                    sVar.setHasMore(false);
                    finderColumnFeedListLoader.onFetchDone(sVar);
                } else if (!arrayList2.isEmpty()) {
                    int size = finderColumnFeedListLoader.getDataList().size();
                    finderColumnFeedListLoader.getDataList().addAll(arrayList2);
                    int size2 = arrayList2.size();
                    com.tencent.mm.plugin.finder.feed.model.s sVar2 = new com.tencent.mm.plugin.finder.feed.model.s(0, 0, "", false, 8, null);
                    sVar2.setIncrementList(finderColumnFeedListLoader.getDataList().subList(size, size2 + size));
                    sVar2.setHasMore(true);
                    finderColumnFeedListLoader.onFetchDone(sVar2);
                }
            }
        }
    }
}
