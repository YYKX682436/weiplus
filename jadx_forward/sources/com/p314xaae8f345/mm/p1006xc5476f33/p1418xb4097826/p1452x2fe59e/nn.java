package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class nn implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f190119d;

    public nn(android.view.View view) {
        this.f190119d = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$onRetryShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View findViewById = this.f190119d.findViewById(com.p314xaae8f345.mm.R.id.m2g);
        if (findViewById != null) {
            findViewById.callOnClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback$onRetryShow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
