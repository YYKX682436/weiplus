package y5;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f540930d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f540931e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f540932f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y5.c f540933g;

    /* renamed from: h, reason: collision with root package name */
    public int f540934h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y5.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f540933g = cVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f540932f = obj;
        this.f540934h |= Integer.MIN_VALUE;
        return this.f540933g.b(null, this);
    }
}
