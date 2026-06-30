package w65;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f524879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f524880e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f524881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w65.e f524882g;

    /* renamed from: h, reason: collision with root package name */
    public int f524883h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w65.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f524882g = eVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f524881f = obj;
        this.f524883h |= Integer.MIN_VALUE;
        return this.f524882g.c(this);
    }
}
