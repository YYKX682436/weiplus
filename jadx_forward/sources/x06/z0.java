package x06;

/* loaded from: classes15.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.z0 f532874d = new x06.z0();

    public z0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o06.d b17;
        java.lang.String b18;
        o06.d it = (o06.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = false;
        if (l06.o.A(it)) {
            x06.j jVar = x06.j.f532797m;
            x06.d1 d1Var = null;
            if (x06.g1.f532780f.contains(it.mo132800xfb82e301()) && (b17 = v16.f.b(it, false, x06.i.f532792d, 1, null)) != null && (b18 = g16.w0.b(b17)) != null) {
                d1Var = ((java.util.ArrayList) x06.g1.f532777c).contains(b18) ? x06.d1.f532762d : ((x06.f1) kz5.c1.h(x06.g1.f532779e, b18)) == x06.f1.f532768e ? x06.d1.f532764f : x06.d1.f532763e;
            }
            if (d1Var != null) {
                z17 = true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
