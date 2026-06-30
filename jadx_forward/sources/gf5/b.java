package gf5;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.c f352909a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f352910b;

    /* renamed from: c, reason: collision with root package name */
    public final double f352911c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f352912d;

    public b(gf5.c mode, java.util.List patterns, double d17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(patterns, "patterns");
        this.f352909a = mode;
        this.f352910b = patterns;
        this.f352911c = d17;
        this.f352912d = z17;
    }

    /* renamed from: equals */
    public boolean m131451xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.b)) {
            return false;
        }
        gf5.b bVar = (gf5.b) obj;
        return this.f352909a == bVar.f352909a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352910b, bVar.f352910b) && java.lang.Double.compare(this.f352911c, bVar.f352911c) == 0 && this.f352912d == bVar.f352912d;
    }

    /* renamed from: hashCode */
    public int m131452x8cdac1b() {
        return (((((this.f352909a.hashCode() * 31) + this.f352910b.hashCode()) * 31) + java.lang.Double.hashCode(this.f352911c)) * 31) + java.lang.Boolean.hashCode(this.f352912d);
    }

    /* renamed from: toString */
    public java.lang.String m131453x9616526c() {
        return "DetectionTextPatternBonusEntry(mode=" + this.f352909a + ", patterns=" + this.f352910b + ", weight=" + this.f352911c + ", ignoreCase=" + this.f352912d + ')';
    }
}
