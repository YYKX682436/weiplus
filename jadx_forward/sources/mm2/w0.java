package mm2;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f411042a;

    /* renamed from: b, reason: collision with root package name */
    public final int f411043b;

    public w0(java.lang.String str, int i17) {
        this.f411042a = str;
        this.f411043b = i17;
    }

    public final boolean a(mm2.w0 other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        java.lang.String str = other.f411042a;
        return (str == null || str.length() == 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f411042a) || this.f411043b < other.f411043b;
    }

    /* renamed from: equals */
    public boolean m148027xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.w0)) {
            return false;
        }
        mm2.w0 w0Var = (mm2.w0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411042a, w0Var.f411042a) && this.f411043b == w0Var.f411043b;
    }

    /* renamed from: hashCode */
    public int m148028x8cdac1b() {
        java.lang.String str = this.f411042a;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f411043b);
    }

    /* renamed from: toString */
    public java.lang.String m148029x9616526c() {
        return "CheerInfoVersion[id = " + this.f411042a + ", version = " + this.f411043b + ']';
    }
}
