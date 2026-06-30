package so2;

/* loaded from: classes5.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f492259a;

    /* renamed from: b, reason: collision with root package name */
    public final int f492260b;

    /* renamed from: c, reason: collision with root package name */
    public final int f492261c;

    public y5(int i17, int i18, int i19) {
        this.f492259a = i17;
        this.f492260b = i18;
        this.f492261c = i19;
    }

    /* renamed from: equals */
    public boolean m164964xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.y5)) {
            return false;
        }
        so2.y5 y5Var = (so2.y5) obj;
        return this.f492259a == y5Var.f492259a && this.f492260b == y5Var.f492260b && this.f492261c == y5Var.f492261c;
    }

    /* renamed from: hashCode */
    public int m164965x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f492259a) * 31) + java.lang.Integer.hashCode(this.f492260b)) * 31) + java.lang.Integer.hashCode(this.f492261c);
    }

    /* renamed from: toString */
    public java.lang.String m164966x9616526c() {
        return "DynamicIconInfo(iconName=" + this.f492259a + ", iconNodeStartPos=" + this.f492260b + ", iconNodeEndPos=" + this.f492261c + ')';
    }
}
