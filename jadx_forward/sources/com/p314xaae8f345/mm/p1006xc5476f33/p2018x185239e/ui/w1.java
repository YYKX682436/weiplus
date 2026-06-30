package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes8.dex */
public class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.eq f239537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 f239538e;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 activityC17130xb547a358, r45.eq eqVar) {
        this.f239538e = activityC17130xb547a358;
        this.f239537d = eqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.eq eqVar = this.f239537d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "app type: %s", java.lang.Integer.valueOf(eqVar.f455194d));
        int i17 = eqVar.f455194d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 activityC17130xb547a358 = this.f239538e;
        if (i17 == 1) {
            activityC17130xb547a358.f238697J = true;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            java.lang.String str = eqVar.f455200m;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            java.lang.String str2 = eqVar.f455201n;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f89000b = str2;
            nxVar.f89002d = 1034;
            nxVar.f89001c = 0;
            c6113xa3727625.e();
        } else if (i17 == 2) {
            activityC17130xb547a358.f238697J = true;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC17130xb547a358.mo55332x76847179(), eqVar.f455199i, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
