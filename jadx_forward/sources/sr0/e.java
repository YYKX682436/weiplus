package sr0;

/* loaded from: classes14.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f492959d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f492960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sr0.f f492961f;

    /* renamed from: g, reason: collision with root package name */
    public int f492962g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sr0.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f492961f = fVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f492960e = obj;
        this.f492962g |= Integer.MIN_VALUE;
        return sr0.f.H(this.f492961f, this);
    }
}
