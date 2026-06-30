package l0;

/* loaded from: classes8.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f395953a;

    /* renamed from: b, reason: collision with root package name */
    public final float f395954b;

    /* renamed from: c, reason: collision with root package name */
    public final float f395955c;

    public p1(float f17, float f18, float f19) {
        this.f395953a = f17;
        this.f395954b = f18;
        this.f395955c = f19;
    }

    /* renamed from: equals */
    public boolean m144747xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0.p1)) {
            return false;
        }
        l0.p1 p1Var = (l0.p1) obj;
        if (!(this.f395953a == p1Var.f395953a)) {
            return false;
        }
        if (this.f395954b == p1Var.f395954b) {
            return (this.f395955c > p1Var.f395955c ? 1 : (this.f395955c == p1Var.f395955c ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m144748x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f395953a) * 31) + java.lang.Float.hashCode(this.f395954b)) * 31) + java.lang.Float.hashCode(this.f395955c);
    }

    /* renamed from: toString */
    public java.lang.String m144749x9616526c() {
        return "ResistanceConfig(basis=" + this.f395953a + ", factorAtMin=" + this.f395954b + ", factorAtMax=" + this.f395955c + ')';
    }
}
