package yx;

/* loaded from: classes14.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f548610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f548611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f548612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f548613g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z0.t tVar, yz5.l lVar, int i17, int i18) {
        super(2);
        this.f548610d = tVar;
        this.f548611e = lVar;
        this.f548612f = i17;
        this.f548613g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f548612f | 1;
        yx.q0.b(this.f548610d, this.f548611e, (n0.o) obj, i17, this.f548613g);
        return jz5.f0.f384359a;
    }
}
