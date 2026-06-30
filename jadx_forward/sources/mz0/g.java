package mz0;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414485d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f414486e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f414487f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f414488g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f414489h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f414490i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414491m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414492n;

    /* renamed from: o, reason: collision with root package name */
    public int f414493o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mz0.b2 b2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f414492n = b2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f414491m = obj;
        this.f414493o |= Integer.MIN_VALUE;
        return mz0.b2.V6(this.f414492n, this);
    }
}
