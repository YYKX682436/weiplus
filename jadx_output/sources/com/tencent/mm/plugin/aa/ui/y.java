package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class y implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAQueryListUI f72892d;

    public y(com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI) {
        this.f72892d = aAQueryListUI;
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
        com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI = this.f72892d;
        if (aAQueryListUI.f72444h.getLastVisiblePosition() == aAQueryListUI.f72444h.getCount() - 1 && aAQueryListUI.f72444h.getCount() > 0 && !aAQueryListUI.f72448o && !aAQueryListUI.f72447n) {
            aAQueryListUI.f72444h.addFooterView(aAQueryListUI.f72449p);
            aAQueryListUI.f7(false, aAQueryListUI.f72452s);
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
