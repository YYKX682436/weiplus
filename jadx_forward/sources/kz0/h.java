package kz0;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f395261d;

    /* renamed from: e, reason: collision with root package name */
    public int f395262e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f395263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kz0.i f395264g;

    /* renamed from: h, reason: collision with root package name */
    public int f395265h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kz0.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f395264g = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f395263f = obj;
        this.f395265h |= Integer.MIN_VALUE;
        return this.f395264g.b(null, this);
    }
}
