package bs2;

/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(bs2.n1 n1Var) {
        super(0);
        this.f23817d = n1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tab=");
        bs2.n1 n1Var = this.f23817d;
        sb6.append(n1Var.f23907a);
        ds2.b0 b0Var = new ds2.b0(ek6, sb6.toString());
        b0Var.f242858f.add(new bs2.a1(n1Var));
        return b0Var;
    }
}
