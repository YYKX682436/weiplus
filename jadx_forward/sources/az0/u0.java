package az0;

/* loaded from: classes16.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97461d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97462e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.f2 f97464g;

    /* renamed from: h, reason: collision with root package name */
    public int f97465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(az0.f2 f2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97464g = f2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97463f = obj;
        this.f97465h |= Integer.MIN_VALUE;
        return this.f97464g.x(null, this);
    }
}
