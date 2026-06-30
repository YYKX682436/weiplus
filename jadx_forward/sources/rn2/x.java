package rn2;

/* loaded from: classes.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f479442d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f479443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.l0 f479444f;

    /* renamed from: g, reason: collision with root package name */
    public int f479445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rn2.l0 l0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f479444f = l0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f479443e = obj;
        this.f479445g |= Integer.MIN_VALUE;
        return this.f479444f.d(null, this);
    }
}
