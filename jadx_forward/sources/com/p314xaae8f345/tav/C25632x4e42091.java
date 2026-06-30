package com.p314xaae8f345.tav;

/* renamed from: com.tencent.tav.Utils */
/* loaded from: classes12.dex */
public class C25632x4e42091 {

    /* renamed from: kPhoneName */
    private static java.lang.String f47045x54cc2cee = "";

    /* renamed from: _hellAccFlag_ */
    private byte f47046x7f11beae;

    /* renamed from: flipYBitmap */
    public static android.graphics.Bitmap m96107x7f5891db(android.graphics.Bitmap bitmap) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(1.0f, -1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/tav/Utils", "flipYBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/tav/Utils", "flipYBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    /* renamed from: getPhoneName */
    public static java.lang.String m96108xc2153663() {
        java.lang.String str = f47045x54cc2cee;
        if (str == null || str.isEmpty()) {
            java.lang.String str2 = android.os.Build.MANUFACTURER.toUpperCase() + " " + android.os.Build.MODEL;
            if (android.text.TextUtils.isEmpty(str2)) {
                return "";
            }
            f47045x54cc2cee = str2.replace(" ", "_").replace("+", "").replace("(t)", "");
        }
        return f47045x54cc2cee;
    }

    /* renamed from: isOnlySupportLowVersionGl */
    public static boolean m96109x923ccc82() {
        java.lang.String str = android.os.Build.HARDWARE;
        return "mt6752".equals(str) || "mt6797".equals(str) || "mt6757".equals(str) || "mt6750".equals(str);
    }
}
