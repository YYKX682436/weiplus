package yf5;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f543396a;

    /* renamed from: b, reason: collision with root package name */
    public int f543397b;

    public e(long j17, int i17) {
        this.f543396a = j17;
        this.f543397b = i17;
    }

    /* renamed from: equals */
    public boolean m176986xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf5.e)) {
            return false;
        }
        yf5.e eVar = (yf5.e) obj;
        return this.f543396a == eVar.f543396a && this.f543397b == eVar.f543397b;
    }

    /* renamed from: hashCode */
    public int m176987x8cdac1b() {
        return (java.lang.Long.hashCode(this.f543396a) * 31) + java.lang.Integer.hashCode(this.f543397b);
    }

    /* renamed from: toString */
    public java.lang.String m176988x9616526c() {
        return "FlagVersion(flag=" + this.f543396a + ", version=" + this.f543397b + ')';
    }
}
