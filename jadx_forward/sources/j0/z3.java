package j0;

/* loaded from: classes14.dex */
public final class z3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.z3 f378230d = new j0.z3();

    public z3() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Integer num;
        k0.p0 deleteIfSelectedOr = (k0.p0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
        a2.k1 k1Var = deleteIfSelectedOr.f384461c;
        if (k1Var != null) {
            int c17 = a2.m1.c(deleteIfSelectedOr.f384464f);
            ((g2.t) deleteIfSelectedOr.f384462d).getClass();
            num = java.lang.Integer.valueOf(deleteIfSelectedOr.d(k1Var, c17));
        } else {
            num = null;
        }
        if (num == null) {
            return null;
        }
        return new g2.b(a2.m1.c(deleteIfSelectedOr.f384464f) - num.intValue(), 0);
    }
}
