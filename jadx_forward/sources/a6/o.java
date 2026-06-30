package a6;

/* loaded from: classes14.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f83207d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f83208e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f83209f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f83210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a6.q f83211h;

    /* renamed from: i, reason: collision with root package name */
    public int f83212i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a6.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f83211h = qVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f83210g = obj;
        this.f83212i |= Integer.MIN_VALUE;
        return this.f83211h.b(null, this);
    }
}
