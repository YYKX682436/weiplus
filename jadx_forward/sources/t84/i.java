package t84;

/* loaded from: classes4.dex */
public abstract class i {
    public static android.graphics.Bitmap a(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        if (i17 == 0 || i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/gllib/Utils", "createColorBitmap", "(IIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/gllib/Utils", "createColorBitmap", "(IIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.eraseColor(i19);
        if (i27 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return createBitmap;
        }
        android.graphics.Bitmap s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(createBitmap, true, i27);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        return s07;
    }

    public static int b(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Utils", "initTexture, bmp==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Utils", "initTexture, bmp.w=" + bitmap.getWidth() + ", bmp.h=" + bitmap.getHeight());
        try {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i17 = iArr[0];
            if (i17 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
                return 0;
            }
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Utils", "initTexture exp:" + android.util.Log.getStackTraceString(th6));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return 0;
        }
    }
}
