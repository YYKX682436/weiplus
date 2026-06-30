package mm2;

/* loaded from: classes3.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public mm2.b2 f411132a;

    /* renamed from: b, reason: collision with root package name */
    public mm2.d2 f411133b;

    public z1(mm2.b2 range, mm2.d2 trans) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(range, "range");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trans, "trans");
        this.f411132a = range;
        this.f411133b = trans;
    }

    /* renamed from: equals */
    public boolean m148045xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.z1)) {
            return false;
        }
        mm2.z1 z1Var = (mm2.z1) obj;
        return this.f411132a == z1Var.f411132a && this.f411133b == z1Var.f411133b;
    }

    /* renamed from: hashCode */
    public int m148046x8cdac1b() {
        return (this.f411132a.hashCode() * 31) + this.f411133b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148047x9616526c() {
        return "DanmakuConfig(range=" + this.f411132a + ", trans=" + this.f411133b + ')';
    }
}
