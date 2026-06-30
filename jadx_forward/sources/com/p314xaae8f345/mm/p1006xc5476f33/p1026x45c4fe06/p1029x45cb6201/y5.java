package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public abstract class y5 {
    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var, java.lang.String str) {
        if (y8Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
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
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(y8Var.b() + "_xdir/" + str);
            com.p314xaae8f345.mm.vfs.r6 s17 = r6Var.s();
            if (s17.m() && s17.A()) {
                s17.l();
            }
            s17.J();
            if (!c18.equals(com.p314xaae8f345.mm.vfs.w6.p(r6Var.u()))) {
                if (r6Var.y()) {
                    java.lang.Runtime.getRuntime().exec("rm -r " + r6Var.o());
                } else {
                    r6Var.l();
                }
                java.io.OutputStream H = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                kk.f.a(c17, H);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(H);
            }
            return r6Var.o();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.PkgPartialCopy", e17, "copy failed", new java.lang.Object[0]);
            return null;
        } finally {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(c17);
        }
    }
}
