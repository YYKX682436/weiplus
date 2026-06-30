package n0;

/* loaded from: classes14.dex */
public final class c2 extends n0.h3 {

    /* renamed from: b, reason: collision with root package name */
    public final n0.r4 f415005b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(n0.r4 policy, yz5.a defaultFactory) {
        super(defaultFactory);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultFactory, "defaultFactory");
        this.f415005b = policy;
    }

    @Override // n0.l1
    public n0.e5 a(java.lang.Object obj, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-84026900);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            y17 = n0.s4.b(obj, this.f415005b);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        v2Var.mo148714x53d8522f(obj);
        y0Var.o(false);
        return v2Var;
    }
}
