package nj3;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f419443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f419444f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f419445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nj3.j f419446h;

    /* renamed from: i, reason: collision with root package name */
    public int f419447i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nj3.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f419446h = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f419445g = obj;
        this.f419447i |= Integer.MIN_VALUE;
        return this.f419446h.b(null, false, this);
    }
}
