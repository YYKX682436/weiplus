package u0;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0.i f504928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f504929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f504930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u0.i iVar, java.lang.Object obj, int i17) {
        super(2);
        this.f504928d = iVar;
        this.f504929e = obj;
        this.f504930f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o nc6 = (n0.o) obj;
        ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nc6, "nc");
        this.f504928d.i(this.f504929e, nc6, this.f504930f | 1);
        return jz5.f0.f384359a;
    }
}
