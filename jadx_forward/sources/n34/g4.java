package n34;

/* loaded from: classes4.dex */
public final class g4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 f416141d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7) {
        this.f416141d = c17694x1b4b7a7;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = this.f416141d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getLastVisiblePosition() == com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getCount() - 2) {
            int count = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getCount();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            int i27 = c17694x1b4b7a7.f244082o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            if (count != i27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", "now refresh count: " + com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getCount());
                int count2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getCount();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                c17694x1b4b7a7.f244082o = count2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setListCount$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17969xa50b38d6 c17969xa50b38d6 = c17694x1b4b7a7.f244075e;
                if (c17969xa50b38d6 != null) {
                    c17969xa50b38d6.c();
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c17694x1b4b7a7.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.class)).U6();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7 = this.f416141d;
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getLastVisiblePosition() == com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.P6(c17694x1b4b7a7).getCount() - 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", "onScrollStateChanged >> to load more data");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLoadingDownView$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17969xa50b38d6 c17969xa50b38d6 = c17694x1b4b7a7.f244075e;
                if (c17969xa50b38d6 != null) {
                    c17969xa50b38d6.c();
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c17694x1b4b7a7.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17692xcc3ccb9d.class)).U6();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$2");
    }
}
