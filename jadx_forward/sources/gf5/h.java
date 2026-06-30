package gf5;

/* loaded from: classes11.dex */
public final class h implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f352929a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f352930b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f352931c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f352932d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f352933e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f352934f;

    /* renamed from: g, reason: collision with root package name */
    public final int f352935g;

    public h(java.util.List separators, gf5.z keyTokenType, boolean z17, java.util.List linePrefixesToSkip, java.util.Set bodyChars, boolean z18, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 4) != 0 ? true : z17;
        linePrefixesToSkip = (i18 & 8) != 0 ? kz5.p0.f395529d : linePrefixesToSkip;
        bodyChars = (i18 & 16) != 0 ? kz5.r0.f395535d : bodyChars;
        z18 = (i18 & 32) != 0 ? true : z18;
        i17 = (i18 & 64) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(separators, "separators");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyTokenType, "keyTokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linePrefixesToSkip, "linePrefixesToSkip");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyChars, "bodyChars");
        this.f352929a = separators;
        this.f352930b = keyTokenType;
        this.f352931c = z17;
        this.f352932d = linePrefixesToSkip;
        this.f352933e = bodyChars;
        this.f352934f = z18;
        this.f352935g = i17;
    }

    /* renamed from: equals */
    public boolean m131472xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.h)) {
            return false;
        }
        gf5.h hVar = (gf5.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352929a, hVar.f352929a) && this.f352930b == hVar.f352930b && this.f352931c == hVar.f352931c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352932d, hVar.f352932d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352933e, hVar.f352933e) && this.f352934f == hVar.f352934f && this.f352935g == hVar.f352935g;
    }

    /* renamed from: hashCode */
    public int m131473x8cdac1b() {
        return (((((((((((this.f352929a.hashCode() * 31) + this.f352930b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f352931c)) * 31) + this.f352932d.hashCode()) * 31) + this.f352933e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f352934f)) * 31) + java.lang.Integer.hashCode(this.f352935g);
    }

    /* renamed from: toString */
    public java.lang.String m131474x9616526c() {
        return "KeyValueSyntaxRule(separators=" + this.f352929a + ", keyTokenType=" + this.f352930b + ", trimLeadingWhitespace=" + this.f352931c + ", linePrefixesToSkip=" + this.f352932d + ", bodyChars=" + this.f352933e + ", useIdentifierRules=" + this.f352934f + ", priority=" + this.f352935g + ')';
    }
}
