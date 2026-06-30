package b0;

/* loaded from: classes14.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f98010d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f98011e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f98012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0.t0 f98013g;

    /* renamed from: h, reason: collision with root package name */
    public int f98014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b0.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f98013g = t0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f98012f = obj;
        this.f98014h |= Integer.MIN_VALUE;
        return this.f98013g.a(null, this);
    }
}
