package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes8.dex */
public class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ku f176609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 f176610e;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb9371272, r45.ku kuVar) {
        this.f176610e = activityC13053xb9371272;
        this.f176609d = kuVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ku kuVar = this.f176609d;
        int i17 = kuVar.f460483h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb9371272 = this.f176610e;
        if (i17 == 1) {
            lu1.d.j(activityC13053xb9371272, kuVar.f460484i, 0);
        } else if (i17 == 2) {
            if (kuVar.f460485m != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
                r45.iu iuVar = kuVar.f460485m;
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
        } else if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardHomePageUI", "unknown op action: %s", java.lang.Integer.valueOf(i17));
        } else if ("weixin://wccard/sharecarddetail".equals(kuVar.f460486n)) {
            android.content.Intent intent = new android.content.Intent(activityC13053xb9371272, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13042x42c001.class);
            intent.putExtra("key_layout_buff", activityC13053xb9371272.C);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb93712722 = this.f176610e;
            activityC13053xb93712722.D = true;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC13053xb93712722, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC13053xb93712722.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC13053xb93712722, "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11324, "ClickShareCard", 0, "", "", 0, 0, "", 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
