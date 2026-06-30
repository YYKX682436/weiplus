package i06;

/* loaded from: classes16.dex */
public class j extends r06.x {

    /* renamed from: a, reason: collision with root package name */
    public final i06.u1 f368197a;

    public j(i06.u1 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f368197a = container;
    }

    @Override // o06.o
    public java.lang.Object l(o06.n0 descriptor, java.lang.Object obj) {
        jz5.f0 data = (jz5.f0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return new i06.y1(this.f368197a, descriptor);
    }

    @Override // o06.o
    public java.lang.Object m(o06.o1 descriptor, java.lang.Object obj) {
        jz5.f0 data = (jz5.f0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i17 = (descriptor.Z() != null ? 1 : 0) + (descriptor.c0() != null ? 1 : 0);
        boolean v17 = descriptor.v();
        i06.u1 u1Var = this.f368197a;
        if (v17) {
            if (i17 == 0) {
                return new i06.b2(u1Var, descriptor);
            }
            if (i17 == 1) {
                return new i06.e2(u1Var, descriptor);
            }
            if (i17 == 2) {
                return new i06.h2(u1Var, descriptor);
            }
        } else {
            if (i17 == 0) {
                return new i06.y2(u1Var, descriptor);
            }
            if (i17 == 1) {
                return new i06.c3(u1Var, descriptor);
            }
            if (i17 == 2) {
                return new i06.g3(u1Var, descriptor);
            }
        }
        throw new i06.a4("Unsupported property: " + descriptor);
    }
}
