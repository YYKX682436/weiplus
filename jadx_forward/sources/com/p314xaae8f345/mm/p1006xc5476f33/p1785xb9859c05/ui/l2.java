package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes4.dex */
public class l2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 f224431d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0) {
        this.f224431d = activityC16139x444a8b0;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getLastVisiblePosition() != absListView.getCount() - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0 = this.f224431d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q2 q2Var = activityC16139x444a8b0.f224166e;
        int i18 = q2Var.f224519o;
        int i19 = q2Var.f224520p;
        if (i18 >= i19) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b02 = q2Var.f224521q;
            if (activityC16139x444a8b02.f224167f.getParent() != null) {
                activityC16139x444a8b02.f224165d.removeFooterView(activityC16139x444a8b02.f224167f);
            }
        } else {
            int i27 = i18 + 10;
            q2Var.f224519o = i27;
            if (i27 > i19) {
                q2Var.f224519o = i19;
                int i28 = i19 % 10;
            }
        }
        activityC16139x444a8b0.f224166e.mo735xb0dfc7d8(null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$5", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
