package va3;

/* loaded from: classes13.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static double f515913a = -85.0d;

    /* renamed from: b, reason: collision with root package name */
    public static double f515914b = -1000.0d;

    /* renamed from: c, reason: collision with root package name */
    public static double f515915c = -85.0d;

    /* renamed from: d, reason: collision with root package name */
    public static double f515916d = -1000.0d;

    public static double a(double d17, double d18) {
        double d19;
        f515915c = d17;
        f515916d = d18;
        double d27 = f515913a;
        if (d27 != -85.0d) {
            double d28 = f515914b;
            if (d28 != -1000.0d) {
                d19 = (java.lang.Math.atan2(d18 - d28, d17 - d27) * 180.0d) / 3.141592d;
                f515913a = f515915c;
                f515914b = f515916d;
                return d19;
            }
        }
        d19 = 0.0d;
        f515913a = f515915c;
        f515914b = f515916d;
        return d19;
    }
}
