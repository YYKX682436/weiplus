package o2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f423873a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f423874b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f423875c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f423876d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f423877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f423878f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f423879g;

    public f(java.lang.String name, java.lang.Object obj, boolean z17, boolean z18, boolean z19, java.lang.String str, boolean z27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f423873a = name;
        this.f423874b = obj;
        this.f423875c = z17;
        this.f423876d = z18;
        this.f423877e = z19;
        this.f423878f = str;
        this.f423879g = z27;
    }

    /* renamed from: equals */
    public boolean m150442xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2.f)) {
            return false;
        }
        o2.f fVar = (o2.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423873a, fVar.f423873a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423874b, fVar.f423874b) && this.f423875c == fVar.f423875c && this.f423876d == fVar.f423876d && this.f423877e == fVar.f423877e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423878f, fVar.f423878f) && this.f423879g == fVar.f423879g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m150443x8cdac1b() {
        int hashCode = this.f423873a.hashCode() * 31;
        java.lang.Object obj = this.f423874b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z17 = this.f423875c;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode2 + i17) * 31;
        boolean z18 = this.f423876d;
        int i19 = z18;
        if (z18 != 0) {
            i19 = 1;
        }
        int i27 = (i18 + i19) * 31;
        boolean z19 = this.f423877e;
        int i28 = z19;
        if (z19 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        java.lang.String str = this.f423878f;
        int hashCode3 = (i29 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z27 = this.f423879g;
        return hashCode3 + (z27 ? 1 : z27 ? 1 : 0);
    }

    /* renamed from: toString */
    public java.lang.String m150444x9616526c() {
        return "ParameterInformation(name=" + this.f423873a + ", value=" + this.f423874b + ", fromDefault=" + this.f423875c + ", static=" + this.f423876d + ", compared=" + this.f423877e + ", inlineClass=" + this.f423878f + ", stable=" + this.f423879g + ')';
    }
}
