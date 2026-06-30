package hf5;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.n f362767a;

    /* renamed from: b, reason: collision with root package name */
    public final double f362768b;

    /* renamed from: c, reason: collision with root package name */
    public final double f362769c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362770d;

    public b(gf5.n language, double d17, double d18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(language, "language");
        this.f362767a = language;
        this.f362768b = d17;
        this.f362769c = d18;
        this.f362770d = i17;
    }

    /* renamed from: equals */
    public boolean m133489xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.b)) {
            return false;
        }
        hf5.b bVar = (hf5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362767a, bVar.f362767a) && java.lang.Double.compare(this.f362768b, bVar.f362768b) == 0 && java.lang.Double.compare(this.f362769c, bVar.f362769c) == 0 && this.f362770d == bVar.f362770d;
    }

    /* renamed from: hashCode */
    public int m133490x8cdac1b() {
        return (((((this.f362767a.m131476x8cdac1b() * 31) + java.lang.Double.hashCode(this.f362768b)) * 31) + java.lang.Double.hashCode(this.f362769c)) * 31) + java.lang.Integer.hashCode(this.f362770d);
    }

    /* renamed from: toString */
    public java.lang.String m133491x9616526c() {
        return "LanguageDetectionCandidate(language=" + this.f362767a + ", score=" + this.f362768b + ", coverageRatio=" + this.f362769c + ", spanCount=" + this.f362770d + ')';
    }
}
