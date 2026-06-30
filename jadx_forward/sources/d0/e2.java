package d0;

/* loaded from: classes14.dex */
public final class e2 implements d0.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f306641a;

    /* renamed from: b, reason: collision with root package name */
    public final float f306642b;

    /* renamed from: c, reason: collision with root package name */
    public final float f306643c;

    /* renamed from: d, reason: collision with root package name */
    public final float f306644d;

    public e2(float f17, float f18, float f19, float f27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f306641a = f17;
        this.f306642b = f18;
        this.f306643c = f19;
        this.f306644d = f27;
    }

    public float a(p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        return layoutDirection == p2.s.Ltr ? this.f306641a : this.f306643c;
    }

    public float b(p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        return layoutDirection == p2.s.Ltr ? this.f306643c : this.f306641a;
    }

    /* renamed from: equals */
    public boolean m123200xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof d0.e2)) {
            return false;
        }
        d0.e2 e2Var = (d0.e2) obj;
        return p2.h.a(this.f306641a, e2Var.f306641a) && p2.h.a(this.f306642b, e2Var.f306642b) && p2.h.a(this.f306643c, e2Var.f306643c) && p2.h.a(this.f306644d, e2Var.f306644d);
    }

    /* renamed from: hashCode */
    public int m123201x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f306641a) * 31) + java.lang.Float.hashCode(this.f306642b)) * 31) + java.lang.Float.hashCode(this.f306643c)) * 31) + java.lang.Float.hashCode(this.f306644d);
    }

    /* renamed from: toString */
    public java.lang.String m123202x9616526c() {
        return "PaddingValues(start=" + ((java.lang.Object) p2.h.b(this.f306641a)) + ", top=" + ((java.lang.Object) p2.h.b(this.f306642b)) + ", end=" + ((java.lang.Object) p2.h.b(this.f306643c)) + ", bottom=" + ((java.lang.Object) p2.h.b(this.f306644d)) + ')';
    }
}
