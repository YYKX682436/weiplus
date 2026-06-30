package s72;

/* loaded from: classes5.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f485681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.v0 f485682e;

    /* renamed from: f, reason: collision with root package name */
    public int f485683f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(s72.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f485682e = v0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f485681d = obj;
        this.f485683f |= Integer.MIN_VALUE;
        return this.f485682e.T6(0, false, this);
    }
}
