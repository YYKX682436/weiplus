package f;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f339517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f339518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f339520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, yz5.a aVar, int i17, int i18) {
        super(2);
        this.f339517d = z17;
        this.f339518e = aVar;
        this.f339519f = i17;
        this.f339520g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f339519f | 1;
        f.l.a(this.f339517d, this.f339518e, (n0.o) obj, i17, this.f339520g);
        return jz5.f0.f384359a;
    }
}
