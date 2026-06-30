package ly0;

/* loaded from: classes5.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f403776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ly0.v f403777e;

    /* renamed from: f, reason: collision with root package name */
    public int f403778f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ly0.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f403777e = vVar;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f403776d = obj;
        this.f403778f |= Integer.MIN_VALUE;
        return this.f403777e.f(null, null, this);
    }
}
