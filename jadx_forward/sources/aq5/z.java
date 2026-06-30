package aq5;

/* loaded from: classes5.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aq5.p0 f94886e;

    /* renamed from: f, reason: collision with root package name */
    public int f94887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(aq5.p0 p0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f94886e = p0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f94885d = obj;
        this.f94887f |= Integer.MIN_VALUE;
        return this.f94886e.b(null, this);
    }
}
