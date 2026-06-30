package q85;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f442344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q85.g f442345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f442346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f442347g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z0.t tVar, q85.g gVar, int i17, int i18) {
        super(2);
        this.f442344d = tVar;
        this.f442345e = gVar;
        this.f442346f = i17;
        this.f442347g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f442346f | 1;
        q85.k.a(this.f442344d, this.f442345e, (n0.o) obj, i17, this.f442347g);
        return jz5.f0.f384359a;
    }
}
