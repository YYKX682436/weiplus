package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes8.dex */
public class p2 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72766d;

    public p2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        this.f72766d = launchAAByPersonAmountSelectUI;
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
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 1) {
            this.f72766d.hideTenpayKB();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAByPersonAmountSelectUI$7", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
