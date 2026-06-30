package su0;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f494205d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f494206e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f494207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su0.r f494208g;

    /* renamed from: h, reason: collision with root package name */
    public int f494209h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(su0.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f494208g = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f494207f = obj;
        this.f494209h |= Integer.MIN_VALUE;
        return this.f494208g.b(null, null, this);
    }
}
