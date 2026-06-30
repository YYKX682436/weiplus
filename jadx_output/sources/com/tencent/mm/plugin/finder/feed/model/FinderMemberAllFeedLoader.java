package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderMemberAllFeedLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/d4", "com/tencent/mm/plugin/finder/feed/model/f4", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMemberAllFeedLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f107500d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107501e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107502f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f107503g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.f4 f107504h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f107505i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r6 != 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FinderMemberAllFeedLoader(r45.qt2 r2, java.lang.String r3, java.lang.String r4, com.tencent.mm.protobuf.g r5, int r6) {
        /*
            r1 = this;
            java.lang.String r0 = "finderUsername"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "myFinderUsername"
            kotlin.jvm.internal.o.g(r4, r0)
            r1.<init>(r2)
            r1.f107500d = r3
            r1.f107501e = r4
            r1.f107502f = r6
            r1.setLastBuffer(r5)
            boolean r2 = kotlin.jvm.internal.o.b(r3, r4)
            if (r2 != 0) goto L20
            r2 = 1
            if (r6 == r2) goto L20
            goto L21
        L20:
            r2 = 0
        L21:
            r1.f107503g = r2
            com.tencent.mm.plugin.finder.feed.model.f4 r2 = new com.tencent.mm.plugin.finder.feed.model.f4
            r2.<init>(r1)
            r1.f107504h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.FinderMemberAllFeedLoader.<init>(r45.qt2, java.lang.String, java.lang.String, com.tencent.mm.protobuf.g, int):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f107504h;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.h4(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        yz5.l lVar = this.f107505i;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public int supportMemberFeedType() {
        return 3;
    }
}
