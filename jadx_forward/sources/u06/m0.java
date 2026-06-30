package u06;

/* loaded from: classes16.dex */
public final class m0 extends u06.b0 implements e16.x {

    /* renamed from: a, reason: collision with root package name */
    public final u06.k0 f505048a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.annotation.Annotation[] f505049b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f505050c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f505051d;

    public m0(u06.k0 type, java.lang.annotation.Annotation[] reflectAnnotations, java.lang.String str, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reflectAnnotations, "reflectAnnotations");
        this.f505048a = type;
        this.f505049b = reflectAnnotations;
        this.f505050c = str;
        this.f505051d = z17;
    }

    @Override // e16.d
    public e16.a a(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        return u06.m.a(this.f505049b, fqName);
    }

    @Override // e16.d
    public boolean b() {
        return false;
    }

    @Override // e16.d
    /* renamed from: getAnnotations */
    public java.util.Collection mo126781xa083c1ee() {
        return u06.m.b(this.f505049b);
    }

    /* renamed from: toString */
    public java.lang.String m167322x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(u06.m0.class.getName());
        sb6.append(": ");
        sb6.append(this.f505051d ? "vararg " : "");
        java.lang.String str = this.f505050c;
        sb6.append(str != null ? n16.g.j(str) : null);
        sb6.append(": ");
        sb6.append(this.f505048a);
        return sb6.toString();
    }
}
