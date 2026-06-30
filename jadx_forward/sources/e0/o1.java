package e0;

/* loaded from: classes5.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.s f327192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(e0.s sVar) {
        super(1);
        this.f327192d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object needle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(needle, "needle");
        e0.s sVar = this.f327192d;
        e0.n1 n1Var = new e0.n1(sVar);
        int e17 = ((e0.u) sVar).e();
        int i17 = 0;
        while (true) {
            if (i17 >= e17) {
                i17 = -1;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(n1Var.mo146xb9724478(java.lang.Integer.valueOf(i17)), needle)) {
                break;
            }
            i17++;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
