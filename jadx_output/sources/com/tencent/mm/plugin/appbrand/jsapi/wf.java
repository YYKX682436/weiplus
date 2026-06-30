package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public abstract class wf {
    public static final java.lang.String a(java.lang.String filePath, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        if (str2 == null || str2.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(filePath);
            java.lang.String str4 = a17.f213279f;
            if (str4 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str5 = a17.f213279f;
            int lastIndexOf = str5.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str5 = str5.substring(lastIndexOf + 1);
            }
            sb6.append(str5);
            if (str == null || str.length() == 0) {
                str3 = "";
            } else {
                str3 = "." + str;
            }
            sb6.append(str3);
            str2 = sb6.toString();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SendVideoCommons", "parseFileName, fileName: " + str2);
        return str2;
    }
}
