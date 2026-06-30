package df2;

/* loaded from: classes3.dex */
public final class t5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312943d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312944e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.w5 f312946g;

    /* renamed from: h, reason: collision with root package name */
    public int f312947h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(df2.w5 w5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f312946g = w5Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f312945f = obj;
        this.f312947h |= Integer.MIN_VALUE;
        return df2.w5.a(this.f312946g, this);
    }
}
