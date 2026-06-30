package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public abstract class f6 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f245725a = new java.util.HashMap();

    public static java.lang.String a(r45.jj4 jj4Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCdnSightDownloadFileName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String str2 = ca4.z0.R(jj4Var) + str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCdnSightDownloadFileName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return str2;
    }

    public static java.lang.String b(java.lang.String str, r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCdnSightDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(str, jj4Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = jj4Var.f459388d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildCdnSightDownloadDirName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            java.lang.String d17 = d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCdnSightDownloadDirName", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            sb6.append(d17);
            sb6.append(a(jj4Var, ""));
            i17 = sb6.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildCdnSightDownloadSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return i17;
    }

    public static java.lang.String c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImageFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String d17 = d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), str);
        com.p314xaae8f345.mm.vfs.w6.u(d17);
        java.lang.String str2 = d17 + str + "image_bg_";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImageFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return str2;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        if (str == null || str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            return "";
        }
        boolean equals = android.os.Looper.getMainLooper().equals(android.os.Looper.myLooper());
        java.util.Map map = f245725a;
        if (equals) {
            if (((java.util.HashMap) map).containsKey(str.concat(str2))) {
                java.lang.String str3 = (java.lang.String) ((java.util.HashMap) map).get(str.concat(str2));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
                    return str3;
                }
            }
        }
        java.lang.String g17 = kk.k.g(str2.getBytes());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str);
        if (g17.length() >= 1) {
            stringBuffer.append(g17.charAt(0));
            stringBuffer.append("/");
        }
        if (g17.length() >= 2) {
            stringBuffer.append(g17.charAt(1));
            stringBuffer.append("/");
        }
        if (equals) {
            ((java.util.HashMap) map).put(str.concat(str2), stringBuffer.toString());
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        return stringBuffer2;
    }
}
