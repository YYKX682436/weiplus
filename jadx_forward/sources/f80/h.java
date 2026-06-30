package f80;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f341635d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f341636e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f80.j f341638g;

    /* renamed from: h, reason: collision with root package name */
    public int f341639h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f80.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f341638g = jVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f341637f = obj;
        this.f341639h |= Integer.MIN_VALUE;
        return f80.j.o(this.f341638g, this);
    }
}
