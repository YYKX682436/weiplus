package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class c0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b f279327d;

    public c0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b) {
        this.f279327d = abstractActivityC21555x39071a9b;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        list = this.f279327d.f39411x50fa61f2;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.widget.AbsListView.OnScrollListener) it.next()).onScroll(absListView, i17, i18, i19);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.List list;
        android.view.View currentFocus;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b abstractActivityC21555x39071a9b = this.f279327d;
        if (1 == i17 && (currentFocus = abstractActivityC21555x39071a9b.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
        list = abstractActivityC21555x39071a9b.f39411x50fa61f2;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.widget.AbsListView.OnScrollListener) it.next()).onScrollStateChanged(absListView, i17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/preference/MMPreference$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
