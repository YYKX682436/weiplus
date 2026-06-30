package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cc extends com.tencent.mm.plugin.finder.feed.gj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.bc presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.q(data);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = o().getRecyclerView().getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            finderLinearLayoutManager.C = false;
        }
    }
}
