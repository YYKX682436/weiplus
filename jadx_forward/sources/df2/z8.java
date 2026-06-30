package df2;

/* loaded from: classes3.dex */
public final class z8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a9 f313467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(df2.a9 a9Var) {
        super(2);
        this.f313467d = a9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        r45.e84 e84Var = (r45.e84) obj;
        r45.e84 e84Var2 = (r45.e84) obj2;
        this.f313467d.getClass();
        r45.nz3 nz3Var = null;
        r45.nz3 nz3Var2 = (e84Var == null || (m75941xfb8219142 = e84Var.m75941xfb821914(2)) == null) ? null : (r45.nz3) kz5.n0.Z(m75941xfb8219142);
        if (e84Var2 != null && (m75941xfb821914 = e84Var2.m75941xfb821914(2)) != null) {
            nz3Var = (r45.nz3) kz5.n0.Z(m75941xfb821914);
        }
        boolean z17 = true;
        if (nz3Var2 == null || nz3Var == null ? nz3Var2 != null || nz3Var != null : !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nz3Var2.m75945x2fec8307(0), nz3Var.m75945x2fec8307(0)) || nz3Var2.m75939xb282bd08(1) != nz3Var.m75939xb282bd08(1) || nz3Var2.m75939xb282bd08(2) != nz3Var.m75939xb282bd08(2)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
