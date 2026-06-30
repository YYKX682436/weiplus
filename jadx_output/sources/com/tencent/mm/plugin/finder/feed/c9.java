package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public class c9 extends com.tencent.mm.plugin.finder.feed.i0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.b9 presenter, int i17, int i18, boolean z17) {
        super(context, presenter, i17, i18, z17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void u() {
        o().setEnableLoadMore(false);
        androidx.recyclerview.widget.f2 adapter = getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.getItemCount();
        }
    }
}
