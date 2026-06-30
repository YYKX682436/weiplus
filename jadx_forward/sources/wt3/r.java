package wt3;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f531012d;

    /* renamed from: e, reason: collision with root package name */
    public int f531013e;

    /* renamed from: f, reason: collision with root package name */
    public int f531014f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f531015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wt3.s f531016h;

    /* renamed from: i, reason: collision with root package name */
    public int f531017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wt3.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f531016h = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f531015g = obj;
        this.f531017i |= Integer.MIN_VALUE;
        return this.f531016h.a(null, 0, 0, this);
    }
}
