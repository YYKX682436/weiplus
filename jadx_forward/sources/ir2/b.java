package ir2;

/* loaded from: classes2.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f375638d;

    /* renamed from: e, reason: collision with root package name */
    public long f375639e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f375640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ir2.c f375641g;

    /* renamed from: h, reason: collision with root package name */
    public int f375642h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ir2.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f375641g = cVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f375640f = obj;
        this.f375642h |= Integer.MIN_VALUE;
        return ir2.c.g(this.f375641g, this);
    }
}
