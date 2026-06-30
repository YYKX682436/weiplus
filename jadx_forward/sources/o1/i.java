package o1;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f423560d;

    /* renamed from: e, reason: collision with root package name */
    public long f423561e;

    /* renamed from: f, reason: collision with root package name */
    public long f423562f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o1.k f423564h;

    /* renamed from: i, reason: collision with root package name */
    public int f423565i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o1.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f423564h = kVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f423563g = obj;
        this.f423565i |= Integer.MIN_VALUE;
        return this.f423564h.a(0L, 0L, this);
    }
}
