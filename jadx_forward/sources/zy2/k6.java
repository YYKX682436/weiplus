package zy2;

/* loaded from: classes2.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f558968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f558969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f558970c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Size f558971d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f558972e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f558973f;

    public k6(java.lang.String dynamicImage, int i17, int i18, android.util.Size size, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicImage, "dynamicImage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        this.f558968a = dynamicImage;
        this.f558969b = i17;
        this.f558970c = i18;
        this.f558971d = size;
        this.f558972e = z17;
        this.f558973f = z18;
    }

    /* renamed from: equals */
    public boolean m179978xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.k6)) {
            return false;
        }
        zy2.k6 k6Var = (zy2.k6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558968a, k6Var.f558968a) && this.f558969b == k6Var.f558969b && this.f558970c == k6Var.f558970c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558971d, k6Var.f558971d) && this.f558972e == k6Var.f558972e && this.f558973f == k6Var.f558973f;
    }

    /* renamed from: hashCode */
    public int m179979x8cdac1b() {
        return (((((((((this.f558968a.hashCode() * 31) + java.lang.Integer.hashCode(this.f558969b)) * 31) + java.lang.Integer.hashCode(this.f558970c)) * 31) + this.f558971d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f558972e)) * 31) + java.lang.Boolean.hashCode(this.f558973f);
    }

    /* renamed from: toString */
    public java.lang.String m179980x9616526c() {
        return "DynamicImage(dynamicImage=" + this.f558968a + ", lightColor=" + this.f558969b + ", darkColor=" + this.f558970c + ", size=" + this.f558971d + ", hasLightColor=" + this.f558972e + ", hasDarkColor=" + this.f558973f + ')';
    }
}
