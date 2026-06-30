package gx0;

/* loaded from: classes5.dex */
public final class nf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358307d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358308e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f358310g;

    /* renamed from: h, reason: collision with root package name */
    public int f358311h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(gx0.gg ggVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358310g = ggVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358309f = obj;
        this.f358311h |= Integer.MIN_VALUE;
        return gx0.gg.U6(this.f358310g, null, this);
    }
}
