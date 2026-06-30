package a84;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f2329a = new kk.l(3);

    public static void a(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        if (android.text.TextUtils.isEmpty(str) || imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        if (!str.equals((java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z))) {
            imageView.setImageDrawable(null);
            f(str, imageView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    public static void b(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLoadImageNotSetNull", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        if (android.text.TextUtils.isEmpty(str) || imageView == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImageNotSetNull", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        if (!str.equals((java.lang.String) imageView.getTag(com.tencent.mm.R.id.n1z))) {
            f(str, imageView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLoadImageNotSetNull", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    public static void c(java.lang.String str, java.lang.String str2, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        java.lang.String g17 = za4.t0.g();
        java.lang.String j17 = za4.t0.j(str2, str);
        java.lang.String str3 = g17 + j17;
        com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", "downloadImageByCdn, fileName=" + j17 + ", url=" + str);
        if (com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", "hit local cache, fileName=" + j17);
            if (e0Var != null) {
                ((ku5.t0) ku5.t0.f312615d).B(new a84.e(e0Var, str3));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        com.tencent.mm.vfs.w6.u(g17);
        r45.jj4 h17 = m21.y.h(j17, 2, str, str, 1, 1, "");
        ca4.s0 s0Var = new ca4.s0(h17);
        s0Var.d(3);
        s0Var.e(h17.f377855d);
        ((ku5.t0) ku5.t0.f312615d).B(new a84.f(h17, str3, str, e0Var, s0Var, g17, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    public static void d(java.lang.String str, za4.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        c(str, "adId_mm", e0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
    }

    public static java.lang.String e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPathForImgMM", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        java.lang.String str2 = za4.t0.g() + za4.t0.j("adId_mm", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPathForImgMM", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        return str2;
    }

    public static void f(java.lang.String str, android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        imageView.setTag(com.tencent.mm.R.id.n1z, str);
        imageView.hashCode();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((kk.l) f2329a).get(str);
        if (bitmap == null || bitmap.isRecycled()) {
            d(str, new a84.b(new java.lang.ref.WeakReference(imageView), str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        } else {
            imageView.setImageBitmap(bitmap);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        }
    }

    public static void g(java.lang.String str, a84.l lVar) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, drawableCallback is null, can not return image");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, imageUrl is null, you need operate this previously");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
            return;
        }
        lVar.hashCode();
        try {
            bitmap = (android.graphics.Bitmap) ((kk.l) f2329a).get(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, exp=" + th6.toString());
        }
        if (bitmap == null || bitmap.isRecycled()) {
            d(str, new a84.g(lVar, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        } else {
            lVar.a(bitmap, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadImageAsync", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
        }
    }
}
