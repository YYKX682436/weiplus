package hf5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.n f362771a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f362772b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362773c;

    public c(gf5.n nVar, java.util.List candidates, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(candidates, "candidates");
        this.f362771a = nVar;
        this.f362772b = candidates;
        this.f362773c = i17;
    }

    /* renamed from: equals */
    public boolean m133492xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.c)) {
            return false;
        }
        hf5.c cVar = (hf5.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362771a, cVar.f362771a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f362772b, cVar.f362772b) && this.f362773c == cVar.f362773c;
    }

    /* renamed from: hashCode */
    public int m133493x8cdac1b() {
        gf5.n nVar = this.f362771a;
        return ((((nVar == null ? 0 : nVar.m131476x8cdac1b()) * 31) + this.f362772b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f362773c);
    }

    /* renamed from: toString */
    public java.lang.String m133494x9616526c() {
        return "LanguageDetectionResult(bestMatch=" + this.f362771a + ", candidates=" + this.f362772b + ", analyzedLength=" + this.f362773c + ')';
    }
}
