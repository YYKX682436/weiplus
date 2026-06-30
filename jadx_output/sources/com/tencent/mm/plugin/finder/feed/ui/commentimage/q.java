package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.LoadMoreFooter f109886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI, com.tencent.mm.plugin.finder.feed.ui.commentimage.LoadMoreFooter loadMoreFooter) {
        super(0);
        this.f109885d = finderCommentImageFlowUI;
        this.f109886e = loadMoreFooter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
        com.tencent.mm.plugin.finder.ui.o6 o6Var;
        android.view.View f17;
        int[] c17;
        int i17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109885d;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderCommentImageFlowUI.f109777u;
        if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null && (f17 = (o6Var = finderCommentImageFlowUI.f109779w).f(layoutManager)) != null && (((i17 = (c17 = o6Var.c(layoutManager, f17))[0]) != 0 || c17[1] != 0) && (recyclerView = finderCommentImageFlowUI.f109777u) != null)) {
            recyclerView.smoothScrollBy(i17, c17[1]);
        }
        com.tencent.mm.plugin.finder.feed.ui.commentimage.LoadMoreFooter loadMoreFooter = this.f109886e;
        if (loadMoreFooter != null) {
            loadMoreFooter.setOnRefreshStateNone(null);
        }
        return jz5.f0.f302826a;
    }
}
