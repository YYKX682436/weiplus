package ir2;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f375781a;

    public z(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f375781a = id6;
    }

    /* renamed from: equals */
    public boolean m139751xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.z) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f375781a, ((ir2.z) obj).f375781a);
    }

    /* renamed from: hashCode */
    public int m139752x8cdac1b() {
        return this.f375781a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139753x9616526c() {
        return "Key(id=" + this.f375781a + ')';
    }
}
