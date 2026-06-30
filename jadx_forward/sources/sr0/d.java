package sr0;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f492954d;

    /* renamed from: e, reason: collision with root package name */
    public int f492955e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sr0.f f492957g;

    /* renamed from: h, reason: collision with root package name */
    public int f492958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sr0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f492957g = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f492956f = obj;
        this.f492958h |= Integer.MIN_VALUE;
        return sr0.f.G(this.f492957g, this);
    }
}
