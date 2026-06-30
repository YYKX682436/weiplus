package aw0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f96000d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f96001e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f96002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aw0.f f96003g;

    /* renamed from: h, reason: collision with root package name */
    public int f96004h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aw0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f96003g = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f96002f = obj;
        this.f96004h |= Integer.MIN_VALUE;
        return aw0.f.a(this.f96003g, null, this);
    }
}
