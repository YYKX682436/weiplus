package xy0;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f539670d;

    /* renamed from: e, reason: collision with root package name */
    public int f539671e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xy0.g f539673g;

    /* renamed from: h, reason: collision with root package name */
    public int f539674h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xy0.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f539673g = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f539672f = obj;
        this.f539674h |= Integer.MIN_VALUE;
        return this.f539673g.b(null, this);
    }
}
