package i1;

/* loaded from: classes14.dex */
public final class u1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.r f368582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1.w1 f368583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(yz5.r rVar, i1.w1 w1Var) {
        super(2);
        this.f368582d = rVar;
        this.f368583e = w1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        i1.w1 w1Var = this.f368583e;
        this.f368582d.C(java.lang.Float.valueOf(w1Var.f368597n.f368466g), java.lang.Float.valueOf(w1Var.f368597n.f368467h), oVar, 0);
        return jz5.f0.f384359a;
    }
}
