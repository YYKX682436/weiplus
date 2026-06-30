package sf2;

/* loaded from: classes10.dex */
public final class u1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488832e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.w1 f488834g;

    /* renamed from: h, reason: collision with root package name */
    public int f488835h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(sf2.w1 w1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488834g = w1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488833f = obj;
        this.f488835h |= Integer.MIN_VALUE;
        return sf2.w1.Z6(this.f488834g, null, this);
    }
}
