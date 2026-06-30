package ab2;

/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab2.g0 f2760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ab2.g0 g0Var) {
        super(1);
        this.f2760d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            return null;
        }
        ab2.g0 g0Var = this.f2760d;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = g0Var.f106570t;
        if (intValue >= ((baseFeedLoader == null || (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) == 0) ? 0 : dataListJustForAdapter.size())) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = g0Var.f106570t;
        so2.j5 j5Var = baseFeedLoader2 != null ? (so2.j5) baseFeedLoader2.get(intValue) : null;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        }
        return null;
    }
}
