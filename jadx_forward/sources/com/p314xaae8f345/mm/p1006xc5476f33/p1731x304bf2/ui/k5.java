package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class k5 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15982xf89d78e9 f222981d;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15982xf89d78e9 activityC15982xf89d78e9) {
        this.f222981d = activityC15982xf89d78e9;
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
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15982xf89d78e9 activityC15982xf89d78e9 = this.f222981d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b5 b5Var = activityC15982xf89d78e9.f222465i;
            int i18 = b5Var.f222584s;
            int i19 = b5Var.f222585t;
            if (!(i18 >= i19)) {
                if (i18 >= i19) {
                    com.p314xaae8f345.mm.ui.y9 y9Var = b5Var.f294144h;
                    if (y9Var != null) {
                        y9Var.b(null);
                    }
                } else {
                    int i27 = i18 + 15;
                    b5Var.f222584s = i27;
                    if (i27 > i19) {
                        b5Var.f222584s = i19;
                    }
                }
                activityC15982xf89d78e9.f222465i.mo735xb0dfc7d8(null, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameMessageUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
