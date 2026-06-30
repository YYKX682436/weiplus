package rj5;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f477915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f477916b;

    public g(int i17, int i18) {
        this.f477915a = i17;
        this.f477916b = i18;
    }

    /* renamed from: equals */
    public boolean m162530xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj5.g)) {
            return false;
        }
        rj5.g gVar = (rj5.g) obj;
        return this.f477915a == gVar.f477915a && this.f477916b == gVar.f477916b;
    }

    /* renamed from: hashCode */
    public int m162531x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f477915a) * 31) + java.lang.Integer.hashCode(this.f477916b);
    }

    /* renamed from: toString */
    public java.lang.String m162532x9616526c() {
        return "ScrollTarget(position=" + this.f477915a + ", offset=" + this.f477916b + ')';
    }
}
