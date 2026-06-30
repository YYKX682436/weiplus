package en5;

/* loaded from: classes14.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ en5.d f336983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ en5.d f336984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336986g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(en5.d dVar, en5.d dVar2, yz5.l lVar, int i17) {
        super(2);
        this.f336983d = dVar;
        this.f336984e = dVar2;
        this.f336985f = lVar;
        this.f336986g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f336986g | 1;
        en5.d dVar = this.f336984e;
        yz5.l lVar = this.f336985f;
        en5.p1.a(this.f336983d, dVar, lVar, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
