package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class j1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b f210909d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b) {
        this.f210909d = activityC15013x60db486b;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView != null && !absListView.canScrollVertically(1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b = this.f210909d;
            if (activityC15013x60db486b.f210051x) {
                activityC15013x60db486b.d7();
            } else {
                android.widget.ListView listView = activityC15013x60db486b.f210047t;
                if (listView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                    throw null;
                }
                if (listView.getFooterViewsCount() == 0) {
                    android.widget.ListView listView2 = activityC15013x60db486b.f210047t;
                    if (listView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
                        throw null;
                    }
                    listView2.addFooterView(android.view.View.inflate(activityC15013x60db486b, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570559b26, null));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI$initView$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
