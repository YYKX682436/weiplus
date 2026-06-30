package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class w9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f262306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x9 f262307e;

    public w9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x9 x9Var, boolean z17) {
        this.f262307e = x9Var;
        this.f262306d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f262306d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x9 x9Var = this.f262307e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19126xf47a4ab1 activityC19126xf47a4ab1 = x9Var.f262333a;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 s0Var = activityC19126xf47a4ab1.f261663h;
            boolean z17 = false;
            if (activityC19126xf47a4ab1.f261662g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVerifyIdCardUI", "isCertInstalled passed");
            } else {
                java.lang.String string = activityC19126xf47a4ab1.m83105x7498fe14().getString("key_cre_type");
                java.lang.String m83161xfb85ada3 = activityC19126xf47a4ab1.f261660e.m83161xfb85ada3();
                at4.t tVar = activityC19126xf47a4ab1.f261661f;
                int i17 = tVar.f95495a;
                if ((i17 == 1) && tVar.f95498d == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isBlockInstall %s", s0Var);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83161xfb85ada3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isBlockInstall sms error %s", s0Var);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 6);
                        activityC19126xf47a4ab1.m83098x5406100e(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0(string, m83161xfb85ada3, activityC19126xf47a4ab1.m83107xcc3330f3(), s0Var, true));
                        z17 = true;
                    }
                } else {
                    if (i17 == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVerifyIdCardUI", "tryToinstallCert isNeedInstall %s", s0Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 6);
                        activityC19126xf47a4ab1.m83098x5406100e(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0(string, m83161xfb85ada3, activityC19126xf47a4ab1.m83107xcc3330f3(), s0Var, false));
                        z17 = true;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVerifyIdCardUI", "no need installcert");
                    }
                }
            }
            if (z17) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19126xf47a4ab1.U6(x9Var.f262333a);
        }
    }
}
