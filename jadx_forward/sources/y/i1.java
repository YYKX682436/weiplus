package y;

/* loaded from: classes13.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f539901a;

    /* renamed from: b, reason: collision with root package name */
    public final z.k0 f539902b;

    public i1(float f17, z.k0 animationSpec) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationSpec, "animationSpec");
        this.f539901a = f17;
        this.f539902b = animationSpec;
    }

    /* renamed from: equals */
    public boolean m176215xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.i1)) {
            return false;
        }
        y.i1 i1Var = (y.i1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f539901a), java.lang.Float.valueOf(i1Var.f539901a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f539902b, i1Var.f539902b);
    }

    /* renamed from: hashCode */
    public int m176216x8cdac1b() {
        return (java.lang.Float.hashCode(this.f539901a) * 31) + this.f539902b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176217x9616526c() {
        return "Fade(alpha=" + this.f539901a + ", animationSpec=" + this.f539902b + ')';
    }
}
