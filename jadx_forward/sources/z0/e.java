package z0;

/* loaded from: classes14.dex */
public final class e implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    public final float f550437a;

    public e(float f17) {
        this.f550437a = f17;
    }

    public int a(int i17, int i18, p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        float f17 = (i18 - i17) / 2.0f;
        p2.s sVar = p2.s.Ltr;
        float f18 = this.f550437a;
        if (layoutDirection != sVar) {
            f18 *= -1;
        }
        return a06.d.b(f17 * (1 + f18));
    }

    /* renamed from: equals */
    public boolean m178204xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0.e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f550437a), java.lang.Float.valueOf(((z0.e) obj).f550437a));
    }

    /* renamed from: hashCode */
    public int m178205x8cdac1b() {
        return java.lang.Float.hashCode(this.f550437a);
    }

    /* renamed from: toString */
    public java.lang.String m178206x9616526c() {
        return "Horizontal(bias=" + this.f550437a + ')';
    }
}
