package rq5;

/* loaded from: classes10.dex */
public abstract class a {
    public static android.graphics.BitmapFactory.Options a(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(i17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/wximage/BigImageJudge", "getBitmapOptions", "(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/wximage/BigImageJudge", "getBitmapOptions", "(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (decodeFile != null) {
            decodeFile.recycle();
        }
        return options;
    }

    public static boolean b() {
        java.lang.String a17;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if ((i17 != 27 || (a17 = wo.w1.a("ro.mediatek.platform")) == null || (!a17.startsWith("mt6765") && !a17.startsWith("MT6765"))) && fp.f0.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImageOpt is MTK platform");
            if (i17 == 24 || i17 == 25 || i17 == 27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImgOpt is MTK platform, android api: %d, cannot use BigImgOpt", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigImageReporter", "alvinluo reportMTKPlatform apiLevel: %d", java.lang.Integer.valueOf(i17));
                if (i17 == 24) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(896L, 0L, 1L);
                    return true;
                }
                if (i17 != 25) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(896L, 1L, 1L);
                return true;
            }
        }
        return false;
    }

    public static boolean c(java.lang.String str) {
        if (b()) {
            return false;
        }
        android.graphics.BitmapFactory.Options a17 = a(str);
        int i17 = a17.outWidth;
        int i18 = a17.outHeight;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImgOpt ignore abTestFlag, widthFactor: %f, heightFactor: %f, width: %d, height: %d", java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.0f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int i19 = context == null ? 0 : context.getResources().getDisplayMetrics().widthPixels;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        return ((float) i17) >= ((float) i19) * 1.0f || ((float) i18) >= ((float) (context2 == null ? 0 : context2.getResources().getDisplayMetrics().heightPixels)) * 1.0f;
    }

    public static boolean d(java.lang.String str) {
        if (b()) {
            return false;
        }
        android.graphics.BitmapFactory.Options a17 = a(str);
        int i17 = a17.outWidth;
        int i18 = a17.outHeight;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImgOpt ignore abTestFlag, widthFactor: %f, heightFactor: %f, width: %d, height: %d", java.lang.Float.valueOf(2.0f), java.lang.Float.valueOf(2.5f), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int i19 = context == null ? 0 : context.getResources().getDisplayMetrics().widthPixels;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        return ((float) i17) >= ((float) i19) * 2.5f || ((float) i18) >= ((float) (context2 == null ? 0 : context2.getResources().getDisplayMetrics().heightPixels)) * 2.0f;
    }
}
