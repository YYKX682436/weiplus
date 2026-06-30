package dk2;

/* loaded from: classes3.dex */
public final class t1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f315624d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f315625e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f315626f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315628h;

    /* renamed from: i, reason: collision with root package name */
    public int f315629i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(dk2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f315628h = r4Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f315627g = obj;
        this.f315629i |= Integer.MIN_VALUE;
        return this.f315628h.F(0, 0, this);
    }
}
