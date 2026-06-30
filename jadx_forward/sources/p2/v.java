package p2;

/* loaded from: classes14.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f432936a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return a(j17, 0L) ? "Unspecified" : a(j17, 4294967296L) ? "Sp" : a(j17, 8589934592L) ? "Em" : "Invalid";
    }

    /* renamed from: equals */
    public boolean m157764xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p2.v) {
            return this.f432936a == ((p2.v) obj).f432936a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m157765x8cdac1b() {
        return java.lang.Long.hashCode(this.f432936a);
    }

    /* renamed from: toString */
    public java.lang.String m157766x9616526c() {
        return b(this.f432936a);
    }
}
