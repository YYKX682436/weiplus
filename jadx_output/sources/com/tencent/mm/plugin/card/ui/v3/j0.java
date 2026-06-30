package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95336d;

    public j0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95336d = couponCardListUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95336d;
        com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "show sort dialog");
        if (couponCardListUI.C != null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) couponCardListUI.getContext(), 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.n0(couponCardListUI);
            k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.p0(couponCardListUI);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
