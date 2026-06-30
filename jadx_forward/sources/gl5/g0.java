package gl5;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f354532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f354533b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f354534c;

    public g0(int i17, int i18, int[] loc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loc, "loc");
        this.f354532a = i17;
        this.f354533b = i18;
        this.f354534c = loc;
    }

    /* renamed from: equals */
    public boolean m131742xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl5.g0)) {
            return false;
        }
        gl5.g0 g0Var = (gl5.g0) obj;
        return this.f354532a == g0Var.f354532a && this.f354533b == g0Var.f354533b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354534c, g0Var.f354534c);
    }

    /* renamed from: hashCode */
    public int m131743x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f354532a) * 31) + java.lang.Integer.hashCode(this.f354533b)) * 31) + java.util.Arrays.hashCode(this.f354534c);
    }

    /* renamed from: toString */
    public java.lang.String m131744x9616526c() {
        return "AnimViewParam(width=" + this.f354532a + ", height=" + this.f354533b + ", loc=" + java.util.Arrays.toString(this.f354534c) + ')';
    }
}
