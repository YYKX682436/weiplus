package kh;

/* loaded from: classes11.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f389332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f389333b;

    public f3(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f389332a = name;
        this.f389333b = i17;
    }

    public final int a() {
        return this.f389333b;
    }

    /* renamed from: equals */
    public boolean m143411xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh.f3)) {
            return false;
        }
        kh.f3 f3Var = (kh.f3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389332a, f3Var.f389332a) && this.f389333b == f3Var.f389333b;
    }

    /* renamed from: hashCode */
    public int m143412x8cdac1b() {
        return (this.f389332a.hashCode() * 31) + java.lang.Integer.hashCode(this.f389333b);
    }

    /* renamed from: toString */
    public java.lang.String m143413x9616526c() {
        return this.f389333b + '-' + this.f389332a;
    }
}
