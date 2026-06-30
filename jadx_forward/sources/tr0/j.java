package tr0;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f502843d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f502844e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f502845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tr0.t f502846g;

    /* renamed from: h, reason: collision with root package name */
    public int f502847h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tr0.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f502846g = tVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f502845f = obj;
        this.f502847h |= Integer.MIN_VALUE;
        return this.f502846g.s(null, null, null, null, this);
    }
}
