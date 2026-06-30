package zr0;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f556666d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f556667e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f556668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zr0.p f556669g;

    /* renamed from: h, reason: collision with root package name */
    public int f556670h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zr0.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f556669g = pVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f556668f = obj;
        this.f556670h |= Integer.MIN_VALUE;
        return this.f556669g.l(null, 0, 0, this);
    }
}
