package b16;

/* loaded from: classes16.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.v1 f98663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b16.e0 f98664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(o06.v1 v1Var, b16.e0 e0Var) {
        super(1);
        this.f98663d = v1Var;
        this.f98664e = e0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n16.g accessorName = (n16.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(accessorName, "accessorName");
        o06.x0 x0Var = this.f98663d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.v) x0Var).mo132800xfb82e301(), accessorName)) {
            return kz5.b0.c(x0Var);
        }
        b16.e0 e0Var = this.f98664e;
        return kz5.n0.t0(b16.e0.v(e0Var, accessorName), b16.e0.w(e0Var, accessorName));
    }
}
