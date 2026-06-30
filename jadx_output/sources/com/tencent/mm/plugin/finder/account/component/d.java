package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.e f101703d;

    public d(com.tencent.mm.plugin.finder.account.component.e eVar) {
        this.f101703d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchDrawerBuilderForNewLife$onBuildDrawerFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.view.drawer.RecyclerViewDrawer.o(this.f101703d.n(), false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchDrawerBuilderForNewLife$onBuildDrawerFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
