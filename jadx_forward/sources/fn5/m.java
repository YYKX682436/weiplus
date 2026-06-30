package fn5;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f346241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f346242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346243f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f346244g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z0.t tVar, fn5.n0 n0Var, yz5.l lVar, int i17) {
        super(2);
        this.f346241d = tVar;
        this.f346242e = n0Var;
        this.f346243f = lVar;
        this.f346244g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f346244g | 1;
        fn5.n0 n0Var = this.f346242e;
        yz5.l lVar = this.f346243f;
        fn5.p.g(this.f346241d, n0Var, lVar, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
