package fn2;

/* loaded from: classes10.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345840d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f345841e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fn2.q1 f345843g;

    /* renamed from: h, reason: collision with root package name */
    public int f345844h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(fn2.q1 q1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f345843g = q1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f345842f = obj;
        this.f345844h |= Integer.MIN_VALUE;
        return this.f345843g.e(false, this);
    }
}
