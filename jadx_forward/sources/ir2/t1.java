package ir2;

/* loaded from: classes2.dex */
public final class t1 implements ir2.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f375756a;

    public t1(ir2.e1 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f375756a = data;
    }

    /* renamed from: equals */
    public boolean m139742xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.t1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375756a, ((ir2.t1) obj).f375756a);
    }

    /* renamed from: hashCode */
    public int m139743x8cdac1b() {
        return this.f375756a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139744x9616526c() {
        return "LoadedMoreState(data=" + this.f375756a + ')';
    }
}
