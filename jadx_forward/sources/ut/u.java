package ut;

/* loaded from: classes12.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f512286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f512287e;

    /* renamed from: f, reason: collision with root package name */
    public int f512288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ut.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        this.f512287e = q0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        this.f512286d = obj;
        this.f512288f |= Integer.MIN_VALUE;
        return this.f512287e.W(null, null, false, null, 0L, null, this);
    }
}
