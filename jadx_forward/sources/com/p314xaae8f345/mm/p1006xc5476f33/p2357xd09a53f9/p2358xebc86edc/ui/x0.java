package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class x0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe f260061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe) {
        super(false);
        this.f260061d = activityC19000x9000bdbe;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        java.util.ArrayList j17 = vr4.f1.wi().Ai().j();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe = this.f260061d;
        if (j17 == null || j17.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is empty, do bind card to fetch");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe.A;
            db5.e1.K(activityC19000x9000bdbe, false, activityC19000x9000bdbe.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575018kf0), "", activityC19000x9000bdbe.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kez), activityC19000x9000bdbe.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.q0(activityC19000x9000bdbe), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.r0(activityC19000x9000bdbe));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "mBankcardList is valid, to do fetch");
            com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19000x9000bdbe, qr4.h.class, null, null);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(15, 1);
        }
    }
}
