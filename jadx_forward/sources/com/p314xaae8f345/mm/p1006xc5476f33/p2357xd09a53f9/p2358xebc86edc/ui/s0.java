package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class s0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c1 f260034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe f260035e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c1 c1Var) {
        super(false);
        this.f260035e = activityC19000x9000bdbe;
        this.f260034d = c1Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.c1 c1Var = this.f260034d;
        int i17 = c1Var.f259405a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe = this.f260035e;
        if (i17 == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", c1Var.f259406b);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(activityC19000x9000bdbe.mo55332x76847179(), intent);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            java.lang.String str = c1Var.f259407c;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            nxVar.f89000b = c1Var.f259408d;
            nxVar.f89002d = 1034;
            nxVar.f89001c = 0;
            c6113xa3727625.e();
        } else if (i17 != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "unknown entrance type");
        } else if (c1Var.f259406b.equals("wxpay://lqp/balanceQuotaState")) {
            j45.l.j(activityC19000x9000bdbe.mo55332x76847179(), "wallet_ecard", ".ui.WalletECardLogoutUI", new android.content.Intent(), null);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(46, 1);
    }
}
