package u0;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0.i f504931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f504932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f504933f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f504934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u0.i iVar, java.lang.Object obj, java.lang.Object obj2, int i17) {
        super(2);
        this.f504931d = iVar;
        this.f504932e = obj;
        this.f504933f = obj2;
        this.f504934g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o nc6 = (n0.o) obj;
        ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nc6, "nc");
        int i17 = this.f504934g | 1;
        this.f504931d.h(this.f504932e, this.f504933f, nc6, i17);
        return jz5.f0.f384359a;
    }
}
