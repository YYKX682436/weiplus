package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class c4 {
    public static java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str, java.lang.String str2) {
        android.net.Uri parse = android.net.Uri.parse(str2);
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().openInputStream(parse));
            try {
                try {
                    java.lang.String c17 = s46.c.c(parse.getPath());
                    if (android.text.TextUtils.isEmpty(c17)) {
                        c17 = "";
                    }
                    if (!android.text.TextUtils.isEmpty(c17) && !c17.startsWith(".")) {
                        c17 = ".".concat(c17);
                    }
                    java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(str, "opensdkfile_" + java.lang.System.currentTimeMillis() + c17).o();
                    com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o17);
                    com.p314xaae8f345.mm.vfs.w6.u(r6Var.r());
                    try {
                        java.io.OutputStream H = com.p314xaae8f345.mm.vfs.w6.H(r6Var);
                        kk.f.a(bufferedInputStream, H);
                        ik1.b0 b0Var = new ik1.b0();
                        o6Var.mo48802x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(o17)), c17, true, b0Var);
                        java.lang.String str3 = (java.lang.String) b0Var.f373357a;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(H);
                        return str3;
                    } catch (java.io.FileNotFoundException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenSdkJsApiProcessor", e17, "", new java.lang.Object[0]);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        return "";
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenSdkJsApiProcessor", e18, "", new java.lang.Object[0]);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(null);
                    return "";
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(bufferedInputStream);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v1(null);
                throw th6;
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenSdkJsApiProcessor", e19, "", new java.lang.Object[0]);
            return "";
        }
    }
}
