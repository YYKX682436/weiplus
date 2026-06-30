package nu0;

/* loaded from: classes5.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421481d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f421482e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421483f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421484g;

    /* renamed from: h, reason: collision with root package name */
    public int f421485h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f421484g = b4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f421483f = obj;
        this.f421485h |= Integer.MIN_VALUE;
        return nu0.b4.X6(this.f421484g, null, null, this);
    }
}
