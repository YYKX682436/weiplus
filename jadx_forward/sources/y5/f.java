package y5;

/* loaded from: classes14.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f540962d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f540963e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f540964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y5.g f540965g;

    /* renamed from: h, reason: collision with root package name */
    public int f540966h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y5.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f540965g = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f540964f = obj;
        this.f540966h |= Integer.MIN_VALUE;
        return this.f540965g.b(null, this);
    }
}
