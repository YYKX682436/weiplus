package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class v implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public long f259935a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 f259936b;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4) {
        this.f259936b = activityC19009xdf81ddb4;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "click switch: %s", java.lang.Boolean.valueOf(z17));
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j17 = elapsedRealtime - this.f259935a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4 = this.f259936b;
        if (j17 < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "skip");
            activityC19009xdf81ddb4.f259466d.m81392x52cfa5c6(!z17);
            this.f259935a = elapsedRealtime;
            return;
        }
        this.f259935a = elapsedRealtime;
        if (z17) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4.f259465t;
            activityC19009xdf81ddb4.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "go to pwd");
            android.content.Intent intent = new android.content.Intent(activityC19009xdf81ddb4, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19111xd5a60886.class);
            intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 3);
            activityC19009xdf81ddb4.startActivityForResult(intent, 16);
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4.f259465t;
        activityC19009xdf81ddb4.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "show close alert");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19009xdf81ddb4.f259477r)) {
            activityC19009xdf81ddb4.f259477r = activityC19009xdf81ddb4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kom);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19009xdf81ddb4.mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.A = false;
        aVar.f293242a = "";
        aVar.f293262s = activityC19009xdf81ddb4.f259477r;
        aVar.f293265v = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.kon);
        aVar.f293266w = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.W = activityC19009xdf81ddb4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.x(activityC19009xdf81ddb4);
        aVar.Z = true;
        aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.y(activityC19009xdf81ddb4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        activityC19009xdf81ddb4.mo53058xe5d1a549(j0Var);
    }
}
