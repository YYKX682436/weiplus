package bp4;

/* loaded from: classes10.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.z3 f23343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(bp4.z3 z3Var) {
        super(1);
        this.f23343d = z3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            bp4.z3 z3Var = this.f23343d;
            boolean z17 = z3Var.f23446r;
            yz5.l lVar = z3Var.f23448t;
            if (z17) {
                if (lVar != null) {
                    ((bp4.s3) lVar).invoke(z3Var.f23443o.get(z3Var.f23447s));
                }
            } else if (lVar != null) {
                ((bp4.s3) lVar).invoke(java.lang.Float.valueOf(z3Var.f23445q));
            }
        }
        return jz5.f0.f302826a;
    }
}
