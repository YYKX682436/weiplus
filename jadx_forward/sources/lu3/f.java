package lu3;

/* loaded from: classes10.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f402929d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f402930e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f402931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lu3.m f402932g;

    /* renamed from: h, reason: collision with root package name */
    public int f402933h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lu3.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f402932g = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f402931f = obj;
        this.f402933h |= Integer.MIN_VALUE;
        return this.f402932g.d(null, this);
    }
}
