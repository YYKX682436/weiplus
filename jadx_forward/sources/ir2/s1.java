package ir2;

/* loaded from: classes2.dex */
public final class s1 implements ir2.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f375750a;

    public s1(ir2.e1 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f375750a = data;
    }

    /* renamed from: equals */
    public boolean m139736xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.s1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375750a, ((ir2.s1) obj).f375750a);
    }

    /* renamed from: hashCode */
    public int m139737x8cdac1b() {
        return this.f375750a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139738x9616526c() {
        return "FirstScreenState(data=" + this.f375750a + ')';
    }
}
