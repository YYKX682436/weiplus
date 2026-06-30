package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f111436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer f111437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f111438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.i f111439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f111440h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f111441i;

    public j(android.view.View view, com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer, android.widget.FrameLayout.LayoutParams layoutParams, com.tencent.mm.plugin.finder.highlight.i iVar, android.content.Context context, yz5.a aVar) {
        this.f111436d = view;
        this.f111437e = finderLiveHighlightDrawer;
        this.f111438f = layoutParams;
        this.f111439g = iVar;
        this.f111440h = context;
        this.f111441i = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f111436d;
        com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer = this.f111437e;
        frameLayout.addView(finderLiveHighlightDrawer, this.f111438f);
        android.widget.FrameLayout headerLayout = finderLiveHighlightDrawer.getHeaderLayout();
        com.tencent.mm.plugin.finder.highlight.l lVar = (com.tencent.mm.plugin.finder.highlight.l) this.f111439g;
        lVar.getClass();
        android.content.Context context = this.f111440h;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e7l, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.u2k);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        lVar.f111445f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.u2j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        lVar.f111446g = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.u2h);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        lVar.f111448i = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.u2i);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        lVar.f111447h = findViewById4;
        android.widget.TextView textView = lVar.f111445f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("headerTitleTv");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491413nn3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.widget.TextView textView2 = lVar.f111445f;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("headerTitleTv");
            throw null;
        }
        textView2.setText(string);
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = finderLiveHighlightDrawer.getCenterLayout();
        lVar.getClass();
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        lVar.f111449m = rlLayout;
        rlLayout.setLimitTopRequest(((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
        rlLayout.setDamping(1.85f);
        androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
        final com.tencent.mm.plugin.finder.highlight.p pVar = lVar.f111443d;
        pVar.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawerPresenter$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == com.tencent.mm.plugin.finder.highlight.d.class.getName().hashCode()) {
                    return new com.tencent.mm.plugin.finder.highlight.h(new com.tencent.mm.plugin.finder.highlight.n(com.tencent.mm.plugin.finder.highlight.p.this));
                }
                hc2.l.a("Finder.FinderLiveHighlightDrawerPresenter", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, pVar.f111456c, true);
        pVar.f111458e = wxRecyclerAdapter;
        wxRecyclerAdapter.F = new com.tencent.mm.plugin.finder.highlight.o(pVar);
        recyclerView.setAdapter(wxRecyclerAdapter);
        rlLayout.setEnableLoadMore(false);
        rlLayout.setEnableRefresh(false);
        com.tencent.mm.plugin.finder.highlight.k kVar = new com.tencent.mm.plugin.finder.highlight.k(lVar);
        lVar.f111450n = kVar;
        recyclerView.i(kVar);
        android.widget.FrameLayout footerLayout = finderLiveHighlightDrawer.getFooterLayout();
        lVar.getClass();
        kotlin.jvm.internal.o.g(footerLayout, "footerLayout");
        com.tencent.mm.view.RefreshLoadMoreLayout g17 = lVar.g();
        android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        g17.setLoadMoreFooter(inflate2);
        lVar.g().H(null);
        yz5.a aVar = this.f111441i;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveHighlightDrawer", "attach to window finished");
    }
}
