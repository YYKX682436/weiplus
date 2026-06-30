package gx0;

/* loaded from: classes5.dex */
public final class e5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357891d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357892e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f357894g;

    /* renamed from: h, reason: collision with root package name */
    public int f357895h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f357894g = w8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f357893f = obj;
        this.f357895h |= Integer.MIN_VALUE;
        return gx0.w8.a7(this.f357894g, null, null, this);
    }
}
