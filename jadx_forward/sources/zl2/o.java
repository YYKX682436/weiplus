package zl2;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f555437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f555438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f555439c;

    public o(int i17, int i18, int i19) {
        this.f555437a = i17;
        this.f555438b = i18;
        this.f555439c = i19;
    }

    /* renamed from: equals */
    public boolean m179118xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.o)) {
            return false;
        }
        zl2.o oVar = (zl2.o) obj;
        return this.f555437a == oVar.f555437a && this.f555438b == oVar.f555438b && this.f555439c == oVar.f555439c;
    }

    /* renamed from: hashCode */
    public int m179119x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f555437a) * 31) + java.lang.Integer.hashCode(this.f555438b)) * 31) + java.lang.Integer.hashCode(this.f555439c);
    }

    /* renamed from: toString */
    public java.lang.String m179120x9616526c() {
        return "LpHeight(source=" + this.f555437a + ", sourceH=" + this.f555438b + ", destH=" + this.f555439c + ')';
    }
}
