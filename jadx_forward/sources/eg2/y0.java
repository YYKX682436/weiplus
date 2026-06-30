package eg2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334180d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eg2.b1 f334182f;

    /* renamed from: g, reason: collision with root package name */
    public int f334183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(eg2.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f334182f = b1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f334181e = obj;
        this.f334183g |= Integer.MIN_VALUE;
        return eg2.b1.f(this.f334182f, this);
    }
}
