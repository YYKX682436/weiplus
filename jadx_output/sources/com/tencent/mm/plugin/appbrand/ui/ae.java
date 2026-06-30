package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public abstract class ae {
    public static void a(android.widget.ImageView imageView) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaRelievedBuyIconApply", "applyBigIcon");
        b(imageView, com.tencent.mm.R.drawable.bvq, com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().Z.f77269m, com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().Z.f77270n, com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().Z.f77271o);
    }

    public static void b(android.widget.ImageView imageView, int i17, java.lang.String str, int i18, int i19) {
        int i27;
        if (imageView == null || imageView.getLayoutParams() == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i28 = layoutParams.height;
        if (!android.text.TextUtils.isEmpty(str) && i18 > 0 && i19 > 0) {
            layoutParams.width = (int) ((i28 * i18) / i19);
            imageView.setLayoutParams(layoutParams);
            l01.d0.f314761a.a(imageView, str, i17, null);
            return;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/WxaRelievedBuyIconApply", "applyIcon", "(Landroid/widget/ImageView;ILjava/lang/String;II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/plugin/appbrand/ui/WxaRelievedBuyIconApply", "applyIcon", "(Landroid/widget/ImageView;ILjava/lang/String;II)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (options.outWidth > 0 && (i27 = options.outHeight) > 0) {
            layoutParams.width = (int) ((i28 * r6) / i27);
        } else if (i18 > 0 && i19 > 0) {
            layoutParams.width = (int) ((i28 * i18) / i19);
        }
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(i17);
    }
}
