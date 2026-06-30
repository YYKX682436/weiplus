package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.detail.i f105144d;

    public e(com.tencent.mm.plugin.finder.drama.detail.i iVar) {
        this.f105144d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f105144d.getActivity().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
