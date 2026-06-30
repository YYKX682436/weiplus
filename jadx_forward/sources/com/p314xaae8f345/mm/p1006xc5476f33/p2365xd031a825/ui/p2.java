package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f262102d;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f262102d = activityC19108xd69d11c7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f262102d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(activityC19108xd69d11c7.mo55332x76847179());
        oVar.f293840n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o2(this, oVar);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(1);
        int i18 = calendar.get(2) + 1;
        int i19 = calendar.get(5);
        oVar.f(i17, i18, i19);
        oVar.e(i17 + 200, 12, 31);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = oVar.f293839m;
        if (c22705x7e16f613 != null) {
            c22705x7e16f613.m82059xc1d8a6e7(true);
        }
        java.lang.String obj = activityC19108xd69d11c7.H.m83169xe7297452().getText().toString();
        if (activityC19108xd69d11c7.Y1 <= 0 || activityC19108xd69d11c7.Z1 <= 0 || activityC19108xd69d11c7.f261428a2 <= 0) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) && obj.length() == 8) {
                activityC19108xd69d11c7.Y1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(obj.substring(0, 4), i17);
                activityC19108xd69d11c7.Z1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(obj.substring(4, 6), i18);
                activityC19108xd69d11c7.f261428a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(obj.substring(6, 8), i19);
            } else if (obj.equals(activityC19108xd69d11c7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l48))) {
                activityC19108xd69d11c7.Y1 = 9999;
                activityC19108xd69d11c7.Z1 = 12;
                activityC19108xd69d11c7.f261428a2 = 31;
            }
        }
        int i27 = activityC19108xd69d11c7.Y1;
        if (i27 == 9999) {
            oVar.d(1, 1, 1);
        } else {
            oVar.d(i27, activityC19108xd69d11c7.Z1, activityC19108xd69d11c7.f261428a2);
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
