package a84;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a84.y f83912a;

    public static void a(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync, exp=" + th6.toString());
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String str2 = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z);
                if (!str.equals(android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdImageLoader", "the input file path is not same as the tag file path");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                } else {
                    ((ku5.t0) ku5.t0.f394148d).g(new a84.u(imageView.getWidth(), imageView.getHeight(), str, str2, f17, z17, imageView));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdImageLoader", "are you sure the input param is valid?");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void b(t84.c cVar, java.lang.String str, float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (cVar != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync, exp=" + th6.toString());
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                float f18 = cVar.f497955c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                int i17 = (int) f18;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                float f19 = cVar.f497956d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                ((ku5.t0) ku5.t0.f394148d).g(new a84.x(i17, (int) f19, str, f17, cVar));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdImageLoader", "are you sure the input param is valid?");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void c(java.lang.String str, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (!str.equals((java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z))) {
            imageView.setImageDrawable(null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            if (android.text.TextUtils.isEmpty(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            } else {
                imageView.hashCode();
                imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, str);
                za4.t0.a(str, false, 41, 0, new a84.r(imageView, str));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void d(java.lang.String str, android.widget.ImageView imageView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        try {
            if (!str.equals((java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z))) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                if (android.text.TextUtils.isEmpty(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                } else {
                    imageView.hashCode();
                    imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, str);
                    za4.t0.a(str, false, 41, 0, new a84.s(i17, imageView, str));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void e(java.lang.String str, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLoadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        if (!str.equals((java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z))) {
            imageView.setImageDrawable(null);
            h(str, imageView);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void f(java.lang.String str, android.widget.ImageView imageView) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        if (str.equals((java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdImageLoader", "same url");
        } else {
            if (f83912a != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$23");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.class) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBitmapFromCache", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    bitmap = (android.graphics.Bitmap) ((kk.l) com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.W).i(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmapFromCache", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$23");
                if (bitmap != null && !bitmap.isRecycled()) {
                    imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, str);
                    imageView.setImageBitmap(bitmap);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdImageLoader", "hit mem cache");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    return;
                }
            }
            imageView.setImageDrawable(null);
            i(str, imageView, 0.0f, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static android.graphics.drawable.Drawable g(android.content.res.Resources resources, java.lang.String str) {
        android.graphics.Bitmap J2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        try {
            J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "getDrawableFromFile exp=" + th6.toString() + ", path=" + str);
        }
        if (J2 != null) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, J2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return bitmapDrawable;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "getDrawableFromFile bitmap==null, path=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        return null;
    }

    public static void h(java.lang.String str, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        i(str, imageView, 0.0f, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void i(java.lang.String str, android.widget.ImageView imageView, float f17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdImageLoader", "loadImageByCdn, hash=" + imageView.hashCode() + ", withCache=" + z17 + ", url=" + str);
        imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, str);
        za4.t0.c(str, false, 1, 0, new a84.v(imageView, str, f17, z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }
}
