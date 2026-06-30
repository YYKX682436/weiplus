package du;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f324848d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f324849e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f324850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ du.c f324851g;

    /* renamed from: h, reason: collision with root package name */
    public int f324852h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(du.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f324851g = cVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f324850f = obj;
        this.f324852h |= Integer.MIN_VALUE;
        return this.f324851g.i(null, null, this);
    }
}
