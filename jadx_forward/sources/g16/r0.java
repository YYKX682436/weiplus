package g16;

/* loaded from: classes15.dex */
public final class r0 implements o06.x1 {

    /* renamed from: b, reason: collision with root package name */
    public final b16.i0 f349187b;

    public r0(b16.i0 packageFragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFragment, "packageFragment");
        this.f349187b = packageFragment;
    }

    @Override // o06.x1
    public o06.z1 b() {
        return o06.z1.f423546a;
    }

    /* renamed from: toString */
    public java.lang.String m130656x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        b16.i0 i0Var = this.f349187b;
        sb6.append(i0Var);
        sb6.append(": ");
        sb6.append(((java.util.Map) e26.b0.a(i0Var.f98721o, i0Var, b16.i0.f98718s[0])).keySet());
        return sb6.toString();
    }
}
