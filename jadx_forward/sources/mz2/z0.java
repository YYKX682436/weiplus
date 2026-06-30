package mz2;

/* loaded from: classes9.dex */
public class z0 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz2.b f414745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz2.d1 f414746b;

    public z0(mz2.d1 d1Var, pz2.b bVar) {
        this.f414746b = d1Var;
        this.f414745a = bVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "result: %s", java.lang.Integer.valueOf(cVar.f423076a));
        int i17 = cVar.f423076a;
        pz2.b bVar = this.f414745a;
        java.lang.String str = "";
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "identify success");
            this.f414746b.f414640g = cVar.f423077b;
            bVar.h(0, "");
            return;
        }
        if (i17 == 2005) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiz);
            re4.n.g(1000, -1000223, cVar.f423076a, "fingerprint error");
        } else if (i17 == 2007 || i17 == 10308) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "hy: on error: %s", java.lang.Integer.valueOf(i17));
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jiv);
            int i18 = cVar.f423076a;
            if (i18 == 10308) {
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jix);
                re4.n.g(6, -1000223, -1, "too many trial");
                bVar.h(-3, string);
                return;
            }
            re4.n.g(1000, -1000223, i18, "fingerprint error");
        } else if (i17 == 2001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "identify timeout");
        } else if (i17 == 2002) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HwFingerprintOpenDelegate", "identify FingerPrintConst.RESULT_NO_MATCH");
            bVar.h(-1, "");
            return;
        }
        bVar.h(-2, str);
    }
}
