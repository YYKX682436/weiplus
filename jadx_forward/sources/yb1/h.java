package yb1;

/* loaded from: classes7.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f542186d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f542187e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f542188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb1.o f542189g;

    /* renamed from: h, reason: collision with root package name */
    public int f542190h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yb1.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f542189g = oVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f542188f = obj;
        this.f542190h |= Integer.MIN_VALUE;
        return this.f542189g.c(null, this);
    }
}
