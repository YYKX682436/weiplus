package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xv f108852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(com.tencent.mm.plugin.finder.feed.xv xvVar) {
        super(0);
        this.f108852d = xvVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.xv xvVar = this.f108852d;
        int size = xvVar.f111114p.getSize();
        int a07 = ((com.tencent.mm.plugin.finder.feed.cw) xvVar.c()).g().a0();
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = xvVar.f111114p;
        finderTimelineFeedLoader.getDataListJustForAdapter().clear();
        ((com.tencent.mm.plugin.finder.feed.cw) xvVar.c()).j().onItemRangeRemoved(a07, size);
        finderTimelineFeedLoader.getDataListJustForAdapter().addAll(xvVar.f111106e.N6(4).f257443c);
        ((com.tencent.mm.plugin.finder.feed.cw) xvVar.c()).j().onItemRangeInserted(a07, xvVar.f111105d.getSize());
        return jz5.f0.f302826a;
    }
}
