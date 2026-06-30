package a84;

/* loaded from: classes4.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static volatile a84.y f2379a;

    public static void a(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync, exp=" + th6.toString());
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.String str2 = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z);
                if (!str.equals(android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2))) {
                    com.tencent.mars.xlog.Log.w("SnsAd.AdImageLoader", "the input file path is not same as the tag file path");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                } else {
                    ((ku5.t0) ku5.t0.f312615d).g(new a84.u(imageView.getWidth(), imageView.getHeight(), str, str2, f17, z17, imageView));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                }
            }
        }
        com.tencent.mars.xlog.Log.w("SnsAd.AdImageLoader", "are you sure the input param is valid?");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void b(t84.c cVar, java.lang.String str, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (cVar != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "setImageBitmapAsync, exp=" + th6.toString());
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                float f18 = cVar.f416422c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidth", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                int i17 = (int) f18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                float f19 = cVar.f416423d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeight", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
                ((ku5.t0) ku5.t0.f312615d).g(new a84.x(i17, (int) f19, str, f17, cVar));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            }
        }
        com.tencent.mars.xlog.Log.w("SnsAd.AdImageLoader", "are you sure the input param is valid?");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageBitmapAsync", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void c(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (!str.equals((java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z))) {
            imageView.setImageDrawable(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            } else {
                imageView.hashCode();
                imageView.setTag(com.tencent.mm.R.id.n1z, str);
                za4.t0.a(str, false, 41, 0, new a84.r(imageView, str));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void d(java.lang.String str, android.widget.ImageView imageView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        try {
            if (!str.equals((java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z))) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                if (android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                } else {
                    imageView.hashCode();
                    imageView.setTag(com.tencent.mm.R.id.n1z, str);
                    za4.t0.a(str, false, 41, 0, new a84.s(i17, imageView, str));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageEx", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void e(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        if (!str.equals((java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z))) {
            imageView.setImageDrawable(null);
            h(str, imageView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void f(java.lang.String str, android.widget.ImageView imageView) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        if (str.equals((java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z))) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdImageLoader", "same url");
        } else {
            if (f2379a != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$23");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                synchronized (com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.class) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBitmapFromCache", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    bitmap = (android.graphics.Bitmap) ((kk.l) com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0.W).i(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmapFromCache", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBitmap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$23");
                if (bitmap != null && !bitmap.isRecycled()) {
                    imageView.setTag(com.tencent.mm.R.id.n1z, str);
                    imageView.setImageBitmap(bitmap);
                    com.tencent.mars.xlog.Log.i("SnsAd.AdImageLoader", "hit mem cache");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    return;
                }
            }
            imageView.setImageDrawable(null);
            i(str, imageView, 0.0f, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImageByCdnWithCache", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static android.graphics.drawable.Drawable g(android.content.res.Resources resources, java.lang.String str) {
        android.graphics.Bitmap J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        try {
            J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "getDrawableFromFile exp=" + th6.toString() + ", path=" + str);
        }
        if (J2 != null) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, J2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return bitmapDrawable;
        }
        com.tencent.mars.xlog.Log.e("SnsAd.AdImageLoader", "getDrawableFromFile bitmap==null, path=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDrawableFromFile", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        return null;
    }

    public static void h(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        i(str, imageView, 0.0f, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }

    public static void i(java.lang.String str, android.widget.ImageView imageView, float f17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            return;
        }
        com.tencent.mars.xlog.Log.i("SnsAd.AdImageLoader", "loadImageByCdn, hash=" + imageView.hashCode() + ", withCache=" + z17 + ", url=" + str);
        imageView.setTag(com.tencent.mm.R.id.n1z, str);
        za4.t0.c(str, false, 1, 0, new a84.v(imageView, str, f17, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
    }
}
