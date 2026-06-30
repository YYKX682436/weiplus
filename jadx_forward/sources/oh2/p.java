package oh2;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f426940a;

    /* renamed from: b, reason: collision with root package name */
    public final int f426941b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f426942c;

    public p(int i17, int i18, boolean z17) {
        this.f426940a = i17;
        this.f426941b = i18;
        this.f426942c = z17;
    }

    /* renamed from: equals */
    public boolean m151380xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh2.p)) {
            return false;
        }
        oh2.p pVar = (oh2.p) obj;
        return this.f426940a == pVar.f426940a && this.f426941b == pVar.f426941b && this.f426942c == pVar.f426942c;
    }

    /* renamed from: hashCode */
    public int m151381x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f426940a) * 31) + java.lang.Integer.hashCode(this.f426941b)) * 31) + java.lang.Boolean.hashCode(this.f426942c);
    }

    /* renamed from: toString */
    public java.lang.String m151382x9616526c() {
        return "time: " + this.f426940a + ", pitch: " + this.f426941b + ", hit: " + this.f426942c;
    }
}
