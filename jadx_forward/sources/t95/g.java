package t95;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f498124a;

    /* renamed from: b, reason: collision with root package name */
    public final long f498125b;

    public g(long j17, long j18) {
        this.f498124a = j17;
        this.f498125b = j18;
    }

    /* renamed from: equals */
    public boolean m166032xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t95.g)) {
            return false;
        }
        t95.g gVar = (t95.g) obj;
        return this.f498124a == gVar.f498124a && this.f498125b == gVar.f498125b;
    }

    /* renamed from: hashCode */
    public int m166033x8cdac1b() {
        return (java.lang.Long.hashCode(this.f498124a) * 31) + java.lang.Long.hashCode(this.f498125b);
    }

    /* renamed from: toString */
    public java.lang.String m166034x9616526c() {
        return "Range(offset=" + this.f498124a + ", length=" + this.f498125b + ')';
    }
}
