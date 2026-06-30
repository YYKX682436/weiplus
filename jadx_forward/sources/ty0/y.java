package ty0;

/* loaded from: classes14.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f504563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f504564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f504565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f504566g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, n0.e5 e5Var, yz5.a aVar, int i17) {
        super(2);
        this.f504563d = str;
        this.f504564e = e5Var;
        this.f504565f = aVar;
        this.f504566g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f504566g | 1;
        n0.e5 e5Var = this.f504564e;
        yz5.a aVar = this.f504565f;
        ty0.z0.a(this.f504563d, e5Var, aVar, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
