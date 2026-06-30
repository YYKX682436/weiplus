package pi0;

/* loaded from: classes11.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436253d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.t0 f436255f;

    /* renamed from: g, reason: collision with root package name */
    public int f436256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(pi0.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f436255f = t0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f436254e = obj;
        this.f436256g |= Integer.MIN_VALUE;
        return this.f436255f.a(null, this);
    }
}
