package dk2;

/* loaded from: classes3.dex */
public final class w1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315797d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f315798e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f315799f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315801h;

    /* renamed from: i, reason: collision with root package name */
    public int f315802i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(dk2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f315801h = r4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f315800g = obj;
        this.f315802i |= Integer.MIN_VALUE;
        return this.f315801h.G(0, 0, 0, this);
    }
}
