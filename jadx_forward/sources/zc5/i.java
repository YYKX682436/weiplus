package zc5;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f552985d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f552986e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f552987f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f552988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zc5.m f552989h;

    /* renamed from: i, reason: collision with root package name */
    public int f552990i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zc5.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f552989h = mVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f552988g = obj;
        this.f552990i |= Integer.MIN_VALUE;
        return this.f552989h.a(null, false, this);
    }
}
