package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes9.dex */
public class b implements com.p314xaae8f345.mm.p2802xd031a825.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b f262571a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b) {
        this.f262571a = activityC19159x79c8ee9b;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.g
    /* renamed from: onProcessEnd */
    public android.content.Intent mo14634xe047072b(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardBindCardListUI", "bind card end, resultCode: %s, feedbackData: %s", java.lang.Integer.valueOf(i17), bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b activityC19159x79c8ee9b = this.f262571a;
        if (i17 == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641 c19093x748e2641 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19093x748e2641) bundle.getParcelable("key_bindcard_value_result");
            if (c19093x748e2641 != null) {
                r45.od odVar = new r45.od();
                odVar.f463688e = bundle.getString("key_bind_card_type");
                odVar.f463692i = c19093x748e2641.f261150n;
                odVar.f463690g = bundle.getString("key_mobile");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(odVar.f463692i) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(odVar.f463688e) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(odVar.f463690g)) {
                    activityC19159x79c8ee9b.m83106x57340563().d(odVar);
                    return null;
                }
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19159x79c8ee9b.f262542o;
            activityC19159x79c8ee9b.V6();
        }
        activityC19159x79c8ee9b.f262548i = false;
        return null;
    }
}
