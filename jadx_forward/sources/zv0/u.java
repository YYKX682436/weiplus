package zv0;

/* loaded from: classes5.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f557761d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f557762e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f557763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zv0.y f557764g;

    /* renamed from: h, reason: collision with root package name */
    public int f557765h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zv0.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f557764g = yVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f557763f = obj;
        this.f557765h |= Integer.MIN_VALUE;
        return this.f557764g.c(null, this);
    }
}
