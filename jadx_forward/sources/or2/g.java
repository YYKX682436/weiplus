package or2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f429159a;

    /* renamed from: b, reason: collision with root package name */
    public final int f429160b;

    public g(long j17, int i17) {
        this.f429159a = j17;
        this.f429160b = i17;
    }

    /* renamed from: equals */
    public boolean m152142xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or2.g)) {
            return false;
        }
        or2.g gVar = (or2.g) obj;
        return this.f429159a == gVar.f429159a && this.f429160b == gVar.f429160b;
    }

    /* renamed from: hashCode */
    public int m152143x8cdac1b() {
        return (java.lang.Long.hashCode(this.f429159a) * 31) + java.lang.Integer.hashCode(this.f429160b);
    }

    /* renamed from: toString */
    public java.lang.String m152144x9616526c() {
        return "Frame(frameTimeNs=" + this.f429159a + ", frameType=" + this.f429160b + ')';
    }
}
