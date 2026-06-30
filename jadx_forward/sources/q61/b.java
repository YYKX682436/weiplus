package q61;

/* loaded from: classes4.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f441768d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f441769e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f441770f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q61.c f441771g;

    /* renamed from: h, reason: collision with root package name */
    public int f441772h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q61.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f441771g = cVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f441770f = obj;
        this.f441772h |= Integer.MIN_VALUE;
        return q61.c.a(this.f441771g, null, null, this);
    }
}
