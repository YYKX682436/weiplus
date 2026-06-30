package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class k0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260309d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3) {
        this.f260309d = activityC19036x32c728a3;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260309d;
        java.lang.String str = activityC19036x32c728a3.f260245d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "WalletPwdDialog event2 %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19036x32c728a3).f39906x53855852 = 4;
        activityC19036x32c728a3.B1 = true;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = activityC19036x32c728a3.f260262u;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 10, "");
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        activityC19036x32c728a3.f260249h = null;
        activityC19036x32c728a3.K = null;
        if (activityC19036x32c728a3.mo63463x4510f9c8()) {
            activityC19036x32c728a3.finish();
        }
        activityC19036x32c728a3.L = null;
    }
}
