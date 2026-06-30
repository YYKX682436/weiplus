package x06;

/* loaded from: classes15.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f532739a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.g f532740b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f532741c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f532742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f532743e;

    public b1(java.lang.String classInternalName, n16.g name, java.lang.String parameters, java.lang.String returnType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classInternalName, "classInternalName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameters, "parameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(returnType, "returnType");
        this.f532739a = classInternalName;
        this.f532740b = name;
        this.f532741c = parameters;
        this.f532742d = returnType;
        java.lang.String jvmDescriptor = name + '(' + parameters + ')' + returnType;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jvmDescriptor, "jvmDescriptor");
        this.f532743e = classInternalName + '.' + jvmDescriptor;
    }

    /* renamed from: equals */
    public boolean m174839xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.b1)) {
            return false;
        }
        x06.b1 b1Var = (x06.b1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532739a, b1Var.f532739a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532740b, b1Var.f532740b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532741c, b1Var.f532741c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f532742d, b1Var.f532742d);
    }

    /* renamed from: hashCode */
    public int m174840x8cdac1b() {
        return (((((this.f532739a.hashCode() * 31) + this.f532740b.m148892x8cdac1b()) * 31) + this.f532741c.hashCode()) * 31) + this.f532742d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174841x9616526c() {
        return "NameAndSignature(classInternalName=" + this.f532739a + ", name=" + this.f532740b + ", parameters=" + this.f532741c + ", returnType=" + this.f532742d + ')';
    }
}
