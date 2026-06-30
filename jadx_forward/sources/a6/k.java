package a6;

/* loaded from: classes14.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f83192d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f83193e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a6.l f83195g;

    /* renamed from: h, reason: collision with root package name */
    public int f83196h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a6.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f83195g = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f83194f = obj;
        this.f83196h |= Integer.MIN_VALUE;
        return this.f83195g.e(null, this);
    }
}
