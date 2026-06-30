package cc1;

/* loaded from: classes7.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f121982d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f121983e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f121984f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f121985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cc1.r f121986h;

    /* renamed from: i, reason: collision with root package name */
    public int f121987i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cc1.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f121986h = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f121985g = obj;
        this.f121987i |= Integer.MIN_VALUE;
        return this.f121986h.C(null, null, this);
    }
}
