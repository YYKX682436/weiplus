package pr0;

/* loaded from: classes14.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f439461e;

    /* renamed from: f, reason: collision with root package name */
    public int f439462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(pr0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f439461e = g0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f439460d = obj;
        this.f439462f |= Integer.MIN_VALUE;
        return pr0.g0.p(this.f439461e, 0, this);
    }
}
