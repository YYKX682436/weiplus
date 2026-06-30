package b16;

/* loaded from: classes16.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.v1 f17130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b16.e0 f17131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(o06.v1 v1Var, b16.e0 e0Var) {
        super(1);
        this.f17130d = v1Var;
        this.f17131e = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g accessorName = (n16.g) obj;
        kotlin.jvm.internal.o.g(accessorName, "accessorName");
        o06.x0 x0Var = this.f17130d;
        if (kotlin.jvm.internal.o.b(((r06.v) x0Var).getName(), accessorName)) {
            return kz5.b0.c(x0Var);
        }
        b16.e0 e0Var = this.f17131e;
        return kz5.n0.t0(b16.e0.v(e0Var, accessorName), b16.e0.w(e0Var, accessorName));
    }
}
