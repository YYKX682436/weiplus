package y;

/* loaded from: classes13.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f539980a;

    /* renamed from: b, reason: collision with root package name */
    public final z.k0 f539981b;

    public t1(yz5.l slideOffset, z.k0 animationSpec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slideOffset, "slideOffset");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        this.f539980a = slideOffset;
        this.f539981b = animationSpec;
    }

    /* renamed from: equals */
    public boolean m176231xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.t1)) {
            return false;
        }
        y.t1 t1Var = (y.t1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539980a, t1Var.f539980a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539981b, t1Var.f539981b);
    }

    /* renamed from: hashCode */
    public int m176232x8cdac1b() {
        return (this.f539980a.hashCode() * 31) + this.f539981b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176233x9616526c() {
        return "Slide(slideOffset=" + this.f539980a + ", animationSpec=" + this.f539981b + ')';
    }
}
