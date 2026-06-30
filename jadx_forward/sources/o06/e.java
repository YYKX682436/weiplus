package o06;

/* loaded from: classes16.dex */
public final class e implements o06.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final o06.e2 f423471d;

    /* renamed from: e, reason: collision with root package name */
    public final o06.m f423472e;

    /* renamed from: f, reason: collision with root package name */
    public final int f423473f;

    public e(o06.e2 originalDescriptor, o06.m declarationDescriptor, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalDescriptor, "originalDescriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(declarationDescriptor, "declarationDescriptor");
        this.f423471d = originalDescriptor;
        this.f423472e = declarationDescriptor;
        this.f423473f = i17;
    }

    @Override // o06.e2
    public e26.c0 a0() {
        return this.f423471d.a0();
    }

    @Override // o06.m
    public o06.m e() {
        return this.f423472e;
    }

    @Override // o06.e2, o06.j
    public f26.c2 g() {
        return this.f423471d.g();
    }

    @Override // p06.a
    /* renamed from: getAnnotations */
    public p06.k mo9601xa083c1ee() {
        return this.f423471d.mo9601xa083c1ee();
    }

    @Override // o06.e2
    /* renamed from: getIndex */
    public int mo150355x7498cf1c() {
        return this.f423473f + this.f423471d.mo150355x7498cf1c();
    }

    @Override // o06.x0
    /* renamed from: getName */
    public n16.g mo132800xfb82e301() {
        return this.f423471d.mo132800xfb82e301();
    }

    @Override // o06.p
    /* renamed from: getSource */
    public o06.x1 mo9602x2fa78b11() {
        return this.f423471d.mo9602x2fa78b11();
    }

    @Override // o06.e2
    /* renamed from: getUpperBounds */
    public java.util.List mo150356xa5be00c1() {
        return this.f423471d.mo150356xa5be00c1();
    }

    @Override // o06.j
    public f26.z0 k() {
        return this.f423471d.k();
    }

    @Override // o06.e2
    public boolean o() {
        return this.f423471d.o();
    }

    @Override // o06.e2
    public f26.d3 q() {
        return this.f423471d.q();
    }

    /* renamed from: toString */
    public java.lang.String m150357x9616526c() {
        return this.f423471d + "[inner-copy]";
    }

    @Override // o06.m
    public java.lang.Object w(o06.o oVar, java.lang.Object obj) {
        return this.f423471d.w(oVar, obj);
    }

    @Override // o06.e2
    public boolean y() {
        return true;
    }

    @Override // o06.m
    public o06.e2 a() {
        o06.e2 a17 = this.f423471d.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getOriginal(...)");
        return a17;
    }
}
