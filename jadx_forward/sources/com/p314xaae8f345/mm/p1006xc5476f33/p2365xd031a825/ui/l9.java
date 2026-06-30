package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class l9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 f261945d;

    public l9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3) {
        this.f261945d = activityC19125x69c29dd3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f261945d;
        activityC19125x69c29dd3.mo48674x36654fab();
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s0 s0Var = activityC19125x69c29dd3.f261658v;
        boolean z17 = false;
        if (activityC19125x69c29dd3.f261655s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "isCertInstalled passed");
        } else {
            at4.t tVar = activityC19125x69c29dd3.f261657u;
            int i17 = tVar.f95495a;
            if ((i17 == 1) && tVar.f95498d == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isBlockInstall %s", s0Var);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19125x69c29dd3.f261644e.m83183xfb85ada3())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isBlockInstall sms error %s", s0Var);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 6);
                    activityC19125x69c29dd3.m83098x5406100e(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0(activityC19125x69c29dd3.f261644e.m83183xfb85ada3(), activityC19125x69c29dd3.m83107xcc3330f3(), s0Var, true, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295514f));
                    z17 = true;
                }
            } else {
                if (i17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "tryToinstallCert isNeedInstall %s", s0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13731, 6);
                    activityC19125x69c29dd3.m83098x5406100e(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t0(activityC19125x69c29dd3.f261644e.m83183xfb85ada3(), activityC19125x69c29dd3.m83107xcc3330f3(), s0Var, false, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295514f));
                    z17 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletVertifyCodeUI", "no need installcert");
                }
            }
        }
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            activityC19125x69c29dd3.U6();
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
