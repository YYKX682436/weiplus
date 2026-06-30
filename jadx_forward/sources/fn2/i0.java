package fn2;

/* loaded from: classes10.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345813d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f345815f;

    /* renamed from: g, reason: collision with root package name */
    public int f345816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(fn2.m0 m0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f345815f = m0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f345814e = obj;
        this.f345816g |= Integer.MIN_VALUE;
        return this.f345815f.a(this);
    }
}
