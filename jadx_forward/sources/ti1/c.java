package ti1;

/* loaded from: classes7.dex */
public abstract class c {
    public static final boolean a(ze.n nVar) {
        byte[] bArr = null;
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPermission.AppidABTestConfig", "fail:runtime is nil");
        } else {
            si1.g gVar = nVar.X1;
            if (gVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPermission.AppidABTestConfig", "NULL permissionController with appId:%s", nVar.f156336n);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89 f17 = gVar.f(nVar.f156336n, 1, nVar.f156338p.f158814g);
                if (f17 != null) {
                    bArr = f17.f168929d;
                }
            }
        }
        return bArr != null && bArr.length > 2 && bArr[2] == 1;
    }

    public static byte[] b(ze.n nVar) {
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPermission.AppidABTestConfig", "fail:runtime is nil");
            return null;
        }
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPermission.AppidABTestConfig", "NULL permissionController with appId:%s", nVar.f156336n);
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.p1175xe0b91e4f.C12541xa79a9e89 f17 = gVar.f(nVar.f156336n, 1, nVar.f156338p.f158814g);
        if (f17 != null) {
            return f17.f168930e;
        }
        return null;
    }
}
