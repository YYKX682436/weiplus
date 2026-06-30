package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes8.dex */
public class b0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f259633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 f259634b;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4, android.app.Dialog dialog) {
        this.f259634b = activityC19009xdf81ddb4;
        this.f259633a = dialog;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtBalanceAutoTransferUI", "open back: %s, %s, %s", java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152148a));
        android.app.Dialog dialog = this.f259633a;
        if (dialog != null) {
            dialog.dismiss();
        }
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19009xdf81ddb4 activityC19009xdf81ddb4 = this.f259634b;
        if (i17 != 0 || fVar.f152149b != 0) {
            activityC19009xdf81ddb4.f259466d.m81392x52cfa5c6(false);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC19009xdf81ddb4.mo55332x76847179(), fVar.f152150c);
            return null;
        }
        if (((r45.r15) fVar.f152151d).f465965d == 0) {
            activityC19009xdf81ddb4.f259466d.m81392x52cfa5c6(true);
            activityC19009xdf81ddb4.Y6();
            return null;
        }
        activityC19009xdf81ddb4.f259466d.m81392x52cfa5c6(false);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.M(activityC19009xdf81ddb4.mo55332x76847179(), ((r45.r15) fVar.f152151d).f465966e);
        return null;
    }
}
