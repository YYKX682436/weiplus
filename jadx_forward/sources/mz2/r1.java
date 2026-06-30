package mz2;

/* loaded from: classes9.dex */
public class r1 implements d50.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz2.s1 f414710a;

    public r1(mz2.s1 s1Var) {
        this.f414710a = s1Var;
    }

    @Override // d50.p
    public void a(int i17) {
    }

    @Override // d50.p
    public void b(eu5.c cVar) {
        int i17 = cVar.f557138a;
        mz2.s1 s1Var = this.f414710a;
        if (i17 == 1006) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: failed upload: model is null or necessary elements null");
            re4.n.e(4, -1000223, -1, "gen auth key failed: unexpected! generated but cannot get");
        } else if (i17 == 6) {
            re4.n.e(4, -1000223, -1, "gen auth key failed");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f557139b) && cVar.f557139b.startsWith("java.security.ProviderException")) {
                s1Var.d(-2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aix));
                return;
            } else if (wt5.a.g() == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f557139b) && cVar.f557139b.equals("errmsg not specified")) {
                s1Var.d(-2, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aiy));
                return;
            }
        } else if (i17 == 1004) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: update pay auth key failed. remove");
            re4.n.e(5, 4, cVar.f557138a, "upload auth key failed");
        } else if (i17 == 4 || i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "hy: gen auth key failed");
            re4.n.e(2, -1000223, -1, "gen ask failed");
        } else if (i17 == 1003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "upload ask failed");
            re4.n.e(3, 4, cVar.f557138a, cVar.f557139b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterFaceIdOpenDelegate", "unknown error when prepare auth key");
            re4.n.e(1000, -1000223, cVar.f557138a, cVar.f557139b);
        }
        s1Var.d(-1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aiw));
    }

    @Override // d50.p
    public void c(eu5.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFaceIdOpenDelegate", "hy: update pay auth key success");
        mz2.s1 s1Var = this.f414710a;
        java.lang.ref.WeakReference weakReference = s1Var.f414712a;
        if (weakReference == null || weakReference.get() == null) {
            s1Var.d(-1, "base ui is null");
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = (com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) s1Var.f414712a.get();
        ((d50.i) ((d50.k) i95.n0.c(d50.k.class))).getClass();
        abstractActivityC22902xe37969e.m83099x5406100e(new oz2.a(2), false);
    }
}
