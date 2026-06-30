package ir2;

/* loaded from: classes2.dex */
public final class u1 implements ir2.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f375760a;

    public u1(ir2.e1 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f375760a = data;
    }

    /* renamed from: equals */
    public boolean m139745xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.u1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375760a, ((ir2.u1) obj).f375760a);
    }

    /* renamed from: hashCode */
    public int m139746x8cdac1b() {
        return this.f375760a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139747x9616526c() {
        return "RefreshedState(data=" + this.f375760a + ')';
    }
}
