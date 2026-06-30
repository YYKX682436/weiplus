package ir2;

/* loaded from: classes2.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f375677d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f375678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f375679f;

    /* renamed from: g, reason: collision with root package name */
    public int f375680g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ir2.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f375679f = a1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f375678e = obj;
        this.f375680g |= Integer.MIN_VALUE;
        return ir2.a1.N6(this.f375679f, null, this);
    }
}
