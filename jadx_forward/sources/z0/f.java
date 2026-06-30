package z0;

/* loaded from: classes5.dex */
public final class f implements z0.c {

    /* renamed from: a, reason: collision with root package name */
    public final float f550438a;

    public f(float f17) {
        this.f550438a = f17;
    }

    public int a(int i17, int i18) {
        return a06.d.b(((i18 - i17) / 2.0f) * (1 + this.f550438a));
    }

    /* renamed from: equals */
    public boolean m178207xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0.f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f550438a), java.lang.Float.valueOf(((z0.f) obj).f550438a));
    }

    /* renamed from: hashCode */
    public int m178208x8cdac1b() {
        return java.lang.Float.hashCode(this.f550438a);
    }

    /* renamed from: toString */
    public java.lang.String m178209x9616526c() {
        return "Vertical(bias=" + this.f550438a + ')';
    }
}
