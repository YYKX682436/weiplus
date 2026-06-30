package u5;

/* loaded from: classes14.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u5.s f506271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c6.j f506272e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r5.j f506273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f506274g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u5.s sVar, c6.j jVar, r5.j jVar2, int i17) {
        super(2);
        this.f506271d = sVar;
        this.f506272e = jVar;
        this.f506273f = jVar2;
        this.f506274g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f506274g | 1;
        c6.j jVar = this.f506272e;
        r5.j jVar2 = this.f506273f;
        u5.x.d(this.f506271d, jVar, jVar2, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
