package sf2;

/* loaded from: classes10.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488812d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488813e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488815g;

    /* renamed from: h, reason: collision with root package name */
    public int f488816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(sf2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488815g = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488814f = obj;
        this.f488816h |= Integer.MIN_VALUE;
        return this.f488815g.p7(null, null, this);
    }
}
