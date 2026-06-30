package p12;

/* loaded from: classes10.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432561d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432562e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p12.w f432564g;

    /* renamed from: h, reason: collision with root package name */
    public int f432565h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p12.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f432564g = wVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f432563f = obj;
        this.f432565h |= Integer.MIN_VALUE;
        return this.f432564g.e(null, this);
    }
}
