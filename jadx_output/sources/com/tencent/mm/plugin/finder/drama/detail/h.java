package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.detail.i f105147d;

    public h(com.tencent.mm.plugin.finder.drama.detail.i iVar) {
        this.f105147d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.drama.detail.i iVar = this.f105147d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) iVar.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.drama.detail.f(iVar);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.drama.detail.g(iVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/detail/FinderNativeDramaDetailHeaderUIC$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
