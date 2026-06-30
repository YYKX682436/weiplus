package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes3.dex */
public class e1 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f f224322d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f) {
        this.f224322d = activityC16130xc9e2940f;
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
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16130xc9e2940f activityC16130xc9e2940f = this.f224322d;
        if (activityC16130xc9e2940f.f224092q == -1) {
            activityC16130xc9e2940f.f224092q = i17;
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        } else {
            if (activityC16130xc9e2940f.f224093r == -1) {
                activityC16130xc9e2940f.f224093r = i17;
            }
            yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        this.f224322d.mo48674x36654fab();
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallContactUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
