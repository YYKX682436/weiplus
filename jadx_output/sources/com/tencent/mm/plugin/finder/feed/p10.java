package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class p10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.r10 f108693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p10(com.tencent.mm.plugin.finder.feed.r10 r10Var) {
        super(0);
        this.f108693d = r10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f108693d.f107157f;
        kotlin.jvm.internal.o.e(a1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicFeedUIContract.TopicFeedViewCallback");
        com.tencent.mm.plugin.finder.feed.x10 x10Var = (com.tencent.mm.plugin.finder.feed.x10) a1Var;
        if (x10Var.B != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter o17 = x10Var.o();
            kotlin.jvm.internal.o.d(x10Var.B);
            o17.i0(r0.hashCode(), true);
        }
        return jz5.f0.f302826a;
    }
}
