package rv0;

/* loaded from: classes5.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f481602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f481603e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f481604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481605g;

    /* renamed from: h, reason: collision with root package name */
    public int f481606h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(rv0.n1 n1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f481605g = n1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f481604f = obj;
        this.f481606h |= Integer.MIN_VALUE;
        return rv0.n1.k7(this.f481605g, null, this);
    }
}
