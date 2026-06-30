package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class p0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe f260024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe) {
        super(false);
        this.f260024d = activityC19000x9000bdbe;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBalanceManagerUI", "click action entry");
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe = this.f260024d;
        at4.s sVar = activityC19000x9000bdbe.f259347r;
        int i17 = sVar.f95475b;
        if (i17 != 1) {
            if (i17 == 2) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.X(activityC19000x9000bdbe.mo55332x76847179(), activityC19000x9000bdbe.f259347r.f95477d, true);
                return;
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(sVar.f95478e, sVar.f95479f, 0, 1061);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBalanceManagerUI", "unknown type: %s", java.lang.Integer.valueOf(i17));
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sVar.f95476c)) {
            return;
        }
        if (activityC19000x9000bdbe.f259347r.f95476c.startsWith("weixin://wcpay/lqt/detail")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(activityC19000x9000bdbe.f259347r.f95476c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_account_type", 1);
            if (((h45.q) i95.n0.c(h45.q.class)).mo24812x391b2a71(activityC19000x9000bdbe.mo55332x76847179())) {
                return;
            }
            j45.l.j(activityC19000x9000bdbe.mo55332x76847179(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, null);
            return;
        }
        if (activityC19000x9000bdbe.f259347r.f95476c.startsWith("weixin://wcpay/lqt/save")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.b(activityC19000x9000bdbe.f259347r.f95476c);
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.a(activityC19000x9000bdbe.f259347r.f95476c);
            new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z().l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.o0(this, com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(activityC19000x9000bdbe.mo55332x76847179(), false, false, null), a17));
        }
    }
}
