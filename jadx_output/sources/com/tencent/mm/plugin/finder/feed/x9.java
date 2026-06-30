package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.y9 f111048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(com.tencent.mm.plugin.finder.feed.y9 y9Var) {
        super(2);
        this.f111048d = y9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        java.util.List dataListJustForAdapter;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter2;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        if (intValue >= 0) {
            com.tencent.mm.plugin.finder.feed.y9 y9Var = this.f111048d;
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader2 = y9Var.f106570t;
            if (intValue2 < ((baseFeedLoader2 == null || (dataListJustForAdapter2 = baseFeedLoader2.getDataListJustForAdapter()) == 0) ? 0 : dataListJustForAdapter2.size()) && (baseFeedLoader = y9Var.f106570t) != null && (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) != null) {
                return new java.util.LinkedList(kz5.n0.C0(dataListJustForAdapter, new e06.k(intValue, intValue2)));
            }
        }
        return null;
    }
}
