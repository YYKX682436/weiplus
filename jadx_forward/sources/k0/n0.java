package k0;

/* loaded from: classes14.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f384484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f384485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f384486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f384487g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(z0.t tVar, yz5.p pVar, int i17, int i18) {
        super(2);
        this.f384484d = tVar;
        this.f384485e = pVar;
        this.f384486f = i17;
        this.f384487g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f384486f | 1;
        k0.o0.a(this.f384484d, this.f384485e, (n0.o) obj, i17, this.f384487g);
        return jz5.f0.f384359a;
    }
}
