package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class lg extends com.tencent.mm.plugin.finder.feed.gj {

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f110272r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f110273s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f110274t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f110275u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.ui.dg presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f110272r = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ig(context));
        this.f110273s = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.eg(context));
        this.f110274t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.jg(context));
        this.f110275u = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.kg(context));
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void q(java.util.ArrayList data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.q(data);
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = o();
        com.tencent.mm.ui.MMActivity mMActivity = this.f106968d;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.f489176bk2, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        o17.setRefreshHeaderView(inflate);
        com.tencent.mm.view.RefreshLoadMoreLayout o18 = o();
        android.view.View inflate2 = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.bs8, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        o18.setLoadMoreFooter(inflate2);
        com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = (com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout) mMActivity.findViewById(com.tencent.mm.R.id.ghe);
        stickTopLoadingLayout.setPadding(0, ((java.lang.Number) ((jz5.n) this.f110272r).getValue()).intValue() + (((java.lang.Number) ((jz5.n) this.f110273s).getValue()).intValue() / 2), 0, 0);
        o().setStickTopLoadingLayout(stickTopLoadingLayout);
        int dimension = (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi);
        o().setLimitTopRequest(dimension - ((int) ((java.lang.Number) ((jz5.n) this.f110275u).getValue()).floatValue()));
        o().setRefreshTargetY(-dimension);
        o().setDamping(1.6f);
        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.f486458la3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        if (recyclerView instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) {
            com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) recyclerView;
            if (finderRecyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
                kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView.i1(finderRecyclerView, (androidx.recyclerview.widget.LinearLayoutManager) layoutManager, null, 2, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.gj, com.tencent.mm.plugin.finder.feed.i0
    public void u() {
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.ui.fg(this));
    }
}
