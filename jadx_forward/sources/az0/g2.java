package az0;

/* loaded from: classes5.dex */
public final class g2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.l2 f97025e;

    /* renamed from: f, reason: collision with root package name */
    public int f97026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(az0.l2 l2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f97025e = l2Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f97024d = obj;
        this.f97026f |= Integer.MIN_VALUE;
        return this.f97025e.a(this);
    }
}
