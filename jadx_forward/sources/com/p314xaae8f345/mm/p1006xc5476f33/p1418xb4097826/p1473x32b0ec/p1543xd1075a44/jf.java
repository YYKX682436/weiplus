package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class jf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of f200288d;

    public jf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of ofVar) {
        this.f200288d = ofVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.of ofVar = this.f200288d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4 n4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.n4(ofVar.f199914d);
        n4Var.f198045y = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kf(ofVar);
        n4Var.f198046z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lf(ofVar);
        int i17 = ofVar.f200829t;
        int i18 = ofVar.f200830u;
        n4Var.w();
        n4Var.f198043w = i17;
        n4Var.f198044x = i18;
        if (i17 == 0) {
            n4Var.z(true);
        } else if (i17 != 2) {
            n4Var.y(true);
        } else {
            n4Var.A(true);
        }
        ofVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubAnnouncementEditPanel$initContentView$6$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
