package bp4;

/* loaded from: classes10.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.m1 f23177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(bp4.m1 m1Var) {
        super(1);
        this.f23177d = m1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        bp4.m1 m1Var = this.f23177d;
        if (booleanValue) {
            ju3.d0.k(m1Var.f23257e, ju3.c0.A2, null, 2, null);
        } else if (!m1Var.f23262m.h()) {
            ju3.d0.k(m1Var.f23257e, ju3.c0.W, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
