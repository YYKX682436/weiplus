package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4 f197990d;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4 n4Var) {
        this.f197990d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4 n4Var = this.f197990d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ve veVar = n4Var.f198042v;
        if (veVar == null) {
            veVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ve(n4Var.f199914d);
            veVar.f201597h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.m4(n4Var);
        }
        n4Var.f198042v = veVar;
        int i17 = n4Var.f198044x;
        veVar.w();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15312xb2c5e319 c15312xb2c5e319 = veVar.f201598i;
        if (c15312xb2c5e319 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("picker");
            throw null;
        }
        c15312xb2c5e319.c(i17 - 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
