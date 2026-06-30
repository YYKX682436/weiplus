package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class r implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109889d;

    public r(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109889d = finderCommentImageFlowUI;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109889d;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = finderCommentImageFlowUI.f109778v;
        on5.c loadMoreFooter = wxRefreshLayout != null ? wxRefreshLayout.getLoadMoreFooter() : null;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.LoadMoreFooter loadMoreFooter2 = loadMoreFooter instanceof com.tencent.mm.plugin.finder.feed.ui.commentimage.LoadMoreFooter ? (com.tencent.mm.plugin.finder.feed.ui.commentimage.LoadMoreFooter) loadMoreFooter : null;
        if (loadMoreFooter2 != null) {
            loadMoreFooter2.setOnRefreshStateNone(new com.tencent.mm.plugin.finder.feed.ui.commentimage.q(finderCommentImageFlowUI, loadMoreFooter2));
        }
        if (finderCommentImageFlowUI.d7().f109830q) {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = finderCommentImageFlowUI.f109778v;
            if (wxRefreshLayout2 != null) {
                wxRefreshLayout2.e(true);
            }
        } else {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout3 = finderCommentImageFlowUI.f109778v;
            if (wxRefreshLayout3 != null) {
                wxRefreshLayout3.f();
            }
        }
        int size = finderCommentImageFlowUI.d7().f109827n.size();
        if (true ^ list.isEmpty()) {
            finderCommentImageFlowUI.d7().f109827n.addAll(list);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = finderCommentImageFlowUI.f109780x;
            if (wxRecyclerAdapter != null) {
                int a07 = wxRecyclerAdapter.a0() + size;
                wxRecyclerAdapter.notifyItemRangeInserted(a07, list.size());
                androidx.recyclerview.widget.RecyclerView recyclerView = finderCommentImageFlowUI.f109777u;
                if (recyclerView != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(a07));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$collectFlows$1$1", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$collectFlows$1$1", "emit", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
