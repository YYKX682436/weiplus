package yn1;

/* loaded from: classes11.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f545281d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f545282e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f545283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yn1.z0 f545284g;

    /* renamed from: h, reason: collision with root package name */
    public int f545285h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(yn1.z0 z0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f545284g = z0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f545283f = obj;
        this.f545285h |= Integer.MIN_VALUE;
        return this.f545284g.b(null, null, this);
    }
}
