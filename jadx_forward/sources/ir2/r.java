package ir2;

/* loaded from: classes2.dex */
public final class r implements ir2.x {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f375745a;

    public r(ir2.e1 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f375745a = data;
    }

    /* renamed from: equals */
    public boolean m139733xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.r) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375745a, ((ir2.r) obj).f375745a);
    }

    /* renamed from: hashCode */
    public int m139734x8cdac1b() {
        return this.f375745a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139735x9616526c() {
        return "FirstScreenEvent(data=" + this.f375745a + ')';
    }
}
