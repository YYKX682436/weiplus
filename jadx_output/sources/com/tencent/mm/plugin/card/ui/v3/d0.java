package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.g0 f95304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.w f95306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f95307g;

    public d0(com.tencent.mm.plugin.card.ui.v3.g0 g0Var, in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.w wVar, int i17) {
        this.f95304d = g0Var;
        this.f95305e = s0Var;
        this.f95306f = wVar;
        this.f95307g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.g0 g0Var = this.f95304d;
        g0Var.getClass();
        com.tencent.mm.plugin.card.ui.v3.w wVar = this.f95306f;
        r45.wt a17 = wVar.a();
        in5.s0 s0Var = this.f95305e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.bvd);
        if (viewGroup.getChildCount() > a17.f389443w) {
            java.lang.String str = g0Var.f95322e.f95253i;
            viewGroup.getChildCount();
            int childCount = viewGroup.getChildCount() - 1;
            int i17 = a17.f389443w;
            if (i17 <= childCount) {
                while (true) {
                    viewGroup.removeViewAt(childCount);
                    if (childCount == i17) {
                        break;
                    } else {
                        childCount--;
                    }
                }
            }
        }
        wVar.a();
        g0Var.q(s0Var, wVar, this.f95307g);
        wVar.f95392e = false;
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
