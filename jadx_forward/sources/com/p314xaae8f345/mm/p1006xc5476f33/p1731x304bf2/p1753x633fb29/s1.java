package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class s1 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f221970d = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1.f221964p, "GamePBCache")};

    public s1(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1.f221964p, "GamePBCache", null);
    }

    public byte[] D0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("game_center_pref", 0).getString("game_center_pref_lang", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()))) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1 r1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1();
        r1Var.f68262x4b6e619a = str;
        if (super.get(r1Var, new java.lang.String[0])) {
            return r1Var.f68263x29f571ec;
        }
        return null;
    }

    public boolean J0(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && fVar != null) {
            try {
                return L0(str, fVar.mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePBCacheStorage", "Saving Failed: %s", e17.getMessage());
            }
        }
        return false;
    }

    public boolean L0(java.lang.String str, byte[] bArr) {
        boolean mo880xb970c2b9;
        if (bArr == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1 r1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1();
        r1Var.f68262x4b6e619a = str;
        if (super.get(r1Var, new java.lang.String[0])) {
            r1Var.f68263x29f571ec = bArr;
            mo880xb970c2b9 = super.mo9952xce0038c9(r1Var, new java.lang.String[0]);
        } else {
            r1Var.f68263x29f571ec = bArr;
            mo880xb970c2b9 = super.mo880xb970c2b9(r1Var);
        }
        if (!mo880xb970c2b9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePBCacheStorage", "Saving cache failed (update or insert)");
        }
        return mo880xb970c2b9;
    }

    public void y0(java.lang.String str) {
        java.lang.String str2 = "delete from GamePBCache where key like '%" + str + "'";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GamePBCacheStorage", "deleteDataWithSuffix, ret:%b, sql: %s", java.lang.Boolean.valueOf(m145253xb158737d("GameHaowanMedia", str2)), str2);
    }

    public boolean z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1 r1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r1();
        r1Var.f68262x4b6e619a = str;
        return super.mo9951xb06685ab(r1Var, new java.lang.String[0]);
    }
}
