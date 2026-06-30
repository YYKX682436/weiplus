package ut;

/* loaded from: classes12.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f512181d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f512182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f512183f;

    /* renamed from: g, reason: collision with root package name */
    public int f512184g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ut.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f512183f = q0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f512182e = obj;
        this.f512184g |= Integer.MIN_VALUE;
        return this.f512183f.B(this);
    }
}
