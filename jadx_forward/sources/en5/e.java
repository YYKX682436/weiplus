package en5;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1.c f336913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f336914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336917h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h1.c cVar, z0.t tVar, java.lang.String str, int i17, int i18) {
        super(2);
        this.f336913d = cVar;
        this.f336914e = tVar;
        this.f336915f = str;
        this.f336916g = i17;
        this.f336917h = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        en5.g.a(this.f336913d, this.f336914e, this.f336915f, (n0.o) obj, this.f336916g | 1, this.f336917h);
        return jz5.f0.f384359a;
    }
}
