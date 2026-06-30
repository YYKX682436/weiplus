package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vs extends com.tencent.mm.plugin.finder.feed.k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs(com.tencent.mm.ui.MMActivity context, int i17, int i18, com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader loader) {
        super(context, i17, i18, loader);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(loader, "loader");
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public in5.s c() {
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        com.tencent.mm.plugin.finder.storage.vj0 q17 = a1Var != null ? a1Var.q() : null;
        kotlin.jvm.internal.o.d(q17);
        return q17.a();
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void g() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.feed.a1 a1Var = this.f107157f;
        if (a1Var != null) {
            a1Var.r(this.f107156e.getDataListJustForAdapter());
        }
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = this.f107157f;
        if (a1Var2 == null || (refreshLoadMoreLayout = a1Var2.f106180m) == null || (textView = (android.widget.TextView) refreshLoadMoreLayout.findViewById(com.tencent.mm.R.id.ili)) == null) {
            return;
        }
        textView.setTextColor(this.f107155d.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void h() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(this.f107156e, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void i() {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f107156e, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.k0
    public void v() {
        this.f107156e.requestRefresh();
    }
}
