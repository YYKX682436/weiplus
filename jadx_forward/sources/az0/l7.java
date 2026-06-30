package az0;

/* loaded from: classes5.dex */
public final class l7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97198d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97199e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f97201g;

    /* renamed from: h, reason: collision with root package name */
    public int f97202h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(az0.n7 n7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97201g = n7Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97200f = obj;
        this.f97202h |= Integer.MIN_VALUE;
        return this.f97201g.r(false, false, this);
    }
}
