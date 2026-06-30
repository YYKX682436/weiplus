package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class y implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a f154425d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a) {
        this.f154425d = activityC11342x8f12a65a;
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
        yj0.a.b("com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a = this.f154425d;
        if (activityC11342x8f12a65a.f153977h.getLastVisiblePosition() == activityC11342x8f12a65a.f153977h.getCount() - 1 && activityC11342x8f12a65a.f153977h.getCount() > 0 && !activityC11342x8f12a65a.f153981o && !activityC11342x8f12a65a.f153980n) {
            activityC11342x8f12a65a.f153977h.addFooterView(activityC11342x8f12a65a.f153982p);
            activityC11342x8f12a65a.f7(false, activityC11342x8f12a65a.f153985s);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/AAQueryListUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
