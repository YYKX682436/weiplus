package hr5;

/* loaded from: classes15.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366018d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f366019e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f366021g;

    /* renamed from: h, reason: collision with root package name */
    public int f366022h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(hr5.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f366021g = a1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f366020f = obj;
        this.f366022h |= Integer.MIN_VALUE;
        return this.f366021g.g(null, this);
    }
}
