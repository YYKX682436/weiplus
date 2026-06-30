package pr0;

/* loaded from: classes14.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439355d;

    /* renamed from: e, reason: collision with root package name */
    public long f439356e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439358g;

    /* renamed from: h, reason: collision with root package name */
    public int f439359h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(pr0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f439358g = g0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f439357f = obj;
        this.f439359h |= Integer.MIN_VALUE;
        return pr0.g0.r(this.f439358g, 0, 0, 0, false, this);
    }
}
