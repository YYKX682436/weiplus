package n0;

/* loaded from: classes14.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414961d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f414962e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.b3 f414964g;

    /* renamed from: h, reason: collision with root package name */
    public int f414965h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(n0.b3 b3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414964g = b3Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414963f = obj;
        this.f414965h |= Integer.MIN_VALUE;
        return this.f414964g.l(null, this);
    }
}
