package yx;

/* loaded from: classes14.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f548567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f548568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f548569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f548570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(z0.t tVar, boolean z17, yz5.a aVar, int i17) {
        super(2);
        this.f548567d = tVar;
        this.f548568e = z17;
        this.f548569f = aVar;
        this.f548570g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f548570g | 1;
        boolean z17 = this.f548568e;
        yz5.a aVar = this.f548569f;
        yx.q0.e(this.f548567d, z17, aVar, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
