package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0 f176837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f176838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w f176839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f176840g;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0 g0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar, int i17) {
        this.f176837d = g0Var;
        this.f176838e = s0Var;
        this.f176839f = wVar;
        this.f176840g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0 g0Var = this.f176837d;
        g0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar = this.f176839f;
        r45.wt a17 = wVar.a();
        in5.s0 s0Var = this.f176838e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.bvd);
        if (viewGroup.getChildCount() > a17.f470976w) {
            java.lang.String str = g0Var.f176855e.f176786i;
            viewGroup.getChildCount();
            int childCount = viewGroup.getChildCount() - 1;
            int i17 = a17.f470976w;
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
        g0Var.q(s0Var, wVar, this.f176840g);
        wVar.f176925e = false;
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$showCollapseLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
