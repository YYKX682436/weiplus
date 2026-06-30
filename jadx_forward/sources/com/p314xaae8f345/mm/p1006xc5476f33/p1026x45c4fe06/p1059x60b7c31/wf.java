package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public abstract class wf {
    public static final java.lang.String a(java.lang.String filePath, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        if (str2 == null || str2.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(filePath);
            java.lang.String str4 = a17.f294812f;
            if (str4 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str5 = a17.f294812f;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SendVideoCommons", "parseFileName, fileName: " + str2);
        return str2;
    }
}
