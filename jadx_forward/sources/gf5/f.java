package gf5;

/* loaded from: classes11.dex */
public final class f implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f352923a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f352924b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f352925c;

    /* renamed from: d, reason: collision with root package name */
    public final int f352926d;

    public f(java.util.List prefixes, gf5.z tokenType, boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixes, "prefixes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        this.f352923a = prefixes;
        this.f352924b = tokenType;
        this.f352925c = z17;
        this.f352926d = i17;
    }

    /* renamed from: equals */
    public boolean m131466xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.f)) {
            return false;
        }
        gf5.f fVar = (gf5.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352923a, fVar.f352923a) && this.f352924b == fVar.f352924b && this.f352925c == fVar.f352925c && this.f352926d == fVar.f352926d;
    }

    /* renamed from: hashCode */
    public int m131467x8cdac1b() {
        return (((((this.f352923a.hashCode() * 31) + this.f352924b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f352925c)) * 31) + java.lang.Integer.hashCode(this.f352926d);
    }

    /* renamed from: toString */
    public java.lang.String m131468x9616526c() {
        return "DiffLineSyntaxRule(prefixes=" + this.f352923a + ", tokenType=" + this.f352924b + ", trimLeadingWhitespace=" + this.f352925c + ", priority=" + this.f352926d + ')';
    }
}
