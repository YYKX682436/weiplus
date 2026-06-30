package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f262292d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f262292d = activityC19108xd69d11c7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f262292d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o oVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o(activityC19108xd69d11c7.mo55332x76847179());
        oVar.f293840n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v1(this, oVar);
        int i19 = activityC19108xd69d11c7.f261434e2;
        if (i19 > 0 && (i17 = activityC19108xd69d11c7.f261436f2) > 0 && (i18 = activityC19108xd69d11c7.f261438g2) > 0) {
            oVar.d(i19, i17, i18);
        }
        oVar.h();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
