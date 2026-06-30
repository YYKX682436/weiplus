package qz2;

/* loaded from: classes9.dex */
public class k implements pz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a f449416a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a) {
        this.f449416a = activityC15523xe4f09a5a;
    }

    @Override // pz2.c
    public void a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a activityC15523xe4f09a5a = this.f449416a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "identify success");
            activityC15523xe4f09a5a.f218532h = i18;
            activityC15523xe4f09a5a.c7();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = activityC15523xe4f09a5a.f218529e;
            if (k2Var != null && k2Var.isShowing()) {
                activityC15523xe4f09a5a.f218529e.dismiss();
            }
            activityC15523xe4f09a5a.Y6();
            return;
        }
        if (i17 == 2005) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiz);
            re4.n.g(1000, -1000223, i17, "fingerprint error");
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.f218527s;
            activityC15523xe4f09a5a.b7(-1, string);
            return;
        }
        if (i17 != 2007) {
            if (i17 == 2009) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", java.lang.Integer.valueOf(i17));
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
                re4.n.g(1000, -1000223, i17, "fingerprint error");
                re4.n.a(3, 2);
                int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.f218527s;
                activityC15523xe4f09a5a.b7(-1, string2);
                return;
            }
            if (i17 != 10308) {
                if (i17 == 2001) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "identify timeout");
                    return;
                }
                if (i17 != 2002) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "identify FingerPrintConst.RESULT_NO_MATCH");
                com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.U6(activityC15523xe4f09a5a);
                pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
                aVar.mo148659x428ac225();
                if (!aVar.yh()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
                    return;
                } else {
                    if (aVar.dg(activityC15523xe4f09a5a.f218539r, 0, true) != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthTransparentUI", "startFingerprintAuth failed!");
                        return;
                    }
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: on error: %d", java.lang.Integer.valueOf(i17));
        java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
        if (i17 == 10308) {
            string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiw);
            re4.n.g(6, -1000223, -1, "too many trial");
        } else {
            re4.n.g(1000, -1000223, i17, "fingerprint error");
        }
        int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15523xe4f09a5a.f218527s;
        activityC15523xe4f09a5a.b7(-1, string3);
    }
}
