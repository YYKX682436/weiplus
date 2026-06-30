package f1;

/* loaded from: classes14.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f339999a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f340000b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f340001c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f340002d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f340003e = 0;

    static {
        long j17 = 3;
        long j18 = j17 << 32;
        f339999a = (0 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | j18;
        f340000b = (1 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | j18;
        f340001c = j18 | (2 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2);
        f340002d = (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | (4 << 32);
    }

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return a(j17, f339999a) ? "Rgb" : a(j17, f340000b) ? "Xyz" : a(j17, f340001c) ? "Lab" : a(j17, f340002d) ? "Cmyk" : "Unknown";
    }
}
