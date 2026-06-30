package of3;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final of3.a f426634a;

    /* renamed from: b, reason: collision with root package name */
    public final of3.a f426635b;

    public f(of3.a factory, of3.a manager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(factory, "factory");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        this.f426634a = factory;
        this.f426635b = manager;
    }

    /* renamed from: equals */
    public boolean m151240xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of3.f)) {
            return false;
        }
        of3.f fVar = (of3.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426634a, fVar.f426634a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f426635b, fVar.f426635b);
    }

    /* renamed from: hashCode */
    public int m151241x8cdac1b() {
        return (this.f426634a.hashCode() * 31) + this.f426635b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151242x9616526c() {
        return "VideoKitBuilder(factory=" + this.f426634a + ", manager=" + this.f426635b + ')';
    }
}
