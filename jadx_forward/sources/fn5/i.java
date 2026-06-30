package fn5;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f346208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f346210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z0.t tVar, java.lang.String str, int i17) {
        super(2);
        this.f346208d = tVar;
        this.f346209e = str;
        this.f346210f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f346210f | 1;
        fn5.p.c(this.f346208d, this.f346209e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
