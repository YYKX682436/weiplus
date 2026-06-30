package yq5;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final yq5.n f546147b = new yq5.n(200, 8);

    /* renamed from: c, reason: collision with root package name */
    public static final yq5.n f546148c = new yq5.n(0, 8);

    /* renamed from: a, reason: collision with root package name */
    public final long f546149a;

    public n(long j17, long j18) {
        this.f546149a = j17;
    }

    /* renamed from: equals */
    public boolean m177533xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yq5.n) {
            return this.f546149a == ((yq5.n) obj).f546149a;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m177534x8cdac1b() {
        return (java.lang.Long.hashCode(this.f546149a) * 31) + java.lang.Long.hashCode(8L);
    }

    /* renamed from: toString */
    public java.lang.String m177535x9616526c() {
        return "TileAnimationSpec(duration=" + this.f546149a + ", interval=8)";
    }
}
