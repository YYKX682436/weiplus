package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f262142d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f262142d = activityC19108xd69d11c7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("GetAddress", true);
        intent.putExtra("ShowSelectedLocation", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f262142d;
        int i17 = activityC19108xd69d11c7.W.I;
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c.A3;
        if (!((i17 & 2) > 0)) {
            intent.putExtra("IsRealNameVerifyScene", true);
            intent.putExtra("IsNeedShowSearchBar", true);
        }
        java.lang.String[] strArr = activityC19108xd69d11c7.L1;
        if (strArr != null && strArr.length > 0) {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            arrayList2.addAll(java.util.Arrays.asList(activityC19108xd69d11c7.L1));
            arrayList2.remove("CN");
            arrayList2.remove("TW");
            arrayList2.remove("HK");
            arrayList2.remove("MO");
            intent.putStringArrayListExtra("BlockedCountries", arrayList2);
        }
        j45.l.v(activityC19108xd69d11c7.mo55332x76847179(), ".ui.tools.MultiStageCitySelectUI", intent, 4);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
