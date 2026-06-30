package rf2;

/* loaded from: classes10.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476483d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476484e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476486g;

    /* renamed from: h, reason: collision with root package name */
    public int f476487h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rf2.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f476486g = v0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f476485f = obj;
        this.f476487h |= Integer.MIN_VALUE;
        return rf2.v0.b(this.f476486g, null, this);
    }
}
