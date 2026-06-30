package fl2;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f345441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f345442e;

    /* renamed from: f, reason: collision with root package name */
    public int f345443f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f345444g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fl2.e f345445h;

    /* renamed from: i, reason: collision with root package name */
    public int f345446i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fl2.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f345445h = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f345444g = obj;
        this.f345446i |= Integer.MIN_VALUE;
        return fl2.e.a(this.f345445h, 0, this);
    }
}
