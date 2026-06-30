package ty0;

/* loaded from: classes14.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f504523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f504524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f504525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f504526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(yz5.q qVar, yz5.a aVar, ty0.b1 b1Var, int i17) {
        super(2);
        this.f504523d = qVar;
        this.f504524e = aVar;
        this.f504525f = b1Var;
        this.f504526g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f504526g | 1;
        yz5.a aVar = this.f504524e;
        ty0.b1 b1Var = this.f504525f;
        ty0.z0.i(this.f504523d, aVar, b1Var, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
