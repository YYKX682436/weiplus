package qw1;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f448626d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f448627e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f448628f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448629g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qw1.j f448630h;

    /* renamed from: i, reason: collision with root package name */
    public int f448631i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qw1.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f448630h = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f448629g = obj;
        this.f448631i |= Integer.MIN_VALUE;
        return this.f448630h.b(null, false, this);
    }
}
