package mz4;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static float f414756a = Float.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static float f414757b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public static int f414758c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static float f414759d = 48.0f;

    public static float a() {
        float f17;
        synchronized (mz4.b.class) {
            if (f414757b == Float.MAX_VALUE) {
                android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                f414757b = displayMetrics.density * com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getConfiguration().fontScale;
            }
            f17 = f414757b;
        }
        return f17;
    }

    public static int b() {
        float f17;
        if (f414758c == -1) {
            synchronized (mz4.b.class) {
                try {
                    if (f414756a == Float.MAX_VALUE) {
                        android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
                        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        f414756a = displayMetrics.density;
                    }
                    f17 = f414756a;
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
            f414758c = java.lang.Math.round(f17 * 30.0f);
        }
        return f414758c;
    }
}
