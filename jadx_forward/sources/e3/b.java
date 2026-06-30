package e3;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f328575a = new java.lang.ThreadLocal();

    public static void a(int i17, int i18, int i19, float[] fArr) {
        float f17;
        float abs;
        float f18 = i17 / 255.0f;
        float f19 = i18 / 255.0f;
        float f27 = i19 / 255.0f;
        float max = java.lang.Math.max(f18, java.lang.Math.max(f19, f27));
        float min = java.lang.Math.min(f18, java.lang.Math.min(f19, f27));
        float f28 = max - min;
        float f29 = (max + min) / 2.0f;
        if (max == min) {
            f17 = 0.0f;
            abs = 0.0f;
        } else {
            f17 = max == f18 ? ((f19 - f27) / f28) % 6.0f : max == f19 ? ((f27 - f18) / f28) + 2.0f : 4.0f + ((f18 - f19) / f28);
            abs = f28 / (1.0f - java.lang.Math.abs((2.0f * f29) - 1.0f));
        }
        float f37 = (f17 * 60.0f) % 360.0f;
        if (f37 < 0.0f) {
            f37 += 360.0f;
        }
        fArr[0] = f37 < 0.0f ? 0.0f : java.lang.Math.min(f37, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : java.lang.Math.min(abs, 1.0f);
        fArr[2] = f29 >= 0.0f ? java.lang.Math.min(f29, 1.0f) : 0.0f;
    }

    public static int b(double d17, double d18, double d19) {
        double d27 = (((3.2406d * d17) + ((-1.5372d) * d18)) + ((-0.4986d) * d19)) / 100.0d;
        double d28 = ((((-0.9689d) * d17) + (1.8758d * d18)) + (0.0415d * d19)) / 100.0d;
        double d29 = (((0.0557d * d17) + ((-0.204d) * d18)) + (1.057d * d19)) / 100.0d;
        return android.graphics.Color.rgb(h((int) java.lang.Math.round((d27 > 0.0031308d ? (java.lang.Math.pow(d27, 0.4166666666666667d) * 1.055d) - 0.055d : d27 * 12.92d) * 255.0d), 0, 255), h((int) java.lang.Math.round((d28 > 0.0031308d ? (java.lang.Math.pow(d28, 0.4166666666666667d) * 1.055d) - 0.055d : d28 * 12.92d) * 255.0d), 0, 255), h((int) java.lang.Math.round((d29 > 0.0031308d ? (java.lang.Math.pow(d29, 0.4166666666666667d) * 1.055d) - 0.055d : d29 * 12.92d) * 255.0d), 0, 255));
    }

    public static int c(int i17, int i18, float f17) {
        float f18 = 1.0f - f17;
        return android.graphics.Color.argb((int) ((android.graphics.Color.alpha(i17) * f18) + (android.graphics.Color.alpha(i18) * f17)), (int) ((android.graphics.Color.red(i17) * f18) + (android.graphics.Color.red(i18) * f17)), (int) ((android.graphics.Color.green(i17) * f18) + (android.graphics.Color.green(i18) * f17)), (int) ((android.graphics.Color.blue(i17) * f18) + (android.graphics.Color.blue(i18) * f17)));
    }

    public static double d(int i17, int i18) {
        if (android.graphics.Color.alpha(i18) != 255) {
            throw new java.lang.IllegalArgumentException("background can not be translucent: #" + java.lang.Integer.toHexString(i18));
        }
        if (android.graphics.Color.alpha(i17) < 255) {
            i17 = g(i17, i18);
        }
        double e17 = e(i17) + 0.05d;
        double e18 = e(i18) + 0.05d;
        return java.lang.Math.max(e17, e18) / java.lang.Math.min(e17, e18);
    }

    public static double e(int i17) {
        java.lang.ThreadLocal threadLocal = f328575a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = android.graphics.Color.red(i17);
        int green = android.graphics.Color.green(i17);
        int blue = android.graphics.Color.blue(i17);
        if (dArr.length != 3) {
            throw new java.lang.IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d17 = red / 255.0d;
        double pow = d17 < 0.04045d ? d17 / 12.92d : java.lang.Math.pow((d17 + 0.055d) / 1.055d, 2.4d);
        double d18 = green / 255.0d;
        double pow2 = d18 < 0.04045d ? d18 / 12.92d : java.lang.Math.pow((d18 + 0.055d) / 1.055d, 2.4d);
        double d19 = blue / 255.0d;
        double pow3 = d19 < 0.04045d ? d19 / 12.92d : java.lang.Math.pow((d19 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        double d27 = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[1] = d27;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
        return d27 / 100.0d;
    }

    public static int f(int i17, int i18, float f17) {
        int i19 = 255;
        if (android.graphics.Color.alpha(i18) != 255) {
            throw new java.lang.IllegalArgumentException("background can not be translucent: #" + java.lang.Integer.toHexString(i18));
        }
        double d17 = f17;
        if (d(i(i17, 255), i18) < d17) {
            return -1;
        }
        int i27 = 0;
        for (int i28 = 0; i28 <= 10 && i19 - i27 > 1; i28++) {
            int i29 = (i27 + i19) / 2;
            if (d(i(i17, i29), i18) < d17) {
                i27 = i29;
            } else {
                i19 = i29;
            }
        }
        return i19;
    }

    public static int g(int i17, int i18) {
        int alpha = android.graphics.Color.alpha(i18);
        int alpha2 = android.graphics.Color.alpha(i17);
        int i19 = 255 - alpha2;
        int i27 = 255 - (((255 - alpha) * i19) / 255);
        return android.graphics.Color.argb(i27, i27 == 0 ? 0 : (((android.graphics.Color.red(i17) * 255) * alpha2) + ((android.graphics.Color.red(i18) * alpha) * i19)) / (i27 * 255), i27 == 0 ? 0 : (((android.graphics.Color.green(i17) * 255) * alpha2) + ((android.graphics.Color.green(i18) * alpha) * i19)) / (i27 * 255), i27 != 0 ? (((android.graphics.Color.blue(i17) * 255) * alpha2) + ((android.graphics.Color.blue(i18) * alpha) * i19)) / (i27 * 255) : 0);
    }

    public static int h(int i17, int i18, int i19) {
        return i17 < i18 ? i18 : java.lang.Math.min(i17, i19);
    }

    public static int i(int i17, int i18) {
        if (i18 < 0 || i18 > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i17 & 16777215) | (i18 << 24);
    }
}
