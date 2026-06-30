package pi0;

/* loaded from: classes11.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f436071d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.g0 f436073f;

    /* renamed from: g, reason: collision with root package name */
    public int f436074g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pi0.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f436073f = g0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f436072e = obj;
        this.f436074g |= Integer.MIN_VALUE;
        return this.f436073f.a(null, 0L, null, false, this);
    }
}
