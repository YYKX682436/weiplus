package jb4;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public jb4.u f380385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f380386b;

    /* renamed from: c, reason: collision with root package name */
    public final int f380387c;

    public v() {
        int i17;
        this.f380386b = com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25865x41bb120a.f48856x4aa82bf;
        this.f380387c = 1280;
        try {
            int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            int i18 = c17[0];
            if (i18 <= 0 || (i17 = c17[1]) <= 0) {
                return;
            }
            int min = java.lang.Math.min(i18, i17);
            this.f380386b = min;
            int max = java.lang.Math.max(c17[0], c17[1]);
            this.f380387c = max;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "screen.w=" + min + ", screen.h=" + max);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "init exp=" + e17.toString());
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShotImgPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        java.lang.String l17 = za4.t0.l("sphere_shot_" + str, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShotImgPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        return l17;
    }

    public static android.graphics.Bitmap b(java.lang.String str, java.lang.String str2) {
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, imageUrl is empty, scene=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return null;
        }
        try {
            a17 = a(str2, str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, exp:" + e17.toString() + ", scene=" + str2);
        } catch (java.lang.OutOfMemoryError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, OOM:" + e18.toString() + ", scene=" + str2);
        }
        if (android.text.TextUtils.isEmpty(a17) || !com.p314xaae8f345.mm.vfs.w6.j(a17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "getSphereImageViewFrameShot, file not exists, scene=" + str2 + ", path=" + a17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.Bitmap c17 = com.p314xaae8f345.mm.p786x600aa8b.e.c(a17);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        int width = c17 == null ? 0 : c17.getWidth();
        int height = c17 == null ? 0 : c17.getHeight();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSphereImageViewFrameShot, timeCost=");
        sb6.append(currentTimeMillis2 - currentTimeMillis);
        sb6.append(", bmp==null?");
        sb6.append(c17 == null);
        sb6.append(", w=");
        sb6.append(width);
        sb6.append(", h=");
        sb6.append(height);
        sb6.append(", path=");
        sb6.append(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        return c17;
    }

    public static boolean c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "hasSphereImageViewFrameShot, imageUrl is empty, scene=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return false;
        }
        try {
            java.lang.String a17 = a(str2, str);
            boolean z17 = !android.text.TextUtils.isEmpty(a17) && com.p314xaae8f345.mm.vfs.w6.j(a17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "hasSphereImageViewFrameShot, ret=" + z17 + ", scene=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "hasSphereImageViewFrameShot, exp:" + e17.toString() + ", scene=" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasSphereImageViewFrameShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return false;
        }
    }

    public static boolean d(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (bitmap == null || bitmap.getWidth() < 20 || bitmap.getHeight() < 20) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return false;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = 0;
        for (int i18 = 0; i18 < 10; i18++) {
            for (int i19 = 0; i19 < 10; i19++) {
                i17 += bitmap.getPixel(i18, i19) & 16777215;
            }
        }
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        int i27 = width - 10;
        for (int i28 = i27; i28 < width; i28++) {
            for (int i29 = 0; i29 < 10; i29++) {
                i17 += bitmap.getPixel(i28, i29) & 16777215;
            }
        }
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        for (int i37 = 0; i37 < 10; i37++) {
            for (int i38 = height - 10; i38 < height; i38++) {
                i17 += bitmap.getPixel(i37, i38) & 16777215;
            }
        }
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        while (i27 < width) {
            for (int i39 = height - 10; i39 < height; i39++) {
                i17 += bitmap.getPixel(i27, i39) & 16777215;
            }
            i27++;
        }
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        int i47 = width / 2;
        int i48 = height / 2;
        for (int i49 = i47 - 5; i49 < i47 + 5; i49++) {
            for (int i57 = i48 - 5; i57 < i48 + 5; i57++) {
                i17 += bitmap.getPixel(i49, i57) & 16777215;
            }
        }
        if (i17 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidSphereImageViewShot", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        return false;
    }

    public static void f(android.view.TextureView textureView, java.lang.String str, java.lang.String str2) {
        long currentTimeMillis;
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveSphereImageViewShootAsyn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        try {
            currentTimeMillis = java.lang.System.currentTimeMillis();
            bitmap = textureView.getBitmap();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "saveSphereImageViewShootAsyn, exp=" + th6.toString());
        }
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !android.text.TextUtils.isEmpty(str)) {
            new jb4.s(bitmap, str, str2).execute(new java.lang.Void[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "saveSphereImageViewShootAsyn, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveSphereImageViewShootAsyn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "saveSphereImageViewShootAsyn, params err");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveSphereImageViewShootAsyn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
    }

    public void e(java.lang.String str, int i17, int i18, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "loadImage, view.w=" + i17 + ", view.h=" + i18 + ", scene=" + str2);
        if (i17 == 0 || i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            return;
        }
        jb4.u uVar = this.f380385a;
        if (uVar != null) {
            uVar.b(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            str3 = null;
        } else {
            try {
                java.lang.String l17 = za4.t0.l("adId", str);
                if (!android.text.TextUtils.isEmpty(l17)) {
                    if (com.p314xaae8f345.mm.vfs.w6.j(l17)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
                        str3 = l17;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereImageLoader", "getImgCacheFilePath, exp:" + e17.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgCacheFilePath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            str3 = "";
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "no cache, download");
            za4.t0.c(str, false, 133, 0, new jb4.q(this, str, i17, i18, str2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereImageLoader", "hit disk cache, path=" + str3);
            new jb4.r(this, str, i17, i18, str2).execute(str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
    }
}
