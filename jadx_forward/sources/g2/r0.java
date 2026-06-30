package g2;

/* loaded from: classes14.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f349277a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.v f349278b;

    public r0(a2.d text, g2.v offsetMapping) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(offsetMapping, "offsetMapping");
        this.f349277a = text;
        this.f349278b = offsetMapping;
    }

    /* renamed from: equals */
    public boolean m130707xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.r0)) {
            return false;
        }
        g2.r0 r0Var = (g2.r0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349277a, r0Var.f349277a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349278b, r0Var.f349278b);
    }

    /* renamed from: hashCode */
    public int m130708x8cdac1b() {
        return (this.f349277a.m340x8cdac1b() * 31) + this.f349278b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130709x9616526c() {
        return "TransformedText(text=" + ((java.lang.Object) this.f349277a) + ", offsetMapping=" + this.f349278b + ')';
    }
}
