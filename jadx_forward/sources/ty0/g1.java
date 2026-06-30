package ty0;

/* loaded from: classes14.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f504372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.i1 f504373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f504374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f504375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.lang.String str, ty0.i1 i1Var, int i17, int i18) {
        super(2);
        this.f504372d = str;
        this.f504373e = i1Var;
        this.f504374f = i17;
        this.f504375g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f504374f | 1;
        ty0.h1.a(this.f504372d, this.f504373e, (n0.o) obj, i17, this.f504375g);
        return jz5.f0.f384359a;
    }
}
