package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public abstract class ae {
    public static void a(android.widget.ImageView imageView) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaRelievedBuyIconApply", "applyBigIcon");
        b(imageView, com.p314xaae8f345.mm.R.C30861xcebc809e.bvq, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().Z.f158802m, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().Z.f158803n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().Z.f158804o);
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
            l01.d0.f396294a.a(imageView, str, i17, null);
            return;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
