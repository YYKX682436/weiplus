package iy;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jy.m f377215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jy.k f377216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f377217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f377218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jy.m mVar, jy.k kVar, int i17, int i18) {
        super(2);
        this.f377215d = mVar;
        this.f377216e = kVar;
        this.f377217f = i17;
        this.f377218g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f377217f | 1;
        iy.n.a(this.f377215d, this.f377216e, (n0.o) obj, i17, this.f377218g);
        return jz5.f0.f384359a;
    }
}
