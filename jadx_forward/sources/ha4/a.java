package ha4;

/* loaded from: classes4.dex */
public abstract class a {
    public static com.p314xaae8f345.mm.p872xbfc2bd01.r a(android.graphics.Bitmap bitmap, java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("blurBitmap", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        com.p314xaae8f345.mm.p872xbfc2bd01.r c17 = com.p314xaae8f345.mm.p872xbfc2bd01.r.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(bitmap, i18));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blurBitmap", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BlurHelper", "returnBitmap error2 ");
        }
        if (c17 != null) {
            c17.f150507h = false;
            new android.graphics.Canvas(c17.f150503d).drawColor(i17);
        }
        try {
            c17.f150507h = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(c17.f150503d, 70, android.graphics.Bitmap.CompressFormat.JPEG, str, false);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BlurHelper", "error for exception " + e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BlurHelper", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BlurHelper", "blur done bitmap  " + c17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        return c17;
    }

    public static com.p314xaae8f345.mm.p872xbfc2bd01.r b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p872xbfc2bd01.r a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        int argb = android.graphics.Color.argb(51, 255, 255, 255);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        com.p314xaae8f345.mm.p872xbfc2bd01.r p17 = ca4.z0.p(str);
        if (p17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BlurHelper", "returnBitmap error1 ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
            a17 = null;
        } else {
            p17.f150507h = false;
            a17 = a(p17.f150503d, str2, argb, 55);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("blurPath", "com.tencent.mm.plugin.sns.lucky.model.BlurHelper");
        return a17;
    }
}
