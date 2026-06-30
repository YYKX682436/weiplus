package h6;

/* loaded from: classes7.dex */
public abstract class a {
    public static final int a(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "<this>");
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (java.lang.Exception unused) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                android.graphics.Bitmap.Config config = bitmap.getConfig();
                return width * height * (config != android.graphics.Bitmap.Config.ALPHA_8 ? (config == android.graphics.Bitmap.Config.RGB_565 || config == android.graphics.Bitmap.Config.ARGB_4444) ? 2 : (android.os.Build.VERSION.SDK_INT < 26 || config != android.graphics.Bitmap.Config.RGBA_F16) ? 4 : 8 : 1);
            }
        }
        throw new java.lang.IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final boolean b(android.graphics.Bitmap.Config config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "<this>");
        return android.os.Build.VERSION.SDK_INT >= 26 && config == android.graphics.Bitmap.Config.HARDWARE;
    }
}
