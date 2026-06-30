package p1;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f432407a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return "PointerId(value=" + j17 + ')';
    }

    /* renamed from: equals */
    public boolean m157656xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p1.r) {
            return this.f432407a == ((p1.r) obj).f432407a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157657x8cdac1b() {
        return java.lang.Long.hashCode(this.f432407a);
    }

    /* renamed from: toString */
    public java.lang.String m157658x9616526c() {
        return b(this.f432407a);
    }
}
