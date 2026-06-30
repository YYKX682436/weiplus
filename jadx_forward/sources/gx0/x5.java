package gx0;

/* loaded from: classes5.dex */
public final class x5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358691d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358693f;

    /* renamed from: g, reason: collision with root package name */
    public int f358694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358693f = w8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358692e = obj;
        this.f358694g |= Integer.MIN_VALUE;
        return gx0.w8.f7(this.f358693f, null, this);
    }
}
