package gf5;

/* loaded from: classes11.dex */
public final class r implements gf5.x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f352970a;

    /* renamed from: b, reason: collision with root package name */
    public final gf5.z f352971b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f352972c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f352973d;

    /* renamed from: e, reason: collision with root package name */
    public final gf5.q f352974e;

    /* renamed from: f, reason: collision with root package name */
    public final int f352975f;

    public r(java.util.List prefixes, gf5.z tokenType, boolean z17, java.lang.Integer num, gf5.q behavior, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 4) != 0 ? true : z17;
        num = (i18 & 8) != 0 ? null : num;
        behavior = (i18 & 16) != 0 ? gf5.q.f352967d : behavior;
        i17 = (i18 & 32) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefixes, "prefixes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenType, "tokenType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(behavior, "behavior");
        this.f352970a = prefixes;
        this.f352971b = tokenType;
        this.f352972c = z17;
        this.f352973d = num;
        this.f352974e = behavior;
        this.f352975f = i17;
    }

    /* renamed from: equals */
    public boolean m131487xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.r)) {
            return false;
        }
        gf5.r rVar = (gf5.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352970a, rVar.f352970a) && this.f352971b == rVar.f352971b && this.f352972c == rVar.f352972c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352973d, rVar.f352973d) && this.f352974e == rVar.f352974e && this.f352975f == rVar.f352975f;
    }

    /* renamed from: hashCode */
    public int m131488x8cdac1b() {
        int hashCode = ((((this.f352970a.hashCode() * 31) + this.f352971b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f352972c)) * 31;
        java.lang.Integer num = this.f352973d;
        return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f352974e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f352975f);
    }

    /* renamed from: toString */
    public java.lang.String m131489x9616526c() {
        return "LineMatchSyntaxRule(prefixes=" + this.f352970a + ", tokenType=" + this.f352971b + ", trimLeadingWhitespace=" + this.f352972c + ", lineIndex=" + this.f352973d + ", behavior=" + this.f352974e + ", priority=" + this.f352975f + ')';
    }
}
