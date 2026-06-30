package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zq extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f111288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(1);
        this.f111288d = krVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue < 0) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.kr krVar = this.f111288d;
        if (intValue >= krVar.m().getDataListJustForAdapter().size()) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m17 = krVar.m();
        so2.j5 j5Var = m17 != null ? (so2.j5) m17.get(intValue) : null;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        }
        return null;
    }
}
