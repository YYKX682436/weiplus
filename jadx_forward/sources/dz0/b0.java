package dz0;

/* loaded from: classes5.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326307d;

    /* renamed from: e, reason: collision with root package name */
    public int f326308e;

    /* renamed from: f, reason: collision with root package name */
    public int f326309f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz0.e0 f326311h;

    /* renamed from: i, reason: collision with root package name */
    public int f326312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(dz0.e0 e0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f326311h = e0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f326310g = obj;
        this.f326312i |= Integer.MIN_VALUE;
        return this.f326311h.c(0, 0, this);
    }
}
