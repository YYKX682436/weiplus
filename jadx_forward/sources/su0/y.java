package su0;

/* loaded from: classes5.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f494248d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f494249e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f494250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su0.a0 f494251g;

    /* renamed from: h, reason: collision with root package name */
    public int f494252h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(su0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f494251g = a0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f494250f = obj;
        this.f494252h |= Integer.MIN_VALUE;
        return this.f494251g.a(null, this);
    }
}
