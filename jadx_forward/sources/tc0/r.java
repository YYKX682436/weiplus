package tc0;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f498660d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f498661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc0.s f498662f;

    /* renamed from: g, reason: collision with root package name */
    public int f498663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tc0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f498662f = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f498661e = obj;
        this.f498663g |= Integer.MIN_VALUE;
        return this.f498662f.Ai(0, this);
    }
}
