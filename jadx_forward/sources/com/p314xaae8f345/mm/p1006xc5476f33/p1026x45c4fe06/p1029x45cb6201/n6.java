package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public class n6 extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f157218f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6.f157209w, "PredownloadEncryptPkgInfo")};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f157219e;

    public n6(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6.f157209w, "PredownloadEncryptPkgInfo", dm.o9.f320528m);
        this.f157219e = k0Var;
    }

    public static boolean y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 m6Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m6Var.f67844x55b471cc)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s path nil", m6Var.t0());
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m6Var.f67843xb05c6f7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity, with %s record md5 nil", m6Var.t0());
            return false;
        }
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(m6Var.f67844x55b471cc);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PredownloadEncryptPkgStorage", "checkPkgIntegrity with %s, file_md5(%s), record_md5(%s)", m6Var.t0(), p17, m6Var.f67843xb05c6f7);
        return m6Var.f67843xb05c6f7.equals(p17);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 D0(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 z07 = z0(str, i17, i18);
        if (z07 == null || !y0(z07)) {
            return null;
        }
        return z07;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 z0(java.lang.String str, int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6 m6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6();
        m6Var.f67842x28d45f97 = str;
        m6Var.f67845x2262335f = i17;
        m6Var.f67846x8987ca93 = i18;
        if (get(m6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.m6.f157208v)) {
            return m6Var;
        }
        return null;
    }
}
