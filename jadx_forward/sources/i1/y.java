package i1;

/* loaded from: classes14.dex */
public final class y extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368607c;

    public y(float f17) {
        super(false, false, 3, null);
        this.f368607c = f17;
    }

    /* renamed from: equals */
    public boolean m134527xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1.y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368607c), java.lang.Float.valueOf(((i1.y) obj).f368607c));
    }

    /* renamed from: hashCode */
    public int m134528x8cdac1b() {
        return java.lang.Float.hashCode(this.f368607c);
    }

    /* renamed from: toString */
    public java.lang.String m134529x9616526c() {
        return "RelativeVerticalTo(dy=" + this.f368607c + ')';
    }
}
