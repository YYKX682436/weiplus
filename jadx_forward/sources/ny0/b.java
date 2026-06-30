package ny0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422917d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ny0.d f422919f;

    /* renamed from: g, reason: collision with root package name */
    public int f422920g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ny0.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f422919f = dVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f422918e = obj;
        this.f422920g |= Integer.MIN_VALUE;
        java.lang.Object e17 = this.f422919f.e(null, null, this);
        return e17 == pz5.a.f440719d ? e17 : p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(e17);
    }
}
