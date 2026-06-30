package mm1;

/* loaded from: classes11.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410221d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410222e;

    /* renamed from: f, reason: collision with root package name */
    public long f410223f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm1.b0 f410225h;

    /* renamed from: i, reason: collision with root package name */
    public int f410226i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mm1.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f410225h = b0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f410224g = obj;
        this.f410226i |= Integer.MIN_VALUE;
        return this.f410225h.b(false, this);
    }
}
