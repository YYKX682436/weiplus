package rn2;

/* loaded from: classes.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f479192d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f479193e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f479194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.l0 f479195g;

    /* renamed from: h, reason: collision with root package name */
    public int f479196h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(rn2.l0 l0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f479195g = l0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f479194f = obj;
        this.f479196h |= Integer.MIN_VALUE;
        return rn2.l0.b(this.f479195g, null, this);
    }
}
