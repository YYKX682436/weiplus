package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class z1 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f108501d;

    public z1(com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f108501d = finderFeedShareRelativeListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.y1 y1Var = new com.tencent.mm.plugin.finder.feed.model.y1(0, 0, "", "", null, null, 0, null, null, 480, null);
        y1Var.setPullType(1000);
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108501d;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderFeedShareRelativeListLoader.getCache();
        if (cache != null) {
            java.util.ArrayList arrayList = cache.f108300a;
            if (!(true ^ (arrayList == null || arrayList.isEmpty()))) {
                cache = null;
            }
            if (cache != null) {
                java.lang.String tag = getTAG();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UserPageDataFetcher callInit: use old data list, size: ");
                java.util.ArrayList arrayList2 = cache.f108300a;
                sb6.append(arrayList2.size());
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                y1Var.setIncrementList(arrayList2);
                com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderFeedShareRelativeListLoader.getCache();
                y1Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
            }
        }
        return y1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0 A[LOOP:1: B:33:0x00ba->B:35:0x00c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0045  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r18, int r19, java.lang.String r20, com.tencent.mm.modelbase.i r21, com.tencent.mm.protobuf.f r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.z1.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        long j17;
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108501d;
        int size = finderFeedShareRelativeListLoader.getDataList().size() - 1;
        while (true) {
            j17 = 0;
            if (-1 >= size) {
                break;
            }
            so2.j5 j5Var = (so2.j5) finderFeedShareRelativeListLoader.getDataList().get(size);
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                if (baseFinderFeed.getFeedObject().getId() != 0) {
                    j17 = baseFinderFeed.getFeedObject().getId();
                    break;
                }
            }
            size--;
        }
        return new db2.q(finderFeedShareRelativeListLoader.M, finderFeedShareRelativeListLoader.f107433d, finderFeedShareRelativeListLoader.f107434e, j17, finderFeedShareRelativeListLoader.getLastBuffer(), 2, finderFeedShareRelativeListLoader.getContextObj());
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f108501d;
        return new db2.q(finderFeedShareRelativeListLoader.M, finderFeedShareRelativeListLoader.f107433d, finderFeedShareRelativeListLoader.f107434e, 0L, finderFeedShareRelativeListLoader.getLastBuffer(), 0, finderFeedShareRelativeListLoader.getContextObj());
    }
}
