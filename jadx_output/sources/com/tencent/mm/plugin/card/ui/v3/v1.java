package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95390d;

    public v1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95390d = vipCardListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95390d;
        com.tencent.mars.xlog.Log.i(vipCardListUI.f95269i, "show sort dialog");
        if (vipCardListUI.E != null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) vipCardListUI.getContext(), 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.l1(vipCardListUI);
            k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.o1(vipCardListUI);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI$updateTopHeaderLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
