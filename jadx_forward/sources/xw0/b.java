package xw0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f539114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw0.r f539115e;

    /* renamed from: f, reason: collision with root package name */
    public int f539116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xw0.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f539115e = rVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f539114d = obj;
        this.f539116f |= Integer.MIN_VALUE;
        return this.f539115e.i(0, this);
    }
}
