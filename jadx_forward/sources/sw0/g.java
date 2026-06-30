package sw0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f494967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f494968b;

    public g(int i17, int i18) {
        this.f494967a = i17;
        this.f494968b = i18;
    }

    /* renamed from: equals */
    public boolean m165406xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw0.g)) {
            return false;
        }
        sw0.g gVar = (sw0.g) obj;
        return this.f494967a == gVar.f494967a && this.f494968b == gVar.f494968b;
    }

    /* renamed from: hashCode */
    public int m165407x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f494967a) * 31) + java.lang.Integer.hashCode(this.f494968b);
    }

    /* renamed from: toString */
    public java.lang.String m165408x9616526c() {
        return "TextStyleSelectedPack(preIndex=" + this.f494967a + ", selectedIndex=" + this.f494968b + ')';
    }
}
