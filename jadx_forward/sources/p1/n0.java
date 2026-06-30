package p1;

/* loaded from: classes14.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.o0 f432390e;

    /* renamed from: f, reason: collision with root package name */
    public int f432391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p1.o0 o0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f432390e = o0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f432389d = obj;
        this.f432391f |= Integer.MIN_VALUE;
        return this.f432390e.j(0L, null, this);
    }
}
