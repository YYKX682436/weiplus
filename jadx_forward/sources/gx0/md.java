package gx0;

/* loaded from: classes5.dex */
public final class md extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358256d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358257e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358259g;

    /* renamed from: h, reason: collision with root package name */
    public int f358260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(gx0.bf bfVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358259g = bfVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358258f = obj;
        this.f358260h |= Integer.MIN_VALUE;
        return this.f358259g.a7(null, this);
    }
}
