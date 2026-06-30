package l0;

/* loaded from: classes14.dex */
public final class g4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f395745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f395746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f395747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395748g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(long j17, java.lang.Float f17, yz5.p pVar, int i17) {
        super(2);
        this.f395745d = j17;
        this.f395746e = f17;
        this.f395747f = pVar;
        this.f395748g = i17;
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
        n0.n1.a(new n0.i3[]{l0.p.f395949a.b(new e1.y(this.f395745d))}, u0.j.b(oVar, -1132188434, true, new l0.f4(this.f395746e, this.f395747f, this.f395748g, this.f395745d)), oVar, 56);
        return jz5.f0.f384359a;
    }
}
