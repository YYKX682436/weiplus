package zx0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f558517d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f558518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx0.f f558519f;

    /* renamed from: g, reason: collision with root package name */
    public int f558520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zx0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f558519f = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f558518e = obj;
        this.f558520g |= Integer.MIN_VALUE;
        return this.f558519f.a(this);
    }
}
