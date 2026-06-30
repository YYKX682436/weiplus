package gf5;

/* loaded from: classes11.dex */
public final class v implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f352990a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f352991b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f352992c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f352993d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f352994e;

    /* renamed from: f, reason: collision with root package name */
    public final int f352995f;

    public v(java.util.List prefixes, gf5.z tokenType, java.lang.String str, java.util.Set bodyChars, boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i18 & 4) != 0 ? null : str;
        bodyChars = (i18 & 8) != 0 ? kz5.r0.f395535d : bodyChars;
        z17 = (i18 & 16) != 0 ? true : z17;
        i17 = (i18 & 32) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixes, "prefixes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyChars, "bodyChars");
        this.f352990a = prefixes;
        this.f352991b = tokenType;
        this.f352992c = str;
        this.f352993d = bodyChars;
        this.f352994e = z17;
        this.f352995f = i17;
    }

    /* renamed from: equals */
    public boolean m131499xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.v)) {
            return false;
        }
        gf5.v vVar = (gf5.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352990a, vVar.f352990a) && this.f352991b == vVar.f352991b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352992c, vVar.f352992c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352993d, vVar.f352993d) && this.f352994e == vVar.f352994e && this.f352995f == vVar.f352995f;
    }

    /* renamed from: hashCode */
    public int m131500x8cdac1b() {
        int hashCode = ((this.f352990a.hashCode() * 31) + this.f352991b.hashCode()) * 31;
        java.lang.String str = this.f352992c;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f352993d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f352994e)) * 31) + java.lang.Integer.hashCode(this.f352995f);
    }

    /* renamed from: toString */
    public java.lang.String m131501x9616526c() {
        return "PrefixedSpanSyntaxRule(prefixes=" + this.f352990a + ", tokenType=" + this.f352991b + ", suffix=" + this.f352992c + ", bodyChars=" + this.f352993d + ", useIdentifierRules=" + this.f352994e + ", priority=" + this.f352995f + ')';
    }
}
