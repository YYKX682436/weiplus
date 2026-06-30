package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class m0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe f260011d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe) {
        this.f260011d = activityC19000x9000bdbe;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe = this.f260011d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19000x9000bdbe.f259346q.S2)) {
            intent.putExtra("rawUrl", activityC19000x9000bdbe.f259346q.R2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "carson: entry_url: %s", activityC19000x9000bdbe.f259346q.S2);
            intent.putExtra("rawUrl", activityC19000x9000bdbe.f259346q.S2);
        }
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("KPublisherId", "pay_blance_list");
        intent.putExtra("geta8key_scene", 33);
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19000x9000bdbe.mo55332x76847179(), intent);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(16, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16503, 1, "balanceBill");
        return true;
    }
}
