package y11;

/* loaded from: classes12.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f540379d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f540380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y11.b0 f540381f;

    /* renamed from: g, reason: collision with root package name */
    public int f540382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y11.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f540381f = b0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f540380e = obj;
        this.f540382g |= Integer.MIN_VALUE;
        return y11.b0.Zi(this.f540381f, this);
    }
}
