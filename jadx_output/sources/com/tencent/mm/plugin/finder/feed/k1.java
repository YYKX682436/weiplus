package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.s1 f107161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f107162e;

    public k1(com.tencent.mm.plugin.finder.feed.s1 s1Var, android.view.View view) {
        this.f107161d = s1Var;
        this.f107162e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f107161d.getClass();
        android.view.View findViewById = this.f107162e.findViewById(com.tencent.mm.R.id.lbi);
        if (findViewById != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.j1(this.f107161d));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
