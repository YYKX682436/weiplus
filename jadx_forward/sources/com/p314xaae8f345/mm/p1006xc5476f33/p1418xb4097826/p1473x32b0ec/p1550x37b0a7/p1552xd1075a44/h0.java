package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 f202240d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var) {
        this.f202240d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("giftRecommendDesc clicked with data:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 t0Var = this.f202240d;
        sb6.append(t0Var.f202320x);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WishEditPanelWidget", sb6.toString());
        t0Var.E();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.z zVar : t0Var.f202320x) {
            r45.kv1 kv1Var = (r45.kv1) zVar.f202357a.m75936x14adae67(0);
            if (kv1Var != null) {
                r45.z94 z94Var = zVar.f202357a;
                t0Var.A(new ln2.f(kv1Var, z94Var.m75942xfb822ef2(1), z94Var.m75942xfb822ef2(2)));
                t0Var.I();
            }
        }
        t0Var.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
