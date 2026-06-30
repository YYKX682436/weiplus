package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class y5 {
    public static java.lang.String a(com.tencent.mm.plugin.appbrand.appcache.y8 y8Var, java.lang.String str) {
        if (y8Var == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        y8Var.a();
        java.io.InputStream c17 = y8Var.c(str);
        if (c17 == null) {
            return null;
        }
        try {
            c17.mark(c17.available());
            java.lang.String c18 = kk.k.c(c17, 4096);
            c17.reset();
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(y8Var.b() + "_xdir/" + str);
            com.tencent.mm.vfs.r6 s17 = r6Var.s();
            if (s17.m() && s17.A()) {
                s17.l();
            }
            s17.J();
            if (!c18.equals(com.tencent.mm.vfs.w6.p(r6Var.u()))) {
                if (r6Var.y()) {
                    java.lang.Runtime.getRuntime().exec("rm -r " + r6Var.o());
                } else {
                    r6Var.l();
                }
                java.io.OutputStream H = com.tencent.mm.vfs.w6.H(r6Var);
                kk.f.a(c17, H);
                com.tencent.mm.sdk.platformtools.t8.v1(H);
            }
            return r6Var.o();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.PkgPartialCopy", e17, "copy failed", new java.lang.Object[0]);
            return null;
        } finally {
            com.tencent.mm.sdk.platformtools.t8.v1(c17);
        }
    }
}
