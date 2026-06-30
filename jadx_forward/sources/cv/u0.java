package cv;

/* loaded from: classes7.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final m3.a f304046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f304047b;

    public u0(m3.a aVar, int i17) {
        this.f304046a = aVar;
        this.f304047b = i17;
    }

    /* renamed from: equals */
    public boolean m122767xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv.u0)) {
            return false;
        }
        cv.u0 u0Var = (cv.u0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f304046a, u0Var.f304046a) && this.f304047b == u0Var.f304047b;
    }

    /* renamed from: hashCode */
    public int m122768x8cdac1b() {
        m3.a aVar = this.f304046a;
        return ((aVar == null ? 0 : aVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f304047b);
    }

    /* renamed from: toString */
    public java.lang.String m122769x9616526c() {
        return "AudioRouteConsumer(consumer=" + this.f304046a + ", usage=" + this.f304047b + ')';
    }
}
