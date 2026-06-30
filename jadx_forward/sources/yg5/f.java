package yg5;

/* loaded from: classes10.dex */
public abstract class f extends xm3.a {
    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return mo177164x3662b71a() - other.mo177164x3662b71a();
    }

    /* renamed from: getPriority */
    public abstract int mo177164x3662b71a();

    @Override // xm3.a
    /* renamed from: l */
    public boolean s0(xm3.d dVar) {
        yg5.f other = (yg5.f) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n(), other.n());
    }

    public abstract java.lang.String n();

    @Override // xm3.a, xm3.d
    public boolean s0(java.lang.Object obj) {
        yg5.f other = (yg5.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n(), other.n());
    }

    @Override // xm3.d
    public java.lang.String v() {
        return n();
    }
}
