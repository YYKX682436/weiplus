package kw2;

/* loaded from: classes13.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f394423a;

    /* renamed from: b, reason: collision with root package name */
    public final long f394424b;

    /* renamed from: c, reason: collision with root package name */
    public final float f394425c;

    /* renamed from: d, reason: collision with root package name */
    public final float f394426d;

    public b0(long j17, long j18, float f17, float f18) {
        this.f394423a = j17;
        this.f394424b = j18;
        this.f394425c = f17;
        this.f394426d = f18;
    }

    public final float a() {
        return this.f394425c;
    }

    public final long b() {
        return this.f394424b;
    }

    public final long c() {
        return this.f394423a;
    }

    public final float d() {
        return this.f394426d;
    }

    /* renamed from: equals */
    public boolean m144482xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.b0)) {
            return false;
        }
        kw2.b0 b0Var = (kw2.b0) obj;
        return this.f394423a == b0Var.f394423a && this.f394424b == b0Var.f394424b && java.lang.Float.compare(this.f394425c, b0Var.f394425c) == 0 && java.lang.Float.compare(this.f394426d, b0Var.f394426d) == 0;
    }

    /* renamed from: hashCode */
    public int m144483x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f394423a) * 31) + java.lang.Long.hashCode(this.f394424b)) * 31) + java.lang.Float.hashCode(this.f394425c)) * 31) + java.lang.Float.hashCode(this.f394426d);
    }

    /* renamed from: toString */
    public java.lang.String m144484x9616526c() {
        return "BufferDurationStats(min=" + this.f394423a + ", max=" + this.f394424b + ", avg=" + this.f394425c + ", variance=" + this.f394426d + ')';
    }
}
