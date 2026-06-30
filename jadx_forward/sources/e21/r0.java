package e21;

/* loaded from: classes11.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f328106d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f328107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.z0 f328108f;

    /* renamed from: g, reason: collision with root package name */
    public int f328109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(e21.z0 z0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f328108f = z0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f328107e = obj;
        this.f328109g |= Integer.MIN_VALUE;
        return e21.z0.b(this.f328108f, this);
    }
}
