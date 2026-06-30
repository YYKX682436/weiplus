package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class bo implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 f109730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader f109731b;

    public bo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 occupyFinderUI25, com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader) {
        this.f109730a = occupyFinderUI25;
        this.f109731b = finderLocalFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        int i18;
        int i19;
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = this.f109730a.C;
        if (lgVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.plugin.finder.ui.fav.ui.FinderLocalFeedLoader finderLocalFeedLoader = this.f109731b;
        boolean z17 = finderLocalFeedLoader.f129211i;
        boolean z18 = finderLocalFeedLoader.f129212m;
        com.tencent.mm.plugin.finder.feed.c0 c0Var = lgVar.f106969e;
        com.tencent.mm.plugin.finder.feed.ui.dg dgVar = c0Var instanceof com.tencent.mm.plugin.finder.feed.ui.dg ? (com.tencent.mm.plugin.finder.feed.ui.dg) c0Var : null;
        if (dgVar == null) {
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = lgVar.f106968d;
        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.imn);
        if (findViewById == null) {
            i18 = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i18 = 0;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        lgVar.o().setEnableRefresh(z17);
        lgVar.o().setEnableLoadMore(z18);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = dgVar.f106570t;
        java.util.ArrayList dataListJustForAdapter = baseFeedLoader != null ? baseFeedLoader.getDataListJustForAdapter() : null;
        if (dataListJustForAdapter != null) {
            java.util.Iterator it = dataListJustForAdapter.iterator();
            i19 = i18;
            while (it.hasNext()) {
                if ((((so2.j5) it.next()).getItemId() == dgVar.A ? 1 : i18) != 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        i19 = -1;
        if (i19 >= 0) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = lgVar.getRecyclerView().getLayoutManager();
            if (layoutManager != null) {
                com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                arrayList2.add(java.lang.Integer.valueOf(i19));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(finderLinearLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.P(((java.lang.Integer) arrayList2.get(i18)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
                yj0.a.f(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onInitEnd", "(ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            if (!z17) {
                com.tencent.mm.view.RefreshLoadMoreLayout.StickTopLoadingLayout stickTopLoadingLayout = lgVar.o().getStickTopLoadingLayout();
                if (stickTopLoadingLayout != null) {
                    stickTopLoadingLayout.setVisibility(8);
                }
                lgVar.o().setStickTopLoadingLayout(null);
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).Q6(lgVar.getRecyclerView());
            return;
        }
        java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.d0g);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = lgVar.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        jz5.g gVar = lgVar.f110274t;
        android.widget.TextView textView = (android.widget.TextView) ((android.view.View) ((jz5.n) gVar).getValue()).findViewById(com.tencent.mm.R.id.cti);
        if (textView != null) {
            textView.setTextColor(-1);
        }
        android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "showErrorUi", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(i18)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "showErrorUi", "(ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if ((string.length() != 0 ? i18 : 1) != 0) {
            textView.setText(com.tencent.mm.R.string.cv_);
        } else {
            textView.setText(string);
        }
    }
}
