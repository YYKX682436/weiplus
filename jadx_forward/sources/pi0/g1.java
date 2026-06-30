package pi0;

/* loaded from: classes11.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f436113e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f436115g;

    /* renamed from: h, reason: collision with root package name */
    public int f436116h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(pi0.l1 l1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f436115g = l1Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f436114f = obj;
        this.f436116h |= Integer.MIN_VALUE;
        return this.f436115g.u(null, null, null, null, null, this);
    }
}
