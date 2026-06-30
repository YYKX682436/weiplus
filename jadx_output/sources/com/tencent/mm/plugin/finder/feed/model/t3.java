package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class t3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveRelatedFeedColumnLoader f108363d;

    public t3(com.tencent.mm.plugin.finder.feed.model.FinderLiveRelatedFeedColumnLoader finderLiveRelatedFeedColumnLoader) {
        this.f108363d = finderLiveRelatedFeedColumnLoader;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.List list;
        java.lang.Iterable iterable;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) ((jz5.l) obj).f302833d;
        com.tencent.mm.plugin.finder.feed.model.FinderLiveRelatedFeedColumnLoader finderLiveRelatedFeedColumnLoader = this.f108363d;
        synchronized (finderLiveRelatedFeedColumnLoader.f107491p) {
            yz5.a aVar = finderLiveRelatedFeedColumnLoader.f111727e;
            if (aVar == null || (list = (java.util.List) aVar.invoke()) == null) {
                list = kz5.p0.f313996d;
            }
            km2.m mVar = (km2.m) kz5.n0.k0(list);
            if (mVar == null) {
                return;
            }
            java.util.Iterator<T> it = dataBuffer.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (((so2.j5) it.next()).getItemId() == mVar.f309129d.f68549s) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 < 0) {
                return;
            }
            int i18 = i17 + 1;
            java.lang.Iterable subList = dataBuffer.size() <= i18 ? kz5.p0.f313996d : dataBuffer.subList(i18, dataBuffer.size());
            yz5.a aVar2 = finderLiveRelatedFeedColumnLoader.f111727e;
            if (aVar2 == null || (iterable = (java.util.List) aVar2.invoke()) == null) {
                iterable = kz5.p0.f313996d;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
            java.util.Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((km2.m) it6.next()).f309129d.f68549s));
            }
            java.util.Set X0 = kz5.n0.X0(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : subList) {
                if (!X0.contains(java.lang.Long.valueOf(((so2.j5) obj2).getItemId()))) {
                    arrayList2.add(obj2);
                }
            }
            java.util.List f17 = finderLiveRelatedFeedColumnLoader.f(arrayList2);
            com.tencent.mars.xlog.Log.i(finderLiveRelatedFeedColumnLoader.getF123427d(), "FinderGlobalVMStore getViewModel mergeExternalData:" + finderLiveRelatedFeedColumnLoader.f107490o);
            ey2.u e17 = finderLiveRelatedFeedColumnLoader.e();
            if (e17 != null) {
                if (!((java.util.ArrayList) f17).isEmpty()) {
                    boolean z17 = !e17.f257531m;
                    com.tencent.mm.plugin.finder.feed.model.w3 w3Var = new com.tencent.mm.plugin.finder.feed.model.w3(0, 0, "", false, 8, null);
                    w3Var.setIncrementList(new java.util.ArrayList(f17));
                    w3Var.setHasMore(z17);
                    finderLiveRelatedFeedColumnLoader.onFetchDone(w3Var);
                } else {
                    com.tencent.mm.plugin.finder.feed.model.w3 w3Var2 = new com.tencent.mm.plugin.finder.feed.model.w3(0, 0, "", false, 8, null);
                    w3Var2.setIncrementList(null);
                    w3Var2.setHasMore(false);
                    finderLiveRelatedFeedColumnLoader.onFetchDone(w3Var2);
                }
            }
        }
    }
}
