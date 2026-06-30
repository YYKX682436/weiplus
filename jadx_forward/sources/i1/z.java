package i1;

/* loaded from: classes14.dex */
public final class z extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368613c;

    public z(float f17) {
        super(false, false, 3, null);
        this.f368613c = f17;
    }

    /* renamed from: equals */
    public boolean m134531xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1.z) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368613c), java.lang.Float.valueOf(((i1.z) obj).f368613c));
    }

    /* renamed from: hashCode */
    public int m134532x8cdac1b() {
        return java.lang.Float.hashCode(this.f368613c);
    }

    /* renamed from: toString */
    public java.lang.String m134533x9616526c() {
        return "VerticalTo(y=" + this.f368613c + ')';
    }
}
