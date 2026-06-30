package ty0;

/* loaded from: classes8.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f504389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f504390b;

    public j1(int i17, int i18) {
        this.f504389a = i17;
        this.f504390b = i18;
    }

    /* renamed from: equals */
    public boolean m167208xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty0.j1)) {
            return false;
        }
        ty0.j1 j1Var = (ty0.j1) obj;
        return this.f504389a == j1Var.f504389a && this.f504390b == j1Var.f504390b;
    }

    /* renamed from: hashCode */
    public int m167209x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f504389a) * 31) + java.lang.Integer.hashCode(this.f504390b);
    }

    /* renamed from: toString */
    public java.lang.String m167210x9616526c() {
        return "TextLayoutInfo(textWidth=" + this.f504389a + ", containerWidth=" + this.f504390b + ')';
    }
}
