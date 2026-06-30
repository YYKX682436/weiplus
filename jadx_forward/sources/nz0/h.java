package nz0;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f423041d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f423042e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nz0.o f423044g;

    /* renamed from: h, reason: collision with root package name */
    public int f423045h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nz0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f423044g = oVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f423043f = obj;
        this.f423045h |= Integer.MIN_VALUE;
        return nz0.o.a(this.f423044g, 0, null, this);
    }
}
