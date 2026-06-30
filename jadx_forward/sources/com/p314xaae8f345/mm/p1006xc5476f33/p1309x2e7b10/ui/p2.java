package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes8.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mu f176646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13054xf92a7996 f176647e;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13054xf92a7996 activityC13054xf92a7996, r45.mu muVar) {
        this.f176647e = activityC13054xf92a7996;
        this.f176646d = muVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardIndexUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.mu muVar = this.f176646d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardIndexUI", "click header view: %s", java.lang.Integer.valueOf(muVar.f462361g));
        int i17 = muVar.f462361g;
        if (i17 == 1) {
            lu1.d.j(this.f176647e, muVar.f462362h, 0);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            r45.iu iuVar = muVar.f462363i;
            java.lang.String str = iuVar.f458861d;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            java.lang.String str2 = iuVar.f458862e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f89000b = str2;
            nxVar.f89002d = 1028;
            c6113xa3727625.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardIndexUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
