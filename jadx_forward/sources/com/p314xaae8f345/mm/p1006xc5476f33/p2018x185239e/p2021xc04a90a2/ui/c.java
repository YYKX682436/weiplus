package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class c implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 f238188a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 activityC17114xc078d367) {
        this.f238188a = activityC17114xc078d367;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        boolean f17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p().f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankMobile.BankMobileRemittanceChooseUI", "onClick() go to WalletPasswordSettingUI, isNewSetting: %b", java.lang.Boolean.valueOf(f17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367 activityC17114xc078d367 = this.f238188a;
        if (f17) {
            r45.yt5 yt5Var = new r45.yt5();
            yt5Var.f472887d = 4;
            yt5Var.f472888e = "paySettingsUseCase";
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.c(activityC17114xc078d367.mo55332x76847179(), yt5Var, null);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_enter_scene", 1);
            j45.l.j(activityC17114xc078d367.mo55332x76847179(), "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, null);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17114xc078d367.f238089i;
        activityC17114xc078d367.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b c7056xe1fb940b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7056xe1fb940b();
        c7056xe1fb940b.f143654d = 11;
        c7056xe1fb940b.k();
    }
}
