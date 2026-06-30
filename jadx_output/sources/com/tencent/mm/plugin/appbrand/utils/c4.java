package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public abstract class c4 {
    public static java.lang.String a(com.tencent.mm.plugin.appbrand.o6 o6Var, java.lang.String str, java.lang.String str2) {
        android.net.Uri parse = android.net.Uri.parse(str2);
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().openInputStream(parse));
            try {
                try {
                    java.lang.String c17 = s46.c.c(parse.getPath());
                    if (android.text.TextUtils.isEmpty(c17)) {
                        c17 = "";
                    }
                    if (!android.text.TextUtils.isEmpty(c17) && !c17.startsWith(".")) {
                        c17 = ".".concat(c17);
                    }
                    java.lang.String o17 = new com.tencent.mm.vfs.r6(str, "opensdkfile_" + java.lang.System.currentTimeMillis() + c17).o();
                    com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o17);
                    com.tencent.mm.vfs.w6.u(r6Var.r());
                    try {
                        java.io.OutputStream H = com.tencent.mm.vfs.w6.H(r6Var);
                        kk.f.a(bufferedInputStream, H);
                        ik1.b0 b0Var = new ik1.b0();
                        o6Var.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(o17)), c17, true, b0Var);
                        java.lang.String str3 = (java.lang.String) b0Var.f291824a;
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedInputStream);
                        com.tencent.mm.sdk.platformtools.t8.v1(H);
                        return str3;
                    } catch (java.io.FileNotFoundException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenSdkJsApiProcessor", e17, "", new java.lang.Object[0]);
                        com.tencent.mm.sdk.platformtools.t8.v1(bufferedInputStream);
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        return "";
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenSdkJsApiProcessor", e18, "", new java.lang.Object[0]);
                    com.tencent.mm.sdk.platformtools.t8.v1(bufferedInputStream);
                    com.tencent.mm.sdk.platformtools.t8.v1(null);
                    return "";
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.sdk.platformtools.t8.v1(bufferedInputStream);
                com.tencent.mm.sdk.platformtools.t8.v1(null);
                throw th6;
            }
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenSdkJsApiProcessor", e19, "", new java.lang.Object[0]);
            return "";
        }
    }
}
