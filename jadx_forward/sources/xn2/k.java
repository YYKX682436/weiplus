package xn2;

/* loaded from: classes2.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f537051d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f537052e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f537053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537054g;

    /* renamed from: h, reason: collision with root package name */
    public int f537055h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xn2.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f537054g = p0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f537053f = obj;
        this.f537055h |= Integer.MIN_VALUE;
        return xn2.p0.c(this.f537054g, this);
    }
}
