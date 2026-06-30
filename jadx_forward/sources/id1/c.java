package id1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f371990a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class[] f371991b;

    public c(java.lang.String name, java.lang.Class[] parameterTypes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameterTypes, "parameterTypes");
        this.f371990a = name;
        this.f371991b = parameterTypes;
    }

    /* renamed from: equals */
    public boolean m135105xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(id1.c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.model.NFCTech.MethodSignature");
        id1.c cVar = (id1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f371990a, cVar.f371990a) && java.util.Arrays.equals(this.f371991b, cVar.f371991b);
    }

    /* renamed from: hashCode */
    public int m135106x8cdac1b() {
        return (this.f371990a.hashCode() * 31) + java.util.Arrays.hashCode(this.f371991b);
    }

    /* renamed from: toString */
    public java.lang.String m135107x9616526c() {
        return "MethodSignature(name=" + this.f371990a + ", parameterTypes=" + java.util.Arrays.toString(this.f371991b) + ')';
    }
}
