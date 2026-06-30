package nx1;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static float f422850a = Float.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static float f422851b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public static int f422852c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static float f422853d = 48.0f;

    public static float a() {
        float f17;
        synchronized (nx1.q.class) {
            if (f422851b == Float.MAX_VALUE) {
                android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                f422851b = displayMetrics.density * com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().fontScale;
            }
            f17 = f422851b;
        }
        return f17;
    }

    public static int b() {
        float f17;
        if (f422852c == -1) {
            synchronized (nx1.q.class) {
                try {
                    if (f422850a == Float.MAX_VALUE) {
                        android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
                        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        f422850a = displayMetrics.density;
                    }
                    f17 = f422850a;
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            f422852c = java.lang.Math.round(f17 * 30.0f);
        }
        return f422852c;
    }
}
