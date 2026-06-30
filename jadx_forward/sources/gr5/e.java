package gr5;

/* loaded from: classes11.dex */
public final class e implements gr5.b {

    /* renamed from: b, reason: collision with root package name */
    public final float f356448b;

    /* renamed from: c, reason: collision with root package name */
    public final float f356449c;

    public e(float f17, float f18) {
        this.f356448b = f17;
        this.f356449c = f18;
    }

    public long a(long j17, long j18, boolean z17) {
        float f17 = (((int) (j18 >> 32)) - ((int) (j17 >> 32))) / 2.0f;
        float b17 = (zq5.g.b(j18) - zq5.g.b(j17)) / 2.0f;
        float f18 = this.f356448b;
        if (!z17) {
            f18 *= -1;
        }
        float f19 = 1;
        return zq5.d.a(a06.d.b(f17 * (f18 + f19)), a06.d.b(b17 * (f19 + this.f356449c)));
    }

    /* renamed from: equals */
    public boolean m132095xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.e)) {
            return false;
        }
        gr5.e eVar = (gr5.e) obj;
        return java.lang.Float.compare(this.f356448b, eVar.f356448b) == 0 && java.lang.Float.compare(this.f356449c, eVar.f356449c) == 0;
    }

    /* renamed from: hashCode */
    public int m132096x8cdac1b() {
        return (java.lang.Float.hashCode(this.f356448b) * 31) + java.lang.Float.hashCode(this.f356449c);
    }

    /* renamed from: toString */
    public java.lang.String m132097x9616526c() {
        return "BiasAlignmentCompat(horizontalBias=" + this.f356448b + ", verticalBias=" + this.f356449c + ')';
    }
}
