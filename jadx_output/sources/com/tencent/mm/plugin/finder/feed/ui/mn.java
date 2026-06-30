package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class mn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        super(1);
        this.f110315d = finderTopicTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = this.f110315d;
        com.tencent.mm.plugin.finder.feed.v20 v20Var = finderTopicTimelineUI.E;
        if (v20Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        v20Var.o().setRefreshingState(false);
        com.tencent.mm.plugin.finder.feed.v20 v20Var2 = finderTopicTimelineUI.E;
        if (v20Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        v20Var2.o().s(new com.tencent.mm.plugin.finder.feed.ui.kn(it, finderTopicTimelineUI));
        com.tencent.mm.plugin.finder.feed.v20 v20Var3 = finderTopicTimelineUI.E;
        if (v20Var3 != null) {
            v20Var3.getRecyclerView().post(new com.tencent.mm.plugin.finder.feed.ui.ln(finderTopicTimelineUI));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
