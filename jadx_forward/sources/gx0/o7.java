package gx0;

/* loaded from: classes5.dex */
public final class o7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358324e;

    /* renamed from: f, reason: collision with root package name */
    public int f358325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f358324e = w8Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f358323d = obj;
        this.f358325f |= Integer.MIN_VALUE;
        return this.f358324e.F7(this);
    }
}
