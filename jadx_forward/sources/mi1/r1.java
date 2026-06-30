package mi1;

/* loaded from: classes7.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f408205a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f408206b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f408207c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f408208d;

    /* renamed from: e, reason: collision with root package name */
    public final int f408209e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f408210f;

    /* renamed from: g, reason: collision with root package name */
    public final int f408211g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f408212h;

    public r1(java.lang.String wording, java.lang.String str, java.lang.String str2, java.lang.Integer num, int i17, boolean z17, int i18, yz5.a aVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i19 & 2) != 0 ? null : str;
        str2 = (i19 & 4) != 0 ? null : str2;
        num = (i19 & 8) != 0 ? null : num;
        if ((i19 & 16) != 0) {
            mi1.z0 z0Var = mi1.z0.f408272e;
            i17 = 0;
        }
        z17 = (i19 & 32) != 0 ? false : z17;
        i18 = (i19 & 64) != 0 ? -1 : i18;
        aVar = (i19 & 128) != 0 ? null : aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        this.f408205a = wording;
        this.f408206b = str;
        this.f408207c = str2;
        this.f408208d = num;
        this.f408209e = i17;
        this.f408210f = z17;
        this.f408211g = i18;
        this.f408212h = aVar;
    }

    public final boolean a() {
        java.lang.String str = this.f408206b;
        if (str != null) {
            if (str.length() > 0) {
                return true;
            }
        }
        return this.f408208d != null;
    }

    /* renamed from: equals */
    public boolean m147363xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1.r1)) {
            return false;
        }
        mi1.r1 r1Var = (mi1.r1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408205a, r1Var.f408205a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408206b, r1Var.f408206b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408207c, r1Var.f408207c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408208d, r1Var.f408208d) && this.f408209e == r1Var.f408209e && this.f408210f == r1Var.f408210f && this.f408211g == r1Var.f408211g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408212h, r1Var.f408212h);
    }

    /* renamed from: hashCode */
    public int m147364x8cdac1b() {
        int hashCode = this.f408205a.hashCode() * 31;
        java.lang.String str = this.f408206b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f408207c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f408208d;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Integer.hashCode(this.f408209e)) * 31) + java.lang.Boolean.hashCode(this.f408210f)) * 31) + java.lang.Integer.hashCode(this.f408211g)) * 31;
        yz5.a aVar = this.f408212h;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m147365x9616526c() {
        return "CapsuleTipsConfig(wording=" + this.f408205a + ", iconUrl=" + this.f408206b + ", darkModeIconUrl=" + this.f408207c + ", iconResourceId=" + this.f408208d + ", type=" + this.f408209e + ", enableClickable=" + this.f408210f + ", ellipsizedTailIndex=" + this.f408211g + ", onClick=" + this.f408212h + ')';
    }
}
