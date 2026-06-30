package gg2;

/* loaded from: classes2.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f353242d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f353243e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f353244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg2.t f353245g;

    /* renamed from: h, reason: collision with root package name */
    public int f353246h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(gg2.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f353245g = tVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f353244f = obj;
        this.f353246h |= Integer.MIN_VALUE;
        return this.f353245g.a(null, this);
    }
}
