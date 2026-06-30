package i65;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseIntArray f370917a = new android.util.SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public static float f370918b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f370919c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f370920d = true;

    public static float A(android.content.Context context) {
        return (l(context) || !E(context)) ? 1.0f : 1.1f;
    }

    public static int B(android.content.Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResourceHelper", "get widthPixels but context is null");
        return 0;
    }

    public static boolean C(float f17, float f18) {
        return ((double) java.lang.Math.abs(f17 - f18)) <= 1.0E-5d;
    }

    public static boolean D(android.content.Context context) {
        float q17 = q(context);
        f370918b = q17;
        return java.lang.Float.compare(q17, w(context)) > 0;
    }

    public static boolean E(android.content.Context context) {
        float q17 = q(context);
        f370918b = q17;
        return java.lang.Float.compare(q17, z(context)) > 0;
    }

    public static void F(android.content.Context context, float f17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putFloat("text_size_scale_key", f17);
        f370918b = f17;
    }

    public static int a(android.content.Context context, float f17) {
        return java.lang.Math.round(g(context) * f17);
    }

    public static int b(android.content.Context context, int i17) {
        return java.lang.Math.round(g(context) * i17);
    }

    public static int c(android.content.Context context, int i17) {
        return java.lang.Math.round(i17 / g(context));
    }

    public static int d(android.content.Context context, int i17) {
        if (context != null) {
            return context.getResources().getColor(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResourceHelper", "get color, resId %d, but context is null", java.lang.Integer.valueOf(i17));
        return 0;
    }

    public static android.content.res.ColorStateList e(android.content.Context context, int i17) {
        if (context != null) {
            return context.getResources().getColorStateList(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResourceHelper", "get color state list, resId %d, but context is null", java.lang.Integer.valueOf(i17));
        return null;
    }

    public static int f(android.content.Context context, int i17) {
        int i18;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResourceHelper", "get dimension pixel size, resId %d, but context is null", java.lang.Integer.valueOf(i17));
            return 0;
        }
        android.util.SparseIntArray sparseIntArray = f370917a;
        synchronized (sparseIntArray) {
            i18 = sparseIntArray.get(i17, 0);
        }
        if (i18 <= 0) {
            i18 = context.getResources().getDimensionPixelSize(i17);
            synchronized (sparseIntArray) {
                sparseIntArray.put(i17, i18);
            }
        }
        return i18;
    }

    public static float g(android.content.Context context) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int h(android.content.Context context, int i17) {
        float q17 = q(context);
        if (q17 > 1.4f) {
            q17 = 1.4f;
        }
        return (int) (f(context, i17) * q17);
    }

    public static android.graphics.drawable.Drawable i(android.content.Context context, int i17) {
        if (context != null) {
            return context.getResources().getDrawable(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResourceHelper", "get drawable, resId %d, but context is null", java.lang.Integer.valueOf(i17));
        return null;
    }

    public static float j(android.content.Context context) {
        float q17 = q(context);
        if (q17 > 1.4f) {
            return 1.4f;
        }
        return q17;
    }

    public static int k(android.content.Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResourceHelper", "get heightPixels but context is null");
        return 0;
    }

    public static boolean l(android.content.Context context) {
        if (context != null && !f370919c) {
            f370920d = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("screenResolution_isModifyDensity", true);
            f370919c = true;
        }
        return f370920d;
    }

    public static float m(android.content.Context context) {
        if (E(context)) {
            return l(context) ? 1.2f : 1.1f;
        }
        return 1.0f;
    }

    public static float n(android.content.Context context) {
        if (context == null) {
            return 1.0f;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).contains("text_size_scale_key") ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).getFloat("text_size_scale_key", 1.0f) : context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getFloat("text_size_scale_key", 1.0f);
    }

    public static int o(android.content.Context context) {
        float n17 = n(context);
        if (n17 == y(context)) {
            return 1;
        }
        x(context);
        if (n17 == 1.0f) {
            return 2;
        }
        if (n17 == w(context)) {
            return 3;
        }
        if (n17 == z(context)) {
            return 4;
        }
        if (n17 == s(context)) {
            return 5;
        }
        if (n17 == t(context)) {
            return 6;
        }
        if (n17 == u(context)) {
            return 7;
        }
        return n17 == v(context) ? 8 : 2;
    }

    public static int p(android.content.Context context, int i17) {
        return (int) (f(context, i17) * q(context));
    }

    public static float q(android.content.Context context) {
        if (f370918b == 0.0f) {
            if (context == null) {
                f370918b = 1.0f;
            } else {
                f370918b = n(context);
            }
        }
        if (!f370919c) {
            f370920d = context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("screenResolution_isModifyDensity", true);
            f370919c = true;
        }
        if (f370920d && (C(f370918b, 1.1f) || C(f370918b, 0.8f))) {
            f370918b = 1.0f;
        }
        return f370918b;
    }

    public static java.lang.String r(android.content.Context context, int i17) {
        if (context != null) {
            return context.getResources().getString(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ResourceHelper", "get string, resId %d, but context is null", java.lang.Integer.valueOf(i17));
        return "";
    }

    public static float s(android.content.Context context) {
        return l(context) ? 1.125f : 1.375f;
    }

    public static float t(android.content.Context context) {
        return l(context) ? 1.4f : 1.625f;
    }

    public static float u(android.content.Context context) {
        return l(context) ? 1.55f : 1.875f;
    }

    public static float v(android.content.Context context) {
        return l(context) ? 1.65f : 2.025f;
    }

    public static float w(android.content.Context context) {
        return l(context) ? 1.1f : 1.11f;
    }

    public static float x(android.content.Context context) {
        l(context);
        return 1.0f;
    }

    public static float y(android.content.Context context) {
        return l(context) ? 0.8f : 0.875f;
    }

    public static float z(android.content.Context context) {
        return l(context) ? 1.12f : 1.25f;
    }
}
