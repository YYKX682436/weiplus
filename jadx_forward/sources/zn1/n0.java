package zn1;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f555989a;

    /* renamed from: b, reason: collision with root package name */
    public final int f555990b;

    public n0(int i17, int i18) {
        this.f555989a = i17;
        this.f555990b = i18;
    }

    public final int a(zn1.n0 other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        int i17 = this.f555989a;
        int i18 = other.f555989a;
        return i17 != i18 ? i17 - i18 : this.f555990b - other.f555990b;
    }

    /* renamed from: equals */
    public boolean m179210xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof zn1.n0)) {
            return super.equals(obj);
        }
        zn1.n0 n0Var = (zn1.n0) obj;
        return this.f555989a == n0Var.f555989a && this.f555990b == n0Var.f555990b;
    }

    /* renamed from: hashCode */
    public int m179211x8cdac1b() {
        return (this.f555989a * 31) + this.f555990b;
    }

    /* renamed from: toString */
    public java.lang.String m179212x9616526c() {
        return "Version(major=" + this.f555989a + ", minor=" + this.f555990b + ')';
    }
}
