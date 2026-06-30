package b0;

/* loaded from: classes14.dex */
public final class l3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97951d;

    /* renamed from: e, reason: collision with root package name */
    public long f97952e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.m3 f97954g;

    /* renamed from: h, reason: collision with root package name */
    public int f97955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(b0.m3 m3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97954g = m3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97953f = obj;
        this.f97955h |= Integer.MIN_VALUE;
        return this.f97954g.c(0.0f, this);
    }
}
