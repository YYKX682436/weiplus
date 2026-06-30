package com.p314xaae8f345.mm.vfs;

/* loaded from: classes8.dex */
public abstract class x6 {
    public static long a(java.lang.String str, java.lang.String str2, boolean z17) {
        boolean z18;
        boolean z19 = false;
        if (z65.c.a()) {
            z18 = true;
        } else {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z18 = !"0".equals(j62.e.g().a("clicfg_enable_refcount_linking", "1", false, true));
        }
        if (z17 && z18) {
            z19 = true;
        }
        return com.p314xaae8f345.mm.vfs.w6.d(str, str2, z19);
    }

    public static java.lang.String b(java.lang.String str, boolean z17) {
        try {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, z17);
            if (i17 == null) {
                return str;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VFSFileOpEx", "exportExternalPath:%s to realPath:%s", str, i17);
            return i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VFSFileOpEx", th6, "exportExternalPath failed", new java.lang.Object[0]);
            return str;
        }
    }
}
