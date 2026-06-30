package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h f213592d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h hVar) {
        this.f213592d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.h hVar = this.f213592d;
        android.view.View.OnClickListener onClickListener = hVar.f213732i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        hVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
