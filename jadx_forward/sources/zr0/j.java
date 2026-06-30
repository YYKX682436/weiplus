package zr0;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f556676d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f556677e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f556678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zr0.p f556679g;

    /* renamed from: h, reason: collision with root package name */
    public int f556680h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zr0.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f556679g = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f556678f = obj;
        this.f556680h |= Integer.MIN_VALUE;
        return this.f556679g.n(null, this);
    }
}
