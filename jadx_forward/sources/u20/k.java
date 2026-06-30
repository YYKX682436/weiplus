package u20;

/* loaded from: classes9.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f505429d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f505430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u20.m f505431f;

    /* renamed from: g, reason: collision with root package name */
    public int f505432g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u20.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f505431f = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f505430e = obj;
        this.f505432g |= Integer.MIN_VALUE;
        return u20.m.e(this.f505431f, null, null, this);
    }
}
