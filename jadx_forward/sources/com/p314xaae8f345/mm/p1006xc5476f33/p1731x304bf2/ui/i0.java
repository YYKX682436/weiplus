package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes4.dex */
public class i0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15947x4bb5f08a f222947d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15947x4bb5f08a c15947x4bb5f08a) {
        this.f222947d = c15947x4bb5f08a;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        android.view.View view;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15947x4bb5f08a c15947x4bb5f08a = this.f222947d;
        if (i17 == 0 && (view = c15947x4bb5f08a.f222250p) != null && view.getTop() == 0) {
            c15947x4bb5f08a.f222245h = true;
        } else {
            c15947x4bb5f08a.f222245h = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameCenterListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
