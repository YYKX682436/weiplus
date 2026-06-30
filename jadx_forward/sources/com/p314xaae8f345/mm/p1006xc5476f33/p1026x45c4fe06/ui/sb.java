package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes15.dex */
public final class sb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 f171744d;

    public sb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7) {
        this.f171744d = activityC12693xccd93dc7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12693xccd93dc7 activityC12693xccd93dc7 = this.f171744d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC12693xccd93dc7.f171002d, "hy: on click menu");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5942x61feebc c5942x61feebc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5942x61feebc();
        am.zr zrVar = c5942x61feebc.f136243g;
        zrVar.f90132a = activityC12693xccd93dc7;
        zrVar.f90134c = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(activityC12693xccd93dc7.f171013r);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String str = activityC12693xccd93dc7.f171013r;
        java.lang.Long l17 = activityC12693xccd93dc7.f171012q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        arrayList2.add(e0Var.n(str, l17.longValue()));
        zrVar.f90133b = arrayList2;
        zrVar.f90135d = activityC12693xccd93dc7.f171013r;
        zrVar.f90136e = activityC12693xccd93dc7;
        c5942x61feebc.e();
        activityC12693xccd93dc7.T6(3);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
