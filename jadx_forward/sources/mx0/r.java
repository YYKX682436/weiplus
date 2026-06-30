package mx0;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413803d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f413804e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.s f413806g;

    /* renamed from: h, reason: collision with root package name */
    public int f413807h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mx0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f413806g = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f413805f = obj;
        this.f413807h |= Integer.MIN_VALUE;
        return this.f413806g.f(null, this);
    }
}
