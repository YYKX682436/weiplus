package wo;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f529313a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f529314b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f529315c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f529316d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f529317e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f529318f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f529319g;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("android-");
        int i17 = android.os.Build.VERSION.SDK_INT;
        sb6.append(i17);
        f529313a = sb6.toString();
        f529314b = android.os.Build.BRAND;
        f529315c = wo.w0.m() + android.os.Build.CPU_ABI;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String str = android.os.Build.MANUFACTURER;
        sb7.append(str);
        sb7.append("-");
        sb7.append(wo.w0.m());
        f529316d = sb7.toString();
        f529317e = "android-" + i17;
        f529318f = "" + i17;
        f529319g = "android-" + str;
    }
}
