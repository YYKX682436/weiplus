package s1;

/* loaded from: classes14.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f483517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f483518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f483519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f483520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(z0.t tVar, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f483517d = tVar;
        this.f483518e = pVar;
        this.f483519f = i17;
        this.f483520g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f483519f | 1;
        s1.f2.b(this.f483517d, this.f483518e, (n0.o) obj, i17, this.f483520g);
        return jz5.f0.f384359a;
    }
}
