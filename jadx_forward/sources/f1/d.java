package f1;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340004a;

    /* renamed from: b, reason: collision with root package name */
    public final long f340005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340006c;

    public d(java.lang.String str, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f340004a = str;
        this.f340005b = j17;
        this.f340006c = i17;
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i17 < -1 || i17 > 63) {
            throw new java.lang.IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] a(float[] fArr);

    public abstract float b(int i17);

    public abstract float c(int i17);

    public boolean d() {
        return false;
    }

    public abstract float[] e(float[] fArr);

    /* renamed from: equals */
    public boolean mo128675xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(getClass()), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(obj.getClass()))) {
            return false;
        }
        f1.d dVar = (f1.d) obj;
        if (this.f340006c == dVar.f340006c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340004a, dVar.f340004a)) {
            return f1.c.a(this.f340005b, dVar.f340005b);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int mo128676x8cdac1b() {
        int hashCode = this.f340004a.hashCode() * 31;
        int i17 = f1.c.f340003e;
        return ((hashCode + java.lang.Long.hashCode(this.f340005b)) * 31) + this.f340006c;
    }

    /* renamed from: toString */
    public java.lang.String m128677x9616526c() {
        return this.f340004a + " (id=" + this.f340006c + ", model=" + ((java.lang.Object) f1.c.b(this.f340005b)) + ')';
    }
}
