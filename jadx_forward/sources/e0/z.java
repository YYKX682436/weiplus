package e0;

/* loaded from: classes5.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.a0 f327259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.g f327260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f327261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f327262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0.a0 a0Var, e0.g gVar, int i17, int i18) {
        super(2);
        this.f327259d = a0Var;
        this.f327260e = gVar;
        this.f327261f = i17;
        this.f327262g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f327262g | 1;
        e0.g gVar = this.f327260e;
        int i18 = this.f327261f;
        this.f327259d.a(gVar, i18, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
