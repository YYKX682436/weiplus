package ur0;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f511818d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f511819e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f511820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ur0.s f511821g;

    /* renamed from: h, reason: collision with root package name */
    public int f511822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ur0.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f511821g = sVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f511820f = obj;
        this.f511822h |= Integer.MIN_VALUE;
        return ur0.s.I(this.f511821g, this);
    }
}
