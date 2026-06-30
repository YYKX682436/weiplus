package ro5;

/* loaded from: classes14.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f479801d;

    /* renamed from: e, reason: collision with root package name */
    public int f479802e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f479803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479804g;

    /* renamed from: h, reason: collision with root package name */
    public int f479805h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ro5.m1 m1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f479804g = m1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f479803f = obj;
        this.f479805h |= Integer.MIN_VALUE;
        return this.f479804g.c(0, null, null, this);
    }
}
