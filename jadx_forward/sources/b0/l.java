package b0;

/* loaded from: classes14.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97929d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.n f97931f;

    /* renamed from: g, reason: collision with root package name */
    public int f97932g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b0.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97931f = nVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97930e = obj;
        this.f97932g |= Integer.MIN_VALUE;
        return this.f97931f.a(null, 0.0f, this);
    }
}
