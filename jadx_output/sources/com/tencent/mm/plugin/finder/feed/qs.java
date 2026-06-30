package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qs extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ss f108848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs(com.tencent.mm.plugin.finder.feed.ss ssVar) {
        super(1);
        this.f108848d = ssVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.ss ssVar = this.f108848d;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = ssVar.f106570t;
        if (intValue >= ((baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == 0) ? 0 : dataListJustForAdapter.size())) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = ssVar.f106570t;
        so2.j5 j5Var = baseFeedLoader2 != null ? (so2.j5) baseFeedLoader2.get(intValue) : null;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        }
        return null;
    }
}
