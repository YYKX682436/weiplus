package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes15.dex */
public class g6 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e f222933d;

    public g6(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e activityC15989x4803986e) {
        this.f222933d = activityC15989x4803986e;
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
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15989x4803986e activityC15989x4803986e = this.f222933d;
            if (activityC15989x4803986e.f222507n.f223441q) {
                android.view.View view = activityC15989x4803986e.f222506m;
                if (view != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                activityC15989x4803986e.T6(activityC15989x4803986e.f222510q, 0, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
