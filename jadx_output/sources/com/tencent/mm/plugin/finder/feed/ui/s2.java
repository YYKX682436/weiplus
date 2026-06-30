package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class s2 implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI f110519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader f110520b;

    public s2(com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI finderFloatBallDetailUI, com.tencent.mm.plugin.finder.feed.model.FinderFloatBallDetailLoader finderFloatBallDetailLoader) {
        this.f110519a = finderFloatBallDetailUI;
        this.f110520b = finderFloatBallDetailLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI finderFloatBallDetailUI = this.f110519a;
        com.tencent.mm.plugin.finder.feed.z9 z9Var = finderFloatBallDetailUI.f109243y;
        if (z9Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = z9Var.getRecyclerView();
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.ui.r2((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager, this.f110520b, finderFloatBallDetailUI, recyclerView));
        }
    }
}
