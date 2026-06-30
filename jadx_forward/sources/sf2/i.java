package sf2;

/* loaded from: classes10.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f488693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f488694e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f488695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.x f488696g;

    /* renamed from: h, reason: collision with root package name */
    public int f488697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sf2.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f488696g = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f488695f = obj;
        this.f488697h |= Integer.MIN_VALUE;
        return this.f488696g.d7(null, null, null, this);
    }
}
