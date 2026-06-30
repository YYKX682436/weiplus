package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f262038d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f262038d = activityC19108xd69d11c7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f262038d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(activityC19108xd69d11c7.mo55332x76847179());
        oVar.f293840n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m2(this, oVar);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i19 = calendar.get(1);
        int i27 = calendar.get(2) + 1;
        int i28 = calendar.get(5);
        oVar.e(i19, i27, i28);
        java.lang.String obj = activityC19108xd69d11c7.G.m83169xe7297452().getText().toString();
        int i29 = activityC19108xd69d11c7.f261429b2;
        if (i29 > 0 && (i17 = activityC19108xd69d11c7.f261430c2) > 0 && (i18 = activityC19108xd69d11c7.f261432d2) > 0) {
            oVar.d(i29, i17, i18);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) && obj.length() == 8) {
            activityC19108xd69d11c7.f261429b2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(obj.substring(0, 4), i19);
            activityC19108xd69d11c7.f261430c2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(obj.substring(4, 6), i27);
            activityC19108xd69d11c7.f261432d2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(obj.substring(6, 8), i28);
            oVar.d(activityC19108xd69d11c7.f261429b2, activityC19108xd69d11c7.f261430c2, activityC19108xd69d11c7.f261432d2);
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
