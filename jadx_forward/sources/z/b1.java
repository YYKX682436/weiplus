package z;

/* loaded from: classes13.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f550126a;

    /* renamed from: b, reason: collision with root package name */
    public z.h0 f550127b;

    public b1(java.lang.Object obj, z.h0 easing, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i17 & 2) != 0) {
            z.h0 h0Var = z.j0.f550237a;
            easing = z.i0.f550229a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(easing, "easing");
        this.f550126a = obj;
        this.f550127b = easing;
    }

    /* renamed from: equals */
    public boolean m178142xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z.b1) {
            z.b1 b1Var = (z.b1) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b1Var.f550126a, this.f550126a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b1Var.f550127b, this.f550127b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178143x8cdac1b() {
        java.lang.Object obj = this.f550126a;
        return ((obj != null ? obj.hashCode() : 0) * 31) + this.f550127b.hashCode();
    }
}
