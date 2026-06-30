package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v00 implements com.tencent.mm.plugin.finder.feed.ct, ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f110846d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.bt f110847e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f110848f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f110849g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f110850h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f110851i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLikeDrawer f110852m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f110853n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f110854o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f110855p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f110856q;

    /* renamed from: r, reason: collision with root package name */
    public ym5.q3 f110857r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f110858s;

    /* renamed from: t, reason: collision with root package name */
    public int f110859t;

    public v00(com.tencent.mm.ui.MMActivity baseContext, com.tencent.mm.plugin.finder.feed.bt presenter, android.view.View parent, androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f110846d = baseContext;
        this.f110847e = presenter;
        this.f110848f = parent;
        this.f110849g = fragment;
        this.f110850h = jz5.h.b(new com.tencent.mm.plugin.finder.feed.s00(this));
        this.f110853n = jz5.h.b(new com.tencent.mm.plugin.finder.feed.i00(this));
        this.f110854o = jz5.h.b(new com.tencent.mm.plugin.finder.feed.u00(this));
        this.f110855p = jz5.h.b(new com.tencent.mm.plugin.finder.feed.r00(this));
        this.f110858s = jz5.h.b(new com.tencent.mm.plugin.finder.feed.k00(this));
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.TimelineViewCallback", "[onOverStop]");
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f110846d;
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return l().getRecyclerView();
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout l() {
        java.lang.Object value = ((jz5.n) this.f110850h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.RefreshLoadMoreLayout) value;
    }

    public final boolean o() {
        return ((java.lang.Boolean) ((jz5.n) this.f110855p).getValue()).booleanValue() && this.f110859t == 4 && !this.f110856q;
    }

    public void q(boolean z17) {
        android.view.View findViewById = this.f110848f.findViewById(com.tencent.mm.R.id.f484356e04);
        if (findViewById != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderTimelineViewCallback", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void s(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            com.tencent.mars.xlog.Log.w("Finder.TimelineViewCallback", "can not cast layoutManager to FinderLinearLayoutManager: " + recyclerView.getLayoutManager());
        } else {
            int w17 = z17 ? finderLinearLayoutManager.w() + 1 : finderLinearLayoutManager.w() - 1;
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (w17 >= 0 && w17 < (adapter != null ? adapter.getItemCount() : 0)) {
                recyclerView.post(new com.tencent.mm.plugin.finder.feed.t00(recyclerView, w17));
            }
        }
    }
}
