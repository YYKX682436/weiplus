package e1;

/* loaded from: classes14.dex */
public abstract class e {
    public static final android.graphics.Bitmap a(e1.g0 g0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(g0Var, "<this>");
        if (g0Var instanceof e1.d) {
            return ((e1.d) g0Var).f327767b;
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final e1.g0 b(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "<this>");
        return new e1.d(bitmap);
    }

    public static final android.graphics.Bitmap.Config c(int i17) {
        if (i17 == 0) {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        if (i17 == 1) {
            return android.graphics.Bitmap.Config.ALPHA_8;
        }
        if (i17 == 2) {
            return android.graphics.Bitmap.Config.RGB_565;
        }
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 26) {
            if (i17 == 3) {
                return android.graphics.Bitmap.Config.RGBA_F16;
            }
        }
        if (i18 >= 26) {
            if (i17 == 4) {
                return android.graphics.Bitmap.Config.HARDWARE;
            }
        }
        return android.graphics.Bitmap.Config.ARGB_8888;
    }
}
