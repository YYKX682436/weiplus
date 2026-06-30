package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class l10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f107268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l10(com.tencent.mm.plugin.finder.feed.r10 r10Var) {
        super(0);
        this.f107268d = r10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f107268d;
        int size = r10Var.f107156e.getSize();
        com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
        int a07 = a1Var != null ? a1Var.o().a0() : 0;
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = r10Var.f107156e;
        baseFeedLoader.getDataListJustForAdapter().clear();
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = r10Var.f107157f;
        if (a1Var2 != null) {
            a1Var2.o().notifyItemRangeRemoved(a07, size);
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var3 = r10Var.f107157f;
        kotlin.jvm.internal.o.e(a1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
        com.tencent.mm.plugin.finder.feed.x10 x10Var = (com.tencent.mm.plugin.finder.feed.x10) a1Var3;
        synchronized (x10Var) {
            if (x10Var.B != null) {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter o17 = x10Var.o();
                kotlin.jvm.internal.o.d(x10Var.B);
                o17.i0(r5.hashCode(), true);
            }
        }
        java.util.ArrayList arrayList = r10Var.f108879z.f257468e;
        if (arrayList != null) {
            baseFeedLoader.getDataListJustForAdapter().addAll(arrayList);
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var4 = r10Var.f107157f;
        if (a1Var4 != null) {
            a1Var4.o().notifyItemRangeRemoved(a07, baseFeedLoader.getSize());
        }
        return jz5.f0.f302826a;
    }
}
