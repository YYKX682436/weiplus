package ay1;

/* loaded from: classes2.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f96747d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f96748e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f96749f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ay1.l f96750g;

    /* renamed from: h, reason: collision with root package name */
    public int f96751h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ay1.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f96750g = lVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f96749f = obj;
        this.f96751h |= Integer.MIN_VALUE;
        return ay1.l.k(this.f96750g, false, this);
    }
}
