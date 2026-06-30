package xp4;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f537484d;

    /* renamed from: e, reason: collision with root package name */
    public long f537485e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f537486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xp4.e f537487g;

    /* renamed from: h, reason: collision with root package name */
    public int f537488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xp4.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f537487g = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f537486f = obj;
        this.f537488h |= Integer.MIN_VALUE;
        return this.f537487g.b(this);
    }
}
