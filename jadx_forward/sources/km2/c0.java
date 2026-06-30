package km2;

/* loaded from: classes3.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f390612d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f390613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.g0 f390614f;

    /* renamed from: g, reason: collision with root package name */
    public int f390615g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(km2.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f390614f = g0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f390613e = obj;
        this.f390615g |= Integer.MIN_VALUE;
        return km2.g0.a(this.f390614f, this);
    }
}
