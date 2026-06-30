package tx2;

/* loaded from: classes15.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f504092d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f504093e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tx2.k f504095g;

    /* renamed from: h, reason: collision with root package name */
    public int f504096h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tx2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f504095g = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f504094f = obj;
        this.f504096h |= Integer.MIN_VALUE;
        return this.f504095g.b(null, null, this);
    }
}
