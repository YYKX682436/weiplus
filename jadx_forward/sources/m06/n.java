package m06;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final m06.m f404142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f404143b;

    public n(m06.m kind, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        this.f404142a = kind;
        this.f404143b = i17;
    }

    /* renamed from: equals */
    public boolean m146608xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m06.n)) {
            return false;
        }
        m06.n nVar = (m06.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404142a, nVar.f404142a) && this.f404143b == nVar.f404143b;
    }

    /* renamed from: hashCode */
    public int m146609x8cdac1b() {
        return (this.f404142a.hashCode() * 31) + java.lang.Integer.hashCode(this.f404143b);
    }

    /* renamed from: toString */
    public java.lang.String m146610x9616526c() {
        return "KindWithArity(kind=" + this.f404142a + ", arity=" + this.f404143b + ')';
    }
}
