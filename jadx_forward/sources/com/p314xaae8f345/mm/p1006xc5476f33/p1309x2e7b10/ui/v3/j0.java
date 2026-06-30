package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176869d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8) {
        this.f176869d = activityC13072x745567c8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176869d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13072x745567c8.f176786i, "show sort dialog");
        if (activityC13072x745567c8.C != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13072x745567c8.mo55332x76847179(), 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.n0(activityC13072x745567c8);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.p0(activityC13072x745567c8);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
