package p2;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final p2.v[] f432933b = {new p2.v(0), new p2.v(4294967296L), new p2.v(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f432934c = p2.u.d(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f432935a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static final long b(long j17) {
        return f432933b[(int) ((j17 & 1095216660480L) >>> 32)].f432936a;
    }

    public static final float c(long j17) {
        return java.lang.Float.intBitsToFloat((int) (j17 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2));
    }

    public static java.lang.String d(long j17) {
        long b17 = b(j17);
        if (p2.v.a(b17, 0L)) {
            return "Unspecified";
        }
        if (p2.v.a(b17, 4294967296L)) {
            return c(j17) + ".sp";
        }
        if (!p2.v.a(b17, 8589934592L)) {
            return "Invalid";
        }
        return c(j17) + ".em";
    }

    /* renamed from: equals */
    public boolean m157761xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.t) {
            return this.f432935a == ((p2.t) obj).f432935a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157762x8cdac1b() {
        return java.lang.Long.hashCode(this.f432935a);
    }

    /* renamed from: toString */
    public java.lang.String m157763x9616526c() {
        return d(this.f432935a);
    }
}
