package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class z0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 f183171d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722) {
        this.f183171d = activityC13563x72179722;
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
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13563x72179722 activityC13563x72179722 = this.f183171d;
            android.widget.ListView listView = activityC13563x72179722.f181842g;
            if (listView.getChildAt(listView.getChildCount() - 1) != null && activityC13563x72179722.f181842g.getLastVisiblePosition() == activityC13563x72179722.f181842g.getAdapter().getCount() - 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavCleanUI", "at bottom call back");
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavCleanUI", "force bottom load data");
                activityC13563x72179722.f181840e.getClass();
                if (activityC13563x72179722.f181841f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavCleanUI", "onBottomLoadData loading, return");
                } else {
                    activityC13563x72179722.f181841f = true;
                    if (activityC13563x72179722.f181842g.getFooterViewsCount() == 0) {
                        activityC13563x72179722.f181842g.addFooterView(activityC13563x72179722.f181847o);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavCleanUI", "on bottom load data listener");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC13563x72179722.f181846n;
                    java.lang.Runnable runnable = activityC13563x72179722.B;
                    n3Var.mo50300x3fa464aa(runnable);
                    activityC13563x72179722.f181846n.mo50293x3498a0(runnable);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavCleanUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
