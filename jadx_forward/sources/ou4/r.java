package ou4;

/* loaded from: classes8.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430546d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ou4.s f430548f;

    /* renamed from: g, reason: collision with root package name */
    public int f430549g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ou4.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f430548f = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f430547e = obj;
        this.f430549g |= Integer.MIN_VALUE;
        return this.f430548f.f(this);
    }
}
