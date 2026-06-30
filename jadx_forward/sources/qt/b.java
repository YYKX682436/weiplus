package qt;

/* loaded from: classes9.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f448016d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt.d f448018f;

    /* renamed from: g, reason: collision with root package name */
    public int f448019g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qt.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f448018f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f448017e = obj;
        this.f448019g |= Integer.MIN_VALUE;
        return this.f448018f.B(this);
    }
}
