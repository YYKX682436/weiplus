package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.g0 f95311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95312f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.w f95313g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f95314h;

    public e0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, com.tencent.mm.plugin.card.ui.v3.g0 g0Var, in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.w wVar, int i17) {
        this.f95310d = couponCardListUI;
        this.f95311e = g0Var;
        this.f95312f = s0Var;
        this.f95313g = wVar;
        this.f95314h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f95310d.f95253i;
        int i17 = this.f95314h;
        com.tencent.mm.plugin.card.ui.v3.g0 g0Var = this.f95311e;
        g0Var.getClass();
        com.tencent.mm.plugin.card.ui.v3.w wVar = this.f95313g;
        r45.wt a17 = wVar.a();
        in5.s0 s0Var = this.f95312f;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.bvg);
        if (((android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.bvd)).getChildCount() < a17.f389442v) {
            g0Var.o(a17.f389443w, -1, s0Var, wVar, i17);
            if (a17.f389443w >= a17.f389442v) {
                viewGroup.setVisibility(8);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(wVar.a().f389437q)) {
                g0Var.p(s0Var, wVar, i17);
            } else {
                g0Var.r(s0Var, wVar, i17);
            }
        }
        wVar.f95392e = true;
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
