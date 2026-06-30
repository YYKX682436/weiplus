package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class j10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f107067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j10(com.tencent.mm.plugin.finder.feed.r10 r10Var) {
        super(0);
        this.f107067d = r10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.r10 r10Var = this.f107067d;
        int size = r10Var.f107156e.getDataListJustForAdapter().size();
        com.tencent.mm.plugin.finder.feed.a1 a1Var = r10Var.f107157f;
        int a07 = a1Var != null ? a1Var.o().a0() : 0;
        r10Var.f107156e.getDataListJustForAdapter().clear();
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = r10Var.f107157f;
        if (a1Var2 != null) {
            a1Var2.o().notifyItemRangeRemoved(a07, size);
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var3 = r10Var.f107157f;
        kotlin.jvm.internal.o.e(a1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
        com.tencent.mm.plugin.finder.feed.x10 x10Var = (com.tencent.mm.plugin.finder.feed.x10) a1Var3;
        synchronized (x10Var) {
            x10Var.W();
        }
        r10Var.v();
        return jz5.f0.f302826a;
    }
}
