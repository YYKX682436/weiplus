package ac2;

/* loaded from: classes2.dex */
public final class c0 extends com.tencent.mm.plugin.finder.feed.model.internal.h {

    /* renamed from: a, reason: collision with root package name */
    public int f3016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader f3017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader) {
        super(finderNativeDramaTimelineFeedLoader, false, 1, null);
        this.f3017b = finderNativeDramaTimelineFeedLoader;
        this.f3016a = 1000;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        int i18 = this.f3016a;
        java.util.List<so2.j5> list2 = kz5.p0.f313996d;
        com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader = this.f3017b;
        if (i18 != 0) {
            if (i18 != 1) {
                return super.mergeDataAndNotify(i17, list, z17, obj);
            }
            this.f3016a = 0;
            if (list != null) {
                list2 = list;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge pull top: size %d", java.lang.Integer.valueOf(list2.size()));
            com.tencent.mm.plugin.finder.feed.model.internal.u0 u0Var = new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, list2.size(), new java.util.LinkedList(), false, false, 24, null);
            finderNativeDramaTimelineFeedLoader.getDataList().addAll(0, list2);
            finderNativeDramaTimelineFeedLoader.getDispatcher().d(0, list2.size());
            return u0Var;
        }
        this.f3016a = 0;
        if (list != null) {
            list2 = list;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge enter: size %d", java.lang.Integer.valueOf(list2.size()));
        so2.j5 j5Var = (so2.j5) kz5.n0.Z(finderNativeDramaTimelineFeedLoader.getDataList());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var2 : list2) {
            java.util.Iterator it = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((so2.j5) it.next()).getItemId() == j5Var2.getItemId()) {
                    break;
                }
                i19++;
            }
            if (i19 == -1) {
                arrayList.add(j5Var2);
            }
        }
        if (j5Var == null) {
            finderNativeDramaTimelineFeedLoader.getDataList().addAll(arrayList);
            finderNativeDramaTimelineFeedLoader.getDispatcher().a();
            com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge enter: no first feed");
            return new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
        }
        java.util.Iterator it6 = arrayList.iterator();
        int i27 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i27 = -1;
                break;
            }
            if (((so2.j5) it6.next()).getItemId() == j5Var.getItemId()) {
                break;
            }
            i27++;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderNativeDramaTimelineFeedLoader", "merge enter: feed index %d", java.lang.Integer.valueOf(i27));
        if (i27 == -1) {
            finderNativeDramaTimelineFeedLoader.getDataList().addAll(arrayList);
            finderNativeDramaTimelineFeedLoader.getDispatcher().d(0, arrayList.size());
            return new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
        }
        if (i27 != 0) {
            finderNativeDramaTimelineFeedLoader.getDataList().addAll(0, arrayList.subList(0, i27));
            finderNativeDramaTimelineFeedLoader.getDispatcher().d(0, i27);
        }
        int i28 = i27 + 1;
        if (i28 < arrayList.size()) {
            int size = finderNativeDramaTimelineFeedLoader.getDataList().size();
            finderNativeDramaTimelineFeedLoader.getDataList().addAll(size, arrayList.subList(i28, arrayList.size()));
            finderNativeDramaTimelineFeedLoader.getDispatcher().d(size, arrayList.size() - i27);
        }
        return new com.tencent.mm.plugin.finder.feed.model.internal.u0(0, arrayList.size(), new java.util.LinkedList(), false, false, 24, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeInit(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f3016a = response.getPullType();
        super.mergeInit(response, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f3016a = 1000;
        super.mergeLoadMore(response, lVar);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.h, com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f3016a = response.getPullType();
        super.mergeRefresh(response, lVar);
    }
}
