package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 f203166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f203167f;

    public d5(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var, vp2.l0 l0Var) {
        this.f203165d = s0Var;
        this.f203166e = t5Var;
        this.f203167f = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$checkMoreEntranceShow$moreEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f203165d;
        android.content.Context context = s0Var.f374654e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        vp2.l0 l0Var = this.f203167f;
        if (abstractActivityC21394xb3d2c0cf != null) {
            ((sp2.b0) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(sp2.b0.class)).R6(l0Var.f520473d.f455667p);
        }
        this.f203166e.s(s0Var, l0Var.f520473d.f455658d, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$checkMoreEntranceShow$moreEntranceClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
