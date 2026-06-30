package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class i0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260303a;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3) {
        this.f260303a = activityC19036x32c728a3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m8
    public void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260303a;
        if (activityC19036x32c728a3.B1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC19036x32c728a3.f260245d, "has received canceled");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 3L, 1L);
            return;
        }
        activityC19036x32c728a3.m83124xb22b7187(true);
        activityC19036x32c728a3.mo48674x36654fab();
        activityC19036x32c728a3.f260253n = c19098xdf4bc178;
        java.lang.String str2 = activityC19036x32c728a3.f260245d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = c19098xdf4bc178 == null ? "" : c19098xdf4bc178.m73877x9616526c();
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "WalletPwdDialog showAlert with favinfo %s isNeedChangeBankcard %s", objArr);
        if (activityC19036x32c728a3.f260253n != null && z17) {
            activityC19036x32c728a3.i7(-100, true);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = activityC19036x32c728a3.f260262u;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 9, "");
        }
        activityC19036x32c728a3.f260249h = str;
        activityC19036x32c728a3.c7(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.e();
        activityC19036x32c728a3.L = null;
    }
}
