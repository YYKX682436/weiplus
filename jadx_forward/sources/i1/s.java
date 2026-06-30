package i1;

/* loaded from: classes14.dex */
public final class s extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368554c;

    public s(float f17) {
        super(false, false, 3, null);
        this.f368554c = f17;
    }

    /* renamed from: equals */
    public boolean m134502xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1.s) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368554c), java.lang.Float.valueOf(((i1.s) obj).f368554c));
    }

    /* renamed from: hashCode */
    public int m134503x8cdac1b() {
        return java.lang.Float.hashCode(this.f368554c);
    }

    /* renamed from: toString */
    public java.lang.String m134504x9616526c() {
        return "RelativeHorizontalTo(dx=" + this.f368554c + ')';
    }
}
