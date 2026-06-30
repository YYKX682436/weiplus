package gc0;

/* loaded from: classes5.dex */
public final class p1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f351770d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f351771e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351772f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f351773g;

    /* renamed from: h, reason: collision with root package name */
    public int f351774h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(gc0.p2 p2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f351773g = p2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f351772f = obj;
        this.f351774h |= Integer.MIN_VALUE;
        return this.f351773g.Q6(null, null, this);
    }
}
