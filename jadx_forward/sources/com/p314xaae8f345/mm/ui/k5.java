package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class k5 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 f290564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f290565e;

    public k5(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.C21370x5ce6d0c6 c21370x5ce6d0c6) {
        this.f290565e = c21357x5e7365bb;
        this.f290564d = c21370x5ce6d0c6;
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
        yj0.a.b("com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f290565e;
            int firstVisiblePosition = c21357x5e7365bb.f278189w.f279352u.getFirstVisiblePosition();
            int lastVisiblePosition = c21357x5e7365bb.f278189w.f279352u.getLastVisiblePosition();
            android.view.View view = this.f290564d.W1;
            if (view == null || (c21357x5e7365bb.f278189w.o("more_tab_game_recommend") > lastVisiblePosition && c21357x5e7365bb.f278189w.o("more_tab_game_recommend") < firstVisiblePosition)) {
                yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                return;
            } else if (view.getLocalVisibleRect(new android.graphics.Rect())) {
                c21357x5e7365bb.w1();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/FindMoreFriendsUI$33", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
