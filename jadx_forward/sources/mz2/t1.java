package mz2;

/* loaded from: classes9.dex */
public class t1 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz2.b f414722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz2.w1 f414723b;

    public t1(mz2.w1 w1Var, pz2.b bVar) {
        this.f414723b = w1Var;
        this.f414722a = bVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "authentication result: %s", java.lang.Integer.valueOf(cVar.f423076a));
        int i17 = cVar.f423076a;
        pz2.b bVar = this.f414722a;
        java.lang.String str = "";
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "identify success");
            mz2.w1 w1Var = this.f414723b;
            w1Var.getClass();
            w1Var.f414737g = cVar.f423080e;
            w1Var.f414738h = cVar.f423081f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 40);
            bVar.h(0, "");
            return;
        }
        if (i17 != 2005) {
            if (i17 != 2007) {
                if (i17 == 2009) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: on error: %d", java.lang.Integer.valueOf(i17));
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
                    re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
                    re4.n.a(3, 2);
                } else if (i17 != 10308) {
                    switch (i17) {
                        case 2000:
                        case 2001:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "identify timeout");
                            return;
                        case 2002:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "identify FingerPrintConst.RESULT_NO_MATCH");
                            bVar.h(-1, "");
                            return;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintOpenDelegate", "hy: on error: %d", java.lang.Integer.valueOf(i17));
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
            if (cVar.f423076a == 10308) {
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jix);
                re4.n.g(6, -1000223, -1, "too many trial");
                bVar.h(-3, string2);
                return;
            } else {
                if (android.os.Build.VERSION.SDK_INT == 27 && "Xiaomi".equals(android.os.Build.MANUFACTURER)) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aiw);
                }
                str = string;
                re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 39);
            }
        } else {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiz);
            re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1104, 39);
        }
        bVar.h(-2, str);
    }
}
