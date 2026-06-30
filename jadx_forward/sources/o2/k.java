package o2;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f423891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f423892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f423893c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f423894d;

    /* renamed from: e, reason: collision with root package name */
    public final int f423895e;

    public k(int i17, int i18, int i19, java.lang.String str, int i27) {
        this.f423891a = i17;
        this.f423892b = i18;
        this.f423893c = i19;
        this.f423894d = str;
        this.f423895e = i27;
    }

    /* renamed from: equals */
    public boolean m150446xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2.k)) {
            return false;
        }
        o2.k kVar = (o2.k) obj;
        return this.f423891a == kVar.f423891a && this.f423892b == kVar.f423892b && this.f423893c == kVar.f423893c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423894d, kVar.f423894d) && this.f423895e == kVar.f423895e;
    }

    /* renamed from: hashCode */
    public int m150447x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f423891a) * 31) + java.lang.Integer.hashCode(this.f423892b)) * 31) + java.lang.Integer.hashCode(this.f423893c)) * 31;
        java.lang.String str = this.f423894d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f423895e);
    }

    /* renamed from: toString */
    public java.lang.String m150448x9616526c() {
        return "SourceLocation(lineNumber=" + this.f423891a + ", offset=" + this.f423892b + ", length=" + this.f423893c + ", sourceFile=" + this.f423894d + ", packageHash=" + this.f423895e + ')';
    }
}
