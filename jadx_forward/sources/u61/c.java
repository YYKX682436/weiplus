package u61;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f506412d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f506413e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f506414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u61.d f506415g;

    /* renamed from: h, reason: collision with root package name */
    public int f506416h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u61.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f506415g = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f506414f = obj;
        this.f506416h |= Integer.MIN_VALUE;
        return this.f506415g.a(null, null, null, null, this);
    }
}
