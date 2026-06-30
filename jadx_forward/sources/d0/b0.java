package d0;

/* loaded from: classes5.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f306608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0.g0 f306609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yz5.q qVar, d0.g0 g0Var, int i17) {
        super(2);
        this.f306608d = qVar;
        this.f306609e = g0Var;
        this.f306610f = i17;
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
        this.f306608d.mo147xb9724478(this.f306609e, oVar, java.lang.Integer.valueOf((this.f306610f >> 6) & 112));
        return jz5.f0.f384359a;
    }
}
