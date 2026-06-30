package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0 f176844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w f176846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f176847h;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0 g0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar, int i17) {
        this.f176843d = activityC13072x745567c8;
        this.f176844e = g0Var;
        this.f176845f = s0Var;
        this.f176846g = wVar;
        this.f176847h = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f176843d.f176786i;
        int i17 = this.f176847h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0 g0Var = this.f176844e;
        g0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar = this.f176846g;
        r45.wt a17 = wVar.a();
        in5.s0 s0Var = this.f176845f;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.bvg);
        if (((android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.bvd)).getChildCount() < a17.f470975v) {
            g0Var.o(a17.f470976w, -1, s0Var, wVar, i17);
            if (a17.f470976w >= a17.f470975v) {
                viewGroup.setVisibility(8);
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wVar.a().f470970q)) {
                g0Var.p(s0Var, wVar, i17);
            } else {
                g0Var.r(s0Var, wVar, i17);
            }
        }
        wVar.f176925e = true;
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showExpandLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
