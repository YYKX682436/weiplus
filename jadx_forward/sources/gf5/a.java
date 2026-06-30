package gf5;

/* loaded from: classes11.dex */
public final class a implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f352899a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f352900b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.z f352901c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f352902d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f352903e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f352904f;

    /* renamed from: g, reason: collision with root package name */
    public final int f352905g;

    public a(java.lang.String start, java.lang.String end, gf5.z tokenType, boolean z17, boolean z18, boolean z19, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 8) != 0 ? true : z17;
        z18 = (i18 & 16) != 0 ? true : z18;
        z19 = (i18 & 32) != 0 ? false : z19;
        i17 = (i18 & 64) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        this.f352899a = start;
        this.f352900b = end;
        this.f352901c = tokenType;
        this.f352902d = z17;
        this.f352903e = z18;
        this.f352904f = z19;
        this.f352905g = i17;
    }

    /* renamed from: equals */
    public boolean m131445xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.a)) {
            return false;
        }
        gf5.a aVar = (gf5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352899a, aVar.f352899a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352900b, aVar.f352900b) && this.f352901c == aVar.f352901c && this.f352902d == aVar.f352902d && this.f352903e == aVar.f352903e && this.f352904f == aVar.f352904f && this.f352905g == aVar.f352905g;
    }

    /* renamed from: hashCode */
    public int m131446x8cdac1b() {
        return (((((((((((this.f352899a.hashCode() * 31) + this.f352900b.hashCode()) * 31) + this.f352901c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f352902d)) * 31) + java.lang.Boolean.hashCode(this.f352903e)) * 31) + java.lang.Boolean.hashCode(this.f352904f)) * 31) + java.lang.Integer.hashCode(this.f352905g);
    }

    /* renamed from: toString */
    public java.lang.String m131447x9616526c() {
        return "DelimitedSyntaxRule(start=" + this.f352899a + ", end=" + this.f352900b + ", tokenType=" + this.f352901c + ", multiline=" + this.f352902d + ", supportsEscape=" + this.f352903e + ", nestable=" + this.f352904f + ", priority=" + this.f352905g + ')';
    }
}
