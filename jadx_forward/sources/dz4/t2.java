package dz4;

/* loaded from: classes12.dex */
public final class t2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f326945d;

    /* renamed from: e, reason: collision with root package name */
    public int f326946e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f326948g;

    /* renamed from: h, reason: collision with root package name */
    public int f326949h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(dz4.u2 u2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f326948g = u2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f326947f = obj;
        this.f326949h |= Integer.MIN_VALUE;
        return dz4.u2.b(this.f326948g, 0L, false, this);
    }
}
