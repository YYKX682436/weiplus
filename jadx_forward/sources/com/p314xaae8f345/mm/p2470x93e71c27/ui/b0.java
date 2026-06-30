package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes11.dex */
public class b0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f271436d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f271437e = new java.util.LinkedList();

    public b0(android.widget.AbsListView.OnScrollListener onScrollListener) {
        this.f271436d = onScrollListener;
    }

    public void a(boolean z17) {
        java.util.Iterator it = this.f271437e.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference == null) {
                it.remove();
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.a0 a0Var = (com.p314xaae8f345.mm.p2470x93e71c27.ui.a0) weakReference.get();
                if (a0Var == null) {
                    it.remove();
                } else {
                    a0Var.mo75389x4d79408f(z17);
                }
            }
        }
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
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f271436d;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i17, i18, i19);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 2) {
            a(true);
        } else {
            a(false);
        }
        android.widget.AbsListView.OnScrollListener onScrollListener = this.f271436d;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i17);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/AvatarWrapperScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
