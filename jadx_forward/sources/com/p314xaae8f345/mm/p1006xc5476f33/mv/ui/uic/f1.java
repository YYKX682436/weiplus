package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f1 implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 f232655d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var) {
        this.f232655d = s1Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = this.f232655d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "onChildViewAdded");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.O6(s1Var, view2);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = this.f232655d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "onChildViewRemoved");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.P6(s1Var, view2);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvLyricUIC$childListener$1", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
