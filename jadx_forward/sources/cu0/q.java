package cu0;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f303864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303865e;

    /* renamed from: f, reason: collision with root package name */
    public int f303866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cu0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f303865e = xVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f303864d = obj;
        this.f303866f |= Integer.MIN_VALUE;
        return cu0.x.a(this.f303865e, null, this);
    }
}
