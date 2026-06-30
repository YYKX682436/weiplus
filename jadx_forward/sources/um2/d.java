package um2;

/* loaded from: classes3.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f510283d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f510284e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f510285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ um2.g f510286g;

    /* renamed from: h, reason: collision with root package name */
    public int f510287h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(um2.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f510286g = gVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f510285f = obj;
        this.f510287h |= Integer.MIN_VALUE;
        return um2.g.k(this.f510286g, this);
    }
}
