package kp;

/* loaded from: classes13.dex */
public final class k0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f392319d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f392320e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392322g;

    /* renamed from: h, reason: collision with root package name */
    public int f392323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kp.i1 i1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f392322g = i1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f392321f = obj;
        this.f392323h |= Integer.MIN_VALUE;
        return this.f392322g.Ri(this);
    }
}
