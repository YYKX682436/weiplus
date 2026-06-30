package xx0;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f539404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f539405e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xx0.i f539407g;

    /* renamed from: h, reason: collision with root package name */
    public int f539408h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xx0.i iVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f539407g = iVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f539406f = obj;
        this.f539408h |= Integer.MIN_VALUE;
        return this.f539407g.a(null, this);
    }
}
