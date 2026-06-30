package rk4;

/* loaded from: classes11.dex */
public final class y6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f478633d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f478634e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f478635f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f478636g;

    /* renamed from: h, reason: collision with root package name */
    public long f478637h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f478638i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f478639m;

    /* renamed from: n, reason: collision with root package name */
    public int f478640n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(rk4.k8 k8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f478639m = k8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f478638i = obj;
        this.f478640n |= Integer.MIN_VALUE;
        return this.f478639m.l(false, false, this);
    }
}
