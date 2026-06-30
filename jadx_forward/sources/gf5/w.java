package gf5;

/* loaded from: classes11.dex */
public final class w implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f352996a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f352997b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.z f352998c;

    /* renamed from: d, reason: collision with root package name */
    public final int f352999d;

    public w(java.util.List prefixes, gf5.z markerTokenType, gf5.z directiveTokenType, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        markerTokenType = (i18 & 2) != 0 ? gf5.z.f353010n : markerTokenType;
        directiveTokenType = (i18 & 4) != 0 ? gf5.z.f353003d : directiveTokenType;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixes, "prefixes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(markerTokenType, "markerTokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(directiveTokenType, "directiveTokenType");
        this.f352996a = prefixes;
        this.f352997b = markerTokenType;
        this.f352998c = directiveTokenType;
        this.f352999d = i17;
    }

    /* renamed from: equals */
    public boolean m131502xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.w)) {
            return false;
        }
        gf5.w wVar = (gf5.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352996a, wVar.f352996a) && this.f352997b == wVar.f352997b && this.f352998c == wVar.f352998c && this.f352999d == wVar.f352999d;
    }

    /* renamed from: hashCode */
    public int m131503x8cdac1b() {
        return (((((this.f352996a.hashCode() * 31) + this.f352997b.hashCode()) * 31) + this.f352998c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f352999d);
    }

    /* renamed from: toString */
    public java.lang.String m131504x9616526c() {
        return "PreprocessorSyntaxRule(prefixes=" + this.f352996a + ", markerTokenType=" + this.f352997b + ", directiveTokenType=" + this.f352998c + ", priority=" + this.f352999d + ')';
    }
}
