package ej1;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f334808a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f334809b;

    public a(java.lang.Class clazz, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        this.f334808a = clazz;
        this.f334809b = aVar;
    }

    /* renamed from: equals */
    public boolean m127759xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej1.a)) {
            return false;
        }
        ej1.a aVar = (ej1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334808a, aVar.f334808a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334809b, aVar.f334809b);
    }

    /* renamed from: hashCode */
    public int m127760x8cdac1b() {
        int hashCode = this.f334808a.hashCode() * 31;
        yz5.a aVar = this.f334809b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m127761x9616526c() {
        return "WAJsApiClassDescriptor(clazz=" + this.f334808a + ", creator=" + this.f334809b + ')';
    }
}
