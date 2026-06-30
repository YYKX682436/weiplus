package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.j f105237d;

    public h(com.tencent.mm.plugin.finder.drama.drawer.j jVar) {
        this.f105237d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.drama.drawer.j jVar = this.f105237d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) jVar.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.finder.drama.drawer.f(jVar);
        k0Var.f211881s = new com.tencent.mm.plugin.finder.drama.drawer.g(jVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailHeaderNewUIC$initViews$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
