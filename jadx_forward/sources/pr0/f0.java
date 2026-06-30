package pr0;

/* loaded from: classes14.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439361d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439362e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439364g;

    /* renamed from: h, reason: collision with root package name */
    public int f439365h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(pr0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f439364g = g0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f439363f = obj;
        this.f439365h |= Integer.MIN_VALUE;
        return pr0.g0.q(this.f439364g, 0, 0, 0, null, false, this);
    }
}
