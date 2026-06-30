package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class h0 implements et4.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260300a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3) {
        this.f260300a = activityC19036x32c728a3;
    }

    @Override // et4.g0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260300a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC19036x32c728a3.f260245d, "click add new bankcard");
        at4.n a17 = at4.n.a();
        if (a17.b()) {
            db5.e1.s(activityC19036x32c728a3.mo55332x76847179(), a17.f95435b, activityC19036x32c728a3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = activityC19036x32c728a3.f260262u;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 14, "");
        activityC19036x32c728a3.K.dismiss();
        activityC19036x32c728a3.K = null;
        activityC19036x32c728a3.Z6();
    }

    @Override // et4.g0
    public void b(java.lang.String str, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260300a;
        if (activityC19036x32c728a3.B1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC19036x32c728a3.f260245d, "has received canceled");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(965L, 3L, 1L);
            return;
        }
        activityC19036x32c728a3.m83124xb22b7187(true);
        activityC19036x32c728a3.mo48674x36654fab();
        activityC19036x32c728a3.f260253n = c19098xdf4bc178;
        activityC19036x32c728a3.f260252m = c19091x9511676c;
        java.lang.String str2 = activityC19036x32c728a3.f260245d;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = c19098xdf4bc178 == null ? "" : c19098xdf4bc178.m73877x9616526c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "WalletPwdDialog showAlert with favinfo %s", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = activityC19036x32c728a3.f260262u;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d562 == null ? 0 : c19760x34448d562.f273642e, c19760x34448d562 == null ? "" : c19760x34448d562.f273647m, 9, "");
        }
        activityC19036x32c728a3.f260249h = str;
        activityC19036x32c728a3.c7(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.b1.e();
    }

    @Override // et4.g0
    /* renamed from: onCancel */
    public void mo73814x3d6f0539() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260300a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC19036x32c728a3.f260245d, "cashier dialog canceled");
        activityC19036x32c728a3.B1 = true;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = activityC19036x32c728a3.f260262u;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 10, "");
        if (activityC19036x32c728a3.mo63463x4510f9c8()) {
            activityC19036x32c728a3.finish();
        }
    }
}
