package com.tencent.mm.plugin.card.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/card/ui/v3/CardRefreshLoadMoreLayout;", "Lcom/tencent/mm/view/RefreshLoadMoreLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-card_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CardRefreshLoadMoreLayout extends com.tencent.mm.view.RefreshLoadMoreLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRefreshLoadMoreLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // com.tencent.mm.view.RefreshLoadMoreLayout, com.tencent.mm.view.HeadFooterLayout
    public void g(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.HeadFooterLayout parent, int i17, int i18, boolean z17, boolean z18, int[] consumed, int i19, boolean z19) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(consumed, "consumed");
        if (i19 == 1 && e(recyclerView) && this.isRefreshing) {
            recyclerView.f1();
        }
        super.g(recyclerView, parent, i17, i18, z17, z18, consumed, i19, z19);
    }

    @Override // com.tencent.mm.view.RefreshLoadMoreLayout, com.tencent.mm.view.HeadFooterLayout
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.HeadFooterLayout parent, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(parent, "parent");
        super.i(recyclerView, parent, i17);
        if (i17 == 0) {
            if (com.tencent.mm.view.RefreshLoadMoreLayout.F(this, false, null, 3, null) && this.isRefreshing && this.isHasTopMore) {
                recyclerView.f1();
                com.tencent.mm.view.RefreshLoadMoreLayout.w(this, 0, false, null, 7, null);
                return;
            }
            return;
        }
        if (i17 == 1 && e(recyclerView) && this.isRefreshing && this.isHasTopMore) {
            recyclerView.f1();
            com.tencent.mm.view.RefreshLoadMoreLayout.w(this, 0, false, null, 7, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRefreshLoadMoreLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
