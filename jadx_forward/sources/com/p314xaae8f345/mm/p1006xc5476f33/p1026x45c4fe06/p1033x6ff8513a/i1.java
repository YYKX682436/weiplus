package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public abstract class i1 {
    public static android.util.Pair a(java.lang.String str, java.lang.String str2) {
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.System.currentTimeMillis();
            android.system.Os.rename(com.p314xaae8f345.mm.vfs.w6.i(str, true), com.p314xaae8f345.mm.vfs.w6.i(str2, true));
            java.lang.System.currentTimeMillis();
            return android.util.Pair.create(java.lang.Boolean.TRUE, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.FileMove", "move, os rename exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            android.system.ErrnoException errnoException = e17 instanceof android.system.ErrnoException ? (android.system.ErrnoException) e17 : null;
            boolean x17 = com.p314xaae8f345.mm.vfs.w6.x(str, str2, true);
            if (!x17) {
                x17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m1.a(com.p314xaae8f345.mm.vfs.w6.i(str, true), com.p314xaae8f345.mm.vfs.w6.i(str2, true), true);
            }
            return android.util.Pair.create(java.lang.Boolean.valueOf(x17), errnoException);
        }
    }
}
