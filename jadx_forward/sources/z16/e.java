package z16;

/* loaded from: classes16.dex */
public class e implements z16.g, z16.h {

    /* renamed from: a, reason: collision with root package name */
    public final o06.g f550952a;

    public e(o06.g classDescriptor, z16.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classDescriptor, "classDescriptor");
        this.f550952a = classDescriptor;
    }

    /* renamed from: equals */
    public boolean m178316xb2c87fbf(java.lang.Object obj) {
        z16.e eVar = obj instanceof z16.e ? (z16.e) obj : null;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550952a, eVar != null ? eVar.f550952a : null);
    }

    @Override // z16.g
    /* renamed from: getType */
    public f26.o0 mo150381xfb85f7b0() {
        f26.z0 k17 = this.f550952a.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getDefaultType(...)");
        return k17;
    }

    /* renamed from: hashCode */
    public int m178317x8cdac1b() {
        return this.f550952a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m178318x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Class{");
        f26.z0 k17 = this.f550952a.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getDefaultType(...)");
        sb6.append(k17);
        sb6.append('}');
        return sb6.toString();
    }
}
