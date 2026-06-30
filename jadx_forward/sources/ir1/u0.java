package ir1;

/* loaded from: classes5.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f375592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ir1.i1 i1Var) {
        super(1);
        this.f375592d = i1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ir1.i1 i1Var = this.f375592d;
        if (booleanValue) {
            hr1.a aVar = i1Var.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i1Var.P);
            aVar.f66211x3c018db3 = !r1.f66211x3c018db3;
            pm0.v.X(new ir1.s0(i1Var));
        } else {
            pm0.v.X(new ir1.t0(i1Var));
        }
        return jz5.f0.f384359a;
    }
}
