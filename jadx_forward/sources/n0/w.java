package n0;

/* loaded from: classes14.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f415267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f415268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(n0.y0 y0Var, int i17) {
        super(2);
        this.f415267d = y0Var;
        this.f415268e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = obj2 instanceof n0.e4;
        int i17 = this.f415268e;
        n0.y0 y0Var = this.f415267d;
        if (z17) {
            y0Var.E.l(i17);
            y0Var.J(false, new n0.u(obj2, i17, intValue));
        } else if (obj2 instanceof n0.l3) {
            n0.l3 l3Var = (n0.l3) obj2;
            n0.j1 j1Var = l3Var.f415138a;
            if (j1Var != null) {
                j1Var.f415092t = true;
                l3Var.f415138a = null;
            }
            y0Var.E.l(i17);
            y0Var.J(false, new n0.v(obj2, i17, intValue));
        }
        return jz5.f0.f384359a;
    }
}
