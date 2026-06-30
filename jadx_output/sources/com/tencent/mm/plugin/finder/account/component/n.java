package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.s f101722d;

    public n(com.tencent.mm.plugin.finder.account.component.s sVar) {
        this.f101722d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife$initBottomLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.plugin.finder.account.component.s sVar = this.f101722d;
        gVar.b(sVar.f101734n);
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = sVar.f101728e;
        if (finderAccountSwitchDrawer != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderAccountSwitchDrawer, false, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife$initBottomLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
