package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fs extends com.tencent.mm.plugin.finder.feed.a1 {

    /* renamed from: u, reason: collision with root package name */
    public final r45.z91 f106772u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f106773v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f106774w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f106775x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(com.tencent.mm.ui.MMActivity context, int i17, int i18, r45.z91 req, java.lang.String title) {
        super(context, i17, i18, false, 0, false, 56, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(title, "title");
        this.f106772u = req;
        this.f106773v = title;
        this.f106774w = "Finder.FinderRelatedFeedUIContract.FavFeedViewCallback";
        this.f106775x = new com.tencent.mm.plugin.finder.storage.s90(context);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.CharSequence B(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void K(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 < 0 || a07 >= z().f107156e.getSize()) {
            return;
        }
        so2.j5 j5Var = (so2.j5) z().f107156e.getDataListJustForAdapter().get(a07);
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            com.tencent.mars.xlog.Log.i(this.f106774w, "onClick " + a07 + " id:" + ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getId() + ", pos:" + a07);
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(z().f107156e, intent, a07, null, 4, null);
            intent.putExtra("KEY_TITLE", this.f106773v);
            intent.putExtra("KEY_REQUEST_PB", this.f106772u.toByteArray());
            com.tencent.mm.ui.MMActivity activity = this.f106174d;
            intent.putExtra("KEY_MORE_ACTION_TYPE", activity.getIntent().getIntExtra("KEY_MORE_ACTION_TYPE", 0));
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).cl(activity, intent, 501);
            kotlin.jvm.internal.o.g(activity, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c17, V6, j5Var.getItemId(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).w(), this.f106180m.getRecyclerView(), 0, null, 0L, null, 240, null);
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, j5Var, 18);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public void M() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public boolean S() {
        return false;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f106174d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public com.tencent.mm.plugin.finder.storage.vj0 q() {
        return this.f106775x;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public java.lang.String s(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        return "";
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View t() {
        return this.f106174d.findViewById(com.tencent.mm.R.id.f484229dg3);
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public android.view.View w() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.p2 x() {
        ((com.tencent.mm.plugin.finder.storage.s90) this.f106775x).getClass();
        return new com.tencent.mm.plugin.finder.storage.r90();
    }

    @Override // com.tencent.mm.plugin.finder.feed.a1
    public androidx.recyclerview.widget.RecyclerView.LayoutManager y(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return this.f106775x.d(context);
    }
}
