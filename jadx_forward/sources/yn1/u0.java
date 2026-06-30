package yn1;

/* loaded from: classes11.dex */
public final class u0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f545386d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f545387e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f545388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yn1.z0 f545389g;

    /* renamed from: h, reason: collision with root package name */
    public int f545390h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(yn1.z0 z0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f545389g = z0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f545388f = obj;
        this.f545390h |= Integer.MIN_VALUE;
        return this.f545389g.s(null, null, this);
    }
}
