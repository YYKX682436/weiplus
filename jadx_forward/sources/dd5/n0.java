package dd5;

/* loaded from: classes9.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310759d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310760e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dd5.p0 f310762g;

    /* renamed from: h, reason: collision with root package name */
    public int f310763h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dd5.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f310762g = p0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f310761f = obj;
        this.f310763h |= Integer.MIN_VALUE;
        return this.f310762g.w(null, null, this);
    }
}
