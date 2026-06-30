package tx2;

/* loaded from: classes15.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f504102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f504103e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f504104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tx2.k f504105g;

    /* renamed from: h, reason: collision with root package name */
    public int f504106h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(tx2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f504105g = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f504104f = obj;
        this.f504106h |= Integer.MIN_VALUE;
        return this.f504105g.c(null, null, this);
    }
}
