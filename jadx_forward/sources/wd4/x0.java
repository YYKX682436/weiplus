package wd4;

/* loaded from: classes4.dex */
public abstract class x0 {
    public static final java.lang.String a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 d17 = d(str);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, snsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        r45.jj4 d18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.d(d17, str);
        if (d18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaObj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        java.lang.String c17 = c(e(d17), d18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return c17;
    }

    public static final java.lang.String b(java.lang.String str, r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, mediaObj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 d17 = d(str);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.MaterialPathUtils", "getMediaPath, snsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return null;
        }
        java.lang.String c17 = c(e(d17), jj4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return c17;
    }

    public static final java.lang.String c(boolean z17, r45.jj4 media) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        if (z17) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), media.f459388d) + ca4.z0.J(media);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return str;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), media.f459388d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(media);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSnsSightName(...)");
        java.lang.String concat = d17.concat(R);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return concat;
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsInfo", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        try {
            c17933xe8d1b226 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        } catch (java.lang.Exception unused) {
            c17933xe8d1b226 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfo", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return c17933xe8d1b226;
    }

    public static final boolean e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        if (snsInfo.m70371x485d7().f39014x86965dde == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.MaterialPathUtils", "isPhotoType, contentObj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
            return false;
        }
        boolean m70405x7b43eb28 = snsInfo.m70405x7b43eb28();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPhotoType", "com.tencent.mm.plugin.sns.ui.sheet.MaterialPathUtils");
        return m70405x7b43eb28;
    }
}
