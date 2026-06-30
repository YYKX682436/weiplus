package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public abstract class i1 {
    public static android.util.Pair a(java.lang.String str, java.lang.String str2) {
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            android.system.Os.rename(com.tencent.mm.vfs.w6.i(str, true), com.tencent.mm.vfs.w6.i(str2, true));
            java.lang.System.currentTimeMillis();
            return android.util.Pair.create(java.lang.Boolean.TRUE, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.FileMove", "move, os rename exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            android.system.ErrnoException errnoException = e17 instanceof android.system.ErrnoException ? (android.system.ErrnoException) e17 : null;
            boolean x17 = com.tencent.mm.vfs.w6.x(str, str2, true);
            if (!x17) {
                x17 = com.tencent.mm.plugin.appbrand.appstorage.m1.a(com.tencent.mm.vfs.w6.i(str, true), com.tencent.mm.vfs.w6.i(str2, true), true);
            }
            return android.util.Pair.create(java.lang.Boolean.valueOf(x17), errnoException);
        }
    }
}
