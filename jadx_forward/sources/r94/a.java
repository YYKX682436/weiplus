package r94;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f474984a = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_color_space_fix, true);

    public static void a(android.graphics.BitmapFactory.Options options, android.graphics.BitmapFactory.Options options2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        if (android.os.Build.VERSION.SDK_INT > 26 && f474984a && options2 != null && (options2.outColorSpace == android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3) || options2.outColorSpace == android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3))) {
            options.inPreferredColorSpace = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSupportWideColor", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
    }

    public static android.graphics.Bitmap b(java.lang.String str, android.graphics.BitmapFactory.Options options, float f17) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p872xbfc2bd01.o.c().b(str, options);
        if (f17 == 0.0f) {
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return b17;
        }
        if (b17 != null) {
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(b17, true, f17 * b17.getWidth());
            java.lang.System.currentTimeMillis();
        } else {
            bitmap = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return bitmap;
    }

    public static com.p314xaae8f345.mm.p872xbfc2bd01.r c(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p872xbfc2bd01.o.c().b(str, options);
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p872xbfc2bd01.r c17 = com.p314xaae8f345.mm.p872xbfc2bd01.r.c(b17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decode", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return c17;
    }

    public static com.p314xaae8f345.mm.p872xbfc2bd01.r d(java.lang.String str, android.graphics.BitmapFactory.Options options) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        a(options, options);
        java.lang.System.currentTimeMillis();
        try {
            android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p872xbfc2bd01.o.c().b(str, options);
            if (b17 != null) {
                b17 = ca4.z0.j(str, b17);
            }
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p872xbfc2bd01.r c17 = com.p314xaae8f345.mm.p872xbfc2bd01.r.c(b17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return c17;
        } catch (java.lang.OutOfMemoryError e17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsBitmapUtil", "%s", com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + e17.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        }
    }

    public static android.graphics.Bitmap e(java.lang.String str, android.graphics.BitmapFactory.Options options, android.graphics.BitmapFactory.Options options2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        a(options, options2);
        java.lang.System.currentTimeMillis();
        try {
            android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p872xbfc2bd01.o.c().b(str, options);
            if (b17 != null) {
                b17 = ca4.z0.j(str, b17);
            }
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return b17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsBitmapUtil", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        } catch (java.lang.OutOfMemoryError e18) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsBitmapUtil", "%s", com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsBitmapUtil", "OutOfMemoryError e " + e18.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodeWithRotateByExifReturnBitmap", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            return null;
        }
    }

    public static android.graphics.Bitmap f(java.lang.String str, android.graphics.Rect rect, android.graphics.BitmapFactory.Options options) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("regionDecodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        java.lang.System.currentTimeMillis();
        android.graphics.Bitmap e17 = com.p314xaae8f345.mm.p872xbfc2bd01.o.c().e(str, rect, options);
        if (e17 != null) {
            e17 = ca4.z0.j(str, e17);
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("regionDecodeWithRotateByExif", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
        return e17;
    }
}
