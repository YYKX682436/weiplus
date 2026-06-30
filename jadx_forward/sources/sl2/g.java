package sl2;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f490778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f490779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f490780f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f490781g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sl2.h f490782h;

    /* renamed from: i, reason: collision with root package name */
    public int f490783i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sl2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f490782h = hVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f490781g = obj;
        this.f490783i |= Integer.MIN_VALUE;
        return this.f490782h.a(null, null, this);
    }
}
