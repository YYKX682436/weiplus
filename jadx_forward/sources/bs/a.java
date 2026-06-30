package bs;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f105306d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f105307e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f105308f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bs.b f105309g;

    /* renamed from: h, reason: collision with root package name */
    public int f105310h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bs.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f105309g = bVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f105308f = obj;
        this.f105310h |= Integer.MIN_VALUE;
        return bs.b.c(this.f105309g, null, this);
    }
}
